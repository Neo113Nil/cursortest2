package t;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public f1.g f6824a = null;

    /* renamed from: b, reason: collision with root package name */
    public f1.b f6825b = null;

    /* renamed from: c, reason: collision with root package name */
    public h1.b f6826c = null;

    /* renamed from: d, reason: collision with root package name */
    public f1.j f6827d = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return q6.i.a(this.f6824a, oVar.f6824a) && q6.i.a(this.f6825b, oVar.f6825b) && q6.i.a(this.f6826c, oVar.f6826c) && q6.i.a(this.f6827d, oVar.f6827d);
    }

    public final int hashCode() {
        f1.g gVar = this.f6824a;
        int hashCode = (gVar == null ? 0 : gVar.hashCode()) * 31;
        f1.b bVar = this.f6825b;
        int hashCode2 = (hashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        h1.b bVar2 = this.f6826c;
        int hashCode3 = (hashCode2 + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
        f1.j jVar = this.f6827d;
        return hashCode3 + (jVar != null ? jVar.hashCode() : 0);
    }

    public final String toString() {
        return "BorderCache(imageBitmap=" + this.f6824a + ", canvas=" + this.f6825b + ", canvasDrawScope=" + this.f6826c + ", borderPath=" + this.f6827d + ')';
    }
}
