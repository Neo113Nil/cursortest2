package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public abstract class q80 {
    public static rb0 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        rb0 g = rb0.g(null, rootWindowInsets);
        ob0 ob0Var = g.a;
        ob0Var.v(g);
        View rootView = view.getRootView();
        ob0Var.d(rootView);
        ob0Var.o(rootView);
        ob0Var.p();
        return g;
    }
}
