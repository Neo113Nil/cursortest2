package h6;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final c9.e f4475a;

    /* renamed from: b, reason: collision with root package name */
    public final b f4476b;

    public a(c9.e eVar, b bVar) {
        this.f4475a = eVar;
        this.f4476b = bVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!this.f4475a.equals(aVar.f4475a)) {
            return false;
        }
        Object obj2 = d.f4479d;
        return obj2.equals(obj2) && this.f4476b.equals(aVar.f4476b);
    }

    public final int hashCode() {
        return this.f4476b.hashCode() ^ (((((1000003 * 1000003) ^ this.f4475a.hashCode()) * 1000003) ^ d.f4479d.hashCode()) * 1000003);
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.f4475a + ", priority=" + d.f4479d + ", productData=" + this.f4476b + "}";
    }
}
