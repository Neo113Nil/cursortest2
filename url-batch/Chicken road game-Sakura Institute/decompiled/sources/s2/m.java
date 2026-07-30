package s2;

import android.app.Notification;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class m {
    public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z8) {
        return builder.setAuthenticationRequired(z8);
    }

    public static Notification.Builder b(Notification.Builder builder, int i7) {
        return builder.setForegroundServiceBehavior(i7);
    }
}
