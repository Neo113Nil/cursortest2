package X0;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final k2.e f2847a;

    /* renamed from: b, reason: collision with root package name */
    public final b f2848b;

    public a(k2.e eVar, b bVar) {
        this.f2847a = eVar;
        this.f2848b = bVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        aVar.getClass();
        k2.e eVar = aVar.f2847a;
        b bVar = aVar.f2848b;
        if (!this.f2847a.equals(eVar)) {
            return false;
        }
        Object obj2 = d.f2851d;
        return obj2.equals(obj2) && this.f2848b.equals(bVar);
    }

    public final int hashCode() {
        return this.f2848b.hashCode() ^ (((((1000003 * 1000003) ^ this.f2847a.hashCode()) * 1000003) ^ d.f2851d.hashCode()) * 1000003);
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.f2847a + ", priority=" + d.f2851d + ", productData=" + this.f2848b + "}";
    }
}
