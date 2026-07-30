package g4;

import androidx.compose.foundation.layout.LayoutWeightElement;
import com.android.installreferrer.R;
import com.android.installreferrer.api.InstallReferrerClient;
import com.chicken.road.whale.store.Meal;
import d0.a4;
import d0.b4;
import d0.d3;
import d0.g2;
import d0.x3;
import g0.k1;
import g0.m2;
import g0.n2;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class d implements q6.f {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f4266f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f4267g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f4268h;

    public /* synthetic */ d(Object obj, int i7, Object obj2) {
        this.f4266f = i7;
        this.f4267g = obj;
        this.f4268h = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // q6.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        boolean z8;
        boolean h3;
        Object G;
        ?? r52;
        g0.p pVar;
        int i7 = this.f4266f;
        Object obj4 = g0.l.f3784a;
        s0.l lVar = s0.l.f8103a;
        d6.z zVar = d6.z.f2639a;
        Object obj5 = this.f4268h;
        Object obj6 = this.f4267g;
        switch (i7) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                q.t tVar = (q.t) obj;
                g0.p pVar2 = (g0.p) obj2;
                int intValue = ((Number) obj3).intValue();
                r6.k.f(tVar, "$this$NavigationRail");
                if ((intValue & 6) == 0) {
                    intValue |= pVar2.f(tVar) ? 4 : 2;
                }
                if ((intValue & 19) == 18 && pVar2.x()) {
                    pVar2.L();
                } else {
                    q.c.a(pVar2, q.t.a(tVar));
                    pVar2.Q(2137233170);
                    t3.v vVar = (t3.v) obj6;
                    t3.b0 b0Var = (t3.b0) obj5;
                    Iterator it = a0.f4243n.iterator();
                    while (it.hasNext()) {
                        a0 a0Var = (a0) it.next();
                        if (vVar != null) {
                            int i8 = t3.v.f8856n;
                            Iterator it2 = r4.a.E(vVar).iterator();
                            while (it2.hasNext()) {
                                if (r6.k.a(((t3.v) it2.next()).f8863l, a0Var.f4244f)) {
                                    z8 = true;
                                    pVar2.Q(-366141696);
                                    h3 = pVar2.h(b0Var) | pVar2.f(a0Var);
                                    G = pVar2.G();
                                    if (!h3 || G == obj4) {
                                        r52 = 0;
                                        G = new a(b0Var, false ? 1 : 0, a0Var);
                                        pVar2.a0(G);
                                    } else {
                                        r52 = 0;
                                    }
                                    pVar2.p(r52);
                                    g2.b(z8, (q6.a) G, o0.f.b(223981911, new c(a0Var, r52), pVar2), null, false, o0.f.b(-393988006, new c(a0Var, 1), pVar2), false, null, pVar2, 196992);
                                }
                            }
                        }
                        z8 = false;
                        pVar2.Q(-366141696);
                        h3 = pVar2.h(b0Var) | pVar2.f(a0Var);
                        G = pVar2.G();
                        if (h3) {
                        }
                        r52 = 0;
                        G = new a(b0Var, false ? 1 : 0, a0Var);
                        pVar2.a0(G);
                        pVar2.p(r52);
                        g2.b(z8, (q6.a) G, o0.f.b(223981911, new c(a0Var, r52), pVar2), null, false, o0.f.b(-393988006, new c(a0Var, 1), pVar2), false, null, pVar2, 196992);
                    }
                    pVar2.p(false);
                    q.c.a(pVar2, q.t.a(tVar));
                }
                return zVar;
            case 1:
                g0.p pVar3 = (g0.p) obj2;
                int intValue2 = ((Number) obj3).intValue();
                r6.k.f((q.t) obj, "$this$Card");
                if ((intValue2 & 17) == 16 && pVar3.x()) {
                    pVar3.L();
                } else {
                    s0.o e9 = androidx.compose.foundation.layout.b.e(lVar, 16);
                    String str = (String) obj6;
                    String str2 = (String) obj5;
                    q.s a3 = q.q.a(q.j.f7293c, s0.b.f8089q, pVar3, 0);
                    int i9 = pVar3.P;
                    k1 m8 = pVar3.m();
                    s0.o c4 = s0.a.c(pVar3, e9);
                    r1.j.f7810d.getClass();
                    r1.n nVar = r1.i.f7781b;
                    pVar3.U();
                    if (pVar3.O) {
                        pVar3.l(nVar);
                    } else {
                        pVar3.d0();
                    }
                    g0.d.Q(pVar3, a3, r1.i.f7784e);
                    g0.d.Q(pVar3, m8, r1.i.f7783d);
                    r1.h hVar = r1.i.f7785f;
                    if (pVar3.O || !r6.k.a(pVar3.G(), Integer.valueOf(i9))) {
                        a0.m.q(i9, pVar3, i9, hVar);
                    }
                    g0.d.Q(pVar3, c4, r1.i.f7782c);
                    n2 n2Var = b4.f1865a;
                    a2.k0 k0Var = ((a4) pVar3.k(n2Var)).f1836f;
                    n2 n2Var2 = d0.s0.f2378a;
                    x3.b(str, null, ((d0.q0) pVar3.k(n2Var2)).f2300a, 0L, 0L, null, null, 0L, 0, false, 1, 0, k0Var, pVar3, 0, 3072, 57338);
                    x3.b(str2, null, ((d0.q0) pVar3.k(n2Var2)).f2318s, 0L, 0L, null, null, 0L, 0, false, 0, 0, ((a4) pVar3.k(n2Var)).f1844n, pVar3, 0, 0, 65530);
                    pVar3.p(true);
                }
                return zVar;
            case 2:
                q.h0 h0Var = (q.h0) obj;
                g0.p pVar4 = (g0.p) obj2;
                int intValue3 = ((Number) obj3).intValue();
                r6.k.f(h0Var, "pad");
                if ((intValue3 & 6) == 0) {
                    intValue3 |= pVar4.f(h0Var) ? 4 : 2;
                }
                if ((intValue3 & 19) == 18 && pVar4.x()) {
                    pVar4.L();
                } else {
                    s0.o j8 = androidx.compose.foundation.layout.b.d(lVar, h0Var).j(androidx.compose.foundation.layout.c.f640c);
                    m2 m2Var = (m2) obj6;
                    j0 j0Var = (j0) obj5;
                    q.s a9 = q.q.a(q.j.f7293c, s0.b.f8089q, pVar4, 0);
                    int i10 = pVar4.P;
                    k1 m9 = pVar4.m();
                    s0.o c6 = s0.a.c(pVar4, j8);
                    r1.j.f7810d.getClass();
                    r1.n nVar2 = r1.i.f7781b;
                    pVar4.U();
                    if (pVar4.O) {
                        pVar4.l(nVar2);
                    } else {
                        pVar4.d0();
                    }
                    g0.d.Q(pVar4, a9, r1.i.f7784e);
                    g0.d.Q(pVar4, m9, r1.i.f7783d);
                    r1.h hVar2 = r1.i.f7785f;
                    if (pVar4.O || !r6.k.a(pVar4.G(), Integer.valueOf(i10))) {
                        a0.m.q(i10, pVar4, i10, hVar2);
                    }
                    g0.d.Q(pVar4, c6, r1.i.f7782c);
                    if (((List) m2Var.getValue()).isEmpty()) {
                        pVar4.Q(-337674809);
                        a8.d.b(u3.q.j(R.string.grocery_empty, pVar4), null, pVar4, 0, 2);
                        pVar4.p(false);
                        pVar = pVar4;
                    } else {
                        pVar4.Q(-337543245);
                        if (1.0f <= 0.0d) {
                            throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero");
                        }
                        s0.o b9 = androidx.compose.foundation.layout.c.b(new LayoutWeightElement(1.0f, true), 1.0f);
                        float f9 = 16;
                        float f10 = 8;
                        q.h0 h0Var2 = new q.h0(f9, f10, f9, f10);
                        pVar4.Q(-1257808728);
                        boolean f11 = pVar4.f(m2Var) | pVar4.h(j0Var);
                        Object G2 = pVar4.G();
                        Object obj7 = G2;
                        if (f11 || G2 == obj4) {
                            d7.d dVar = new d7.d(m2Var, 2, j0Var);
                            pVar4.a0(dVar);
                            obj7 = dVar;
                        }
                        pVar4.p(false);
                        r4.a.e(384, 250, pVar4, null, null, h0Var2, (q6.c) obj7, null, null, b9, false);
                        pVar4.Q(-1257771841);
                        boolean h8 = pVar4.h(j0Var);
                        Object G3 = pVar4.G();
                        Object obj8 = G3;
                        if (h8 || G3 == obj4) {
                            c0 c0Var = new c0(j0Var, 1);
                            pVar4.a0(c0Var);
                            obj8 = c0Var;
                        }
                        pVar4.p(false);
                        d3.e((q6.a) obj8, androidx.compose.foundation.layout.b.e(lVar, f10), false, null, null, null, w.f4429e, pVar4, 805306416, 508);
                        g0.p pVar5 = pVar4;
                        pVar5.p(false);
                        pVar = pVar5;
                    }
                    pVar.p(true);
                }
                return zVar;
            case 3:
                g0.p pVar6 = (g0.p) obj2;
                int intValue4 = ((Number) obj3).intValue();
                r6.k.f((q.t) obj, "$this$Card");
                if ((intValue4 & 17) == 16 && pVar6.x()) {
                    pVar6.L();
                } else {
                    s0.o e10 = androidx.compose.foundation.layout.b.e(lVar, 14);
                    q0 q0Var = (q0) obj6;
                    Meal meal = (Meal) obj5;
                    q.m0 a10 = q.l0.a(q.j.f7291a, s0.b.f8088p, pVar6, 48);
                    int i11 = pVar6.P;
                    k1 m10 = pVar6.m();
                    s0.o c9 = s0.a.c(pVar6, e10);
                    r1.j.f7810d.getClass();
                    r1.n nVar3 = r1.i.f7781b;
                    pVar6.U();
                    if (pVar6.O) {
                        pVar6.l(nVar3);
                    } else {
                        pVar6.d0();
                    }
                    r1.h hVar3 = r1.i.f7784e;
                    g0.d.Q(pVar6, a10, hVar3);
                    r1.h hVar4 = r1.i.f7783d;
                    g0.d.Q(pVar6, m10, hVar4);
                    r1.h hVar5 = r1.i.f7785f;
                    if (pVar6.O || !r6.k.a(pVar6.G(), Integer.valueOf(i11))) {
                        a0.m.q(i11, pVar6, i11, hVar5);
                    }
                    r1.h hVar6 = r1.i.f7782c;
                    g0.d.Q(pVar6, c9, hVar6);
                    s0.o a11 = q.n0.a();
                    q.s a12 = q.q.a(q.j.f7293c, s0.b.f8089q, pVar6, 0);
                    int i12 = pVar6.P;
                    k1 m11 = pVar6.m();
                    s0.o c10 = s0.a.c(pVar6, a11);
                    pVar6.U();
                    if (pVar6.O) {
                        pVar6.l(nVar3);
                    } else {
                        pVar6.d0();
                    }
                    g0.d.Q(pVar6, a12, hVar3);
                    g0.d.Q(pVar6, m11, hVar4);
                    if (pVar6.O || !r6.k.a(pVar6.G(), Integer.valueOf(i12))) {
                        a0.m.q(i12, pVar6, i12, hVar5);
                    }
                    g0.d.Q(pVar6, c10, hVar6);
                    String name = meal.getName();
                    n2 n2Var3 = b4.f1865a;
                    x3.b(name, null, 0L, 0L, 0L, null, null, 0L, 0, false, 0, 0, ((a4) pVar6.k(n2Var3)).f1838h, pVar6, 0, 0, 65534);
                    String category = meal.getCategory();
                    a2.k0 k0Var2 = ((a4) pVar6.k(n2Var3)).f1844n;
                    n2 n2Var4 = d0.s0.f2378a;
                    x3.b(category, null, ((d0.q0) pVar6.k(n2Var4)).f2305f, 0L, 0L, null, null, 0L, 0, false, 0, 0, k0Var2, pVar6, 0, 0, 65530);
                    pVar6.Q(1208669687);
                    if (!z6.h.G(meal.getIngredients())) {
                        x3.b(meal.getIngredients(), null, ((d0.q0) pVar6.k(n2Var4)).f2318s, 0L, 0L, null, null, 0L, 0, false, 2, 0, ((a4) pVar6.k(n2Var3)).f1842l, pVar6, 0, 3072, 57338);
                    }
                    pVar6.p(false);
                    pVar6.p(true);
                    pVar6.Q(1818806201);
                    boolean h9 = pVar6.h(q0Var) | pVar6.f(meal);
                    Object G4 = pVar6.G();
                    Object obj9 = G4;
                    if (h9 || G4 == obj4) {
                        o oVar = new o(q0Var, meal, 2);
                        pVar6.a0(oVar);
                        obj9 = oVar;
                    }
                    pVar6.p(false);
                    d3.d((q6.a) obj9, null, false, null, x.f4438d, pVar6, 196608);
                    pVar6.p(true);
                }
                return zVar;
            default:
                q.h0 h0Var3 = (q.h0) obj;
                g0.p pVar7 = (g0.p) obj2;
                int intValue5 = ((Number) obj3).intValue();
                m2 m2Var2 = (m2) obj6;
                r6.k.f(h0Var3, "pad");
                if ((intValue5 & 6) == 0) {
                    intValue5 |= pVar7.f(h0Var3) ? 4 : 2;
                }
                if ((intValue5 & 19) == 18 && pVar7.x()) {
                    pVar7.L();
                } else {
                    s0.o j9 = androidx.compose.foundation.layout.b.d(lVar, h0Var3).j(androidx.compose.foundation.layout.c.f640c);
                    float f12 = 16;
                    q.h0 h0Var4 = new q.h0(f12, f12, f12, f12);
                    q.b bVar = q.j.f7291a;
                    q.g gVar = new q.g(12);
                    pVar7.Q(267149443);
                    boolean f13 = pVar7.f(m2Var2);
                    g0.z0 z0Var = (g0.z0) obj5;
                    Object G5 = pVar7.G();
                    if (f13 || G5 == obj4) {
                        G5 = new d7.d(m2Var2, 3, z0Var);
                        pVar7.a0(G5);
                    }
                    pVar7.p(false);
                    r4.a.e(24960, 234, pVar7, null, gVar, h0Var4, (q6.c) G5, null, null, j9, false);
                }
                return zVar;
        }
    }
}
