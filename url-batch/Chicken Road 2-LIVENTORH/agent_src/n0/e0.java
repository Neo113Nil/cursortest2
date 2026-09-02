package n0;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public abstract class e0 {
    public static q1 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        q1 g4 = q1.g(null, rootWindowInsets);
        n1 n1Var = g4.f2775a;
        n1Var.q(g4);
        n1Var.d(view.getRootView());
        return g4;
    }

    public static void b(View view, int i, int i4) {
        view.setScrollIndicators(i, i4);
    }
}
