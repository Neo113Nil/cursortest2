package w;

import a0.e1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class m extends r6.l implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ j0 f9312g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ a2.k0 f9313h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f9314i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f9315j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ x0 f9316k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g2.w f9317l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a0.s f9318m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ s0.o f9319n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ s0.o f9320o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ s0.o f9321p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ s0.o f9322q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ t.c f9323r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a0.x0 f9324s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f9325t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ q6.c f9326u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ g2.q f9327v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m2.b f9328w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(j0 j0Var, a2.k0 k0Var, int i7, int i8, x0 x0Var, g2.w wVar, a0.s sVar, s0.o oVar, s0.o oVar2, s0.o oVar3, s0.o oVar4, t.c cVar, a0.x0 x0Var2, boolean z8, q6.c cVar2, g2.q qVar, m2.b bVar) {
        super(2);
        this.f9312g = j0Var;
        this.f9313h = k0Var;
        this.f9314i = i7;
        this.f9315j = i8;
        this.f9316k = x0Var;
        this.f9317l = wVar;
        this.f9318m = sVar;
        this.f9319n = oVar;
        this.f9320o = oVar2;
        this.f9321p = oVar3;
        this.f9322q = oVar4;
        this.f9323r = cVar;
        this.f9324s = x0Var2;
        this.f9325t = z8;
        this.f9326u = cVar2;
        this.f9327v = qVar;
        this.f9328w = bVar;
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        s0.o b1Var;
        g0.p pVar = (g0.p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && pVar.x()) {
            pVar.L();
        } else {
            j0 j0Var = this.f9312g;
            s0.o e9 = androidx.compose.foundation.layout.c.e(s0.l.f8103a, ((m2.e) j0Var.f9261g.getValue()).f6312f, 0.0f, 2);
            int i7 = this.f9314i;
            int i8 = this.f9315j;
            a2.k0 k0Var = this.f9313h;
            s0.o a3 = s0.a.a(e9, new b0(i7, i8, k0Var));
            g2.w wVar = this.f9317l;
            long j8 = wVar.f4066b;
            boolean h3 = pVar.h(j0Var);
            Object G = pVar.G();
            if (h3 || G == g0.l.f3784a) {
                G = new r1.z0(10, j0Var);
                pVar.a0(G);
            }
            q6.a aVar = (q6.a) G;
            x0 x0Var = this.f9316k;
            o.j0 j0Var2 = (o.j0) x0Var.f9459e.getValue();
            int i9 = a2.j0.f407c;
            int i10 = (int) (j8 >> 32);
            long j9 = x0Var.f9458d;
            if (i10 == ((int) (j9 >> 32)) && (i10 = (int) (j8 & 4294967295L)) == ((int) (j9 & 4294967295L))) {
                i10 = a2.j0.e(j8);
            }
            x0Var.f9458d = j8;
            g2.d0 l8 = g0.l(this.f9318m, wVar.f4065a);
            int ordinal = j0Var2.ordinal();
            if (ordinal == 0) {
                b1Var = new b1(x0Var, i10, l8, aVar);
            } else {
                if (ordinal != 1) {
                    throw new b4.c();
                }
                b1Var = new c0(x0Var, i10, l8, aVar);
            }
            a.a.g(androidx.compose.foundation.relocation.a.a(s0.a.a(v0.d.e(a3).j(b1Var).j(this.f9319n).j(this.f9320o), new e1(6, k0Var)).j(this.f9321p).j(this.f9322q), this.f9323r), o0.f.b(-363167407, new d0.d0(this.f9324s, j0Var, this.f9325t, this.f9326u, wVar, this.f9327v, this.f9328w, this.f9315j), pVar), pVar, 48);
        }
        return d6.z.f2639a;
    }
}
