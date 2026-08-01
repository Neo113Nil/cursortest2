package defpackage;

import android.window.OnBackInvokedDispatcher;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final /* synthetic */ class qb implements lq {
    public final /* synthetic */ lw a;
    public final /* synthetic */ ac b;

    public /* synthetic */ qb(lw lwVar, ac acVar) {
        this.a = lwVar;
        this.b = acVar;
    }

    @Override // defpackage.lq
    public final void b(nq nqVar, gq gqVar) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (gqVar == gq.ON_CREATE) {
            onBackInvokedDispatcher = this.b.getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            this.a.b(onBackInvokedDispatcher);
        }
    }
}
