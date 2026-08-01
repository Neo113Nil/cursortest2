package l0;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public static final C0250C f3116a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0254b f3117b;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f3116a = new C0251D();
        } else {
            f3116a = new C0250C();
        }
        f3117b = new C0254b(Float.class, "translationAlpha", 5);
        new C0254b(Rect.class, "clipBounds", 6);
    }

    public static void a(View view, int i, int i2, int i3, int i4) {
        f3116a.t(view, i, i2, i3, i4);
    }

    public static void b(View view, int i) {
        f3116a.q(view, i);
    }
}
