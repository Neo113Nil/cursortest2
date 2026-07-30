package m;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public z0.h f6182a = null;

    /* renamed from: b, reason: collision with root package name */
    public z0.d f6183b = null;

    /* renamed from: c, reason: collision with root package name */
    public b1.c f6184c = null;

    /* renamed from: d, reason: collision with root package name */
    public z0.j f6185d = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return r6.k.a(this.f6182a, jVar.f6182a) && r6.k.a(this.f6183b, jVar.f6183b) && r6.k.a(this.f6184c, jVar.f6184c) && r6.k.a(this.f6185d, jVar.f6185d);
    }

    public final int hashCode() {
        z0.h hVar = this.f6182a;
        int hashCode = (hVar == null ? 0 : hVar.hashCode()) * 31;
        z0.d dVar = this.f6183b;
        int hashCode2 = (hashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        b1.c cVar = this.f6184c;
        int hashCode3 = (hashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        z0.j jVar = this.f6185d;
        return hashCode3 + (jVar != null ? jVar.hashCode() : 0);
    }

    public final String toString() {
        return "BorderCache(imageBitmap=" + this.f6182a + ", canvas=" + this.f6183b + ", canvasDrawScope=" + this.f6184c + ", borderPath=" + this.f6185d + ')';
    }
}
