package j0;

import androidx.compose.foundation.layout.HorizontalAlignElement;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class e implements p6.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p6.e f3617d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p6.e f3618e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f3619f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f3620g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f3621h;
    public final /* synthetic */ u0.c i;

    public e(p6.e eVar, p6.e eVar2, long j7, long j8, long j9, long j10, u0.c cVar) {
        this.f3617d = eVar;
        this.f3618e = eVar2;
        this.f3619f = j8;
        this.f3620g = j9;
        this.f3621h = j10;
        this.i = cVar;
    }

    @Override // p6.e
    public final Object g(Object obj, Object obj2) {
        m0.s sVar = (m0.s) obj;
        int intValue = ((Number) obj2).intValue();
        if (sVar.N(intValue & 1, (intValue & 3) != 2)) {
            y0.m f6 = androidx.compose.foundation.layout.a.f(y0.j.f8705a, j.f3710e);
            x.q a8 = x.o.a(x.i.f8223c, y0.b.f8692p, sVar, 0);
            int hashCode = Long.hashCode(sVar.T);
            m0.o1 l3 = sVar.l();
            y0.m a02 = r2.o.a0(sVar, f6);
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
            sVar.V(346092326);
            sVar.p(false);
            p6.e eVar = this.f3617d;
            if (eVar == null) {
                sVar.V(346396529);
            } else {
                sVar.V(346396530);
                k0.d.a(this.f3619f, p2.a(l0.f.f4531e, sVar), u0.h.d(71284337, new d(0, eVar), sVar), sVar, 384);
            }
            sVar.p(false);
            p6.e eVar2 = this.f3618e;
            if (eVar2 == null) {
                sVar.V(347174009);
            } else {
                sVar.V(347174010);
                k0.d.a(this.f3620g, p2.a(l0.f.f4533g, sVar), u0.h.d(705583346, new d(1, eVar2), sVar), sVar, 384);
            }
            sVar.p(false);
            HorizontalAlignElement horizontalAlignElement = new HorizontalAlignElement(y0.b.f8694r);
            u1.e0 d8 = x.k.d(y0.b.f8681d, false);
            int hashCode2 = Long.hashCode(sVar.T);
            m0.o1 l7 = sVar.l();
            y0.m a03 = r2.o.a0(sVar, horizontalAlignElement);
            sVar.Y();
            if (sVar.S) {
                sVar.k(yVar);
            } else {
                sVar.i0();
            }
            m0.b.u(d8, sVar, gVar);
            m0.b.u(l7, sVar, gVar2);
            if (sVar.S || !q6.i.a(sVar.K(), Integer.valueOf(hashCode2))) {
                a0.q.n(hashCode2, sVar, hashCode2, gVar3);
            }
            m0.b.u(a03, sVar, gVar4);
            k0.d.a(this.f3621h, p2.a(l0.f.f4528b, sVar), this.i, sVar, 0);
            sVar.p(true);
            sVar.p(true);
        } else {
            sVar.Q();
        }
        return c6.m.f1757a;
    }
}
