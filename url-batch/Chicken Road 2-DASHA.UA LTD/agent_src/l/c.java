package l;

import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public abstract class c {
    public static q a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        q a2 = q.a(null, rootWindowInsets);
        o oVar = a2.f924a;
        oVar.o(a2);
        oVar.d(view.getRootView());
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
