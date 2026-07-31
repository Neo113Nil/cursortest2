package A0;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final I1.e f39a;

    /* renamed from: b, reason: collision with root package name */
    public final b f40b;

    public a(I1.e eVar, b bVar) {
        this.f39a = eVar;
        this.f40b = bVar;
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
        I1.e eVar = aVar.f39a;
        b bVar = aVar.f40b;
        if (!this.f39a.equals(eVar)) {
            return false;
        }
        Object obj2 = d.f43f;
        return obj2.equals(obj2) && this.f40b.equals(bVar);
    }

    public final int hashCode() {
        return this.f40b.hashCode() ^ (((((1000003 * 1000003) ^ this.f39a.hashCode()) * 1000003) ^ d.f43f.hashCode()) * 1000003);
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.f39a + ", priority=" + d.f43f + ", productData=" + this.f40b + "}";
    }
}
