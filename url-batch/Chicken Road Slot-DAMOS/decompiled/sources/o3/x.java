package o3;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class x {
    public static k1 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        k1 c10 = k1.c(rootWindowInsets, null);
        h1 h1Var = c10.f7415a;
        h1Var.y(c10);
        View rootView = view.getRootView();
        h1Var.d(rootView);
        h1Var.p(rootView);
        h1Var.q();
        return c10;
    }
}
