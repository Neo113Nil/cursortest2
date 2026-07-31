package j0;

import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.LayoutWeightElement;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class d implements p6.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3609d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p6.e f3610e;

    public /* synthetic */ d(int i, p6.e eVar) {
        this.f3609d = i;
        this.f3610e = eVar;
    }

    @Override // p6.e
    public final Object g(Object obj, Object obj2) {
        switch (this.f3609d) {
            case 0:
                m0.s sVar = (m0.s) obj;
                int intValue = ((Number) obj2).intValue();
                if (sVar.N(intValue & 1, (intValue & 3) != 2)) {
                    y0.m d8 = androidx.compose.foundation.layout.a.f(y0.j.f8705a, j.f3711f).d(new HorizontalAlignElement(y0.b.f8692p));
                    u1.e0 d9 = x.k.d(y0.b.f8681d, false);
                    int hashCode = Long.hashCode(sVar.T);
                    m0.o1 l3 = sVar.l();
                    y0.m a02 = r2.o.a0(sVar, d8);
                    w1.i.f7684c.getClass();
                    w1.y yVar = w1.h.f7675b;
                    sVar.Y();
                    if (sVar.S) {
                        sVar.k(yVar);
                    } else {
                        sVar.i0();
                    }
                    m0.b.u(d9, sVar, w1.h.f7678e);
                    m0.b.u(l3, sVar, w1.h.f7677d);
                    w1.g gVar = w1.h.f7679f;
                    if (sVar.S || !q6.i.a(sVar.K(), Integer.valueOf(hashCode))) {
                        a0.q.n(hashCode, sVar, hashCode, gVar);
                    }
                    m0.b.u(a02, sVar, w1.h.f7676c);
                    this.f3610e.g(sVar, 0);
                    sVar.p(true);
                } else {
                    sVar.Q();
                }
                break;
            case 1:
                m0.s sVar2 = (m0.s) obj;
                int intValue2 = ((Number) obj2).intValue();
                if (sVar2.N(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (1.0f <= 0.0d) {
                        y.a.a("invalid weight; must be greater than zero");
                    }
                    y0.m d10 = androidx.compose.foundation.layout.a.f(new LayoutWeightElement(1.0f, false), j.f3712g).d(new HorizontalAlignElement(y0.b.f8692p));
                    u1.e0 d11 = x.k.d(y0.b.f8681d, false);
                    int hashCode2 = Long.hashCode(sVar2.T);
                    m0.o1 l7 = sVar2.l();
                    y0.m a03 = r2.o.a0(sVar2, d10);
                    w1.i.f7684c.getClass();
                    w1.y yVar2 = w1.h.f7675b;
                    sVar2.Y();
                    if (sVar2.S) {
                        sVar2.k(yVar2);
                    } else {
                        sVar2.i0();
                    }
                    m0.b.u(d11, sVar2, w1.h.f7678e);
                    m0.b.u(l7, sVar2, w1.h.f7677d);
                    w1.g gVar2 = w1.h.f7679f;
                    if (sVar2.S || !q6.i.a(sVar2.K(), Integer.valueOf(hashCode2))) {
                        a0.q.n(hashCode2, sVar2, hashCode2, gVar2);
                    }
                    m0.b.u(a03, sVar2, w1.h.f7676c);
                    this.f3610e.g(sVar2, 0);
                    sVar2.p(true);
                } else {
                    sVar2.Q();
                }
                break;
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                m0.s sVar3 = (m0.s) obj;
                int intValue3 = ((Number) obj2).intValue();
                if (sVar3.N(intValue3 & 1, (intValue3 & 3) != 2)) {
                    u1.e0 d12 = x.k.d(y0.b.f8681d, false);
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
                    m0.b.u(d12, sVar3, w1.h.f7678e);
                    m0.b.u(l8, sVar3, w1.h.f7677d);
                    w1.g gVar3 = w1.h.f7679f;
                    if (sVar3.S || !q6.i.a(sVar3.K(), Integer.valueOf(hashCode3))) {
                        a0.q.n(hashCode3, sVar3, hashCode3, gVar3);
                    }
                    m0.b.u(a04, sVar3, w1.h.f7676c);
                    this.f3610e.g(sVar3, 0);
                    sVar3.p(true);
                } else {
                    sVar3.Q();
                }
                break;
            case a4.i.INTEGER_FIELD_NUMBER /* 3 */:
                m0.s sVar4 = (m0.s) obj;
                int intValue4 = ((Number) obj2).intValue();
                if (sVar4.N(intValue4 & 1, (intValue4 & 3) != 2)) {
                    u1.e0 d13 = x.k.d(y0.b.f8681d, false);
                    int hashCode4 = Long.hashCode(sVar4.T);
                    m0.o1 l9 = sVar4.l();
                    y0.m a05 = r2.o.a0(sVar4, y0.j.f8705a);
                    w1.i.f7684c.getClass();
                    w1.y yVar4 = w1.h.f7675b;
                    sVar4.Y();
                    if (sVar4.S) {
                        sVar4.k(yVar4);
                    } else {
                        sVar4.i0();
                    }
                    m0.b.u(d13, sVar4, w1.h.f7678e);
                    m0.b.u(l9, sVar4, w1.h.f7677d);
                    w1.g gVar4 = w1.h.f7679f;
                    if (sVar4.S || !q6.i.a(sVar4.K(), Integer.valueOf(hashCode4))) {
                        a0.q.n(hashCode4, sVar4, hashCode4, gVar4);
                    }
                    m0.b.u(a05, sVar4, w1.h.f7676c);
                    this.f3610e.g(sVar4, 0);
                    sVar4.p(true);
                } else {
                    sVar4.Q();
                }
                break;
            default:
                m0.s sVar5 = (m0.s) obj;
                int intValue5 = ((Number) obj2).intValue();
                if (sVar5.N(intValue5 & 1, (intValue5 & 3) != 2)) {
                    u1.e0 d14 = x.k.d(y0.b.f8681d, false);
                    int hashCode5 = Long.hashCode(sVar5.T);
                    m0.o1 l10 = sVar5.l();
                    y0.m a06 = r2.o.a0(sVar5, y0.j.f8705a);
                    w1.i.f7684c.getClass();
                    w1.y yVar5 = w1.h.f7675b;
                    sVar5.Y();
                    if (sVar5.S) {
                        sVar5.k(yVar5);
                    } else {
                        sVar5.i0();
                    }
                    m0.b.u(d14, sVar5, w1.h.f7678e);
                    m0.b.u(l10, sVar5, w1.h.f7677d);
                    w1.g gVar5 = w1.h.f7679f;
                    if (sVar5.S || !q6.i.a(sVar5.K(), Integer.valueOf(hashCode5))) {
                        a0.q.n(hashCode5, sVar5, hashCode5, gVar5);
                    }
                    m0.b.u(a06, sVar5, w1.h.f7676c);
                    this.f3610e.g(sVar5, 0);
                    sVar5.p(true);
                } else {
                    sVar5.Q();
                }
                break;
        }
        return c6.m.f1757a;
    }
}
