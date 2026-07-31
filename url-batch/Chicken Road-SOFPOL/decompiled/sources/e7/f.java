package e7;

import a0.w0;
import a7.x;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class f extends e {

    /* renamed from: g, reason: collision with root package name */
    public final d7.f f2548g;

    public f(d7.f fVar, g6.h hVar, int i, c7.a aVar) {
        super(hVar, i, aVar);
        this.f2548g = fVar;
    }

    @Override // d7.f
    public final Object c(d7.g gVar, g6.c cVar) {
        int i = this.f2546e;
        g6.c cVar2 = null;
        h6.a aVar = h6.a.f3204d;
        c6.m mVar = c6.m.f1757a;
        if (i == -3) {
            g6.h f6 = cVar.f();
            Boolean bool = Boolean.FALSE;
            w0 w0Var = new w0(3);
            g6.h hVar = this.f2545d;
            g6.h c8 = !((Boolean) hVar.g(bool, w0Var)).booleanValue() ? f6.c(hVar) : x.e(f6, hVar, false);
            if (q6.i.a(c8, f6)) {
                Object h8 = h(gVar, cVar);
                if (h8 == aVar) {
                    return h8;
                }
            } else {
                g6.d dVar = g6.d.f3045d;
                if (q6.i.a(c8.l(dVar), f6.l(dVar))) {
                    g6.h f8 = cVar.f();
                    if (!(gVar instanceof t) && !(gVar instanceof p)) {
                        gVar = new d7.o(gVar, f8);
                    }
                    Object a8 = c.a(c8, gVar, f7.a.k(c8), new b0.d(this, cVar2, 4), cVar);
                    if (a8 == aVar) {
                        return a8;
                    }
                }
            }
        }
        Object b8 = x.b(new b0.c(gVar, this, cVar2, 4), cVar);
        if (b8 != aVar) {
            b8 = mVar;
        }
        return b8 == aVar ? b8 : mVar;
    }

    @Override // e7.e
    public final Object d(c7.p pVar, b0.d dVar) {
        Object h8 = h(new t(pVar), dVar);
        return h8 == h6.a.f3204d ? h8 : c6.m.f1757a;
    }

    public abstract Object h(d7.g gVar, g6.c cVar);

    @Override // e7.e
    public final String toString() {
        return this.f2548g + " -> " + super.toString();
    }
}
