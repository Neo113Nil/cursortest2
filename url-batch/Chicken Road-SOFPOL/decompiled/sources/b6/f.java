package b6;

import j0.n2;
import m0.u2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements p6.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1312d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1313e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1314f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1315g;

    public /* synthetic */ f(int i, int i8, int i9, int i10) {
        this.f1312d = i10;
        this.f1313e = i;
        this.f1314f = i8;
        this.f1315g = i9;
    }

    @Override // p6.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        switch (this.f1312d) {
            case 0:
                m0.s sVar = (m0.s) obj2;
                int intValue = ((Integer) obj3).intValue();
                q6.i.e((x.r) obj, "$this$Card");
                if (sVar.N(intValue & 1, (intValue & 17) != 16)) {
                    y0.j jVar = y0.j.f8705a;
                    y0.m g3 = androidx.compose.foundation.layout.a.g(androidx.compose.foundation.layout.a.d(jVar, 1.0f), 20);
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
                    x.l0 a9 = x.k0.a(x.i.f8225e, y0.b.f8690n, sVar, 54);
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
                    long Q = r2.o.Q(18);
                    j2.k kVar = j2.k.f3997h;
                    u2 u2Var = j0.c0.f3599a;
                    n2.b("Overall Progress", null, ((j0.b0) sVar.j(u2Var)).f3572q, Q, null, kVar, 0L, null, 0L, 0, false, 0, 0, null, sVar, 1597446, 0, 262058);
                    n2.b(this.f1315g + "%", null, ((j0.b0) sVar.j(u2Var)).f3555a, r2.o.Q(20), null, kVar, 0L, null, 0L, 0, false, 0, 0, null, sVar, 1597440, 0, 262058);
                    sVar.p(true);
                    final int i = this.f1313e;
                    boolean d9 = sVar.d(i);
                    final int i8 = this.f1314f;
                    boolean d10 = d9 | sVar.d(i8);
                    Object K = sVar.K();
                    if (d10 || K == m0.n.f5019a) {
                        K = new p6.a() { // from class: b6.d
                            @Override // p6.a
                            public final Object b() {
                                return Float.valueOf(i / i8);
                            }
                        };
                        sVar.f0(K);
                    }
                    j0.u1.a((p6.a) K, androidx.compose.foundation.layout.a.e(androidx.compose.foundation.layout.a.d(jVar, 1.0f), f6), ((j0.b0) sVar.j(u2Var)).f3555a, ((j0.b0) sVar.j(u2Var)).f3573r, 0, 0.0f, null, sVar, 48);
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
                    y0.m g7 = androidx.compose.foundation.layout.a.g(androidx.compose.foundation.layout.a.d(jVar2, 1.0f), 32);
                    x.q a10 = x.o.a(x.i.f8223c, y0.b.f8693q, sVar2, 48);
                    int hashCode3 = Long.hashCode(sVar2.T);
                    m0.o1 l8 = sVar2.l();
                    y0.m a04 = r2.o.a0(sVar2, g7);
                    w1.i.f7684c.getClass();
                    w1.y yVar2 = w1.h.f7675b;
                    sVar2.Y();
                    if (sVar2.S) {
                        sVar2.k(yVar2);
                    } else {
                        sVar2.i0();
                    }
                    m0.b.u(a10, sVar2, w1.h.f7678e);
                    m0.b.u(l8, sVar2, w1.h.f7677d);
                    w1.g gVar5 = w1.h.f7679f;
                    if (sVar2.S || !q6.i.a(sVar2.K(), Integer.valueOf(hashCode3))) {
                        a0.q.n(hashCode3, sVar2, hashCode3, gVar5);
                    }
                    m0.b.u(a04, sVar2, w1.h.f7676c);
                    long Q2 = r2.o.Q(18);
                    u2 u2Var2 = j0.c0.f3599a;
                    n2.b("Your Score", null, f1.s.b(((j0.b0) sVar2.j(u2Var2)).f3570o, 0.7f), Q2, null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar2, 24582, 0, 262122);
                    float f8 = 8;
                    x.v0.a(sVar2, androidx.compose.foundation.layout.a.e(jVar2, f8));
                    n2.b(this.f1313e + " / " + this.f1314f, null, ((j0.b0) sVar2.j(u2Var2)).f3555a, r2.o.Q(48), null, j2.k.f3997h, 0L, null, 0L, 0, false, 0, 0, null, sVar2, 1597440, 0, 262058);
                    x.v0.a(sVar2, androidx.compose.foundation.layout.a.e(jVar2, f8));
                    n2.b(this.f1315g + "%", null, ((j0.b0) sVar2.j(u2Var2)).f3570o, r2.o.Q(24), null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar2, 24576, 0, 262122);
                    sVar2.p(true);
                } else {
                    sVar2.Q();
                }
                break;
        }
        return c6.m.f1757a;
    }
}
