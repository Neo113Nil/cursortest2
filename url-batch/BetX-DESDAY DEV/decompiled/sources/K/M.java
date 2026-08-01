package K;

import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public abstract class M {
    public static B0 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        B0 g2 = B0.g(null, rootWindowInsets);
        z0 z0Var = g2.f396a;
        z0Var.p(g2);
        z0Var.d(view.getRootView());
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
