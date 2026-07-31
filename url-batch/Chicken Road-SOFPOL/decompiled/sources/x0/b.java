package x0;

import java.util.List;
import m0.s;
import n0.k0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class b implements k0, g6.f {

    /* renamed from: e, reason: collision with root package name */
    public static final p.b f8316e = new p.b(16);

    /* renamed from: d, reason: collision with root package name */
    public final s f8317d;

    public b(s sVar) {
        this.f8317d = sVar;
    }

    @Override // g6.h
    public final g6.h c(g6.h hVar) {
        return a.a.v(this, hVar);
    }

    @Override // n0.k0
    public final List e(Integer num) {
        return this.f8317d.D();
    }

    @Override // g6.h
    public final Object g(Object obj, p6.e eVar) {
        return eVar.g(obj, this);
    }

    @Override // g6.f
    public final g6.g getKey() {
        return f8316e;
    }

    @Override // g6.h
    public final g6.f l(g6.g gVar) {
        return a.a.j(this, gVar);
    }

    @Override // g6.h
    public final g6.h v(g6.g gVar) {
        return a.a.s(this, gVar);
    }
}
