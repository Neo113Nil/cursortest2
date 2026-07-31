package b6;

import j0.n2;
import java.util.Iterator;
import java.util.List;
import m0.t2;
import m0.u2;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final /* synthetic */ class d0 implements p6.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1293d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1294e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f1295f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f1296g;

    public /* synthetic */ d0(Object obj, Object obj2, Object obj3, int i) {
        this.f1293d = i;
        this.f1294e = obj;
        this.f1295f = obj2;
        this.f1296g = obj3;
    }

    @Override // p6.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        Object obj4;
        switch (this.f1293d) {
            case 0:
                List list = (List) this.f1294e;
                String str = (String) this.f1295f;
                m0.z0 z0Var = (m0.z0) this.f1296g;
                m0.s sVar = (m0.s) obj2;
                int intValue = ((Integer) obj3).intValue();
                q6.i.e((x.r) obj, "$this$Card");
                if (sVar.N(intValue & 1, (intValue & 17) != 16)) {
                    y0.j jVar = y0.j.f8705a;
                    y0.m g3 = androidx.compose.foundation.layout.a.g(androidx.compose.foundation.layout.a.d(jVar, 1.0f), 16);
                    x.l0 a8 = x.k0.a(x.i.g(12), y0.b.f8690n, sVar, 54);
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
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj4 = it.next();
                            if (((e2) obj4).f1309a.equals((String) z0Var.getValue())) {
                            }
                        } else {
                            obj4 = null;
                        }
                    }
                    e2 e2Var = (e2) obj4;
                    n2.b(e2Var != null ? e2Var.f1310b : "💡", null, 0L, r2.o.Q(32), null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar, 24576, 0, 262126);
                    n2.b(str, x.m0.a(x.m0.f8248a, jVar), ((j0.b0) sVar.j(j0.c0.f3599a)).f3572q, r2.o.Q(16), null, null, 0L, null, r2.o.Q(24), 0, false, 0, 0, null, sVar, 24576, 48, 260072);
                    sVar.p(true);
                } else {
                    sVar.Q();
                }
                break;
            case 1:
                List list2 = (List) this.f1294e;
                String str2 = (String) this.f1295f;
                String str3 = (String) this.f1296g;
                m0.s sVar2 = (m0.s) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                q6.i.e((x.r) obj, "$this$Card");
                if (sVar2.N(intValue2 & 1, (intValue2 & 17) != 16)) {
                    y0.j jVar2 = y0.j.f8705a;
                    y0.m g7 = androidx.compose.foundation.layout.a.g(androidx.compose.foundation.layout.a.d(jVar2, 1.0f), 20);
                    x.q a9 = x.o.a(x.i.f8223c, y0.b.f8693q, sVar2, 48);
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
                    x.l0 a10 = x.k0.a(x.i.g(8), y0.b.f8690n, sVar2, 54);
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
                    n2.b(str2, null, 0L, r2.o.Q(24), null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar2, 24576, 0, 262126);
                    long Q = r2.o.Q(18);
                    j2.k kVar = j2.k.f3997h;
                    u2 u2Var = j0.c0.f3599a;
                    n2.b(str3, null, ((j0.b0) sVar2.j(u2Var)).f3572q, Q, null, kVar, 0L, null, 0L, 0, false, 0, 0, null, sVar2, 1597440, 0, 262058);
                    m0.s sVar3 = sVar2;
                    if (list2.isEmpty()) {
                        sVar3.V(632057069);
                    } else {
                        sVar3.V(652692095);
                        n2.b("(" + list2.size() + ")", null, f1.s.b(((j0.b0) sVar3.j(u2Var)).f3572q, 0.6f), r2.o.Q(14), null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar3, 24576, 0, 262122);
                        sVar3 = sVar3;
                    }
                    sVar3.p(false);
                    sVar3.p(true);
                    float f6 = 12;
                    x.v0.a(sVar3, androidx.compose.foundation.layout.a.e(jVar2, f6));
                    if (list2.isEmpty()) {
                        sVar3.V(-162546975);
                        y0.m b8 = androidx.compose.foundation.a.b(androidx.compose.foundation.layout.a.e(androidx.compose.foundation.layout.a.d(jVar2, 1.0f), 60), f1.s.b(((j0.b0) sVar3.j(u2Var)).f3571p, 0.3f), d0.e.a(f6));
                        u1.e0 d8 = x.k.d(y0.b.f8685h, false);
                        int hashCode4 = Long.hashCode(sVar3.T);
                        m0.o1 l9 = sVar3.l();
                        y0.m a05 = r2.o.a0(sVar3, b8);
                        sVar3.Y();
                        if (sVar3.S) {
                            sVar3.k(yVar2);
                        } else {
                            sVar3.i0();
                        }
                        m0.b.u(d8, sVar3, gVar2);
                        m0.b.u(l9, sVar3, gVar3);
                        if (sVar3.S || !q6.i.a(sVar3.K(), Integer.valueOf(hashCode4))) {
                            a0.q.n(hashCode4, sVar3, hashCode4, gVar4);
                        }
                        m0.b.u(a05, sVar3, gVar5);
                        m0.s sVar4 = sVar3;
                        n2.b("Drop items here", null, f1.s.b(((j0.b0) sVar3.j(u2Var)).f3572q, 0.5f), r2.o.Q(14), new j2.i(1), null, 0L, null, 0L, 0, false, 0, 0, null, sVar4, 24582, 0, 262090);
                        sVar3 = sVar4;
                        sVar3.p(true);
                        sVar3.p(false);
                    } else {
                        sVar3.V(-161717074);
                        x.f g8 = x.i.g(10);
                        y0.m d9 = androidx.compose.foundation.layout.a.d(jVar2, 1.0f);
                        boolean h8 = sVar3.h(list2);
                        Object K = sVar3.K();
                        if (h8 || K == m0.n.f5019a) {
                            K = new a0.t(3, list2);
                            sVar3.f0(K);
                        }
                        r2.o.c(24582, 494, sVar3, (p6.c) K, null, null, g8, null, null, d9, null, false);
                        sVar3.p(false);
                    }
                    sVar3.p(true);
                } else {
                    sVar2.Q();
                }
                break;
            default:
                o4.t tVar = (o4.t) this.f1294e;
                w wVar = (w) this.f1295f;
                t2 t2Var = (t2) this.f1296g;
                x.f0 f0Var = (x.f0) obj;
                m0.s sVar5 = (m0.s) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                q6.i.e(f0Var, "paddingValues");
                if ((intValue3 & 6) == 0) {
                    intValue3 |= sVar5.f(f0Var) ? 4 : 2;
                }
                if (sVar5.N(intValue3 & 1, (intValue3 & 19) != 18)) {
                    String str4 = x1.f1507d.f1525a;
                    y0.m f8 = androidx.compose.foundation.layout.a.f(y0.j.f8705a, f0Var);
                    boolean h9 = sVar5.h(wVar) | sVar5.h(tVar) | sVar5.f(t2Var);
                    Object K2 = sVar5.K();
                    if (h9 || K2 == m0.n.f5019a) {
                        K2 = new c0(wVar, tVar, t2Var, 1);
                        sVar5.f0(K2);
                    }
                    m.a.d(tVar, str4, f8, null, null, null, null, null, (p6.c) K2, sVar5, 0);
                } else {
                    sVar5.Q();
                }
                break;
        }
        return c6.m.f1757a;
    }
}
