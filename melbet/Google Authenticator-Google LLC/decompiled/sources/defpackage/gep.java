package defpackage;

import android.os.Bundle;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gep implements aec {
    final /* synthetic */ bd a;
    final /* synthetic */ gpj b;

    public gep(gpj gpjVar, bd bdVar) {
        this.a = bdVar;
        this.b = gpjVar;
    }

    @Override // defpackage.aec
    public final void a(aer aerVar) {
        bd bdVar = this.a;
        agp agpVar = new agp(bdVar.P());
        agpVar.b(afx.c, Bundle.EMPTY);
        this.b.b = (ger) new agj(bdVar.O(), bdVar.N(), agpVar).a(ger.class);
    }

    @Override // defpackage.aec
    public final void b(aer aerVar) {
        gpj gpjVar = this.b;
        gbf gbfVar = (gbf) gpjVar.a;
        gbfVar.c();
        gbfVar.a();
        ger gerVar = (ger) gpjVar.b;
        Iterator it = gerVar.a.values().iterator();
        while (it.hasNext()) {
            ((geu) it.next()).c();
        }
        Iterator it2 = gerVar.b.values().iterator();
        while (it2.hasNext()) {
            ((geu) it2.next()).c();
        }
        gerVar.c.c();
        gerVar.d.clear();
    }

    @Override // defpackage.aec
    public final void e(aer aerVar) {
        gpj gpjVar = this.b;
        ((gbf) gpjVar.a).b();
        ger gerVar = (ger) gpjVar.b;
        gerVar.c.g();
        for (Integer num : gerVar.b.keySet()) {
            hoq.J(gerVar.d.contains(num), "Did not re-register a subscription for @ResId %s. You must re-register all subscriptions you previously had after a configuration change, so that you don't lose user state.", num.intValue());
        }
        ((ger) gpjVar.b).e.b();
    }

    @Override // defpackage.aec
    public final void f(aer aerVar) {
        gpj gpjVar = this.b;
        ((ger) gpjVar.b).e.c();
        ((gbf) gpjVar.a).c();
    }

    @Override // defpackage.aec
    public final /* synthetic */ void bJ(aer aerVar) {
    }

    @Override // defpackage.aec
    public final /* synthetic */ void d(aer aerVar) {
    }
}
