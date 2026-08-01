package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public abstract class ba0 {
    public static final ha0 a;
    public static final q9 b;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            a = new ia0();
        } else {
            a = new ha0();
        }
        b = new q9(Float.class, "translationAlpha", 5);
        new q9(Rect.class, "clipBounds", 6);
    }

    public static void a(View view, int i, int i2, int i3, int i4) {
        a.Z(view, i, i2, i3, i4);
    }

    public static void b(View view, int i) {
        a.a0(view, i);
    }
}
