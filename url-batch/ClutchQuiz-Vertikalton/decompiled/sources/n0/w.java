package n0;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public static final C f3199a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0259b f3200b;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f3199a = new D();
        } else {
            f3199a = new C();
        }
        f3200b = new C0259b(Float.class, "translationAlpha", 5);
        new C0259b(Rect.class, "clipBounds", 6);
    }

    public static void a(View view, int i, int i2, int i3, int i4) {
        f3199a.q(view, i, i2, i3, i4);
    }

    public static void b(View view, int i) {
        f3199a.m(view, i);
    }
}
