package G1;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final long f2119a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f2120b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2121c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2122d;

    /* renamed from: e, reason: collision with root package name */
    public final double f2123e;

    /* renamed from: f, reason: collision with root package name */
    public final String f2124f;

    /* renamed from: g, reason: collision with root package name */
    public final long f2125g;

    public n(long j3, Long l3, String str, String str2, double d3, String str3, long j4) {
        f2.j.f(str, "clientName");
        f2.j.f(str2, "service");
        f2.j.f(str3, "note");
        this.f2119a = j3;
        this.f2120b = l3;
        this.f2121c = str;
        this.f2122d = str2;
        this.f2123e = d3;
        this.f2124f = str3;
        this.f2125g = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f2119a == nVar.f2119a && f2.j.a(this.f2120b, nVar.f2120b) && f2.j.a(this.f2121c, nVar.f2121c) && f2.j.a(this.f2122d, nVar.f2122d) && Double.compare(this.f2123e, nVar.f2123e) == 0 && f2.j.a(this.f2124f, nVar.f2124f) && this.f2125g == nVar.f2125g;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.f2119a) * 31;
        Long l3 = this.f2120b;
        return Long.hashCode(this.f2125g) + A.k.d((Double.hashCode(this.f2123e) + A.k.d(A.k.d((hashCode + (l3 == null ? 0 : l3.hashCode())) * 31, 31, this.f2121c), 31, this.f2122d)) * 31, 31, this.f2124f);
    }

    public final String toString() {
        return "HaircutEntity(id=" + this.f2119a + ", clientId=" + this.f2120b + ", clientName=" + this.f2121c + ", service=" + this.f2122d + ", price=" + this.f2123e + ", note=" + this.f2124f + ", timestamp=" + this.f2125g + ")";
    }
}
