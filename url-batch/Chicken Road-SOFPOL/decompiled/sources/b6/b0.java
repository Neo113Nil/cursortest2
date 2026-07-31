package b6;

import j0.n2;
import java.util.List;
import m0.u2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final /* synthetic */ class b0 implements p6.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1267d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m0.z0 f1268e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ List f1269f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ m0.z0 f1270g;

    public /* synthetic */ b0(List list, m0.z0 z0Var, m0.z0 z0Var2) {
        this.f1269f = list;
        this.f1268e = z0Var;
        this.f1270g = z0Var2;
    }

    @Override // p6.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        switch (this.f1267d) {
            case 0:
                m0.s sVar = (m0.s) obj2;
                int intValue = ((Integer) obj3).intValue();
                q6.i.e((x.r) obj, "$this$Card");
                if (sVar.N(intValue & 1, (intValue & 17) != 16)) {
                    y0.j jVar = y0.j.f8705a;
                    y0.m g3 = androidx.compose.foundation.layout.a.g(androidx.compose.foundation.layout.a.d(jVar, 1.0f), 20);
                    x.f g7 = x.i.g(16);
                    y0.c cVar = y0.b.f8692p;
                    x.q a8 = x.o.a(g7, cVar, sVar, 6);
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
                    x.l0 a9 = x.k0.a(x.i.g(8), y0.b.f8690n, sVar, 54);
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
                    n2.b("🎯", null, 0L, r2.o.Q(32), null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar, 24582, 0, 262126);
                    y0.m a10 = x.m0.a(x.m0.f8248a, jVar);
                    x.q a11 = x.o.a(x.i.f8223c, cVar, sVar, 0);
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
                    long Q = r2.o.Q(22);
                    j2.k kVar = j2.k.f3997h;
                    u2 u2Var = j0.c0.f3599a;
                    n2.b("Interactive Winter Facts", null, ((j0.b0) sVar.j(u2Var)).f3572q, Q, null, kVar, 0L, null, 0L, 0, false, 0, 0, null, sVar, 1597446, 0, 262058);
                    n2.b("Tap a category to discover interesting facts!", null, f1.s.b(((j0.b0) sVar.j(u2Var)).f3572q, 0.7f), r2.o.Q(14), null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar, 24582, 0, 262122);
                    sVar.p(true);
                    sVar.p(true);
                    x.f g8 = x.i.g(12);
                    y0.m d9 = androidx.compose.foundation.layout.a.d(jVar, 1.0f);
                    List list = this.f1269f;
                    boolean h8 = sVar.h(list);
                    Object K = sVar.K();
                    m0.z0 z0Var = this.f1268e;
                    m0.z0 z0Var2 = this.f1270g;
                    if (h8 || K == m0.n.f5019a) {
                        K = new c0(list, z0Var, z0Var2, 0);
                        sVar.f0(K);
                    }
                    r2.o.c(24582, 494, sVar, (p6.c) K, null, null, g8, null, null, d9, null, false);
                    androidx.compose.animation.b.b(((String) z0Var2.getValue()) != null, null, q.h0.a().a(q.h0.b(null, 3)), q.h0.d().a(q.h0.c(null, 3)), null, u0.h.d(-607259979, new b0(z0Var2, list, z0Var), sVar), sVar, 1600518);
                    sVar.p(true);
                } else {
                    sVar.Q();
                }
                break;
            default:
                m0.s sVar2 = (m0.s) obj2;
                ((Integer) obj3).getClass();
                q6.i.e((q.x) obj, "$this$AnimatedVisibility");
                String str = (String) this.f1268e.getValue();
                if (str == null) {
                    sVar2.V(-479708368);
                } else {
                    sVar2.V(-479708367);
                    j0.m.d(androidx.compose.foundation.layout.a.d(y0.j.f8705a, 1.0f), d0.e.a(16), j0.m.j(f1.s.b(((j0.b0) sVar2.j(j0.c0.f3599a)).f3559c, 0.5f), sVar2, 0), null, u0.h.d(479469029, new d0(this.f1269f, str, this.f1270g, 0), sVar2), sVar2, 196614, 24);
                }
                sVar2.p(false);
                break;
        }
        return c6.m.f1757a;
    }

    public /* synthetic */ b0(m0.z0 z0Var, List list, m0.z0 z0Var2) {
        this.f1268e = z0Var;
        this.f1269f = list;
        this.f1270g = z0Var2;
    }
}
