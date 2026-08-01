package L;

import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public abstract class I {
    public static z0 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        z0 g2 = z0.g(null, rootWindowInsets);
        x0 x0Var = g2.f589a;
        x0Var.p(g2);
        x0Var.d(view.getRootView());
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
