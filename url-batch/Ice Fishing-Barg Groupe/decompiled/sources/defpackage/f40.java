package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class f40 extends l40 {
    @Override // defpackage.l40
    public void lS5Rgt96tfkO(wc2 wc2Var, wc2 wc2Var2, Window window, View view, boolean z, boolean z2) {
        wc2Var.getClass();
        wc2Var2.getClass();
        window.getClass();
        view.getClass();
        ng0.rZjpSjn4zoMv(window, false);
        window.setStatusBarColor(z ? wc2Var.lS5Rgt96tfkO : wc2Var.PxuCJdSBwIXG);
        window.setNavigationBarColor(wc2Var2.lS5Rgt96tfkO);
        int i = Build.VERSION.SDK_INT;
        (i >= 35 ? new vt2(window) : i >= 30 ? new ut2(window) : i >= 26 ? new tt2(window) : new st2(window)).EpkonXwzFgDB(!z);
    }
}
