package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public abstract class cn0 {
    public static final in0 a;
    public static final ab b;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            a = new jn0();
        } else {
            a = new in0();
        }
        b = new ab(Float.class, "translationAlpha", 5);
        new ab(Rect.class, "clipBounds", 6);
    }

    public static void a(View view, int i, int i2, int i3, int i4) {
        a.k(view, i, i2, i3, i4);
    }

    public static void b(View view, int i) {
        a.l(view, i);
    }
}
