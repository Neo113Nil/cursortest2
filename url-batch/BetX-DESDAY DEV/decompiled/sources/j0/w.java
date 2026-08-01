package j0;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public static final C0174C f2967a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0179b f2968b;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f2967a = new C0175D();
        } else {
            f2967a = new C0174C();
        }
        f2968b = new C0179b(Float.class, "translationAlpha", 5);
        new C0179b(Rect.class, "clipBounds", 6);
    }

    public static void a(View view, int i, int i2, int i3, int i4) {
        f2967a.u(view, i, i2, i3, i4);
    }

    public static void b(View view, int i) {
        f2967a.r(view, i);
    }
}
