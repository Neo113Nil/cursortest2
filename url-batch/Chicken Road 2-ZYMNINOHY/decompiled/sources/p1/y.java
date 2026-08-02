package p1;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import k.C1211e0;

/* loaded from: classes.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public static final A f14807a;

    /* renamed from: b, reason: collision with root package name */
    public static final C1211e0 f14808b;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f14807a = new B();
        } else {
            f14807a = new A();
        }
        f14808b = new C1211e0(Float.class, "translationAlpha", 6);
        new C1211e0(Rect.class, "clipBounds", 7);
    }

    public static void a(View view, int i4, int i5, int i6, int i7) {
        f14807a.P(view, i4, i5, i6, i7);
    }
}
