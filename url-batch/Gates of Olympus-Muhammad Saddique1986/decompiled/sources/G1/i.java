package G1;

import m.AbstractC0625j;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final long f2102a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2103b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2104c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2105d;

    /* renamed from: e, reason: collision with root package name */
    public final long f2106e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2107f;

    /* renamed from: g, reason: collision with root package name */
    public final double f2108g;

    public i(long j3, String str, String str2, String str3, long j4, int i3, double d3) {
        f2.j.f(str, "name");
        f2.j.f(str2, "phone");
        f2.j.f(str3, "note");
        this.f2102a = j3;
        this.f2103b = str;
        this.f2104c = str2;
        this.f2105d = str3;
        this.f2106e = j4;
        this.f2107f = i3;
        this.f2108g = d3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f2102a == iVar.f2102a && f2.j.a(this.f2103b, iVar.f2103b) && f2.j.a(this.f2104c, iVar.f2104c) && f2.j.a(this.f2105d, iVar.f2105d) && this.f2106e == iVar.f2106e && this.f2107f == iVar.f2107f && Double.compare(this.f2108g, iVar.f2108g) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f2108g) + AbstractC0625j.a(this.f2107f, A.k.c(A.k.d(A.k.d(A.k.d(Long.hashCode(this.f2102a) * 31, 31, this.f2103b), 31, this.f2104c), 31, this.f2105d), 31, this.f2106e), 31);
    }

    public final String toString() {
        return "ClientStatsRow(id=" + this.f2102a + ", name=" + this.f2103b + ", phone=" + this.f2104c + ", note=" + this.f2105d + ", createdAt=" + this.f2106e + ", visitCount=" + this.f2107f + ", totalSpent=" + this.f2108g + ")";
    }
}
