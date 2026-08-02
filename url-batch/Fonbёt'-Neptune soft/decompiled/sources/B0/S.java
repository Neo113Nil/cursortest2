package B0;

/* loaded from: classes.dex */
public final class S {

    /* renamed from: a, reason: collision with root package name */
    public final String f135a;

    /* renamed from: b, reason: collision with root package name */
    public final P f136b;

    public S(String str, P p2) {
        this.f135a = str;
        this.f136b = p2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S)) {
            return false;
        }
        S s2 = (S) obj;
        return Q0.h.a(this.f135a, s2.f135a) && this.f136b == s2.f136b;
    }

    public final int hashCode() {
        String str = this.f135a;
        return this.f136b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "StringListResult(jsonEncodedValue=" + this.f135a + ", type=" + this.f136b + ")";
    }
}
