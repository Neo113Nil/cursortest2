package p4;

import b6.c0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class m implements p6.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o4.d f5755d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p f5756e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v0.c f5757f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ w0.p f5758g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ o f5759h;

    public m(o4.d dVar, p pVar, v0.d dVar2, w0.p pVar2, o oVar) {
        this.f5755d = dVar;
        this.f5756e = pVar;
        this.f5757f = dVar2;
        this.f5758g = pVar2;
        this.f5759h = oVar;
    }

    @Override // p6.e
    public final Object g(Object obj, Object obj2) {
        m0.s sVar = (m0.s) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && sVar.z()) {
            sVar.Q();
        } else {
            o4.d dVar = this.f5755d;
            boolean h8 = sVar.h(dVar);
            p pVar = this.f5756e;
            boolean h9 = h8 | sVar.h(pVar);
            Object K = sVar.K();
            if (h9 || K == m0.n.f5019a) {
                K = new c0(this.f5758g, dVar, pVar, 4);
                sVar.f0(K);
            }
            m0.b.d(dVar, (p6.c) K, sVar);
            h0.a.d(dVar, this.f5757f, u0.h.d(-497631156, new a0.v(6, this.f5759h, dVar), sVar), sVar, 384);
        }
        return c6.m.f1757a;
    }
}
