package k0;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public static final C0175D f2756a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0178b f2757b;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f2756a = new C0176E();
        } else {
            f2756a = new C0175D();
        }
        f2757b = new C0178b(Float.class, "translationAlpha", 5);
        new C0178b(Rect.class, "clipBounds", 6);
    }

    public static void a(View view, int i, int i2, int i3, int i4) {
        f2756a.n(view, i, i2, i3, i4);
    }

    public static void b(View view, int i) {
        f2756a.m(view, i);
    }
}
