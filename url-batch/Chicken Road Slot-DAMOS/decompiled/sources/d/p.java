package d;

import android.os.Build;
import android.view.View;
import android.view.Window;
import o3.l1;
import o3.m1;
import o3.n1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class p extends v {
    @Override // d.v
    public void b(f0 f0Var, f0 f0Var2, Window window, View view, boolean z10, boolean z11) {
        f0Var.getClass();
        f0Var2.getClass();
        window.getClass();
        view.getClass();
        g8.b.J(window, false);
        window.setStatusBarColor(z10 ? f0Var.f3229b : f0Var.f3228a);
        window.setNavigationBarColor(f0Var2.f3229b);
        l.d dVar = new l.d(view);
        int i3 = Build.VERSION.SDK_INT;
        (i3 >= 35 ? new n1(window, dVar, 1) : i3 >= 30 ? new l1(window, dVar, 1) : i3 >= 26 ? new m1(window, dVar, 0) : new l1(window, dVar, 0)).P(!z10);
    }
}
