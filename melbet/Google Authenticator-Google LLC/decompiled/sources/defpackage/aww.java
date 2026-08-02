package defpackage;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.Service;
import androidx.work.impl.foreground.SystemForegroundService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aww {
    public static void a(Service service, int i, Notification notification, int i2) {
        try {
            service.startForeground(i, notification, i2);
        } catch (ForegroundServiceStartNotAllowedException e) {
            asq.a().f(SystemForegroundService.a, "Unable to start foreground service", e);
        } catch (SecurityException e2) {
            asq.a().f(SystemForegroundService.a, "Unable to start foreground service", e2);
        }
    }
}
