package defpackage;

import android.view.MenuItem;
import android.view.Window;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class h60 implements f60, kt {
    public final /* synthetic */ i60 f;

    @Override // defpackage.kt
    public boolean i(mt mtVar, MenuItem menuItem) {
        return false;
    }

    @Override // defpackage.kt
    public void r(mt mtVar) {
        i60 i60Var = this.f;
        boolean o = i60Var.s.a.o();
        Window.Callback callback = i60Var.t;
        if (o) {
            callback.onPanelClosed(108, mtVar);
        } else if (callback.onPreparePanel(0, null, mtVar)) {
            callback.onMenuOpened(108, mtVar);
        }
    }
}
