package k0;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* renamed from: k0.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0200w {

    /* renamed from: a, reason: collision with root package name */
    public static final C0173C f2816a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0179b f2817b;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f2816a = new C0174D();
        } else {
            f2816a = new C0173C();
        }
        f2817b = new C0179b(Float.class, "translationAlpha", 5);
        new C0179b(Rect.class, "clipBounds", 6);
    }

    public static void a(View view, int i, int i2, int i3, int i4) {
        f2816a.v(view, i, i2, i3, i4);
    }

    public static void b(View view, int i) {
        f2816a.s(view, i);
    }
}
