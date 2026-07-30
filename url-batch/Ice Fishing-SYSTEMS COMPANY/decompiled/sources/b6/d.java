package b6;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f5567a;

    /* renamed from: b, reason: collision with root package name */
    public final g f5568b;

    public d(String str, g gVar) {
        if (str == null) {
            throw new NullPointerException("Null key");
        }
        this.f5567a = str;
        if (gVar == null) {
            throw new NullPointerException("Null value");
        }
        this.f5568b = gVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f5567a.equals(dVar.f5567a) && this.f5568b.equals(dVar.f5568b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f5567a.hashCode() ^ 1000003) * 1000003) ^ this.f5568b.hashCode();
    }

    public final String toString() {
        return "KeyValueImpl{key=" + this.f5567a + ", value=" + this.f5568b + "}";
    }
}
