package S1;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final r f2488a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2489b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2490c;

    public j(int i2, int i5, Class cls) {
        this(r.a(cls), i2, i5);
    }

    public static j a(Class cls) {
        return new j(1, 0, cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f2488a.equals(jVar.f2488a) && this.f2489b == jVar.f2489b && this.f2490c == jVar.f2490c;
    }

    public final int hashCode() {
        return ((((this.f2488a.hashCode() ^ 1000003) * 1000003) ^ this.f2489b) * 1000003) ^ this.f2490c;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f2488a);
        sb.append(", type=");
        int i2 = this.f2489b;
        sb.append(i2 == 1 ? "required" : i2 == 0 ? "optional" : "set");
        sb.append(", injection=");
        int i5 = this.f2490c;
        if (i5 == 0) {
            str = K3.e.DIRECT_TAG;
        } else if (i5 == 1) {
            str = "provider";
        } else {
            if (i5 != 2) {
                throw new AssertionError(C4.p.g(i5, "Unsupported injection: "));
            }
            str = "deferred";
        }
        return r4.f.f(sb, str, "}");
    }

    public j(r rVar, int i2, int i5) {
        this.f2488a = rVar;
        this.f2489b = i2;
        this.f2490c = i5;
    }
}
