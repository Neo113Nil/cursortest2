package b6;

import j0.n2;
import m0.u2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final /* synthetic */ class p0 implements p6.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1417d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1418e;

    public /* synthetic */ p0(int i, int i8) {
        this.f1417d = i8;
        this.f1418e = i;
    }

    @Override // p6.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        switch (this.f1417d) {
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
                    n2.b("🎮 Winter Sort", null, ((j0.b0) sVar.j(u2Var)).f3570o, Q, null, kVar, 0L, null, 0L, 0, false, 0, 0, null, sVar, 1597446, 0, 262058);
                    x.v0.a(sVar, androidx.compose.foundation.layout.a.e(jVar, 8));
                    n2.b("Progress: " + this.f1418e + "/20", null, f1.s.b(((j0.b0) sVar.j(u2Var)).f3570o, 0.7f), r2.o.Q(16), null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar, 24576, 0, 262122);
                    sVar.p(true);
                } else {
                    sVar.Q();
                }
                break;
            default:
                m0.s sVar2 = (m0.s) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                q6.i.e((x.r) obj, "$this$Card");
                if (sVar2.N(intValue2 & 1, (intValue2 & 17) != 16)) {
                    y0.j jVar2 = y0.j.f8705a;
                    y0.m g7 = androidx.compose.foundation.layout.a.g(androidx.compose.foundation.layout.a.d(jVar2, 1.0f), 20);
                    y0.d dVar = y0.b.f8690n;
                    x.l0 a9 = x.k0.a(x.i.f8225e, dVar, sVar2, 54);
                    int hashCode2 = Long.hashCode(sVar2.T);
                    m0.o1 l7 = sVar2.l();
                    y0.m a03 = r2.o.a0(sVar2, g7);
                    w1.i.f7684c.getClass();
                    w1.y yVar2 = w1.h.f7675b;
                    sVar2.Y();
                    if (sVar2.S) {
                        sVar2.k(yVar2);
                    } else {
                        sVar2.i0();
                    }
                    w1.g gVar2 = w1.h.f7678e;
                    m0.b.u(a9, sVar2, gVar2);
                    w1.g gVar3 = w1.h.f7677d;
                    m0.b.u(l7, sVar2, gVar3);
                    w1.g gVar4 = w1.h.f7679f;
                    if (sVar2.S || !q6.i.a(sVar2.K(), Integer.valueOf(hashCode2))) {
                        a0.q.n(hashCode2, sVar2, hashCode2, gVar4);
                    }
                    w1.g gVar5 = w1.h.f7676c;
                    m0.b.u(a03, sVar2, gVar5);
                    x.l0 a10 = x.k0.a(x.i.g(16), dVar, sVar2, 54);
                    int hashCode3 = Long.hashCode(sVar2.T);
                    m0.o1 l8 = sVar2.l();
                    y0.m a04 = r2.o.a0(sVar2, jVar2);
                    sVar2.Y();
                    if (sVar2.S) {
                        sVar2.k(yVar2);
                    } else {
                        sVar2.i0();
                    }
                    m0.b.u(a10, sVar2, gVar2);
                    m0.b.u(l8, sVar2, gVar3);
                    if (sVar2.S || !q6.i.a(sVar2.K(), Integer.valueOf(hashCode3))) {
                        a0.q.n(hashCode3, sVar2, hashCode3, gVar4);
                    }
                    m0.b.u(a04, sVar2, gVar5);
                    n2.b("🏆", null, 0L, r2.o.Q(48), null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar2, 24582, 0, 262126);
                    x.q a11 = x.o.a(x.i.f8223c, y0.b.f8692p, sVar2, 0);
                    int hashCode4 = Long.hashCode(sVar2.T);
                    m0.o1 l9 = sVar2.l();
                    y0.m a05 = r2.o.a0(sVar2, jVar2);
                    sVar2.Y();
                    if (sVar2.S) {
                        sVar2.k(yVar2);
                    } else {
                        sVar2.i0();
                    }
                    m0.b.u(a11, sVar2, gVar2);
                    m0.b.u(l9, sVar2, gVar3);
                    if (sVar2.S || !q6.i.a(sVar2.K(), Integer.valueOf(hashCode4))) {
                        a0.q.n(hashCode4, sVar2, hashCode4, gVar4);
                    }
                    m0.b.u(a05, sVar2, gVar5);
                    long Q2 = r2.o.Q(20);
                    j2.k kVar2 = j2.k.f3997h;
                    u2 u2Var2 = j0.c0.f3599a;
                    n2.b("Achievements", null, ((j0.b0) sVar2.j(u2Var2)).f3572q, Q2, null, kVar2, 0L, null, 0L, 0, false, 0, 0, null, sVar2, 1597446, 0, 262058);
                    n2.b(this.f1418e + " / 12 unlocked", null, f1.s.b(((j0.b0) sVar2.j(u2Var2)).f3572q, 0.7f), r2.o.Q(14), null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar2, 24576, 0, 262122);
                    sVar2.p(true);
                    sVar2.p(true);
                    j0.u0.a(s6.a.p(), "View Achievements", androidx.compose.foundation.layout.a.j((float) 28), ((j0.b0) sVar2.j(u2Var2)).f3555a, sVar2, 432, 0);
                    sVar2.p(true);
                } else {
                    sVar2.Q();
                }
                break;
        }
        return c6.m.f1757a;
    }
}
