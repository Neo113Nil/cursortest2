package g4;

import com.android.installreferrer.api.InstallReferrerClient;
import com.chicken.road.whale.store.GroceryItem;
import com.chicken.road.whale.store.Meal;
import d0.a4;
import d0.b4;
import d0.d3;
import d0.x3;
import g0.k1;
import g0.n2;
import java.util.List;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class q extends r6.l implements q6.g {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4361g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ List f4362h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f4363i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(List list, Object obj, int i7) {
        super(4);
        this.f4361g = i7;
        this.f4362h = list;
        this.f4363i = obj;
    }

    @Override // q6.g
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int i7;
        int i8;
        long j8;
        switch (this.f4361g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                r.b bVar = (r.b) obj;
                int intValue = ((Number) obj2).intValue();
                g0.p pVar = (g0.p) obj3;
                int intValue2 = ((Number) obj4).intValue();
                q6.c cVar = (q6.c) this.f4363i;
                if ((intValue2 & 6) == 0) {
                    i7 = (pVar.f(bVar) ? 4 : 2) | intValue2;
                } else {
                    i7 = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i7 |= pVar.d(intValue) ? 32 : 16;
                }
                if ((i7 & 147) == 146 && pVar.x()) {
                    pVar.L();
                } else {
                    Meal meal = (Meal) this.f4362h.get(intValue);
                    pVar.Q(650772701);
                    s0.o b9 = androidx.compose.foundation.layout.c.b(s0.l.f8103a, 1.0f);
                    pVar.Q(-1780120913);
                    boolean f9 = pVar.f(cVar) | pVar.f(meal);
                    Object G = pVar.G();
                    if (f9 || G == g0.l.f3784a) {
                        G = new o(cVar, meal, 0);
                        pVar.a0(G);
                    }
                    pVar.p(false);
                    s0.o g9 = androidx.compose.foundation.layout.b.g(androidx.compose.foundation.a.d(b9, false, null, (q6.a) G, 7), 0.0f, 10, 1);
                    q.s a3 = q.q.a(q.j.f7293c, s0.b.f8089q, pVar, 0);
                    int i9 = pVar.P;
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
                    if (pVar.O || !r6.k.a(pVar.G(), Integer.valueOf(i9))) {
                        a0.m.q(i9, pVar, i9, hVar);
                    }
                    g0.d.Q(pVar, c4, r1.i.f7782c);
                    String name = meal.getName();
                    n2 n2Var = b4.f1865a;
                    x3.b(name, null, 0L, 0L, 0L, null, null, 0L, 0, false, 0, 0, ((a4) pVar.k(n2Var)).f1840j, pVar, 0, 0, 65534);
                    x3.b(meal.getCategory(), null, ((d0.q0) pVar.k(d0.s0.f2378a)).f2318s, 0L, 0L, null, null, 0L, 0, false, 0, 0, ((a4) pVar.k(n2Var)).f1845o, pVar, 0, 0, 65530);
                    pVar.p(true);
                    pVar.p(false);
                }
                break;
            default:
                Object obj5 = (r.b) obj;
                int intValue3 = ((Number) obj2).intValue();
                g0.p pVar2 = (g0.p) obj3;
                int intValue4 = ((Number) obj4).intValue();
                j0 j0Var = (j0) this.f4363i;
                if ((intValue4 & 6) == 0) {
                    i8 = (pVar2.f(obj5) ? 4 : 2) | intValue4;
                } else {
                    i8 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    i8 |= pVar2.d(intValue3) ? 32 : 16;
                }
                if ((i8 & 147) == 146 && pVar2.x()) {
                    pVar2.L();
                } else {
                    GroceryItem groceryItem = (GroceryItem) this.f4362h.get(intValue3);
                    pVar2.Q(-954985159);
                    s0.o b10 = androidx.compose.foundation.layout.c.b(s0.l.f8103a, 1.0f);
                    pVar2.Q(-1139183497);
                    boolean h3 = pVar2.h(j0Var) | pVar2.f(groceryItem);
                    Object G2 = pVar2.G();
                    Object obj6 = g0.l.f3784a;
                    if (h3 || G2 == obj6) {
                        G2 = new e0(j0Var, groceryItem, 0);
                        pVar2.a0(G2);
                    }
                    pVar2.p(false);
                    s0.o g10 = androidx.compose.foundation.layout.b.g(androidx.compose.foundation.a.d(b10, false, null, (q6.a) G2, 7), 0.0f, 4, 1);
                    q.m0 a9 = q.l0.a(q.j.f7291a, s0.b.f8088p, pVar2, 48);
                    int i10 = pVar2.P;
                    k1 m9 = pVar2.m();
                    s0.o c6 = s0.a.c(pVar2, g10);
                    r1.j.f7810d.getClass();
                    q6.a aVar = r1.i.f7781b;
                    pVar2.U();
                    if (pVar2.O) {
                        pVar2.l(aVar);
                    } else {
                        pVar2.d0();
                    }
                    g0.d.Q(pVar2, a9, r1.i.f7784e);
                    g0.d.Q(pVar2, m9, r1.i.f7783d);
                    r1.h hVar2 = r1.i.f7785f;
                    if (pVar2.O || !r6.k.a(pVar2.G(), Integer.valueOf(i10))) {
                        a0.m.q(i10, pVar2, i10, hVar2);
                    }
                    g0.d.Q(pVar2, c6, r1.i.f7782c);
                    boolean checked = groceryItem.getChecked();
                    pVar2.Q(917842870);
                    boolean h8 = pVar2.h(j0Var) | pVar2.f(groceryItem);
                    Object G3 = pVar2.G();
                    if (h8 || G3 == obj6) {
                        G3 = new f4.b(j0Var, 1, groceryItem);
                        pVar2.a0(G3);
                    }
                    pVar2.p(false);
                    d0.p0.a(checked, (q6.c) G3, null, false, null, pVar2, 0);
                    String name2 = groceryItem.getName();
                    s0.o a10 = q.n0.a();
                    a2.k0 k0Var = ((a4) pVar2.k(b4.f1865a)).f1840j;
                    l2.j jVar = groceryItem.getChecked() ? l2.j.f5879d : null;
                    if (groceryItem.getChecked()) {
                        pVar2.Q(917856141);
                        j8 = ((d0.q0) pVar2.k(d0.s0.f2378a)).A;
                    } else {
                        pVar2.Q(917857391);
                        j8 = ((d0.q0) pVar2.k(d0.s0.f2378a)).f2316q;
                    }
                    pVar2.p(false);
                    x3.b(name2, a10, j8, 0L, 0L, jVar, null, 0L, 0, false, 0, 0, k0Var, pVar2, 0, 0, 65272);
                    pVar2.Q(917860246);
                    boolean h9 = pVar2.h(j0Var) | pVar2.f(groceryItem);
                    Object G4 = pVar2.G();
                    if (h9 || G4 == obj6) {
                        G4 = new e0(j0Var, groceryItem, 1);
                        pVar2.a0(G4);
                    }
                    pVar2.p(false);
                    d3.d((q6.a) G4, null, false, null, w.f4428d, pVar2, 196608);
                    pVar2.p(true);
                    pVar2.p(false);
                }
                break;
        }
        return d6.z.f2639a;
    }
}
