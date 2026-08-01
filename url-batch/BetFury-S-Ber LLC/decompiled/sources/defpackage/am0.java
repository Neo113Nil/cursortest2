package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public abstract class am0 {
    public static dp0 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        dp0 g = dp0.g(null, rootWindowInsets);
        ap0 ap0Var = g.a;
        ap0Var.v(g);
        View rootView = view.getRootView();
        ap0Var.d(rootView);
        ap0Var.o(rootView);
        ap0Var.p();
        return g;
    }
}
