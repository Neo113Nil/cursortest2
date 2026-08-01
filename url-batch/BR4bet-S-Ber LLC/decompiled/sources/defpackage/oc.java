package defpackage;

import android.window.OnBackInvokedDispatcher;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final /* synthetic */ class oc implements ks {
    public final /* synthetic */ hz f;
    public final /* synthetic */ wc g;

    public /* synthetic */ oc(hz hzVar, wc wcVar) {
        this.f = hzVar;
        this.g = wcVar;
    }

    @Override // defpackage.ks
    public final void f(ms msVar, gs gsVar) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (gsVar == gs.ON_CREATE) {
            onBackInvokedDispatcher = this.g.getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            this.f.b(onBackInvokedDispatcher);
        }
    }
}
