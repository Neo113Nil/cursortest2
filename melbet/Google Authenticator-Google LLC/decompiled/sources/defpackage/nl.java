package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public class nl extends nk {
    @Override // defpackage.nj, defpackage.np
    public void a(nx nxVar, nx nxVar2, Window window, View view, boolean z, boolean z2) {
        yk.b(window);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        window.setStatusBarContrastEnforced(false);
        window.setNavigationBarContrastEnforced(true);
        ym aaeVar = Build.VERSION.SDK_INT >= 35 ? new aae(window) : Build.VERSION.SDK_INT >= 30 ? new aad(window) : new aac(window);
        yn.d(!z, aaeVar);
        yn.c(true ^ z2, aaeVar);
    }
}
