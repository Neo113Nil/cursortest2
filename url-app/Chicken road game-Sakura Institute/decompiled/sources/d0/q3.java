package d0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class q3 extends r6.l implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ s0.o f2328g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ z0.p0 f2329h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f2330i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f2331j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ m.n f2332k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f2333l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ o0.a f2334m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(s0.o oVar, z0.p0 p0Var, long j8, float f9, m.n nVar, float f10, o0.a aVar) {
        super(2);
        this.f2328g = oVar;
        this.f2329h = p0Var;
        this.f2330i = j8;
        this.f2331j = f9;
        this.f2332k = nVar;
        this.f2333l = f10;
        this.f2334m = aVar;
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        g0.p pVar = (g0.p) obj;
        int intValue = ((Number) obj2).intValue() & 3;
        d6.z zVar = d6.z.f2639a;
        if (intValue == 2 && pVar.x()) {
            pVar.L();
            return zVar;
        }
        s0.o a3 = l1.a0.a(y1.k.a(s3.c(this.f2328g, this.f2329h, s3.d(this.f2330i, this.f2331j, pVar), this.f2332k, ((m2.b) pVar.k(s1.f1.f8217f)).y(this.f2333l)), false, a0.f1816m), zVar, new p3(2, null, 0));
        p1.f0 e9 = q.n.e(s0.b.f8078f, true);
        int i7 = pVar.P;
        g0.k1 m8 = pVar.m();
        s0.o c4 = s0.a.c(pVar, a3);
        r1.j.f7810d.getClass();
        r1.n nVar = r1.i.f7781b;
        pVar.U();
        if (pVar.O) {
            pVar.l(nVar);
        } else {
            pVar.d0();
        }
        g0.d.Q(pVar, e9, r1.i.f7784e);
        g0.d.Q(pVar, m8, r1.i.f7783d);
        r1.h hVar = r1.i.f7785f;
        if (pVar.O || !r6.k.a(pVar.G(), Integer.valueOf(i7))) {
            a0.m.q(i7, pVar, i7, hVar);
        }
        g0.d.Q(pVar, c4, r1.i.f7782c);
        this.f2334m.d(pVar, 0);
        pVar.p(true);
        return zVar;
    }
}
