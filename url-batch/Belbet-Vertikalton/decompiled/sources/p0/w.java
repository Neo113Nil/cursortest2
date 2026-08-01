package p0;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import n.U0;

/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public static final C0321B f3874a;

    /* renamed from: b, reason: collision with root package name */
    public static final U0 f3875b;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f3874a = new C0322C();
        } else {
            f3874a = new C0321B();
        }
        f3875b = new U0(Float.class, "translationAlpha", 6);
        new U0(Rect.class, "clipBounds", 7);
    }

    public static void a(View view, int i, int i2, int i3, int i4) {
        f3874a.k0(view, i, i2, i3, i4);
    }

    public static void b(View view, int i) {
        f3874a.f0(view, i);
    }
}
