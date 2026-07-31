package d7;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class y implements l0, f, e7.n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0 f2430d;

    public y(n0 n0Var) {
        this.f2430d = n0Var;
    }

    @Override // e7.n
    public final f b(g6.h hVar, int i, c7.a aVar) {
        return (((i < 0 || i >= 2) && i != -2) || aVar != c7.a.f1761e) ? e0.i(this, hVar, i, aVar) : this;
    }

    @Override // d7.f
    public final Object c(g gVar, g6.c cVar) {
        this.f2430d.c(gVar, cVar);
        return h6.a.f3204d;
    }

    @Override // d7.l0
    public final Object getValue() {
        return this.f2430d.getValue();
    }
}
