package D0;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public static final D f674a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0300b f675b;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f674a = new E();
        } else {
            f674a = new D();
        }
        f675b = new C0300b(Float.class, "translationAlpha", 5);
        new C0300b(Rect.class, "clipBounds", 6);
    }

    public static void a(View view, int i, int i4, int i9, int i10) {
        f674a.u(view, i, i4, i9, i10);
    }

    public static void b(View view, int i) {
        f674a.p(view, i);
    }
}
