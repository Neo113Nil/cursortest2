package t0;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.Service;
import android.util.Log;
import androidx.work.impl.foreground.SystemForegroundService;
import l0.q;

/* renamed from: t0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0653e {
    public static void a(Service service, int i7, Notification notification, int i8) {
        try {
            service.startForeground(i7, notification, i8);
        } catch (ForegroundServiceStartNotAllowedException e4) {
            q d7 = q.d();
            String str = SystemForegroundService.f3588k;
            if (d7.f5283a <= 5) {
                Log.w(str, "Unable to start foreground service", e4);
            }
        }
    }
}
