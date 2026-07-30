package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class lf0 extends kf0 {
    @Override // defpackage.jf0, defpackage.of0
    public void b(es2 es2Var, es2 es2Var2, Window window, View view, boolean z, boolean z2) {
        es2Var.getClass();
        es2Var2.getClass();
        window.getClass();
        view.getClass();
        ak2.l(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        window.setStatusBarContrastEnforced(false);
        window.setNavigationBarContrastEnforced(true);
        int i = Build.VERSION.SDK_INT;
        nk2 h83Var = i >= 35 ? new h83(window) : i >= 30 ? new f83(window) : i >= 26 ? new e83(window) : new d83(window);
        h83Var.n(!z);
        h83Var.m(true ^ z2);
    }
}
