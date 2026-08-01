package b6;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.Service;
import android.util.Log;
import androidx.work.impl.foreground.SystemForegroundService;
import t5.o;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class f {
    public static void a(Service service, int i3, Notification notification, int i10) {
        try {
            service.startForeground(i3, notification, i10);
        } catch (ForegroundServiceStartNotAllowedException e2) {
            o d10 = o.d();
            String str = SystemForegroundService.f783t;
            if (d10.f9314a <= 5) {
                Log.w(str, "Unable to start foreground service", e2);
            }
        }
    }
}
