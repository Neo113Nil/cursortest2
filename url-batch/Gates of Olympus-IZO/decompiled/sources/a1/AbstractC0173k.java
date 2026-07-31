package a1;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: a1.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0173k {
    public static Q a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        Q b2 = Q.b(null, rootWindowInsets);
        O o3 = b2.f3542a;
        o3.q(b2);
        o3.d(view.getRootView());
        return b2;
    }

    public static int b(View view) {
        return view.getScrollIndicators();
    }

    public static void c(View view, int i3) {
        view.setScrollIndicators(i3);
    }

    public static void d(View view, int i3, int i4) {
        view.setScrollIndicators(i3, i4);
    }
}
