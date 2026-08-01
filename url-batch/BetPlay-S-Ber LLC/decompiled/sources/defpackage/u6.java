package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Insets;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public abstract class u6 {
    public static String a(Context context) {
        return context.getOpPackageName();
    }

    public static Insets b(int i, int i2, int i3, int i4) {
        return Insets.of(i, i2, i3, i4);
    }

    public static void c(Resources.Theme theme) {
        theme.rebase();
    }
}
