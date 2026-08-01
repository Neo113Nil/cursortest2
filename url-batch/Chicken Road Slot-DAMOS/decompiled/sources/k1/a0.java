package k1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a0 extends v {

    /* renamed from: f, reason: collision with root package name */
    public final j1.d f5295f;
    public final g g;

    public a0(j1.d dVar) {
        g gVar;
        this.f5295f = dVar;
        if (g8.b.G(dVar)) {
            gVar = null;
        } else {
            gVar = i.a();
            g.b(gVar, dVar);
        }
        this.g = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a0) {
            return this.f5295f.equals(((a0) obj).f5295f);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5295f.hashCode();
    }

    @Override // k1.v
    public final j1.c i() {
        j1.d dVar = this.f5295f;
        return new j1.c(dVar.f4920a, dVar.f4921b, dVar.f4922c, dVar.f4923d);
    }
}
