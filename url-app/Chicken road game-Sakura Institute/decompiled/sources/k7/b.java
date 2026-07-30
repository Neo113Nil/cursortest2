package k7;

import c7.w1;
import d6.z;
import h7.q;
import h7.s;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b implements c7.f, w1 {

    /* renamed from: f, reason: collision with root package name */
    public final c7.h f5377f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c f5378g;

    public b(c cVar, c7.h hVar) {
        this.f5378g = cVar;
        this.f5377f = hVar;
    }

    @Override // c7.w1
    public final void a(q qVar, int i7) {
        this.f5377f.a(qVar, i7);
    }

    @Override // c7.f
    public final boolean g(Throwable th) {
        return this.f5377f.g(th);
    }

    @Override // h6.d
    public final h6.i getContext() {
        return this.f5377f.f1702j;
    }

    @Override // c7.f
    public final void l(Object obj) {
        this.f5377f.l(obj);
    }

    @Override // c7.f
    public final s o(Object obj, q6.f fVar) {
        c cVar = this.f5378g;
        c7.g gVar = new c7.g(cVar, this);
        s o2 = this.f5377f.o((z) obj, gVar);
        if (o2 != null) {
            c.f5379g.set(cVar, null);
        }
        return o2;
    }

    @Override // h6.d
    public final void resumeWith(Object obj) {
        this.f5377f.resumeWith(obj);
    }
}
