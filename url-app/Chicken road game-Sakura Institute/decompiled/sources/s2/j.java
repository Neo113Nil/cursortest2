package s2;

import android.app.Notification;
import android.content.Context;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class j {
    public static Notification.Builder a(Context context, String str) {
        return new Notification.Builder(context, str);
    }

    public static Notification.Builder b(Notification.Builder builder, int i7) {
        return builder.setBadgeIconType(i7);
    }

    public static Notification.Builder c(Notification.Builder builder, boolean z8) {
        return builder.setColorized(z8);
    }

    public static Notification.Builder d(Notification.Builder builder, int i7) {
        return builder.setGroupAlertBehavior(i7);
    }

    public static Notification.Builder e(Notification.Builder builder, CharSequence charSequence) {
        return builder.setSettingsText(charSequence);
    }

    public static Notification.Builder f(Notification.Builder builder, String str) {
        return builder.setShortcutId(str);
    }

    public static Notification.Builder g(Notification.Builder builder, long j8) {
        return builder.setTimeoutAfter(j8);
    }
}
