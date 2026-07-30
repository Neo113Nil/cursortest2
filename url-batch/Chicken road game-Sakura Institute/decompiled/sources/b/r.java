package b;

import android.os.Build;
import android.view.View;
import android.view.Window;
import b3.u0;
import b3.v0;
import b3.w0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class r extends j1.c {
    @Override // j1.c
    public void m0(m0 m0Var, m0 m0Var2, Window window, View view, boolean z8, boolean z9) {
        r6.k.f(m0Var, "statusBarStyle");
        r6.k.f(m0Var2, "navigationBarStyle");
        r6.k.f(window, "window");
        r6.k.f(view, "view");
        a.a.H(window, false);
        window.setStatusBarColor(z8 ? m0Var.f1192b : m0Var.f1191a);
        window.setNavigationBarColor(m0Var2.f1192b);
        int i7 = Build.VERSION.SDK_INT;
        (i7 >= 30 ? new w0(window) : i7 >= 26 ? new v0(window) : new u0(window)).K(!z8);
    }
}
