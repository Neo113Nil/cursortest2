package V3;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f2716a;

    /* renamed from: b, reason: collision with root package name */
    public final g f2717b;

    public d(String str, g gVar) {
        if (str == null) {
            throw new NullPointerException("Null key");
        }
        this.f2716a = str;
        if (gVar == null) {
            throw new NullPointerException("Null value");
        }
        this.f2717b = gVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f2716a.equals(dVar.f2716a) && this.f2717b.equals(dVar.f2717b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f2716a.hashCode() ^ 1000003) * 1000003) ^ this.f2717b.hashCode();
    }

    public final String toString() {
        return "KeyValueImpl{key=" + this.f2716a + ", value=" + this.f2717b + "}";
    }
}
