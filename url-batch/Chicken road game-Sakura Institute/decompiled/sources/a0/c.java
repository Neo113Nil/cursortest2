package a0;

import g0.k1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c extends r6.l implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f24g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f25h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ s0.o f26i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ o f27j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(long j8, boolean z8, s0.o oVar, o oVar2) {
        super(2);
        this.f24g = j8;
        this.f25h = z8;
        this.f26i = oVar;
        this.f27j = oVar2;
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        g0.p pVar = (g0.p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && pVar.x()) {
            pVar.L();
        } else {
            long j8 = this.f24g;
            g0.t0 t0Var = g0.l.f3784a;
            o oVar = this.f27j;
            boolean z8 = this.f25h;
            if (j8 != 9205357640488583168L) {
                pVar.Q(-837727128);
                q.b bVar = z8 ? q.c.f7258b : q.c.f7257a;
                s0.o g9 = androidx.compose.foundation.layout.c.g(this.f26i, Float.intBitsToFloat((int) (j8 >> 32)), Float.intBitsToFloat((int) (j8 & 4294967295L)), 0.0f, 0.0f, 12);
                q.m0 a3 = q.l0.a(bVar, s0.b.f8087o, pVar, 0);
                int i7 = pVar.P;
                k1 m8 = pVar.m();
                s0.o c4 = s0.a.c(pVar, g9);
                r1.j.f7810d.getClass();
                r1.n nVar = r1.i.f7781b;
                pVar.U();
                if (pVar.O) {
                    pVar.l(nVar);
                } else {
                    pVar.d0();
                }
                g0.d.Q(pVar, a3, r1.i.f7784e);
                g0.d.Q(pVar, m8, r1.i.f7783d);
                r1.h hVar = r1.i.f7785f;
                if (pVar.O || !r6.k.a(pVar.G(), Integer.valueOf(i7))) {
                    m.q(i7, pVar, i7, hVar);
                }
                g0.d.Q(pVar, c4, r1.i.f7782c);
                boolean h3 = pVar.h(oVar);
                Object G = pVar.G();
                if (h3 || G == t0Var) {
                    G = new b(oVar, 0);
                    pVar.a0(G);
                }
                a.a.f(s0.l.f8103a, (q6.a) G, z8, pVar, 6);
                pVar.p(true);
                pVar.p(false);
            } else {
                pVar.Q(-836867312);
                boolean h8 = pVar.h(oVar);
                Object G2 = pVar.G();
                if (h8 || G2 == t0Var) {
                    G2 = new b(oVar, 1);
                    pVar.a0(G2);
                }
                a.a.f(this.f26i, (q6.a) G2, z8, pVar, 0);
                pVar.p(false);
            }
        }
        return d6.z.f2639a;
    }
}
