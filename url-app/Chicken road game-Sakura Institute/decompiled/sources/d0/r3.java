package d0;

import androidx.compose.material3.MinimumInteractiveModifier;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class r3 extends r6.l implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ s0.o f2360g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ z0.p0 f2361h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f2362i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f2363j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ m.n f2364k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p.j f2365l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f2366m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ q6.a f2367n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f2368o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ o0.a f2369p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(s0.o oVar, z0.p0 p0Var, long j8, float f9, m.n nVar, p.j jVar, boolean z8, q6.a aVar, float f10, o0.a aVar2) {
        super(2);
        this.f2360g = oVar;
        this.f2361h = p0Var;
        this.f2362i = j8;
        this.f2363j = f9;
        this.f2364k = nVar;
        this.f2365l = jVar;
        this.f2366m = z8;
        this.f2367n = aVar;
        this.f2368o = f10;
        this.f2369p = aVar2;
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        g0.p pVar = (g0.p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && pVar.x()) {
            pVar.L();
        } else {
            g0.n2 n2Var = r1.f2357a;
            s0.o c4 = androidx.compose.foundation.a.c(s3.c(this.f2360g.j(MinimumInteractiveModifier.f694a), this.f2361h, s3.d(this.f2362i, this.f2363j, pVar), this.f2364k, ((m2.b) pVar.k(s1.f1.f8217f)).y(this.f2368o)), this.f2365l, e3.a(0.0f, pVar, 0, 7), this.f2366m, null, this.f2367n, 24);
            p1.f0 e9 = q.n.e(s0.b.f8078f, true);
            int i7 = pVar.P;
            g0.k1 m8 = pVar.m();
            s0.o c6 = s0.a.c(pVar, c4);
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
            g0.d.Q(pVar, c6, r1.i.f7782c);
            this.f2369p.d(pVar, 0);
            pVar.p(true);
        }
        return d6.z.f2639a;
    }
}
