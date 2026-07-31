package q3;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class d0 {
    public static l1 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        l1 d8 = l1.d(null, rootWindowInsets);
        i1 i1Var = d8.f6127a;
        i1Var.r(d8);
        i1Var.d(view.getRootView());
        return d8;
    }
}
