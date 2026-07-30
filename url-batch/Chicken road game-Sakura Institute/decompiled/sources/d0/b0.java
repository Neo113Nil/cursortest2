package d0;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Collection;
import java.util.List;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b0 extends r6.l implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1848g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f1849h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f1850i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(int i7, int i8, Object obj, Object obj2) {
        super(2);
        this.f1848g = i8;
        this.f1850i = obj;
        this.f1849h = obj2;
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        Object obj3;
        int i7 = this.f1848g;
        g0.t0 t0Var = g0.l.f3784a;
        s0.l lVar = s0.l.f8103a;
        int i8 = 2;
        int i9 = 3;
        d6.z zVar = d6.z.f2639a;
        Object obj4 = this.f1849h;
        Object obj5 = this.f1850i;
        switch (i7) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                g0.p pVar = (g0.p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && pVar.x()) {
                    pVar.L();
                } else {
                    s0.o d8 = androidx.compose.foundation.layout.b.d(androidx.compose.foundation.layout.c.a(lVar, x.f2514b, x.f2515c), (q.h0) obj5);
                    o0.a aVar = (o0.a) obj4;
                    q.m0 a3 = q.l0.a(q.j.f7295e, s0.b.f8088p, pVar, 54);
                    int i10 = pVar.P;
                    g0.k1 m8 = pVar.m();
                    s0.o c4 = s0.a.c(pVar, d8);
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
                    if (pVar.O || !r6.k.a(pVar.G(), Integer.valueOf(i10))) {
                        a0.m.q(i10, pVar, i10, hVar);
                    }
                    g0.d.Q(pVar, c4, r1.i.f7782c);
                    aVar.c(q.n0.f7313a, pVar, 6);
                    pVar.p(true);
                }
                return zVar;
            case 1:
                g0.p pVar2 = (g0.p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && pVar2.x()) {
                    pVar2.L();
                } else {
                    x3.a(((a4) obj5).f1840j, (o0.a) obj4, pVar2, 0);
                }
                return zVar;
            case 2:
                g0.p pVar3 = (g0.p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && pVar3.x()) {
                    pVar3.L();
                } else {
                    FillElement fillElement = androidx.compose.foundation.layout.c.f639b;
                    q1.h hVar2 = q.w0.f7372a;
                    s0.o l8 = androidx.compose.foundation.layout.c.l(s0.a.a(fillElement, new a0.e1(4, (q.s0) obj5)), f0.l.f2960c);
                    float f9 = g2.f1981a;
                    s0.o a9 = y1.k.a(androidx.compose.foundation.layout.b.g(l8, 0.0f, f9, 1), false, u.a.f8939g);
                    s0.e eVar = s0.b.f8090r;
                    q.b bVar = q.j.f7291a;
                    o0.a aVar2 = (o0.a) obj4;
                    q.s a10 = q.q.a(new q.g(f9), eVar, pVar3, 54);
                    int i11 = pVar3.P;
                    g0.k1 m9 = pVar3.m();
                    s0.o c6 = s0.a.c(pVar3, a9);
                    r1.j.f7810d.getClass();
                    r1.n nVar2 = r1.i.f7781b;
                    pVar3.U();
                    if (pVar3.O) {
                        pVar3.l(nVar2);
                    } else {
                        pVar3.d0();
                    }
                    g0.d.Q(pVar3, a10, r1.i.f7784e);
                    g0.d.Q(pVar3, m9, r1.i.f7783d);
                    r1.h hVar3 = r1.i.f7785f;
                    if (pVar3.O || !r6.k.a(pVar3.G(), Integer.valueOf(i11))) {
                        a0.m.q(i11, pVar3, i11, hVar3);
                    }
                    g0.d.Q(pVar3, c6, r1.i.f7782c);
                    pVar3.Q(722845512);
                    pVar3.p(false);
                    aVar2.c(q.t.f7341a, pVar3, 6);
                    pVar3.p(true);
                }
                return zVar;
            case 3:
                g0.p pVar4 = (g0.p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && pVar4.x()) {
                    pVar4.L();
                } else {
                    q.n.a(androidx.compose.foundation.d.a(v0.d.d(androidx.compose.ui.layout.a.c(lVar, "indicatorRipple"), (z0.p0) obj5), (e0.f) obj4, e3.a(0.0f, pVar4, 0, 7)), pVar4, 0);
                }
                return zVar;
            case 4:
                ((Number) obj2).intValue();
                x3.a((a2.k0) obj5, (o0.a) obj4, (g0.p) obj, g0.d.T(1));
                return zVar;
            case 5:
                ((Number) obj2).intValue();
                j1.c.B((s0.o) obj5, (q6.c) obj4, (g0.p) obj, g0.d.T(1));
                return zVar;
            case 6:
                ((Number) obj2).intValue();
                ((n.e) obj5).a((n.a) obj4, (g0.p) obj, g0.d.T(1));
                return zVar;
            case j3.i.DOUBLE_FIELD_NUMBER /* 7 */:
                ((Number) obj2).intValue();
                n.k.a((n.a) obj5, (o0.a) obj4, (g0.p) obj, g0.d.T(385));
                return zVar;
            case 8:
                g0.p pVar5 = (g0.p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && pVar5.x()) {
                    pVar5.L();
                } else {
                    n.a aVar3 = (n.a) obj5;
                    n.k.a(aVar3, o0.f.b(1156688164, new a0.j0((a0.y) obj4, i9, aVar3), pVar5), pVar5, 384);
                }
                return zVar;
            case q.c.f7259c /* 9 */:
                long j8 = ((y0.c) obj2).f9778a;
                a8.m.i((m1.c) obj5, (l1.v) obj);
                e7.e eVar2 = ((o.x0) obj4).f6796y;
                if (eVar2 != null) {
                    eVar2.e(new o.o(j8));
                }
                return zVar;
            case q.c.f7261e /* 10 */:
                g0.p pVar6 = (g0.p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && pVar6.x()) {
                    pVar6.L();
                } else {
                    Boolean bool = (Boolean) ((p1.t) obj5).f7086f.getValue();
                    boolean booleanValue = bool.booleanValue();
                    q6.e eVar3 = (q6.e) obj4;
                    pVar6.T(bool);
                    boolean g9 = pVar6.g(booleanValue);
                    pVar6.Q(-869707859);
                    if (booleanValue) {
                        eVar3.d(pVar6, 0);
                    } else {
                        if (pVar6.f3830k != 0) {
                            g0.d.w("No nodes can be emitted before calling dactivateToEndGroup");
                            throw null;
                        }
                        if (!pVar6.O) {
                            if (g9) {
                                g0.x1 x1Var = pVar6.F;
                                int i12 = x1Var.f3964g;
                                int i13 = x1Var.f3965h;
                                h0.b bVar2 = pVar6.L;
                                bVar2.getClass();
                                bVar2.d(false);
                                bVar2.f4590b.f4587g.Z(h0.f.f4616c);
                                g0.d.q(pVar6.f3837r, i12, i13);
                                pVar6.F.m();
                            } else {
                                pVar6.K();
                            }
                        }
                    }
                    pVar6.p(false);
                    if (pVar6.f3843x && pVar6.F.f3966i == pVar6.f3844y) {
                        pVar6.f3844y = -1;
                        pVar6.f3843x = false;
                    }
                    pVar6.p(false);
                }
                return zVar;
            case 11:
                ((Number) obj2).intValue();
                p1.s0.c((s0.o) obj5, (q6.e) obj4, (g0.p) obj, g0.d.T(1));
                return zVar;
            case 12:
                g0.p pVar7 = (g0.p) obj;
                p2.v vVar = (p2.v) obj5;
                if ((((Number) obj2).intValue() & 3) == 2 && pVar7.x()) {
                    pVar7.L();
                } else {
                    s0.o a11 = y1.k.a(lVar, false, p2.b.f7119k);
                    boolean h3 = pVar7.h(vVar);
                    Object G = pVar7.G();
                    if (h3 || G == t0Var) {
                        G = new p2.i(vVar, 1);
                        pVar7.a0(G);
                    }
                    s0.o e9 = androidx.compose.ui.layout.a.e(a11, (q6.c) G);
                    float f10 = vVar.getCanCalculatePosition() ? 1.0f : 0.0f;
                    if (f10 != 1.0f) {
                        e9 = androidx.compose.ui.graphics.a.b(e9, f10, 0.0f, null, true, 126971);
                    }
                    o0.a b9 = o0.f.b(606497925, new p2.c((g0.z0) obj4, i8), pVar7);
                    p2.e eVar4 = p2.e.f7130c;
                    int i14 = pVar7.P;
                    g0.k1 m10 = pVar7.m();
                    s0.o c9 = s0.a.c(pVar7, e9);
                    r1.j.f7810d.getClass();
                    r1.n nVar3 = r1.i.f7781b;
                    pVar7.U();
                    if (pVar7.O) {
                        pVar7.l(nVar3);
                    } else {
                        pVar7.d0();
                    }
                    g0.d.Q(pVar7, eVar4, r1.i.f7784e);
                    g0.d.Q(pVar7, m10, r1.i.f7783d);
                    r1.h hVar4 = r1.i.f7785f;
                    if (pVar7.O || !r6.k.a(pVar7.G(), Integer.valueOf(i14))) {
                        a0.m.q(i14, pVar7, i14, hVar4);
                    }
                    g0.d.Q(pVar7, c9, r1.i.f7782c);
                    b9.d(pVar7, 6);
                    pVar7.p(true);
                }
                return zVar;
            case 13:
                g0.p pVar8 = (g0.p) obj;
                int intValue = ((Number) obj2).intValue();
                s.p pVar9 = (s.p) obj5;
                s.o oVar = (s.o) obj4;
                Object obj6 = oVar.f8041a;
                if ((intValue & 3) == 2 && pVar8.x()) {
                    pVar8.L();
                } else {
                    r.h hVar5 = (r.h) pVar9.f8047b.a();
                    int i15 = oVar.f8043c;
                    if ((i15 >= hVar5.c() || !hVar5.d(i15).equals(obj6)) && (i15 = hVar5.f7607d.b(obj6)) != -1) {
                        oVar.f8043c = i15;
                    }
                    int i16 = i15;
                    if (i16 != -1) {
                        pVar8.Q(-660479623);
                        a8.m.f(hVar5, pVar9.f8046a, i16, obj6, pVar8, 0);
                        obj3 = obj6;
                        pVar8.p(false);
                    } else {
                        obj3 = obj6;
                        pVar8.Q(-660272047);
                        pVar8.p(false);
                    }
                    boolean h8 = pVar8.h(oVar);
                    Object G2 = pVar8.G();
                    if (h8 || G2 == t0Var) {
                        G2 = new c1.a(28, oVar);
                        pVar8.a0(G2);
                    }
                    g0.d.d(obj3, (q6.c) G2, pVar8);
                }
                return zVar;
            case 14:
                return (p1.g0) ((q6.e) obj4).d(new s.s((s.p) obj5, (p1.w0) obj), new m2.a(((m2.a) obj2).f6306a));
            case q.c.f7263g /* 15 */:
                g0.p pVar10 = (g0.p) obj;
                s.g0 g0Var = (s.g0) obj5;
                if ((((Number) obj2).intValue() & 3) == 2 && pVar10.x()) {
                    pVar10.L();
                } else {
                    g0Var.f8008b.setValue(a8.d.W(pVar10));
                    ((o0.a) obj4).c(g0Var, pVar10, 0);
                }
                return zVar;
            case 16:
                ((Number) obj2).intValue();
                AndroidCompositionLocals_androidKt.a((s1.r) obj5, (q6.e) obj4, (g0.p) obj, g0.d.T(1));
                return zVar;
            case 17:
                g0.p pVar11 = (g0.p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && pVar11.x()) {
                    pVar11.L();
                } else {
                    ((u3.o) obj5).f9014p.c((t3.h) obj4, pVar11, 0);
                }
                return zVar;
            case 18:
                ((Number) obj2).intValue();
                t6.a.h((List) obj5, (Collection) obj4, (g0.p) obj, g0.d.T(1));
                return zVar;
            case 19:
                g0.p pVar12 = (g0.p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && pVar12.x()) {
                    pVar12.L();
                } else {
                    u3.q.c((p0.c) obj5, (o0.a) obj4, pVar12, 0);
                }
                return zVar;
            default:
                g0.p pVar13 = (g0.p) obj;
                t3.h hVar6 = (t3.h) obj5;
                if ((((Number) obj2).intValue() & 3) == 2 && pVar13.x()) {
                    pVar13.L();
                } else {
                    t3.v vVar2 = hVar6.f8792g;
                    r6.k.d(vVar2, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                    ((u3.h) vVar2).f8993o.j((k.i) obj4, hVar6, pVar13, 0);
                }
                return zVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(Object obj, int i7, Object obj2) {
        super(2);
        this.f1848g = i7;
        this.f1850i = obj;
        this.f1849h = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(n.a aVar, a0.y yVar) {
        super(2);
        this.f1848g = 8;
        this.f1850i = aVar;
        this.f1849h = yVar;
    }
}
