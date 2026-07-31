package y;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: y.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0273q {
    public static Q a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        Q a2 = Q.a(rootWindowInsets, null);
        O o2 = a2.f3130a;
        o2.o(a2);
        o2.d(view.getRootView());
        return a2;
    }

    public static int b(View view) {
        return view.getScrollIndicators();
    }

    public static void c(View view, int i2) {
        view.setScrollIndicators(i2);
    }

    public static void d(View view, int i2, int i3) {
        view.setScrollIndicators(i2, i3);
    }
}
