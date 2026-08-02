package E;

import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public abstract class B {
    public static e0 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        e0 a3 = e0.a(null, rootWindowInsets);
        a0 a0Var = a3.f416a;
        a0Var.o(a3);
        a0Var.d(view.getRootView());
        return a3;
    }
}
