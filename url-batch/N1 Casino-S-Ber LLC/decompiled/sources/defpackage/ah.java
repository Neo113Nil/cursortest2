package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public class ah extends zg {
    @Override // defpackage.yg
    public void b(b50 b50Var, b50 b50Var2, Window window, View view, boolean z, boolean z2) {
        b50Var.getClass();
        b50Var2.getClass();
        window.getClass();
        view.getClass();
        c90.a(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        window.setStatusBarContrastEnforced(false);
        window.setNavigationBarContrastEnforced(true);
        vw vwVar = new vw(view, 12);
        int i = Build.VERSION.SDK_INT;
        u90 vb0Var = i >= 35 ? new vb0(window, vwVar) : i >= 30 ? new ub0(window, vwVar) : new sb0(window, vwVar);
        vb0Var.d(!z);
        vb0Var.c(!z2);
    }
}
