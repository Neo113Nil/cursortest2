package ac;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ NotificationChannel b() {
        return new NotificationChannel("restored_OS_notifications", "Restored", 2);
    }

    public static /* synthetic */ NotificationChannel c(int i3, String str, String str2) {
        return new NotificationChannel(str, str2, i3);
    }

    public static /* bridge */ /* synthetic */ NotificationChannel f(Object obj) {
        return (NotificationChannel) obj;
    }

    public static /* synthetic */ NotificationChannel g(String str) {
        return new NotificationChannel("fcm_fallback_notification_channel", str, 3);
    }

    public static /* synthetic */ NotificationChannelGroup h(String str, String str2) {
        return new NotificationChannelGroup(str, str2);
    }

    public static /* synthetic */ void k() {
    }

    public static /* bridge */ /* synthetic */ boolean v(Drawable drawable) {
        return drawable instanceof AdaptiveIconDrawable;
    }

    public static /* synthetic */ NotificationChannel w() {
        return new NotificationChannel("fcm_fallback_notification_channel", "Miscellaneous", 3);
    }
}
