package B;

import android.app.Notification;
import android.content.Context;
import android.graphics.Insets;

/* loaded from: classes.dex */
public abstract class b {
    public static String a(Context context) {
        return context.getOpPackageName();
    }

    public static Insets b(int i2, int i5, int i7, int i8) {
        return Insets.of(i2, i5, i7, i8);
    }

    public static void c(Notification.Builder builder, boolean z7) {
        builder.setAllowSystemGeneratedContextualActions(z7);
    }

    public static void d(Notification.Builder builder) {
        builder.setBubbleMetadata(null);
    }

    public static void e(Notification.Action.Builder builder) {
        builder.setContextual(false);
    }
}
