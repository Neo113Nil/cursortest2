package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* compiled from: PG */
/* loaded from: classes.dex */
class nj extends no {
    @Override // defpackage.np
    public void a(nx nxVar, nx nxVar2, Window window, View view, boolean z, boolean z2) {
        yk.b(window);
        window.setStatusBarColor(nxVar.a(z));
        window.setNavigationBarColor(nxVar2.a(z2));
        ym aaeVar = Build.VERSION.SDK_INT >= 35 ? new aae(window) : Build.VERSION.SDK_INT >= 30 ? new aad(window) : new aac(window);
        yn.d(!z, aaeVar);
        yn.c(!z2, aaeVar);
    }
}
