package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kep extends jzk {
    final /* synthetic */ keq f;
    private final jzc g;
    private jzk h;
    private jzm i;

    public kep(keq keqVar, jzc jzcVar) {
        this.f = keqVar;
        this.g = jzcVar;
        jzm jzmVar = keqVar.a;
        this.i = jzmVar;
        this.h = jzmVar.a(jzcVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0025, code lost:
    
        if (r0.a.c().equals(r1.c()) == false) goto L9;
     */
    @Override // defpackage.jzk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final kbq a(jzg jzgVar) {
        kme kmeVar = (kme) jzgVar.c;
        if (kmeVar == null) {
            kmeVar = new kme(this.f.a, null);
        }
        jzm jzmVar = this.i;
        if (jzmVar != null) {
        }
        jzc jzcVar = this.g;
        jzcVar.f(jxi.a, new jzb(jze.a));
        this.h.d();
        jzm jzmVar2 = kmeVar.a;
        this.i = jzmVar2;
        jzk jzkVar = this.h;
        this.h = jzmVar2.a(jzcVar);
        jzcVar.a().b(2, "Load balancer changed from {0} to {1}", jzkVar.getClass().getSimpleName(), this.h.getClass().getSimpleName());
        Object obj = kmeVar.b;
        if (obj != null) {
            this.g.a().b(1, "Load-balancing config: {0}", obj);
        }
        jzk jzkVar2 = this.h;
        jwt jwtVar = jwt.a;
        return jzkVar2.a(new jzg(jzgVar.a, jzgVar.b, obj));
    }

    @Override // defpackage.jzk
    public final void b(kbq kbqVar) {
        this.h.b(kbqVar);
    }

    @Override // defpackage.jzk
    public final void c() {
        this.h.c();
    }

    @Override // defpackage.jzk
    public final void d() {
        this.h.d();
        this.h = null;
    }
}
