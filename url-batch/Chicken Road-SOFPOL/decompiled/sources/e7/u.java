package e7;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class u implements g6.c, i6.d {

    /* renamed from: d, reason: collision with root package name */
    public final g6.c f2575d;

    /* renamed from: e, reason: collision with root package name */
    public final g6.h f2576e;

    public u(g6.c cVar, g6.h hVar) {
        this.f2575d = cVar;
        this.f2576e = hVar;
    }

    @Override // i6.d
    public final i6.d e() {
        g6.c cVar = this.f2575d;
        if (cVar instanceof i6.d) {
            return (i6.d) cVar;
        }
        return null;
    }

    @Override // g6.c
    public final g6.h f() {
        return this.f2576e;
    }

    @Override // g6.c
    public final void k(Object obj) {
        this.f2575d.k(obj);
    }
}
