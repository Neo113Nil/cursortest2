package k0;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public abstract class c0 {
    public static m1 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        m1 g = m1.g(null, rootWindowInsets);
        i1 i1Var = g.f2760a;
        i1Var.q(g);
        i1Var.d(view.getRootView());
        return g;
    }

    public static void b(View view, int i4, int i5) {
        view.setScrollIndicators(i4, i5);
    }
}
