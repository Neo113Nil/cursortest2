package p0;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public static final B f3709a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0300b f3710b;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f3709a = new C();
        } else {
            f3709a = new B();
        }
        f3710b = new C0300b(Float.class, "translationAlpha", 5);
        new C0300b(Rect.class, "clipBounds", 6);
    }

    public static void a(View view, int i, int i2, int i3, int i4) {
        f3709a.D(view, i, i2, i3, i4);
    }

    public static void b(View view, int i) {
        f3709a.z(view, i);
    }
}
