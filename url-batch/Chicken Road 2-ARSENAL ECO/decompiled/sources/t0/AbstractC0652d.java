package t0;

import android.app.Notification;
import android.app.Service;

/* renamed from: t0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0652d {
    public static void a(Service service, int i7, Notification notification, int i8) {
        service.startForeground(i7, notification, i8);
    }
}
