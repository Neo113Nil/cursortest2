package b6;

import android.app.Notification;
import android.app.Service;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class e {
    public static void a(Service service, int i3, Notification notification, int i10) {
        service.startForeground(i3, notification, i10);
    }
}
