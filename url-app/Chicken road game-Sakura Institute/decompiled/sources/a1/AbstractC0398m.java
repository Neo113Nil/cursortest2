package a1;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: a1.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0398m {
    public static C0383T a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        C0383T b4 = C0383T.b(null, rootWindowInsets);
        C0380P c0380p = b4.f4871a;
        c0380p.q(b4);
        c0380p.d(view.getRootView());
        return b4;
    }

    public static int b(View view) {
        return view.getScrollIndicators();
    }

    public static void c(View view, int i2) {
        view.setScrollIndicators(i2);
    }

    public static void d(View view, int i2, int i4) {
        view.setScrollIndicators(i2, i4);
    }
}
