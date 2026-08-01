package k0;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public static final E f2803a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0173b f2804b;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f2803a = new F();
        } else {
            f2803a = new E();
        }
        f2804b = new C0173b(Float.class, "translationAlpha", 5);
        new C0173b(Rect.class, "clipBounds", 6);
    }

    public static void a(View view, int i, int i2, int i3, int i4) {
        f2803a.q(view, i, i2, i3, i4);
    }

    public static void b(View view, int i) {
        f2803a.p(view, i);
    }
}
