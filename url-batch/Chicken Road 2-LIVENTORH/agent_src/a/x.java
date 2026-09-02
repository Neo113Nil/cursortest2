package a;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import n0.r1;
import n0.s1;
import n0.u1;
import n0.v1;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class x extends w {
    @Override // a.v, a.r, a.y
    public void U(i0 i0Var, i0 i0Var2, Window window, View view, boolean z3, boolean z4) {
        f3.d.e(i0Var, "statusBarStyle");
        f3.d.e(i0Var2, "navigationBarStyle");
        f3.d.e(window, "window");
        f3.d.e(view, "view");
        h.a.f0(window, false);
        WindowManager.LayoutParams attributes = window.getAttributes();
        if ((attributes.flags & 256) != 0 || attributes.width != -2 || attributes.height != -2) {
            window.setStatusBarColor(0);
            window.setNavigationBarColor(0);
            ViewGroup viewGroup = (ViewGroup) view;
            viewGroup.addView(new q0.d(viewGroup.getContext(), a3.f.W(new q0.a(2, 0), new q0.a(1, 0), new q0.a(4, 0), new q0.a(8, 0))));
        }
        window.setNavigationBarContrastEnforced(true);
        l2.f fVar = new l2.f(view, 20);
        int i = Build.VERSION.SDK_INT;
        h.a v1Var = i >= 35 ? new v1(window, fVar) : i >= 30 ? new u1(window, fVar) : i >= 26 ? new s1(window, fVar) : new r1(window, fVar);
        v1Var.e0(!z3);
        v1Var.d0(!z4);
    }
}
