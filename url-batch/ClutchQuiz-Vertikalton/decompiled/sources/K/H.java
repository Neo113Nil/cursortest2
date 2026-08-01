package K;

import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public abstract class H {
    public static w0 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        w0 g2 = w0.g(null, rootWindowInsets);
        u0 u0Var = g2.f451a;
        u0Var.p(g2);
        u0Var.d(view.getRootView());
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
