package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public class bj extends aj {
    @Override // defpackage.zi
    public void b(e80 e80Var, e80 e80Var2, Window window, View view, boolean z, boolean z2) {
        e80Var.getClass();
        e80Var2.getClass();
        window.getClass();
        view.getClass();
        xf.H(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        window.setStatusBarContrastEnforced(false);
        window.setNavigationBarContrastEnforced(true);
        ky kyVar = new ky(view, 14);
        int i = Build.VERSION.SDK_INT;
        mz cf0Var = i >= 35 ? new cf0(window, kyVar) : i >= 30 ? new bf0(window, kyVar) : new ze0(window, kyVar);
        cf0Var.H(!z);
        cf0Var.G(!z2);
    }
}
