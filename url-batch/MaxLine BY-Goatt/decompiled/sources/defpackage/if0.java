package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class if0 extends of0 {
    @Override // defpackage.of0
    public void b(es2 es2Var, es2 es2Var2, Window window, View view, boolean z, boolean z2) {
        es2Var.getClass();
        es2Var2.getClass();
        window.getClass();
        view.getClass();
        ak2.l(window, false);
        window.setStatusBarColor(z ? es2Var.b : es2Var.a);
        window.setNavigationBarColor(es2Var2.b);
        int i = Build.VERSION.SDK_INT;
        (i >= 35 ? new h83(window) : i >= 30 ? new f83(window) : i >= 26 ? new e83(window) : new d83(window)).n(!z);
    }
}
