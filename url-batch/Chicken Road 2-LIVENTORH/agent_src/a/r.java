package a;

import android.os.Build;
import android.view.View;
import android.view.Window;
import n0.r1;
import n0.s1;
import n0.u1;
import n0.v1;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public class r extends y {
    @Override // a.y
    public void U(i0 i0Var, i0 i0Var2, Window window, View view, boolean z3, boolean z4) {
        f3.d.e(i0Var, "statusBarStyle");
        f3.d.e(i0Var2, "navigationBarStyle");
        f3.d.e(window, "window");
        f3.d.e(view, "view");
        h.a.f0(window, false);
        window.setStatusBarColor(z3 ? i0Var.f32b : i0Var.f31a);
        window.setNavigationBarColor(z4 ? i0Var2.f32b : i0Var2.f31a);
        l2.f fVar = new l2.f(view, 20);
        int i = Build.VERSION.SDK_INT;
        h.a v1Var = i >= 35 ? new v1(window, fVar) : i >= 30 ? new u1(window, fVar) : i >= 26 ? new s1(window, fVar) : new r1(window, fVar);
        v1Var.e0(!z3);
        v1Var.d0(!z4);
    }
}
