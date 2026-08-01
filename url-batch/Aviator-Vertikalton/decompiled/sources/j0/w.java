package j0;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public static final C0173C f2963a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0177b f2964b;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f2963a = new C0174D();
        } else {
            f2963a = new C0173C();
        }
        f2964b = new C0177b(Float.class, "translationAlpha", 5);
        new C0177b(Rect.class, "clipBounds", 6);
    }

    public static void a(View view, int i, int i2, int i3, int i4) {
        f2963a.u(view, i, i2, i3, i4);
    }

    public static void b(View view, int i) {
        f2963a.r(view, i);
    }
}
