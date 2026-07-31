package f7;

import a7.x;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public class q extends a7.a implements i6.d {

    /* renamed from: g, reason: collision with root package name */
    public final g6.c f2797g;

    public q(g6.c cVar, g6.h hVar) {
        super(hVar, true);
        this.f2797g = cVar;
    }

    @Override // a7.a1
    public final boolean R() {
        return true;
    }

    @Override // i6.d
    public final i6.d e() {
        g6.c cVar = this.f2797g;
        if (cVar instanceof i6.d) {
            return (i6.d) cVar;
        }
        return null;
    }

    @Override // a7.a1
    public void y(Object obj) {
        a.h(m.a.G(this.f2797g), x.o(obj));
    }

    @Override // a7.a1
    public void z(Object obj) {
        this.f2797g.k(x.o(obj));
    }
}
