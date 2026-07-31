package b;

import a.AbstractC0157a;
import a1.S;
import a1.T;
import a1.V;
import android.os.Build;
import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public class r extends I2.l {
    @Override // I2.l
    public void P(I i3, I i4, Window window, View view, boolean z3, boolean z4) {
        Z1.i.f(i3, "statusBarStyle");
        Z1.i.f(i4, "navigationBarStyle");
        Z1.i.f(window, "window");
        Z1.i.f(view, "view");
        AbstractC0157a.T(window, false);
        window.setStatusBarColor(z3 ? i3.f4144b : i3.f4143a);
        window.setNavigationBarColor(z4 ? i4.f4144b : i4.f4143a);
        int i5 = Build.VERSION.SDK_INT;
        I2.d v3 = i5 >= 30 ? new V(window) : i5 >= 26 ? new T(window) : new S(window);
        v3.J(!z3);
        v3.I(!z4);
    }
}
