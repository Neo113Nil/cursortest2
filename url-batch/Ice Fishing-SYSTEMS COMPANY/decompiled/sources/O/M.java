package O;

import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public abstract class M {
    public static A0 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        A0 h9 = A0.h(null, rootWindowInsets);
        y0 y0Var = h9.f2213a;
        y0Var.p(h9);
        y0Var.d(view.getRootView());
        return h9;
    }

    public static int b(View view) {
        return view.getScrollIndicators();
    }

    public static void c(View view, int i) {
        view.setScrollIndicators(i);
    }

    public static void d(View view, int i, int i4) {
        view.setScrollIndicators(i, i4);
    }
}
