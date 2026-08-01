package M;

import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public abstract class F {
    public static t0 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        t0 g2 = t0.g(null, rootWindowInsets);
        r0 r0Var = g2.f794a;
        r0Var.p(g2);
        r0Var.d(view.getRootView());
        return g2;
    }

    public static int b(View view) {
        return view.getScrollIndicators();
    }

    public static void c(View view, int i) {
        view.setScrollIndicators(i);
    }

    public static void d(View view, int i, int i2) {
        view.setScrollIndicators(i, i2);
    }
}
