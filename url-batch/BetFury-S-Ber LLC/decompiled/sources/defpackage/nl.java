package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public class nl {
    public void b(ah0 ah0Var, ah0 ah0Var2, Window window, View view, boolean z, boolean z2) {
        ah0Var.getClass();
        ah0Var2.getClass();
        window.getClass();
        view.getClass();
        ud0.z(window, false);
        window.setStatusBarColor(z ? ah0Var.b : ah0Var.a);
        window.setNavigationBarColor(z2 ? ah0Var2.b : ah0Var2.a);
        xy xyVar = new xy(view, 17);
        int i = Build.VERSION.SDK_INT;
        mc0 hp0Var = i >= 35 ? new hp0(window, xyVar) : i >= 30 ? new gp0(window, xyVar) : new ep0(window, xyVar);
        hp0Var.l(!z);
        hp0Var.k(!z2);
    }

    public void a(Window window) {
    }
}
