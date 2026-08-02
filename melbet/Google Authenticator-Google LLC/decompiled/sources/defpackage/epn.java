package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class epn implements ekq {
    final /* synthetic */ hvm a;
    public final /* synthetic */ epp b;

    public epn(epp eppVar, hvm hvmVar) {
        this.a = hvmVar;
        this.b = eppVar;
    }

    @Override // defpackage.ekq
    public final void g(eik eikVar) {
        epp eppVar = this.b;
        eppVar.d.a(3, eikVar.a);
        eppVar.a();
        eppVar.f = this.a.schedule(new drn(this, eikVar, 17, null), 10L, TimeUnit.SECONDS);
    }

    @Override // defpackage.ekq
    public final void j(eik eikVar) {
        epp eppVar = this.b;
        eppVar.d.a(4, eikVar.a);
        eppVar.a();
        eppVar.e = this.a.schedule(new drn(this, eikVar, 18, null), 10L, TimeUnit.SECONDS);
    }
}
