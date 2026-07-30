package d0;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class x1 extends r6.l implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2519g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f2520h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f2521i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f2522j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x1(Object obj, Object obj2, Object obj3, int i7) {
        super(2);
        this.f2519g = i7;
        this.f2520h = obj;
        this.f2521i = obj2;
        this.f2522j = obj3;
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        int i7 = this.f2519g;
        s0.l lVar = s0.l.f8103a;
        int i8 = 1;
        int i9 = 3;
        d6.z zVar = d6.z.f2639a;
        Object obj3 = this.f2522j;
        Object obj4 = this.f2521i;
        Object obj5 = this.f2520h;
        switch (i7) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                g0.p pVar = (g0.p) obj;
                g0.m2 m2Var = (g0.m2) obj5;
                if ((((Number) obj2).intValue() & 3) != 2 || !pVar.x()) {
                    s0.o c4 = androidx.compose.ui.layout.a.c(lVar, "indicator");
                    boolean f9 = pVar.f(m2Var);
                    Object G = pVar.G();
                    if (f9 || G == g0.l.f3784a) {
                        G = new c1.a(i8, m2Var);
                        pVar.a0(G);
                    }
                    q.n.a(androidx.compose.foundation.a.a(androidx.compose.ui.graphics.a.a(c4, (q6.c) G), ((v1) obj4).f2468c, (z0.p0) obj3), pVar, 0);
                    break;
                } else {
                    pVar.L();
                    break;
                }
                break;
            case 1:
                g0.p pVar2 = (g0.p) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !pVar2.x()) {
                    s0.o c6 = androidx.compose.ui.layout.a.c(lVar, "Container");
                    float f10 = r2.f2358a;
                    s0.o c9 = androidx.compose.ui.draw.a.c(c6, new a0.y(new e0.j((g0.z0) obj5, g0.z0.class, "value", "getValue()Ljava/lang/Object;", 0, 0), i9, (q.h0) obj4));
                    o0.a aVar = (o0.a) obj3;
                    p1.f0 e9 = q.n.e(s0.b.f8078f, true);
                    int i10 = pVar2.P;
                    g0.k1 m8 = pVar2.m();
                    s0.o c10 = s0.a.c(pVar2, c9);
                    r1.j.f7810d.getClass();
                    r1.n nVar = r1.i.f7781b;
                    pVar2.U();
                    if (pVar2.O) {
                        pVar2.l(nVar);
                    } else {
                        pVar2.d0();
                    }
                    g0.d.Q(pVar2, e9, r1.i.f7784e);
                    g0.d.Q(pVar2, m8, r1.i.f7783d);
                    r1.h hVar = r1.i.f7785f;
                    if (pVar2.O || !r6.k.a(pVar2.G(), Integer.valueOf(i10))) {
                        a0.m.q(i10, pVar2, i10, hVar);
                    }
                    g0.d.Q(pVar2, c10, r1.i.f7782c);
                    aVar.d(pVar2, 0);
                    pVar2.p(true);
                    break;
                } else {
                    pVar2.L();
                    break;
                }
                break;
            case 2:
                float floatValue = ((Number) obj).floatValue();
                ((Number) obj2).floatValue();
                r6.s sVar = (r6.s) obj5;
                o.f1 f1Var = (o.f1) obj4;
                long g9 = f1Var.g(f1Var.c(floatValue - sVar.f7965f));
                o.f1 f1Var2 = ((o.d1) obj3).f6593a;
                sVar.f7965f += f1Var.c(f1Var.f(o.f1.a(f1Var2, f1Var2.f6616h, g9, 1)));
                break;
            case 3:
                g0.p pVar3 = (g0.p) obj;
                if ((((Number) obj2).intValue() & 3) != 2 || !pVar3.x()) {
                    s1.f1.a((s1.r) obj5, (s1.u0) obj4, (q6.e) obj3, pVar3, 0);
                    break;
                } else {
                    pVar3.L();
                    break;
                }
            case 4:
                ((Number) obj2).intValue();
                s1.f1.a((r1.g1) obj5, (s1.u0) obj4, (q6.e) obj3, (g0.p) obj, g0.d.T(1));
                break;
            case 5:
                ((Number) obj2).intValue();
                u3.q.a((t3.h) obj5, (p0.c) obj4, (o0.a) obj3, (g0.p) obj, g0.d.T(385));
                break;
            case 6:
                float floatValue2 = ((Number) obj).floatValue();
                ((Number) obj2).floatValue();
                c7.a0.p((c7.x) obj5, null, null, new c0.v(floatValue2, (l.x0) obj4, (t3.h) obj3, (h6.d) null), 3);
                break;
            default:
                ((Number) obj2).intValue();
                w.g0.d((s0.o) obj5, (a0.x0) obj4, (o0.a) obj3, (g0.p) obj, g0.d.T(385));
                break;
        }
        return zVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x1(Object obj, Object obj2, q6.e eVar, int i7, int i8) {
        super(2);
        this.f2519g = i8;
        this.f2520h = obj;
        this.f2521i = obj2;
        this.f2522j = eVar;
    }
}
