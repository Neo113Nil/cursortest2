package j0;

import android.content.Context;
import com.snovikpovik.vuevnxsj.R;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class i0 implements p6.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3698d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3699e;

    public /* synthetic */ i0(int i, Object obj) {
        this.f3698d = i;
        this.f3699e = obj;
    }

    @Override // p6.e
    public final Object g(Object obj, Object obj2) {
        int i = this.f3698d;
        y0.j jVar = y0.j.f8705a;
        Object obj3 = this.f3699e;
        c6.m mVar = c6.m.f1757a;
        int i8 = 1;
        switch (i) {
            case 0:
                m0.s sVar = (m0.s) obj;
                int intValue = ((Number) obj2).intValue();
                c5.x xVar = (c5.x) obj3;
                if (sVar.N(intValue & 1, (intValue & 3) != 2)) {
                    sVar.j(x1.k0.f8487a);
                    String string = ((Context) sVar.j(x1.k0.f8488b)).getResources().getString(R.string.m3c_dialog);
                    y0.m mVar2 = (y0.m) xVar.f1738e;
                    float f6 = j.f3706a;
                    y0.m l3 = androidx.compose.foundation.layout.a.l(mVar2);
                    boolean f8 = sVar.f(string);
                    Object K = sVar.K();
                    if (f8 || K == m0.n.f5019a) {
                        K = new h0(string, 0);
                        sVar.f0(K);
                    }
                    y0.m d8 = l3.d(d2.l.a(jVar, (p6.c) K));
                    u1.e0 d9 = x.k.d(y0.b.f8681d, true);
                    int hashCode = Long.hashCode(sVar.T);
                    m0.o1 l7 = sVar.l();
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
                    m0.b.u(l7, sVar, w1.h.f7677d);
                    w1.g gVar = w1.h.f7679f;
                    if (sVar.S || !q6.i.a(sVar.K(), Integer.valueOf(hashCode))) {
                        a0.q.n(hashCode, sVar, hashCode, gVar);
                    }
                    m0.b.u(a02, sVar, w1.h.f7676c);
                    ((u0.c) xVar.f1740g).g(sVar, 0);
                    sVar.p(true);
                } else {
                    sVar.Q();
                }
                return mVar;
            case 1:
                m0.s sVar2 = (m0.s) obj;
                int intValue2 = ((Number) obj2).intValue();
                p1 p1Var = (p1) obj3;
                if (sVar2.N(intValue2 & 1, (intValue2 & 3) != 2)) {
                    y0.m a8 = d2.l.a(androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.a.d(jVar, 1.0f).d(new y0.h(new x.u0(i8, p1Var.f3854e))), Float.NaN, o1.f3811a), new a4.a(3));
                    x.c cVar = x.i.f8221a;
                    x.f g3 = x.i.g(o1.f3812b);
                    y0.d dVar = y0.b.f8690n;
                    u0.c cVar2 = p1Var.f3855f;
                    x.l0 a9 = x.k0.a(g3, dVar, sVar2, 54);
                    int hashCode2 = Long.hashCode(sVar2.T);
                    m0.o1 l8 = sVar2.l();
                    y0.m a03 = r2.o.a0(sVar2, a8);
                    w1.i.f7684c.getClass();
                    w1.y yVar2 = w1.h.f7675b;
                    sVar2.Y();
                    if (sVar2.S) {
                        sVar2.k(yVar2);
                    } else {
                        sVar2.i0();
                    }
                    m0.b.u(a9, sVar2, w1.h.f7678e);
                    m0.b.u(l8, sVar2, w1.h.f7677d);
                    w1.g gVar2 = w1.h.f7679f;
                    if (sVar2.S || !q6.i.a(sVar2.K(), Integer.valueOf(hashCode2))) {
                        a0.q.n(hashCode2, sVar2, hashCode2, gVar2);
                    }
                    m0.b.u(a03, sVar2, w1.h.f7676c);
                    cVar2.d(x.m0.f8248a, sVar2, 6);
                    sVar2.p(true);
                } else {
                    sVar2.Q();
                }
                return mVar;
            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                m0.s sVar3 = (m0.s) obj;
                int intValue3 = ((Number) obj2).intValue();
                if (sVar3.N(intValue3 & 1, (intValue3 & 3) != 2)) {
                    x.k.a(androidx.compose.foundation.c.a(a.a.f(androidx.compose.ui.layout.a.c("indicatorRipple"), h2.a(l0.m.f4566d, sVar3)), (k0.g) obj3, w1.a()), sVar3, 0);
                } else {
                    sVar3.Q();
                }
                return mVar;
            default:
                m0.s sVar4 = (m0.s) obj;
                int intValue4 = ((Number) obj2).intValue();
                if (sVar4.N(intValue4 & 1, (intValue4 & 3) != 2)) {
                    throw null;
                }
                sVar4.Q();
                return mVar;
        }
    }
}
