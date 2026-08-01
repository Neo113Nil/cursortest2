package M;

import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public abstract class G {
    public static v0 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        v0 g2 = v0.g(null, rootWindowInsets);
        t0 t0Var = g2.f596a;
        t0Var.p(g2);
        t0Var.d(view.getRootView());
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
