package e7;

import a7.x;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class k extends f {

    /* renamed from: h, reason: collision with root package name */
    public final i6.i f2562h;

    /* JADX WARN: Multi-variable type inference failed */
    public k(p6.f fVar, d7.f fVar2, g6.h hVar, int i, c7.a aVar) {
        super(fVar2, hVar, i, aVar);
        this.f2562h = (i6.i) fVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [i6.i, p6.f] */
    @Override // e7.e
    public final e e(g6.h hVar, int i, c7.a aVar) {
        return new k(this.f2562h, this.f2548g, hVar, i, aVar);
    }

    @Override // e7.f
    public final Object h(d7.g gVar, g6.c cVar) {
        Object b8 = x.b(new h(this, gVar, null), cVar);
        return b8 == h6.a.f3204d ? b8 : c6.m.f1757a;
    }
}
