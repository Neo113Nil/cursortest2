package j0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class a0 implements p6.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3524d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u0.c f3525e;

    public /* synthetic */ a0(u0.c cVar, int i) {
        this.f3524d = i;
        this.f3525e = cVar;
    }

    @Override // p6.e
    public final Object g(Object obj, Object obj2) {
        switch (this.f3524d) {
            case 0:
                m0.s sVar = (m0.s) obj;
                int intValue = ((Number) obj2).intValue();
                if (sVar.N(intValue & 1, (intValue & 3) != 2)) {
                    x.q a8 = x.o.a(x.i.f8223c, y0.b.f8692p, sVar, 0);
                    int hashCode = Long.hashCode(sVar.T);
                    m0.o1 l3 = sVar.l();
                    y0.m a02 = r2.o.a0(sVar, y0.j.f8705a);
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
                    this.f3525e.d(x.r.f8270a, sVar, 6);
                    sVar.p(true);
                } else {
                    sVar.Q();
                }
                break;
            case 1:
                m0.s sVar2 = (m0.s) obj;
                int intValue2 = ((Number) obj2).intValue();
                if (sVar2.N(intValue2 & 1, (intValue2 & 3) != 2)) {
                    x.q a9 = x.o.a(x.i.f8223c, y0.b.f8692p, sVar2, 0);
                    int hashCode2 = Long.hashCode(sVar2.T);
                    m0.o1 l7 = sVar2.l();
                    y0.m a03 = r2.o.a0(sVar2, y0.j.f8705a);
                    w1.i.f7684c.getClass();
                    w1.y yVar2 = w1.h.f7675b;
                    sVar2.Y();
                    if (sVar2.S) {
                        sVar2.k(yVar2);
                    } else {
                        sVar2.i0();
                    }
                    m0.b.u(a9, sVar2, w1.h.f7678e);
                    m0.b.u(l7, sVar2, w1.h.f7677d);
                    w1.g gVar2 = w1.h.f7679f;
                    if (sVar2.S || !q6.i.a(sVar2.K(), Integer.valueOf(hashCode2))) {
                        a0.q.n(hashCode2, sVar2, hashCode2, gVar2);
                    }
                    m0.b.u(a03, sVar2, w1.h.f7676c);
                    this.f3525e.d(x.r.f8270a, sVar2, 6);
                    sVar2.p(true);
                } else {
                    sVar2.Q();
                }
                break;
            default:
                m0.s sVar3 = (m0.s) obj;
                int intValue3 = ((Number) obj2).intValue();
                if (sVar3.N(intValue3 & 1, (intValue3 & 3) != 2)) {
                    u1.e0 d8 = x.k.d(y0.b.f8681d, false);
                    int hashCode3 = Long.hashCode(sVar3.T);
                    m0.o1 l8 = sVar3.l();
                    y0.m a04 = r2.o.a0(sVar3, y0.j.f8705a);
                    w1.i.f7684c.getClass();
                    w1.y yVar3 = w1.h.f7675b;
                    sVar3.Y();
                    if (sVar3.S) {
                        sVar3.k(yVar3);
                    } else {
                        sVar3.i0();
                    }
                    m0.b.u(d8, sVar3, w1.h.f7678e);
                    m0.b.u(l8, sVar3, w1.h.f7677d);
                    w1.g gVar3 = w1.h.f7679f;
                    if (sVar3.S || !q6.i.a(sVar3.K(), Integer.valueOf(hashCode3))) {
                        a0.q.n(hashCode3, sVar3, hashCode3, gVar3);
                    }
                    m0.b.u(a04, sVar3, w1.h.f7676c);
                    this.f3525e.g(sVar3, 0);
                    sVar3.p(true);
                } else {
                    sVar3.Q();
                }
                break;
        }
        return c6.m.f1757a;
    }
}
