package im.zom.keanu3

import info.guardianproject.keanu.core.ImApp
import info.guardianproject.keanu.core.service.RemoteImService
import org.matrix.android.sdk.api.session.Session

class ZomApp : ImApp() {

    var isNotificaitonListeng = false

    override fun onCreate() {
        super.onCreate()


    }

    open fun startNotifications () {

        if (!isNotificaitonListeng) {
            RemoteImService?.instance?.initNotificationListener()
            isNotificaitonListeng = true
        }
    }

    override fun onSessionStarted(session: Session) {
        super.onSessionStarted(session)

        startNotifications()
    }
}