package b;

import a.AbstractC0235a;
import android.os.Build;
import android.view.View;
import android.view.Window;
import c1.C0385i;
import c1.V;
import c1.W;
import c1.X;
import h2.AbstractC0508a;

/* renamed from: b.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0321q extends AbstractC0508a {
    @Override // h2.AbstractC0508a
    public void U(C0304H c0304h, C0304H c0304h2, Window window, View view, boolean z3, boolean z4) {
        f2.j.f(c0304h, "statusBarStyle");
        f2.j.f(c0304h2, "navigationBarStyle");
        f2.j.f(window, "window");
        f2.j.f(view, "view");
        AbstractC0235a.H(window, false);
        window.setStatusBarColor(z3 ? c0304h.f5279b : c0304h.f5278a);
        window.setNavigationBarColor(c0304h2.f5279b);
        if (Build.VERSION.SDK_INT >= 30) {
            new C0385i(view).f5602e = view;
        }
        int i3 = Build.VERSION.SDK_INT;
        (i3 >= 30 ? new X(window) : i3 >= 26 ? new W(window) : new V(window)).M(!z3);
    }
}
