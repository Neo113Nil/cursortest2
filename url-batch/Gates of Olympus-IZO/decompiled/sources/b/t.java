package b;

import a.AbstractC0157a;
import a1.S;
import a1.T;
import a1.V;
import android.os.Build;
import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public class t extends s {
    @Override // b.r, I2.l
    public void P(I i3, I i4, Window window, View view, boolean z3, boolean z4) {
        Z1.i.f(i3, "statusBarStyle");
        Z1.i.f(i4, "navigationBarStyle");
        Z1.i.f(window, "window");
        Z1.i.f(view, "view");
        AbstractC0157a.T(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        window.setStatusBarContrastEnforced(false);
        window.setNavigationBarContrastEnforced(true);
        int i5 = Build.VERSION.SDK_INT;
        I2.d v3 = i5 >= 30 ? new V(window) : i5 >= 26 ? new T(window) : new S(window);
        v3.J(!z3);
        v3.I(!z4);
    }
}
