package t;

import android.app.Notification;

/* renamed from: t.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1419g {
    public static void a(Notification.Builder builder, boolean z) {
        builder.setAllowSystemGeneratedContextualActions(z);
    }

    public static void b(Notification.Builder builder) {
        builder.setBubbleMetadata(null);
    }

    public static void c(Notification.Action.Builder builder) {
        builder.setContextual(false);
    }
}
