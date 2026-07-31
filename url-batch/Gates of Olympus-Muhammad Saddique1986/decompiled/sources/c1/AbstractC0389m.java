package c1;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: c1.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0389m {
    public static U a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        U b3 = U.b(null, rootWindowInsets);
        Q q3 = b3.f5589a;
        q3.q(b3);
        q3.d(view.getRootView());
        return b3;
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
