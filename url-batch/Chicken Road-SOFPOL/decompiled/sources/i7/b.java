package i7;

import a7.s1;
import c6.m;
import d4.t;
import f7.r;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class b implements a7.f, s1 {

    /* renamed from: d, reason: collision with root package name */
    public final a7.h f3466d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c f3467e;

    public b(c cVar, a7.h hVar) {
        this.f3467e = cVar;
        this.f3466d = hVar;
    }

    @Override // a7.f
    public final void A(Object obj) {
        this.f3466d.A(obj);
    }

    @Override // a7.s1
    public final void a(r rVar, int i) {
        this.f3466d.a(rVar, i);
    }

    @Override // g6.c
    public final g6.h f() {
        return this.f3466d.f261h;
    }

    @Override // g6.c
    public final void k(Object obj) {
        this.f3466d.k(obj);
    }

    @Override // a7.f
    public final boolean m(Throwable th) {
        return this.f3466d.m(th);
    }

    @Override // a7.f
    public final t o(Object obj, p6.f fVar) {
        c cVar = this.f3467e;
        a7.g gVar = new a7.g(cVar, this);
        t o2 = this.f3466d.o((m) obj, gVar);
        if (o2 != null) {
            c.f3468g.set(cVar, null);
        }
        return o2;
    }
}
