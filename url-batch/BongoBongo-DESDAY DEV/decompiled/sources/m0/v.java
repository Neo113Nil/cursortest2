package m0;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import m.V0;

/* loaded from: classes.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    public static final C0253A f3311a;

    /* renamed from: b, reason: collision with root package name */
    public static final V0 f3312b;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f3311a = new C0254B();
        } else {
            f3311a = new C0253A();
        }
        f3312b = new V0(Float.class, "translationAlpha", 6);
        new V0(Rect.class, "clipBounds", 7);
    }

    public static void a(View view, int i, int i2, int i3, int i4) {
        f3311a.v(view, i, i2, i3, i4);
    }

    public static void b(View view, int i) {
        f3311a.s(view, i);
    }
}
