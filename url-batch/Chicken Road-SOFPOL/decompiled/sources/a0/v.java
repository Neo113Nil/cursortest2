package a0;

import j0.c2;
import j0.h2;
import j0.n2;
import j0.o2;
import m0.o1;
import m0.t2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class v implements p6.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f155d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f156e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f157f;

    public /* synthetic */ v(int i, Object obj, Object obj2) {
        this.f155d = i;
        this.f156e = obj;
        this.f157f = obj2;
    }

    @Override // p6.e
    public final Object g(Object obj, Object obj2) {
        switch (this.f155d) {
            case 0:
                m0.s sVar = (m0.s) obj;
                int intValue = ((Number) obj2).intValue();
                x xVar = (x) this.f156e;
                w wVar = (w) this.f157f;
                Object obj3 = wVar.f161a;
                if (sVar.N(intValue & 1, (intValue & 3) != 2)) {
                    z.h hVar = (z.h) xVar.f168b.b();
                    int i = wVar.f163c;
                    if ((i >= hVar.c() || !hVar.d(i).equals(obj3)) && (i = hVar.f9021d.c(obj3)) != -1) {
                        wVar.f163c = i;
                    }
                    if (i != -1) {
                        sVar.V(-1664741271);
                        g0.d(hVar, xVar.f167a, i, obj3, sVar, 0);
                        sVar.p(false);
                    } else {
                        sVar.V(-1664505826);
                        sVar.p(false);
                    }
                    boolean h8 = sVar.h(wVar);
                    Object K = sVar.K();
                    if (h8 || K == m0.n.f5019a) {
                        K = new t(0, wVar);
                        sVar.f0(K);
                    }
                    m0.b.d(obj3, (p6.c) K, sVar);
                } else {
                    sVar.Q();
                }
                break;
            case 1:
                m0.s sVar2 = (m0.s) obj;
                int intValue2 = ((Number) obj2).intValue();
                if (sVar2.N(intValue2 & 1, (intValue2 & 3) != 2)) {
                    ((u0.c) this.f156e).d((y0) this.f157f, sVar2, 0);
                } else {
                    sVar2.Q();
                }
                break;
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                m0.s sVar3 = (m0.s) obj;
                int intValue3 = ((Number) obj2).intValue();
                if (sVar3.N(intValue3 & 1, (intValue3 & 3) != 2)) {
                    y0.m f6 = androidx.compose.foundation.layout.a.f(androidx.compose.foundation.layout.a.c(y0.j.f8705a, j0.o.f3807c, j0.o.f3808d), (x.f0) this.f156e);
                    x.b bVar = x.i.f8224d;
                    y0.d dVar = y0.b.f8690n;
                    p6.f fVar = (p6.f) this.f157f;
                    x.l0 a8 = x.k0.a(bVar, dVar, sVar3, 54);
                    int hashCode = Long.hashCode(sVar3.T);
                    o1 l3 = sVar3.l();
                    y0.m a02 = r2.o.a0(sVar3, f6);
                    w1.i.f7684c.getClass();
                    w1.y yVar = w1.h.f7675b;
                    sVar3.Y();
                    if (sVar3.S) {
                        sVar3.k(yVar);
                    } else {
                        sVar3.i0();
                    }
                    m0.b.u(a8, sVar3, w1.h.f7678e);
                    m0.b.u(l3, sVar3, w1.h.f7677d);
                    w1.g gVar = w1.h.f7679f;
                    if (sVar3.S || !q6.i.a(sVar3.K(), Integer.valueOf(hashCode))) {
                        q.n(hashCode, sVar3, hashCode, gVar);
                    }
                    m0.b.u(a02, sVar3, w1.h.f7676c);
                    fVar.d(x.m0.f8248a, sVar3, 6);
                    sVar3.p(true);
                } else {
                    sVar3.Q();
                }
                break;
            case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                m0.s sVar4 = (m0.s) obj;
                int intValue4 = ((Number) obj2).intValue();
                if (sVar4.N(intValue4 & 1, (intValue4 & 3) != 2)) {
                    n2.a(((o2) this.f156e).f3827j, (u0.c) this.f157f, sVar4, 0);
                } else {
                    sVar4.Q();
                }
                break;
            case a4.i.LONG_FIELD_NUMBER /* 4 */:
                m0.s sVar5 = (m0.s) obj;
                int intValue5 = ((Number) obj2).intValue();
                t2 t2Var = (t2) this.f156e;
                if (sVar5.N(intValue5 & 1, (intValue5 & 3) != 2)) {
                    y0.m c8 = androidx.compose.ui.layout.a.c("indicator");
                    boolean f8 = sVar5.f(t2Var);
                    Object K2 = sVar5.K();
                    if (f8 || K2 == m0.n.f5019a) {
                        K2 = new t(10, t2Var);
                        sVar5.f0(K2);
                    }
                    x.k.a(androidx.compose.foundation.a.b(androidx.compose.ui.graphics.a.a(c8, (p6.c) K2), ((j0.f1) this.f157f).f3639c, h2.a(l0.m.f4566d, sVar5)), sVar5, 0);
                } else {
                    sVar5.Q();
                }
                break;
            case 5:
                m0.s sVar6 = (m0.s) obj;
                int intValue6 = ((Number) obj2).intValue();
                if (sVar6.N(intValue6 & 1, (intValue6 & 3) != 2)) {
                    u0.c cVar = (u0.c) this.f156e;
                    c2 c2Var = (c2) this.f157f;
                    u1.e0 d8 = x.k.d(y0.b.f8681d, false);
                    int hashCode2 = Long.hashCode(sVar6.T);
                    o1 l7 = sVar6.l();
                    y0.m a03 = r2.o.a0(sVar6, y0.j.f8705a);
                    w1.i.f7684c.getClass();
                    w1.y yVar2 = w1.h.f7675b;
                    sVar6.Y();
                    if (sVar6.S) {
                        sVar6.k(yVar2);
                    } else {
                        sVar6.i0();
                    }
                    m0.b.u(d8, sVar6, w1.h.f7678e);
                    m0.b.u(l7, sVar6, w1.h.f7677d);
                    w1.g gVar2 = w1.h.f7679f;
                    if (sVar6.S || !q6.i.a(sVar6.K(), Integer.valueOf(hashCode2))) {
                        q.n(hashCode2, sVar6, hashCode2, gVar2);
                    }
                    m0.b.u(a03, sVar6, w1.h.f7676c);
                    cVar.d(c2Var, sVar6, 6);
                    sVar6.p(true);
                } else {
                    sVar6.Q();
                }
                break;
            case 6:
                m0.s sVar7 = (m0.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar7.z()) {
                    sVar7.Q();
                } else {
                    ((p4.o) this.f156e).f5762j.d((o4.d) this.f157f, sVar7, 0);
                }
                break;
            case a4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                m0.s sVar8 = (m0.s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && sVar8.z()) {
                    sVar8.Q();
                } else {
                    h0.a.e((v0.c) this.f156e, (u0.c) this.f157f, sVar8, 0);
                }
                break;
            default:
                m0.s sVar9 = (m0.s) obj;
                int intValue7 = ((Number) obj2).intValue();
                o4.d dVar2 = (o4.d) this.f156e;
                if ((intValue7 & 3) == 2 && sVar9.z()) {
                    sVar9.Q();
                } else {
                    o4.o oVar = dVar2.f5621e;
                    q6.i.c(oVar, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                    ((p4.h) oVar).i.j((q.k) this.f157f, dVar2, sVar9, 0);
                }
                break;
        }
        return c6.m.f1757a;
    }
}
