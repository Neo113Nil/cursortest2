package a0;

import com.android.installreferrer.api.InstallReferrerClient;
import g0.m2;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class e1 extends r6.l implements q6.f {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f55g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f56h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e1(int i7, Object obj) {
        super(3);
        this.f55g = i7;
        this.f56h = obj;
    }

    @Override // q6.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        long a3;
        long a9;
        int i7 = this.f55g;
        e6.v vVar = e6.v.f2827f;
        g0.t0 t0Var = g0.l.f3784a;
        Object obj4 = this.f56h;
        switch (i7) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                s0.o oVar = (s0.o) obj;
                g0.p pVar = (g0.p) obj2;
                ((Number) obj3).intValue();
                x0 x0Var = (x0) obj4;
                pVar.Q(1980580247);
                m2.b bVar = (m2.b) pVar.k(s1.f1.f8217f);
                Object G = pVar.G();
                if (G == t0Var) {
                    G = g0.d.J(new m2.j(0L), g0.t0.f3903k);
                    pVar.a0(G);
                }
                g0.z0 z0Var = (g0.z0) G;
                boolean h3 = pVar.h(x0Var);
                Object G2 = pVar.G();
                if (h3 || G2 == t0Var) {
                    G2 = new b1(x0Var, 0, z0Var);
                    pVar.a0(G2);
                }
                q6.a aVar = (q6.a) G2;
                boolean f9 = pVar.f(bVar);
                Object G3 = pVar.G();
                if (f9 || G3 == t0Var) {
                    G3 = new d1(bVar, z0Var, r2);
                    pVar.a0(G3);
                }
                l.n nVar = m0.f106a;
                s0.o a10 = s0.a.a(oVar, new j0(aVar, 0, (q6.c) G3));
                pVar.p(false);
                return a10;
            case 1:
                p1.n0 b9 = ((p1.e0) obj2).b(((m2.a) obj3).f6306a);
                return ((p1.h0) obj).C(b9.f7063f, b9.f7064g, vVar, new y(b9, 15, (k.v) obj4));
            case 2:
                long j8 = ((y0.c) obj3).f9778a;
                ((c0) obj4).f29h.c(((l1.v) obj2).f5832c);
                return d6.z.f2639a;
            case 3:
                g0.p pVar2 = (g0.p) obj2;
                ((Number) obj3).intValue();
                pVar2.Q(-1608161351);
                q6.c cVar = (q6.c) obj4;
                boolean f10 = pVar2.f(cVar);
                Object G4 = pVar2.G();
                if (f10 || G4 == t0Var) {
                    G4 = new q.u(cVar);
                    pVar2.a0(G4);
                }
                q.u uVar = (q.u) G4;
                pVar2.p(false);
                return uVar;
            case 4:
                g0.p pVar3 = (g0.p) obj2;
                ((Number) obj3).intValue();
                pVar3.Q(-1415685722);
                q.s0 s0Var = (q.s0) obj4;
                boolean f11 = pVar3.f(s0Var);
                Object G5 = pVar3.G();
                if (f11 || G5 == t0Var) {
                    G5 = new q.b0(s0Var);
                    pVar3.a0(G5);
                }
                q.b0 b0Var = (q.b0) G5;
                pVar3.p(false);
                return b0Var;
            case 5:
                long j9 = ((m2.a) obj3).f6306a;
                long j10 = ((w.y0) obj4).f9466f;
                p1.n0 b10 = ((p1.e0) obj2).b(m2.a.a(j9, v1.g.e((int) (j10 >> 32), m2.a.j(j9), m2.a.h(j9)), 0, v1.g.e((int) (j10 & 4294967295L), m2.a.i(j9), m2.a.g(j9)), 0, 10));
                return ((p1.h0) obj).C(b10.f7063f, b10.f7064g, vVar, new k.c0(b10, 8));
            default:
                g0.p pVar4 = (g0.p) obj2;
                ((Number) obj3).intValue();
                pVar4.Q(1582736677);
                m2.b bVar2 = (m2.b) pVar4.k(s1.f1.f8217f);
                f2.d dVar = (f2.d) pVar4.k(s1.f1.f8220i);
                m2.k kVar = (m2.k) pVar4.k(s1.f1.f8223l);
                a2.k0 k0Var = (a2.k0) obj4;
                boolean f12 = pVar4.f(k0Var) | pVar4.f(kVar);
                Object G6 = pVar4.G();
                if (f12 || G6 == t0Var) {
                    G6 = t6.a.J(k0Var, kVar);
                    pVar4.a0(G6);
                }
                a2.k0 k0Var2 = (a2.k0) G6;
                boolean f13 = pVar4.f(dVar) | pVar4.f(k0Var2);
                Object G7 = pVar4.G();
                if (f13 || G7 == t0Var) {
                    a2.d0 d0Var = k0Var2.f412a;
                    f2.q qVar = d0Var.f352f;
                    f2.k kVar2 = d0Var.f349c;
                    if (kVar2 == null) {
                        kVar2 = f2.k.f3278h;
                    }
                    f2.i iVar = d0Var.f350d;
                    int i8 = iVar != null ? iVar.f3275a : 0;
                    f2.j jVar = d0Var.f351e;
                    G7 = ((f2.e) dVar).b(qVar, kVar2, i8, jVar != null ? jVar.f3276a : 1);
                    pVar4.a0(G7);
                }
                m2 m2Var = (m2) G7;
                Object G8 = pVar4.G();
                Object obj5 = G8;
                if (G8 == t0Var) {
                    Object value = m2Var.getValue();
                    w.y0 y0Var = new w.y0();
                    y0Var.f9461a = kVar;
                    y0Var.f9462b = bVar2;
                    y0Var.f9463c = dVar;
                    y0Var.f9464d = k0Var;
                    y0Var.f9465e = value;
                    a9 = w.p0.a(k0Var, bVar2, dVar, w.p0.f9378a, 1);
                    y0Var.f9466f = a9;
                    pVar4.a0(y0Var);
                    obj5 = y0Var;
                }
                w.y0 y0Var2 = (w.y0) obj5;
                Object value2 = m2Var.getValue();
                if (kVar != y0Var2.f9461a || !r6.k.a(bVar2, y0Var2.f9462b) || !r6.k.a(dVar, y0Var2.f9463c) || !r6.k.a(k0Var2, y0Var2.f9464d) || !r6.k.a(value2, y0Var2.f9465e)) {
                    y0Var2.f9461a = kVar;
                    y0Var2.f9462b = bVar2;
                    y0Var2.f9463c = dVar;
                    y0Var2.f9464d = k0Var2;
                    y0Var2.f9465e = value2;
                    a3 = w.p0.a(k0Var2, bVar2, dVar, w.p0.f9378a, 1);
                    y0Var2.f9466f = a3;
                }
                boolean h8 = pVar4.h(y0Var2);
                Object G9 = pVar4.G();
                if (h8 || G9 == t0Var) {
                    G9 = new e1(5, y0Var2);
                    pVar4.a0(G9);
                }
                s0.o b11 = androidx.compose.ui.layout.a.b((q6.f) G9);
                pVar4.p(false);
                return b11;
        }
    }
}
