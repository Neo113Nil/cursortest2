package defpackage;

import android.app.Activity;
import android.app.Notification;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Insets;
import defpackage.l60;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public abstract class v6 {
    public static String a(Context context) {
        return context.getOpPackageName();
    }

    public static Insets b(int i, int i2, int i3, int i4) {
        return Insets.of(i, i2, i3, i4);
    }

    public static void c(Resources.Theme theme) {
        theme.rebase();
    }

    public static final void d(Activity activity, l60.a aVar) {
        activity.registerActivityLifecycleCallbacks(aVar);
    }

    public static void e(Notification.Builder builder, boolean z) {
        builder.setAllowSystemGeneratedContextualActions(z);
    }

    public static void f(Notification.Builder builder) {
        builder.setBubbleMetadata(null);
    }
}
