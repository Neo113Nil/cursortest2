package s0;

/* loaded from: classes.dex */
public final class N {

    /* renamed from: a, reason: collision with root package name */
    public final String f2883a;

    /* renamed from: b, reason: collision with root package name */
    public final L f2884b;

    public N(String str, L l2) {
        this.f2883a = str;
        this.f2884b = l2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof N)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        N n2 = (N) obj;
        return o.g.k(v0.e.B(this.f2883a, this.f2884b), v0.e.B(n2.f2883a, n2.f2884b));
    }

    public final int hashCode() {
        return v0.e.B(this.f2883a, this.f2884b).hashCode();
    }

    public final String toString() {
        return "StringListResult(jsonEncodedValue=" + this.f2883a + ", type=" + this.f2884b + ")";
    }
}
