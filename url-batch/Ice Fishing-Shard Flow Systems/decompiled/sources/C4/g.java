package C4;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f310a;

    /* renamed from: b, reason: collision with root package name */
    public final j f311b;

    public g(String str, j jVar) {
        if (str == null) {
            throw new NullPointerException("Null key");
        }
        this.f310a = str;
        if (jVar == null) {
            throw new NullPointerException("Null value");
        }
        this.f311b = jVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (this.f310a.equals(gVar.f310a) && this.f311b.equals(gVar.f311b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f310a.hashCode() ^ 1000003) * 1000003) ^ this.f311b.hashCode();
    }

    public final String toString() {
        return "KeyValueImpl{key=" + this.f310a + ", value=" + this.f311b + "}";
    }
}
