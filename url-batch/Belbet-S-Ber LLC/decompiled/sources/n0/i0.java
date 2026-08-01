package n0;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public abstract class i0 {
    public static v1 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        v1 g3 = v1.g(null, rootWindowInsets);
        s1 s1Var = g3.f2842a;
        s1Var.v(g3);
        View rootView = view.getRootView();
        s1Var.d(rootView);
        s1Var.o(rootView);
        s1Var.p();
        return g3;
    }
}
