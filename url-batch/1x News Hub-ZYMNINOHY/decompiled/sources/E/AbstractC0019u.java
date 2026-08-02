package E;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: E.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0019u {
    public static W a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        W b3 = W.b(rootWindowInsets, null);
        T t3 = b3.f270a;
        t3.p(b3);
        t3.d(view.getRootView());
        return b3;
    }
}
