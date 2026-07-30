package g4;

import d0.r2;
import g0.k1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class n implements q6.e {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g0.z0 f4341f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g0.z0 f4342g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ g0.z0 f4343h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ g0.z0 f4344i;

    public n(g0.z0 z0Var, g0.z0 z0Var2, g0.z0 z0Var3, g0.z0 z0Var4) {
        this.f4341f = z0Var;
        this.f4342g = z0Var2;
        this.f4343h = z0Var3;
        this.f4344i = z0Var4;
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        g0.p pVar = (g0.p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && pVar.x()) {
            pVar.L();
        } else {
            q.b bVar = q.j.f7291a;
            q.s a3 = q.q.a(new q.g(8), s0.b.f8089q, pVar, 6);
            int i7 = pVar.P;
            k1 m8 = pVar.m();
            s0.o c4 = s0.a.c(pVar, s0.l.f8103a);
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
                a0.m.q(i7, pVar, i7, hVar);
            }
            g0.d.Q(pVar, c4, r1.i.f7782c);
            g0.z0 z0Var = this.f4341f;
            String str = (String) z0Var.getValue();
            pVar.Q(1497240592);
            Object G = pVar.G();
            g0.t0 t0Var = g0.l.f3784a;
            if (G == t0Var) {
                G = new m(z0Var, 0);
                pVar.a0(G);
            }
            pVar.p(false);
            r2.a(str, (q6.c) G, null, false, null, v.f4418f, null, null, null, true, 0, 0, null, null, pVar, 1572912, 12582912, 8257468);
            g0.z0 z0Var2 = this.f4342g;
            String str2 = (String) z0Var2.getValue();
            pVar.Q(1497243924);
            Object G2 = pVar.G();
            if (G2 == t0Var) {
                G2 = new m(z0Var2, 1);
                pVar.a0(G2);
            }
            pVar.p(false);
            r2.a(str2, (q6.c) G2, null, false, null, v.f4419g, null, null, null, true, 0, 0, null, null, pVar, 1572912, 12582912, 8257468);
            g0.z0 z0Var3 = this.f4343h;
            String str3 = (String) z0Var3.getValue();
            pVar.Q(1497247607);
            Object G3 = pVar.G();
            if (G3 == t0Var) {
                G3 = new m(z0Var3, 2);
                pVar.a0(G3);
            }
            pVar.p(false);
            r2.a(str3, (q6.c) G3, null, false, null, v.f4420h, null, null, null, false, 0, 0, null, null, pVar, 1572912, 0, 8388540);
            g0.z0 z0Var4 = this.f4344i;
            String str4 = (String) z0Var4.getValue();
            pVar.Q(1497251249);
            Object G4 = pVar.G();
            if (G4 == t0Var) {
                G4 = new m(z0Var4, 3);
                pVar.a0(G4);
            }
            pVar.p(false);
            r2.a(str4, (q6.c) G4, null, false, null, v.f4421i, null, null, null, false, 0, 0, null, null, pVar, 1572912, 0, 8388540);
            pVar.p(true);
        }
        return d6.z.f2639a;
    }
}
