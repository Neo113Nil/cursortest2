package defpackage;

import android.window.OnBackInvokedDispatcher;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final /* synthetic */ class ob implements yp {
    public final /* synthetic */ ew a;
    public final /* synthetic */ wb b;

    public /* synthetic */ ob(ew ewVar, wb wbVar) {
        this.a = ewVar;
        this.b = wbVar;
    }

    @Override // defpackage.yp
    public final void b(aq aqVar, up upVar) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (upVar == up.ON_CREATE) {
            onBackInvokedDispatcher = this.b.getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            this.a.b(onBackInvokedDispatcher);
        }
    }
}
