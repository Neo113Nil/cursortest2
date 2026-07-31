package D;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: D.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0109w {
    public static Y a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        Y c7 = Y.c(rootWindowInsets, null);
        W w5 = c7.f272a;
        w5.p(c7);
        w5.d(view.getRootView());
        return c7;
    }

    public static int b(View view) {
        return view.getScrollIndicators();
    }

    public static void c(View view, int i7) {
        view.setScrollIndicators(i7);
    }

    public static void d(View view, int i7, int i8) {
        view.setScrollIndicators(i7, i8);
    }
}
