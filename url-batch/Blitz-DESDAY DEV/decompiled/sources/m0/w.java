package m0;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public static final C0230B f3204a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0235b f3205b;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f3204a = new C0231C();
        } else {
            f3204a = new C0230B();
        }
        f3205b = new C0235b(Float.class, "translationAlpha", 5);
        new C0235b(Rect.class, "clipBounds", 6);
    }

    public static void a(View view, int i, int i2, int i3, int i4) {
        f3204a.w(view, i, i2, i3, i4);
    }

    public static void b(View view, int i) {
        f3204a.s(view, i);
    }
}
