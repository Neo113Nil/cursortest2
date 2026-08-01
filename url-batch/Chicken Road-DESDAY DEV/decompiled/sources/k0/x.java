package k0;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public static final C0178D f2769a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0181b f2770b;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f2769a = new C0179E();
        } else {
            f2769a = new C0178D();
        }
        f2770b = new C0181b(Float.class, "translationAlpha", 5);
        new C0181b(Rect.class, "clipBounds", 6);
    }

    public static void a(View view, int i, int i2, int i3, int i4) {
        f2769a.w(view, i, i2, i3, i4);
    }

    public static void b(View view, int i) {
        f2769a.t(view, i);
    }
}
