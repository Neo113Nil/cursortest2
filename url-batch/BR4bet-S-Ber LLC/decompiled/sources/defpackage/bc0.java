package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public abstract class bc0 {
    public static ye0 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        ye0 g = ye0.g(null, rootWindowInsets);
        ve0 ve0Var = g.a;
        ve0Var.v(g);
        View rootView = view.getRootView();
        ve0Var.d(rootView);
        ve0Var.o(rootView);
        ve0Var.p();
        return g;
    }
}
