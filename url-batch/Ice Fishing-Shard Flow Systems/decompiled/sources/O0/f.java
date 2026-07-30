package O0;

import G0.s;
import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.Service;
import android.util.Log;
import androidx.work.impl.foreground.SystemForegroundService;

/* loaded from: classes.dex */
public abstract class f {
    public static void a(Service service, int i2, Notification notification, int i5) {
        try {
            service.startForeground(i2, notification, i5);
        } catch (ForegroundServiceStartNotAllowedException e7) {
            s d7 = s.d();
            String str = SystemForegroundService.f4117n;
            if (d7.f824a <= 5) {
                Log.w(str, "Unable to start foreground service", e7);
            }
        }
    }
}
