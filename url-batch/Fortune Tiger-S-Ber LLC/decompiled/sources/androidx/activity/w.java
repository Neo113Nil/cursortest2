package androidx.activity;

import android.os.Build;
import android.view.View;
import android.view.Window;
import k0.n1;
import k0.o1;
import k0.p1;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public class w extends u {
    @Override // androidx.activity.s
    public void b(j0 j0Var, j0 j0Var2, Window window, View view, boolean z3, boolean z4) {
        u2.c.e(j0Var, "statusBarStyle");
        u2.c.e(j0Var2, "navigationBarStyle");
        u2.c.e(window, "window");
        u2.c.e(view, "view");
        k3.d.d0(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        window.setStatusBarContrastEnforced(false);
        window.setNavigationBarContrastEnforced(true);
        g2.f fVar = new g2.f(view, 15);
        int i4 = Build.VERSION.SDK_INT;
        k3.d p1Var = i4 >= 35 ? new p1(window, fVar) : i4 >= 30 ? new o1(window, fVar) : new n1(window, fVar);
        p1Var.c0(!z3);
        p1Var.b0(!z4);
    }
}
