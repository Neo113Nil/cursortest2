package l0;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public static final C0253C f3144a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0257b f3145b;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f3144a = new C0254D();
        } else {
            f3144a = new C0253C();
        }
        f3145b = new C0257b(Float.class, "translationAlpha", 5);
        new C0257b(Rect.class, "clipBounds", 6);
    }

    public static void a(View view, int i, int i2, int i3, int i4) {
        f3144a.u(view, i, i2, i3, i4);
    }

    public static void b(View view, int i) {
        f3144a.r(view, i);
    }
}
