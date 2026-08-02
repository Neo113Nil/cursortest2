package W1;

/* loaded from: classes.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    public final String f1659a;

    /* renamed from: b, reason: collision with root package name */
    public final M f1660b;

    public O(String str, M m3) {
        this.f1659a = str;
        this.f1660b = m3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof O)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        O o = (O) obj;
        return C2.b.l(c2.f.L(this.f1659a, this.f1660b), c2.f.L(o.f1659a, o.f1660b));
    }

    public final int hashCode() {
        return c2.f.L(this.f1659a, this.f1660b).hashCode();
    }

    public final String toString() {
        return "StringListResult(jsonEncodedValue=" + this.f1659a + ", type=" + this.f1660b + ")";
    }
}
