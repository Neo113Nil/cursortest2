package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class d30 implements ia, qn0 {
    public final ka f;
    public final /* synthetic */ e30 g;

    public d30(e30 e30Var, ka kaVar) {
        this.g = e30Var;
        this.f = kaVar;
    }

    @Override // defpackage.qn0
    public final void a(uc0 uc0Var, int i) {
        this.f.a(uc0Var, i);
    }

    @Override // defpackage.dg
    public final qg d() {
        return this.f.j;
    }

    @Override // defpackage.dg
    public final void e(Object obj) {
        this.f.e(obj);
    }

    @Override // defpackage.ia
    public final lm f(ja jaVar) {
        e30 e30Var = this.g;
        lm f = this.f.f(new ja(e30Var, this));
        if (f != null) {
            e30.m.set(e30Var, null);
        }
        return f;
    }

    @Override // defpackage.ia
    public final void j(ja jaVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e30.m;
        e30 e30Var = this.g;
        atomicReferenceFieldUpdater.set(e30Var, null);
        h hVar = new h(e30Var, this);
        ka kaVar = this.f;
        kaVar.B(sk0.a, kaVar.h, new ja(0, hVar));
    }

    @Override // defpackage.ia
    public final void k(Object obj) {
        this.f.k(obj);
    }
}
