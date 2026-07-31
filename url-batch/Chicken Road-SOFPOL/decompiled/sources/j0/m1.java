package j0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class m1 implements p6.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f1 f3773d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f3774e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f3775f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r.u0 f3776g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p6.e f3777h;

    public m1(f1 f1Var, boolean z3, boolean z7, r.u0 u0Var, p6.e eVar) {
        this.f3773d = f1Var;
        this.f3774e = z3;
        this.f3775f = z7;
        this.f3776g = u0Var;
        this.f3777h = eVar;
    }

    @Override // p6.e
    public final Object g(Object obj, Object obj2) {
        m0.s sVar = (m0.s) obj;
        int intValue = ((Number) obj2).intValue();
        if (sVar.N(intValue & 1, (intValue & 3) != 2)) {
            g2.i0 a8 = p2.a(l0.m.i, sVar);
            boolean z3 = this.f3775f;
            f1 f1Var = this.f3773d;
            k0.d.a(((f1.s) q.s0.a(!z3 ? f1Var.f3643g : this.f3774e ? f1Var.f3638b : f1Var.f3641e, this.f3776g, sVar).getValue()).f2705a, a8, this.f3777h, sVar, 0);
        } else {
            sVar.Q();
        }
        return c6.m.f1757a;
    }
}
