package B;

import android.app.NotificationChannel;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ NotificationChannel A() {
        return new NotificationChannel("fcm_fallback_notification_channel", "Miscellaneous", 3);
    }

    public static /* synthetic */ NotificationChannel c() {
        return new NotificationChannel("restored_OS_notifications", "Restored", 2);
    }

    public static /* bridge */ /* synthetic */ NotificationChannel f(Object obj) {
        return (NotificationChannel) obj;
    }

    public static /* synthetic */ NotificationChannel g(String str) {
        return new NotificationChannel("fcm_fallback_notification_channel", str, 3);
    }

    public static /* synthetic */ void p() {
    }

    public static /* bridge */ /* synthetic */ boolean y(Drawable drawable) {
        return drawable instanceof AdaptiveIconDrawable;
    }
}
