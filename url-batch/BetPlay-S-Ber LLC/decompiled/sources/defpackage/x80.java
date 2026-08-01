package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public abstract class x80 {
    public static ac0 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        ac0 g = ac0.g(null, rootWindowInsets);
        xb0 xb0Var = g.a;
        xb0Var.v(g);
        View rootView = view.getRootView();
        xb0Var.d(rootView);
        xb0Var.o(rootView);
        xb0Var.p();
        return g;
    }
}
