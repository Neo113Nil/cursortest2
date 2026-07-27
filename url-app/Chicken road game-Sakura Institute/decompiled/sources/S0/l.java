package S0;

import android.app.Notification;

/* loaded from: classes.dex */
public abstract class l {
    public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z4) {
        return builder.setAuthenticationRequired(z4);
    }

    public static Notification.Builder b(Notification.Builder builder, int i2) {
        return builder.setForegroundServiceBehavior(i2);
    }
}
