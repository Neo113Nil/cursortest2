package b6;

import android.graphics.Typeface;
import android.text.Spannable;
import j0.n2;
import java.util.ArrayList;
import java.util.Iterator;
import m0.u2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final /* synthetic */ class a0 implements p6.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1253d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1254e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f1255f;

    public /* synthetic */ a0(int i, Object obj, Object obj2) {
        this.f1253d = i;
        this.f1254e = obj;
        this.f1255f = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v29, types: [m0.s] */
    /* JADX WARN: Type inference failed for: r7v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v16, types: [a0.z0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v17 */
    @Override // p6.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        l1.e eVar;
        boolean z3;
        boolean h8;
        p6.a K;
        Typeface typeface;
        int i = this.f1253d;
        y0.j jVar = y0.j.f8705a;
        c6.m mVar = c6.m.f1757a;
        Object obj4 = this.f1255f;
        Object obj5 = this.f1254e;
        final int i8 = 1;
        switch (i) {
            case 0:
                h hVar = (h) obj5;
                m0.z0 z0Var = (m0.z0) obj4;
                m0.s sVar = (m0.s) obj2;
                int intValue = ((Integer) obj3).intValue();
                q6.i.e((x.r) obj, "$this$Card");
                if (sVar.N(intValue & 1, (intValue & 17) != 16)) {
                    y0.m g3 = androidx.compose.foundation.layout.a.g(androidx.compose.foundation.layout.a.d(jVar, 1.0f), 24);
                    float f6 = 12;
                    x.q a8 = x.o.a(x.i.g(f6), y0.b.f8692p, sVar, 6);
                    int hashCode = Long.hashCode(sVar.T);
                    m0.o1 l3 = sVar.l();
                    y0.m a02 = r2.o.a0(sVar, g3);
                    w1.i.f7684c.getClass();
                    w1.y yVar = w1.h.f7675b;
                    sVar.Y();
                    if (sVar.S) {
                        sVar.k(yVar);
                    } else {
                        sVar.i0();
                    }
                    w1.g gVar = w1.h.f7678e;
                    m0.b.u(a8, sVar, gVar);
                    w1.g gVar2 = w1.h.f7677d;
                    m0.b.u(l3, sVar, gVar2);
                    w1.g gVar3 = w1.h.f7679f;
                    if (sVar.S || !q6.i.a(sVar.K(), Integer.valueOf(hashCode))) {
                        a0.q.n(hashCode, sVar, hashCode, gVar3);
                    }
                    w1.g gVar4 = w1.h.f7676c;
                    m0.b.u(a02, sVar, gVar4);
                    y0.m d8 = androidx.compose.foundation.layout.a.d(jVar, 1.0f);
                    y0.d dVar = y0.b.f8690n;
                    x.l0 a9 = x.k0.a(x.i.f8225e, dVar, sVar, 54);
                    int hashCode2 = Long.hashCode(sVar.T);
                    m0.o1 l7 = sVar.l();
                    y0.m a03 = r2.o.a0(sVar, d8);
                    sVar.Y();
                    if (sVar.S) {
                        sVar.k(yVar);
                    } else {
                        sVar.i0();
                    }
                    m0.b.u(a9, sVar, gVar);
                    m0.b.u(l7, sVar, gVar2);
                    if (sVar.S || !q6.i.a(sVar.K(), Integer.valueOf(hashCode2))) {
                        a0.q.n(hashCode2, sVar, hashCode2, gVar3);
                    }
                    m0.b.u(a03, sVar, gVar4);
                    x.f g7 = x.i.g(f6);
                    y0.m a10 = x.m0.a(x.m0.f8248a, jVar);
                    x.l0 a11 = x.k0.a(g7, dVar, sVar, 54);
                    int hashCode3 = Long.hashCode(sVar.T);
                    m0.o1 l8 = sVar.l();
                    y0.m a04 = r2.o.a0(sVar, a10);
                    sVar.Y();
                    if (sVar.S) {
                        sVar.k(yVar);
                    } else {
                        sVar.i0();
                    }
                    m0.b.u(a11, sVar, gVar);
                    m0.b.u(l8, sVar, gVar2);
                    if (sVar.S || !q6.i.a(sVar.K(), Integer.valueOf(hashCode3))) {
                        a0.q.n(hashCode3, sVar, hashCode3, gVar3);
                    }
                    m0.b.u(a04, sVar, gVar4);
                    n2.b(hVar.f1330b, null, 0L, r2.o.Q(48), null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar, 24576, 0, 262126);
                    String str = hVar.f1329a;
                    long Q = r2.o.Q(22);
                    j2.k kVar = j2.k.f3997h;
                    u2 u2Var = j0.c0.f3599a;
                    n2.b(str, null, ((j0.b0) sVar.j(u2Var)).f3572q, Q, null, kVar, 0L, null, 0L, 0, false, 0, 0, null, sVar, 1597440, 0, 262058);
                    sVar.p(true);
                    if (((Boolean) z0Var.getValue()).booleanValue()) {
                        eVar = a.a.i;
                        if (eVar == null) {
                            l1.d dVar2 = new l1.d("Filled.KeyboardArrowUp");
                            int i9 = l1.y.f4827a;
                            f1.k0 k0Var = new f1.k0(f1.s.f2698b);
                            ArrayList arrayList = new ArrayList(32);
                            arrayList.add(new l1.l(7.41f, 15.41f));
                            arrayList.add(new l1.k(12.0f, 10.83f));
                            arrayList.add(new l1.p(4.59f, 4.58f));
                            arrayList.add(new l1.k(18.0f, 14.0f));
                            arrayList.add(new l1.p(-6.0f, -6.0f));
                            arrayList.add(new l1.p(-6.0f, 6.0f));
                            arrayList.add(l1.h.f4778b);
                            l1.d.a(dVar2, arrayList, k0Var);
                            eVar = dVar2.b();
                            a.a.i = eVar;
                        }
                    } else {
                        eVar = s6.a.f6732d;
                        if (eVar == null) {
                            l1.d dVar3 = new l1.d("Filled.KeyboardArrowDown");
                            int i10 = l1.y.f4827a;
                            f1.k0 k0Var2 = new f1.k0(f1.s.f2698b);
                            ArrayList arrayList2 = new ArrayList(32);
                            arrayList2.add(new l1.l(7.41f, 8.59f));
                            arrayList2.add(new l1.k(12.0f, 13.17f));
                            arrayList2.add(new l1.p(4.59f, -4.58f));
                            arrayList2.add(new l1.k(18.0f, 10.0f));
                            arrayList2.add(new l1.p(-6.0f, 6.0f));
                            arrayList2.add(new l1.p(-6.0f, -6.0f));
                            arrayList2.add(new l1.p(1.41f, -1.41f));
                            arrayList2.add(l1.h.f4778b);
                            l1.d.a(dVar3, arrayList2, k0Var2);
                            eVar = dVar3.b();
                            s6.a.f6732d = eVar;
                        }
                    }
                    j0.u0.a(eVar, ((Boolean) z0Var.getValue()).booleanValue() ? "Collapse" : "Expand", null, ((j0.b0) sVar.j(u2Var)).f3572q, sVar, 0, 4);
                    sVar.p(true);
                    androidx.compose.animation.b.b(((Boolean) z0Var.getValue()).booleanValue(), null, q.h0.a(), q.h0.d(), null, u0.h.d(-1898408747, new a7.g(3, hVar), sVar), sVar, 1600518);
                    sVar.p(true);
                    break;
                } else {
                    sVar.Q();
                    break;
                }
                break;
            case 1:
                String str2 = (String) obj5;
                String str3 = (String) obj4;
                m0.s sVar2 = (m0.s) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                q6.i.e((x.r) obj, "$this$Card");
                if (sVar2.N(intValue2 & 1, (intValue2 & 17) != 16)) {
                    y0.m g8 = androidx.compose.foundation.layout.a.g(jVar, 8);
                    x.q a12 = x.o.a(x.i.f8223c, y0.b.f8693q, sVar2, 48);
                    int hashCode4 = Long.hashCode(sVar2.T);
                    m0.o1 l9 = sVar2.l();
                    y0.m a05 = r2.o.a0(sVar2, g8);
                    w1.i.f7684c.getClass();
                    w1.y yVar2 = w1.h.f7675b;
                    sVar2.Y();
                    if (sVar2.S) {
                        sVar2.k(yVar2);
                    } else {
                        sVar2.i0();
                    }
                    m0.b.u(a12, sVar2, w1.h.f7678e);
                    m0.b.u(l9, sVar2, w1.h.f7677d);
                    w1.g gVar5 = w1.h.f7679f;
                    if (sVar2.S || !q6.i.a(sVar2.K(), Integer.valueOf(hashCode4))) {
                        a0.q.n(hashCode4, sVar2, hashCode4, gVar5);
                    }
                    m0.b.u(a05, sVar2, w1.h.f7676c);
                    n2.b(str2, null, 0L, r2.o.Q(28), null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar2, 24576, 0, 262126);
                    n2.b(str3, null, ((j0.b0) sVar2.j(j0.c0.f3599a)).f3560d, r2.o.Q(10), null, j2.k.f3997h, 0L, null, 0L, 0, false, 0, 0, null, sVar2, 1597440, 0, 262058);
                    sVar2.p(true);
                    break;
                } else {
                    sVar2.Q();
                    break;
                }
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                o4.o oVar = (o4.o) obj5;
                o4.t tVar = (o4.t) obj4;
                x.m0 m0Var = (x.m0) obj;
                ?? r12 = (m0.s) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                q6.i.e(m0Var, "$this$NavigationBar");
                int i11 = 2;
                if ((intValue3 & 6) == 0) {
                    intValue3 |= r12.f(m0Var) ? 4 : 2;
                }
                if (r12.N(intValue3 & 1, (intValue3 & 19) != 18)) {
                    for (final z1 z1Var : s6.a.y(x1.f1507d, w1.f1496d, v1.f1482d, y1.f1514d)) {
                        if (oVar != null) {
                            int i12 = o4.o.f5669h;
                            Iterator it = h0.a.G(oVar).iterator();
                            while (it.hasNext()) {
                                if (q6.i.a((String) ((o4.o) it.next()).f5671e.f4352e, z1Var.f1525a)) {
                                    z3 = true;
                                    h8 = r12.h(tVar) | r12.f(z1Var);
                                    K = r12.K();
                                    if (!h8 || K == m0.n.f5019a) {
                                        K = new a0.z0(i11, tVar, z1Var);
                                        r12.f0(K);
                                    }
                                    final int i13 = r11 ? 1 : 0;
                                    j0.o1.b(m0Var, z3, K, u0.h.d(147665038, new p6.e() { // from class: b6.c1
                                        @Override // p6.e
                                        public final Object g(Object obj6, Object obj7) {
                                            switch (i13) {
                                                case 0:
                                                    m0.s sVar3 = (m0.s) obj6;
                                                    int intValue4 = ((Integer) obj7).intValue();
                                                    if (sVar3.N(intValue4 & 1, (intValue4 & 3) != 2)) {
                                                        z1 z1Var2 = z1Var;
                                                        j0.u0.a(z1Var2.f1527c, z1Var2.f1526b, null, 0L, sVar3, 0, 12);
                                                    } else {
                                                        sVar3.Q();
                                                    }
                                                    break;
                                                default:
                                                    m0.s sVar4 = (m0.s) obj6;
                                                    int intValue5 = ((Integer) obj7).intValue();
                                                    if (sVar4.N(intValue5 & 1, (intValue5 & 3) != 2)) {
                                                        n2.b(z1Var.f1526b, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar4, 0, 0, 262142);
                                                    } else {
                                                        sVar4.Q();
                                                    }
                                                    break;
                                            }
                                            return c6.m.f1757a;
                                        }
                                    }, r12), null, false, u0.h.d(-543878229, new p6.e() { // from class: b6.c1
                                        @Override // p6.e
                                        public final Object g(Object obj6, Object obj7) {
                                            switch (i8) {
                                                case 0:
                                                    m0.s sVar3 = (m0.s) obj6;
                                                    int intValue4 = ((Integer) obj7).intValue();
                                                    if (sVar3.N(intValue4 & 1, (intValue4 & 3) != 2)) {
                                                        z1 z1Var2 = z1Var;
                                                        j0.u0.a(z1Var2.f1527c, z1Var2.f1526b, null, 0L, sVar3, 0, 12);
                                                    } else {
                                                        sVar3.Q();
                                                    }
                                                    break;
                                                default:
                                                    m0.s sVar4 = (m0.s) obj6;
                                                    int intValue5 = ((Integer) obj7).intValue();
                                                    if (sVar4.N(intValue5 & 1, (intValue5 & 3) != 2)) {
                                                        n2.b(z1Var.f1526b, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar4, 0, 0, 262142);
                                                    } else {
                                                        sVar4.Q();
                                                    }
                                                    break;
                                            }
                                            return c6.m.f1757a;
                                        }
                                    }, r12), false, null, r12, (intValue3 & 14) | 1575936);
                                }
                            }
                        }
                        z3 = false;
                        h8 = r12.h(tVar) | r12.f(z1Var);
                        K = r12.K();
                        if (!h8) {
                        }
                        K = new a0.z0(i11, tVar, z1Var);
                        r12.f0(K);
                        final int i132 = r11 ? 1 : 0;
                        j0.o1.b(m0Var, z3, K, u0.h.d(147665038, new p6.e() { // from class: b6.c1
                            @Override // p6.e
                            public final Object g(Object obj6, Object obj7) {
                                switch (i132) {
                                    case 0:
                                        m0.s sVar3 = (m0.s) obj6;
                                        int intValue4 = ((Integer) obj7).intValue();
                                        if (sVar3.N(intValue4 & 1, (intValue4 & 3) != 2)) {
                                            z1 z1Var2 = z1Var;
                                            j0.u0.a(z1Var2.f1527c, z1Var2.f1526b, null, 0L, sVar3, 0, 12);
                                        } else {
                                            sVar3.Q();
                                        }
                                        break;
                                    default:
                                        m0.s sVar4 = (m0.s) obj6;
                                        int intValue5 = ((Integer) obj7).intValue();
                                        if (sVar4.N(intValue5 & 1, (intValue5 & 3) != 2)) {
                                            n2.b(z1Var.f1526b, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar4, 0, 0, 262142);
                                        } else {
                                            sVar4.Q();
                                        }
                                        break;
                                }
                                return c6.m.f1757a;
                            }
                        }, r12), null, false, u0.h.d(-543878229, new p6.e() { // from class: b6.c1
                            @Override // p6.e
                            public final Object g(Object obj6, Object obj7) {
                                switch (i8) {
                                    case 0:
                                        m0.s sVar3 = (m0.s) obj6;
                                        int intValue4 = ((Integer) obj7).intValue();
                                        if (sVar3.N(intValue4 & 1, (intValue4 & 3) != 2)) {
                                            z1 z1Var2 = z1Var;
                                            j0.u0.a(z1Var2.f1527c, z1Var2.f1526b, null, 0L, sVar3, 0, 12);
                                        } else {
                                            sVar3.Q();
                                        }
                                        break;
                                    default:
                                        m0.s sVar4 = (m0.s) obj6;
                                        int intValue5 = ((Integer) obj7).intValue();
                                        if (sVar4.N(intValue5 & 1, (intValue5 & 3) != 2)) {
                                            n2.b(z1Var.f1526b, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar4, 0, 0, 262142);
                                        } else {
                                            sVar4.Q();
                                        }
                                        break;
                                }
                                return c6.m.f1757a;
                            }
                        }, r12), false, null, r12, (intValue3 & 14) | 1575936);
                    }
                    break;
                } else {
                    r12.Q();
                    break;
                }
            case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                Spannable spannable = (Spannable) obj5;
                f1 f1Var = (f1) obj4;
                g2.b0 b0Var = (g2.b0) obj;
                int intValue4 = ((Integer) obj2).intValue();
                int intValue5 = ((Integer) obj3).intValue();
                j2.p pVar = b0Var.f2908f;
                j2.k kVar2 = b0Var.f2905c;
                if (kVar2 == null) {
                    kVar2 = j2.k.f3995f;
                }
                j2.i iVar = b0Var.f2906d;
                int i14 = iVar != null ? iVar.f3992a : 0;
                j2.j jVar2 = b0Var.f2907e;
                int i15 = jVar2 != null ? jVar2.f3993a : 65535;
                n2.c cVar = (n2.c) f1Var.f1319e;
                j2.r b8 = ((j2.e) cVar.f5310e).b(pVar, kVar2, i14, i15);
                if (b8 instanceof j2.r) {
                    Object obj6 = b8.f4008d;
                    q6.i.c(obj6, "null cannot be cast to non-null type android.graphics.Typeface");
                    typeface = (Typeface) obj6;
                } else {
                    a0.g1 g1Var = new a0.g1(b8, cVar.f5314j);
                    cVar.f5314j = g1Var;
                    Object obj7 = g1Var.f85c;
                    q6.i.c(obj7, "null cannot be cast to non-null type android.graphics.Typeface");
                    typeface = (Typeface) obj7;
                }
                spannable.setSpan(new i2.b(1, typeface), intValue4, intValue5, 33);
                break;
            default:
                u.x0 x0Var = (u.x0) obj5;
                r1.d dVar4 = (r1.d) obj4;
                q1.k kVar3 = (q1.k) obj;
                q1.k kVar4 = (q1.k) obj2;
                e1.b bVar = (e1.b) obj3;
                x0Var.A = 0L;
                if (((Boolean) x0Var.f7121u.i(kVar3)).booleanValue()) {
                    if (!x0Var.f7126z) {
                        if (x0Var.f7124x == null) {
                            x0Var.f7124x = c7.j.a(Integer.MAX_VALUE, null, 6);
                        }
                        x0Var.f7126z = true;
                        a7.x.n(x0Var.f0(), null, new u.z(x0Var, null), 3);
                    }
                    m.a.h(dVar4, kVar3, 0L);
                    long d9 = e1.b.d(kVar4.f5996c, bVar.f2455a);
                    c7.c cVar2 = x0Var.f7124x;
                    if (cVar2 != null) {
                        cVar2.t(new u.m(d9));
                        break;
                    }
                }
                break;
        }
        return mVar;
    }
}
