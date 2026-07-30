package O0;

import android.app.Notification;
import android.app.Service;

/* loaded from: classes.dex */
public abstract class e {
    public static void a(Service service, int i2, Notification notification, int i5) {
        service.startForeground(i2, notification, i5);
    }
}
