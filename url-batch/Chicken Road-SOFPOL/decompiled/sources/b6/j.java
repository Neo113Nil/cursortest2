package b6;

import j0.n2;
import m0.u2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements p6.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1349d;

    @Override // p6.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        switch (this.f1349d) {
            case 0:
                m0.s sVar = (m0.s) obj2;
                int intValue = ((Integer) obj3).intValue();
                q6.i.e((x.r) obj, "$this$Card");
                if (sVar.N(intValue & 1, (intValue & 17) != 16)) {
                    y0.j jVar = y0.j.f8705a;
                    y0.m g3 = androidx.compose.foundation.layout.a.g(androidx.compose.foundation.layout.a.d(jVar, 1.0f), 20);
                    x.q a8 = x.o.a(x.i.f8223c, y0.b.f8693q, sVar, 48);
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
                    m0.b.u(a8, sVar, w1.h.f7678e);
                    m0.b.u(l3, sVar, w1.h.f7677d);
                    w1.g gVar = w1.h.f7679f;
                    if (sVar.S || !q6.i.a(sVar.K(), Integer.valueOf(hashCode))) {
                        a0.q.n(hashCode, sVar, hashCode, gVar);
                    }
                    m0.b.u(a02, sVar, w1.h.f7676c);
                    long Q = r2.o.Q(28);
                    j2.k kVar = j2.k.f3997h;
                    u2 u2Var = j0.c0.f3599a;
                    n2.b("📚 Winter Encyclopedia", null, ((j0.b0) sVar.j(u2Var)).f3570o, Q, null, kVar, 0L, null, 0L, 0, false, 0, 0, null, sVar, 1597446, 0, 262058);
                    x.v0.a(sVar, androidx.compose.foundation.layout.a.e(jVar, 8));
                    n2.b("Explore winter knowledge", null, f1.s.b(((j0.b0) sVar.j(u2Var)).f3570o, 0.7f), r2.o.Q(16), null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar, 24582, 0, 262122);
                    sVar.p(true);
                } else {
                    sVar.Q();
                }
                return c6.m.f1757a;
            case 1:
                m0.s sVar2 = (m0.s) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                q6.i.e((x.m0) obj, "$this$Button");
                if (sVar2.N(intValue2 & 1, (intValue2 & 17) != 16)) {
                    n2.b("←", null, 0L, r2.o.Q(20), null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar2, 24582, 0, 262126);
                } else {
                    sVar2.Q();
                }
                return c6.m.f1757a;
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                m0.s sVar3 = (m0.s) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                q6.i.e((x.r) obj, "$this$Card");
                if (sVar3.N(intValue3 & 1, (intValue3 & 17) != 16)) {
                    n2.b("📦 Sort these items:", androidx.compose.foundation.layout.a.g(y0.j.f8705a, 16), ((j0.b0) sVar3.j(j0.c0.f3599a)).f3570o, r2.o.Q(18), null, j2.k.f3997h, 0L, null, 0L, 0, false, 0, 0, null, sVar3, 1597494, 0, 262056);
                } else {
                    sVar3.Q();
                }
                return c6.m.f1757a;
            case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                m0.s sVar4 = (m0.s) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                q6.i.e((x.m0) obj, "$this$Button");
                if (sVar4.N(intValue4 & 1, (intValue4 & 17) != 16)) {
                    n2.b("Next Level →", null, 0L, r2.o.Q(16), null, j2.k.f3997h, 0L, null, 0L, 0, false, 0, 0, null, sVar4, 1597446, 0, 262062);
                } else {
                    sVar4.Q();
                }
                return c6.m.f1757a;
            case a4.i.LONG_FIELD_NUMBER /* 4 */:
                m0.s sVar5 = (m0.s) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                q6.i.e((x.m0) obj, "$this$Button");
                if (sVar5.N(intValue5 & 1, (intValue5 & 17) != 16)) {
                    n2.b("Finish", null, 0L, r2.o.Q(16), null, j2.k.f3997h, 0L, null, 0L, 0, false, 0, 0, null, sVar5, 1597446, 0, 262062);
                } else {
                    sVar5.Q();
                }
                return c6.m.f1757a;
            case 5:
                m0.s sVar6 = (m0.s) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                q6.i.e((x.m0) obj, "$this$TextButton");
                if (sVar6.N(intValue6 & 1, (intValue6 & 17) != 16)) {
                    n2.b("Close", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar6, 6, 0, 262142);
                } else {
                    sVar6.Q();
                }
                return c6.m.f1757a;
            case 6:
                m0.s sVar7 = (m0.s) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                q6.i.e((x.r) obj, "$this$Card");
                if (sVar7.N(intValue7 & 1, (intValue7 & 17) != 16)) {
                    y0.j jVar2 = y0.j.f8705a;
                    y0.m d8 = androidx.compose.foundation.layout.a.d(jVar2, 1.0f);
                    u2 u2Var2 = j0.c0.f3599a;
                    float f6 = 24;
                    y0.m g7 = androidx.compose.foundation.layout.a.g(androidx.compose.foundation.a.a(d8, new f1.b0(s6.a.y(new f1.s(f1.s.b(((j0.b0) sVar7.j(u2Var2)).f3559c, 0.4f)), new f1.s(f1.s.b(((j0.b0) sVar7.j(u2Var2)).f3564h, 0.3f))), 0L, 9187343241974906880L), d0.e.a(f6), 4), f6);
                    u1.e0 d9 = x.k.d(y0.b.f8681d, false);
                    int hashCode2 = Long.hashCode(sVar7.T);
                    m0.o1 l7 = sVar7.l();
                    y0.m a03 = r2.o.a0(sVar7, g7);
                    w1.i.f7684c.getClass();
                    w1.y yVar2 = w1.h.f7675b;
                    sVar7.Y();
                    if (sVar7.S) {
                        sVar7.k(yVar2);
                    } else {
                        sVar7.i0();
                    }
                    w1.g gVar2 = w1.h.f7678e;
                    m0.b.u(d9, sVar7, gVar2);
                    w1.g gVar3 = w1.h.f7677d;
                    m0.b.u(l7, sVar7, gVar3);
                    w1.g gVar4 = w1.h.f7679f;
                    if (sVar7.S || !q6.i.a(sVar7.K(), Integer.valueOf(hashCode2))) {
                        a0.q.n(hashCode2, sVar7, hashCode2, gVar4);
                    }
                    w1.g gVar5 = w1.h.f7676c;
                    m0.b.u(a03, sVar7, gVar5);
                    y0.m d10 = androidx.compose.foundation.layout.a.d(jVar2, 1.0f);
                    x.q a9 = x.o.a(x.i.f8223c, y0.b.f8693q, sVar7, 48);
                    int hashCode3 = Long.hashCode(sVar7.T);
                    m0.o1 l8 = sVar7.l();
                    y0.m a04 = r2.o.a0(sVar7, d10);
                    sVar7.Y();
                    if (sVar7.S) {
                        sVar7.k(yVar2);
                    } else {
                        sVar7.i0();
                    }
                    m0.b.u(a9, sVar7, gVar2);
                    m0.b.u(l8, sVar7, gVar3);
                    if (sVar7.S || !q6.i.a(sVar7.K(), Integer.valueOf(hashCode3))) {
                        a0.q.n(hashCode3, sVar7, hashCode3, gVar4);
                    }
                    m0.b.u(a04, sVar7, gVar5);
                    n2.b("❄️", null, 0L, r2.o.Q(72), null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar7, 24582, 0, 262126);
                    x.v0.a(sVar7, androidx.compose.foundation.layout.a.e(jVar2, 12));
                    n2.b("Snovik Povik", null, ((j0.b0) sVar7.j(u2Var2)).f3570o, r2.o.Q(32), null, j2.k.f3997h, 0L, null, 0L, 0, false, 0, 0, null, sVar7, 1597446, 0, 262058);
                    x.v0.a(sVar7, androidx.compose.foundation.layout.a.e(jVar2, 4));
                    n2.b("Welcome Back!", null, f1.s.b(((j0.b0) sVar7.j(u2Var2)).f3570o, 0.9f), r2.o.Q(20), null, j2.k.f3996g, 0L, null, 0L, 0, false, 0, 0, null, sVar7, 1597446, 0, 262058);
                    n2.b("Ready for a winter adventure?", null, f1.s.b(((j0.b0) sVar7.j(u2Var2)).f3570o, 0.7f), r2.o.Q(16), null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar7, 24582, 0, 262122);
                    sVar7.p(true);
                    sVar7.p(true);
                } else {
                    sVar7.Q();
                }
                return c6.m.f1757a;
            case a4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                m0.s sVar8 = (m0.s) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                q6.i.e((x.m0) obj, "$this$Button");
                if (sVar8.N(intValue8 & 1, (intValue8 & 17) != 16)) {
                    n2.b("Next", null, 0L, r2.o.Q(18), null, j2.k.f3997h, 0L, null, 0L, 0, false, 0, 0, null, sVar8, 1597446, 0, 262062);
                    x.v0.a(sVar8, androidx.compose.foundation.layout.a.m(y0.j.f8705a, 8));
                    j0.u0.a(s6.a.p(), "Next", null, 0L, sVar8, 48, 12);
                } else {
                    sVar8.Q();
                }
                return c6.m.f1757a;
            case a4.i.BYTES_FIELD_NUMBER /* 8 */:
                m0.s sVar9 = (m0.s) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                q6.i.e((x.m0) obj, "$this$Button");
                if (sVar9.N(intValue9 & 1, (intValue9 & 17) != 16)) {
                    n2.b("Get Started", null, 0L, r2.o.Q(18), null, j2.k.f3997h, 0L, null, 0L, 0, false, 0, 0, null, sVar9, 1597446, 0, 262062);
                } else {
                    sVar9.Q();
                }
                return c6.m.f1757a;
            case x.v0.f8304b /* 9 */:
                m0.s sVar10 = (m0.s) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                q6.i.e((x.m0) obj, "$this$OutlinedButton");
                if (sVar10.N(intValue10 & 1, (intValue10 & 17) != 16)) {
                    n2.b("Back to Quizzes", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar10, 6, 0, 262142);
                } else {
                    sVar10.Q();
                }
                return c6.m.f1757a;
            case x.v0.f8306d /* 10 */:
                m0.s sVar11 = (m0.s) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                q6.i.e((x.m0) obj, "$this$Button");
                if (sVar11.N(intValue11 & 1, (intValue11 & 17) != 16)) {
                    n2.b("Retry", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar11, 6, 0, 262142);
                } else {
                    sVar11.Q();
                }
                return c6.m.f1757a;
            case 11:
                u1.l0 e8 = ((u1.d0) obj2).e(((r2.a) obj3).f6514a);
                return ((u1.g0) obj).J(e8.f7230d, e8.f7231e, d6.v.f2327d, new j0.l(0), new a0.m(e8, 2));
            case 12:
                u1.g0 g0Var = (u1.g0) obj;
                int H = g0Var.H(k0.b.f4149a);
                int i = H * 2;
                u1.l0 e9 = ((u1.d0) obj2).e(r2.b.h(i, 0, ((r2.a) obj3).f6514a));
                return g0Var.e0(e9.f7230d - i, e9.f7231e, d6.v.f2327d, new k0.a(H, 1, e9));
            default:
                u1.g0 g0Var2 = (u1.g0) obj;
                int H2 = g0Var2.H(k0.b.f4150b);
                int i8 = H2 * 2;
                u1.l0 e10 = ((u1.d0) obj2).e(r2.b.h(0, i8, ((r2.a) obj3).f6514a));
                return g0Var2.e0(e10.f7230d, e10.f7231e - i8, d6.v.f2327d, new k0.a(H2, 0, e10));
        }
    }
}
