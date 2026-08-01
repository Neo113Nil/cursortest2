package defpackage;

import android.window.OnBackInvokedDispatcher;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final /* synthetic */ class pd implements jx {
    public final /* synthetic */ y40 f;
    public final /* synthetic */ yd g;

    public /* synthetic */ pd(y40 y40Var, yd ydVar) {
        this.f = y40Var;
        this.g = ydVar;
    }

    @Override // defpackage.jx
    public final void i(lx lxVar, fx fxVar) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (fxVar == fx.ON_CREATE) {
            onBackInvokedDispatcher = this.g.getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            this.f.b(onBackInvokedDispatcher);
        }
    }
}
