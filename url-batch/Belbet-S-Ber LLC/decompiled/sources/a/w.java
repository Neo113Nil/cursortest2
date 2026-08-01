package a;

import android.os.Build;
import android.view.View;
import android.view.Window;
import n0.w1;
import n0.x1;
import n0.z1;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public class w extends u {
    @Override // a.s
    public void b(l0 l0Var, l0 l0Var2, Window window, View view, boolean z4, boolean z5) {
        i3.d.e(l0Var, "statusBarStyle");
        i3.d.e(l0Var2, "navigationBarStyle");
        i3.d.e(window, "window");
        i3.d.e(view, "view");
        b4.l.a0(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        window.setStatusBarContrastEnforced(false);
        window.setNavigationBarContrastEnforced(true);
        o2.f fVar = new o2.f(view, 21);
        int i = Build.VERSION.SDK_INT;
        b4.l z1Var = i >= 35 ? new z1(window, fVar) : i >= 30 ? new x1(window, fVar) : new w1(window, fVar);
        z1Var.Z(!z4);
        z1Var.Y(!z5);
    }
}
