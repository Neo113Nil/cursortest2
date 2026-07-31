package b6;

import j0.n2;
import java.util.List;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class w0 implements p6.g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f1495d;

    public w0(List list) {
        this.f1495d = list;
    }

    @Override // p6.g
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        z.c cVar = (z.c) obj;
        int intValue = ((Number) obj2).intValue();
        m0.s sVar = (m0.s) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            i = (sVar.f(cVar) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= sVar.d(intValue) ? 32 : 16;
        }
        if (sVar.N(i & 1, (i & 147) != 146)) {
            h0 h0Var = (h0) this.f1495d.get(intValue);
            sVar.V(-476961279);
            y0.m b8 = androidx.compose.foundation.a.b(androidx.compose.foundation.layout.a.j(50), f1.s.b(((j0.b0) sVar.j(j0.c0.f3599a)).f3571p, 0.7f), d0.e.a(10));
            u1.e0 d8 = x.k.d(y0.b.f8685h, false);
            int hashCode = Long.hashCode(sVar.T);
            m0.o1 l3 = sVar.l();
            y0.m a02 = r2.o.a0(sVar, b8);
            w1.i.f7684c.getClass();
            w1.y yVar = w1.h.f7675b;
            sVar.Y();
            if (sVar.S) {
                sVar.k(yVar);
            } else {
                sVar.i0();
            }
            m0.b.u(d8, sVar, w1.h.f7678e);
            m0.b.u(l3, sVar, w1.h.f7677d);
            w1.g gVar = w1.h.f7679f;
            if (sVar.S || !q6.i.a(sVar.K(), Integer.valueOf(hashCode))) {
                a0.q.n(hashCode, sVar, hashCode, gVar);
            }
            m0.b.u(a02, sVar, w1.h.f7676c);
            n2.b(h0Var.f1332a, null, 0L, r2.o.Q(28), null, null, 0L, null, 0L, 0, false, 0, 0, null, sVar, 24576, 0, 262126);
            sVar.p(true);
            sVar.p(false);
        } else {
            sVar.Q();
        }
        return c6.m.f1757a;
    }
}
