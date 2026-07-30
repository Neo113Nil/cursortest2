package I;

import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public abstract class L {
    public static v0 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        v0 c7 = v0.c(rootWindowInsets, null);
        r0 r0Var = c7.f1239a;
        r0Var.u(c7);
        View rootView = view.getRootView();
        r0Var.d(rootView);
        r0Var.m(rootView);
        r0Var.n();
        return c7;
    }
}
