package k0;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public static final C0177D f2818a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0180b f2819b;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f2818a = new C0178E();
        } else {
            f2818a = new C0177D();
        }
        f2819b = new C0180b(Float.class, "translationAlpha", 5);
        new C0180b(Rect.class, "clipBounds", 6);
    }

    public static void a(View view, int i, int i2, int i3, int i4) {
        f2818a.u(view, i, i2, i3, i4);
    }

    public static void b(View view, int i) {
        f2818a.s(view, i);
    }
}
