package b;

import a.AbstractC0235a;
import android.os.Build;
import android.view.View;
import android.view.Window;
import c1.C0385i;
import c1.V;
import c1.W;
import c1.X;

/* renamed from: b.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0324t extends C0323s {
    @Override // b.C0322r, h2.AbstractC0508a
    public void U(C0304H c0304h, C0304H c0304h2, Window window, View view, boolean z3, boolean z4) {
        f2.j.f(c0304h, "statusBarStyle");
        f2.j.f(c0304h2, "navigationBarStyle");
        f2.j.f(window, "window");
        f2.j.f(view, "view");
        AbstractC0235a.H(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        window.setStatusBarContrastEnforced(false);
        window.setNavigationBarContrastEnforced(true);
        if (Build.VERSION.SDK_INT >= 30) {
            new C0385i(view).f5602e = view;
        }
        int i3 = Build.VERSION.SDK_INT;
        l0.c x3 = i3 >= 30 ? new X(window) : i3 >= 26 ? new W(window) : new V(window);
        x3.M(!z3);
        x3.L(!z4);
    }
}
