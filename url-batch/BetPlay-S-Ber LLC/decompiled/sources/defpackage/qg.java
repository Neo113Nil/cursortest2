package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public class qg {
    public void b(i50 i50Var, i50 i50Var2, Window window, View view, boolean z, boolean z2) {
        i50Var.getClass();
        i50Var2.getClass();
        window.getClass();
        view.getClass();
        op.P(window, false);
        window.setStatusBarColor(z ? i50Var.b : i50Var.a);
        window.setNavigationBarColor(z2 ? i50Var2.b : i50Var2.a);
        ix ixVar = new ix(view, 12);
        int i = Build.VERSION.SDK_INT;
        l70 ec0Var = i >= 35 ? new ec0(window, ixVar) : i >= 30 ? new dc0(window, ixVar) : new bc0(window, ixVar);
        ec0Var.U(!z);
        ec0Var.T(!z2);
    }

    public void a(Window window) {
    }
}
