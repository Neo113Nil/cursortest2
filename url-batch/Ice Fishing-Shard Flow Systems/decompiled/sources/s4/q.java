package s4;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final f f7769a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7770b;

    /* renamed from: c, reason: collision with root package name */
    public final r f7771c;

    public q(f fVar, String str) {
        this(fVar, str, w.f7775a);
    }

    public final void a(String str, Object obj, p pVar) {
        this.f7769a.f(this.f7770b, this.f7771c.b(new n(obj, str)), pVar == null ? null : new C0892a(this, 1, pVar));
    }

    public final void b(o oVar) {
        P0.s sVar;
        if (oVar == null) {
            sVar = null;
        } else {
            P0.s sVar2 = new P0.s();
            sVar2.f2252e = this;
            sVar2.f2251d = oVar;
            sVar = sVar2;
        }
        this.f7769a.n(this.f7770b, sVar);
    }

    public q(f fVar, String str, r rVar) {
        this.f7769a = fVar;
        this.f7770b = str;
        this.f7771c = rVar;
    }
}
