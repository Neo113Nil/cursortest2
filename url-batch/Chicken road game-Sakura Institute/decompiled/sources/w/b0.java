package w;

import g0.m2;
import s1.f1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b0 extends r6.l implements q6.f {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f9194g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f9195h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ a2.k0 f9196i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(int i7, int i8, a2.k0 k0Var) {
        super(3);
        this.f9194g = i7;
        this.f9195h = i8;
        this.f9196i = k0Var;
    }

    @Override // q6.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        g0.p pVar = (g0.p) obj2;
        ((Number) obj3).intValue();
        pVar.Q(408240218);
        int i7 = this.f9194g;
        int i8 = this.f9195h;
        g0.s(i7, i8);
        s0.l lVar = s0.l.f8103a;
        if (i7 == 1 && i8 == Integer.MAX_VALUE) {
            pVar.p(false);
            return lVar;
        }
        m2.b bVar = (m2.b) pVar.k(f1.f8217f);
        f2.d dVar = (f2.d) pVar.k(f1.f8220i);
        m2.k kVar = (m2.k) pVar.k(f1.f8223l);
        a2.k0 k0Var = this.f9196i;
        boolean f9 = pVar.f(k0Var) | pVar.f(kVar);
        Object G = pVar.G();
        g0.t0 t0Var = g0.l.f3784a;
        if (f9 || G == t0Var) {
            G = t6.a.J(k0Var, kVar);
            pVar.a0(G);
        }
        a2.k0 k0Var2 = (a2.k0) G;
        boolean f10 = pVar.f(dVar) | pVar.f(k0Var2);
        Object G2 = pVar.G();
        if (f10 || G2 == t0Var) {
            a2.d0 d0Var = k0Var2.f412a;
            f2.q qVar = d0Var.f352f;
            f2.k kVar2 = d0Var.f349c;
            if (kVar2 == null) {
                kVar2 = f2.k.f3278h;
            }
            f2.i iVar = d0Var.f350d;
            int i9 = iVar != null ? iVar.f3275a : 0;
            f2.j jVar = d0Var.f351e;
            G2 = ((f2.e) dVar).b(qVar, kVar2, i9, jVar != null ? jVar.f3276a : 1);
            pVar.a0(G2);
        }
        m2 m2Var = (m2) G2;
        boolean f11 = pVar.f(m2Var.getValue()) | pVar.f(bVar) | pVar.f(dVar) | pVar.f(k0Var) | pVar.f(kVar);
        Object G3 = pVar.G();
        if (f11 || G3 == t0Var) {
            G3 = Integer.valueOf((int) (p0.a(k0Var2, bVar, dVar, p0.f9378a, 1) & 4294967295L));
            pVar.a0(G3);
        }
        int intValue = ((Number) G3).intValue();
        boolean f12 = pVar.f(m2Var.getValue()) | pVar.f(bVar) | pVar.f(dVar) | pVar.f(k0Var) | pVar.f(kVar);
        Object G4 = pVar.G();
        if (f12 || G4 == t0Var) {
            StringBuilder sb = new StringBuilder();
            String str = p0.f9378a;
            sb.append(str);
            sb.append('\n');
            sb.append(str);
            G4 = Integer.valueOf((int) (p0.a(k0Var2, bVar, dVar, sb.toString(), 2) & 4294967295L));
            pVar.a0(G4);
        }
        int intValue2 = ((Number) G4).intValue() - intValue;
        Integer valueOf = i7 == 1 ? null : Integer.valueOf(((i7 - 1) * intValue2) + intValue);
        Integer valueOf2 = i8 != Integer.MAX_VALUE ? Integer.valueOf(((i8 - 1) * intValue2) + intValue) : null;
        s0.o d8 = androidx.compose.foundation.layout.c.d(lVar, valueOf != null ? bVar.k0(valueOf.intValue()) : Float.NaN, valueOf2 != null ? bVar.k0(valueOf2.intValue()) : Float.NaN);
        pVar.p(false);
        return d8;
    }
}
