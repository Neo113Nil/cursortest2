package defpackage;

import android.view.MenuItem;
import android.view.Window;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class vi0 implements ti0, p10 {
    public final /* synthetic */ wi0 f;

    public /* synthetic */ vi0(wi0 wi0Var) {
        this.f = wi0Var;
    }

    @Override // defpackage.p10
    public boolean g(r10 r10Var, MenuItem menuItem) {
        return false;
    }

    @Override // defpackage.p10
    public void o(r10 r10Var) {
        wi0 wi0Var = this.f;
        boolean o = wi0Var.s.a.o();
        Window.Callback callback = wi0Var.t;
        if (o) {
            callback.onPanelClosed(108, r10Var);
        } else if (callback.onPreparePanel(0, null, r10Var)) {
            callback.onMenuOpened(108, r10Var);
        }
    }
}
