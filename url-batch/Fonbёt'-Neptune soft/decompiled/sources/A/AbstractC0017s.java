package A;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: A.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0017s {
    public static T a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        T a2 = T.a(rootWindowInsets, null);
        S s2 = a2.f24a;
        s2.k(a2);
        s2.d(view.getRootView());
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
