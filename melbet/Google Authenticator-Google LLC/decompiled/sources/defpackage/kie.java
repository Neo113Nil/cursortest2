package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kie extends jyb {
    public final jxr a;
    private final jym b;
    private final jwx c;
    private final Executor d;
    private final kae e;
    private jww f;
    private iws g;

    public kie(jym jymVar, jwx jwxVar, Executor executor, kae kaeVar, jww jwwVar) {
        this.b = jymVar;
        this.c = jwxVar;
        this.e = kaeVar;
        Executor executor2 = jwwVar.c;
        executor = executor2 != null ? executor2 : executor;
        this.d = executor;
        kby g = jww.g(jwwVar);
        g.a = executor;
        this.f = new jww(g);
        this.a = jxr.k();
    }

    @Override // defpackage.jyb, defpackage.iws
    public final void a(iwr iwrVar, kaa kaaVar) {
        kae kaeVar = this.e;
        new jzf(kaeVar, kaaVar, this.f, kiq.f);
        kuq a = this.b.a();
        kbq kbqVar = (kbq) a.b;
        if (!kbqVar.g()) {
            this.d.execute(new kid(this, iwrVar, khd.b(kbqVar)));
            this.g = kiq.U;
        } else {
            kix b = ((kiz) a.a).b(kaeVar);
            if (b != null) {
                this.f = this.f.d(kix.a, b);
            }
            iws b2 = this.c.b(kaeVar, this.f);
            this.g = b2;
            b2.a(iwrVar, kaaVar);
        }
    }

    @Override // defpackage.jyb, defpackage.kau
    protected final iws f() {
        return this.g;
    }

    @Override // defpackage.kau, defpackage.iws
    public final void r(String str, Throwable th) {
        iws iwsVar = this.g;
        if (iwsVar != null) {
            iwsVar.r(str, th);
        }
    }
}
