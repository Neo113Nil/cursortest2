package t;

import android.app.Notification;

/* loaded from: classes.dex */
public abstract class z {
    public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z5) {
        return builder.setAuthenticationRequired(z5);
    }

    public static Notification.Builder b(Notification.Builder builder, int i7) {
        return builder.setForegroundServiceBehavior(i7);
    }
}
