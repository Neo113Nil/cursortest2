package G1;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final long f2097a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2098b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2099c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2100d;

    /* renamed from: e, reason: collision with root package name */
    public final long f2101e;

    public h(long j3, String str, String str2, String str3, long j4) {
        f2.j.f(str, "name");
        f2.j.f(str2, "phone");
        f2.j.f(str3, "note");
        this.f2097a = j3;
        this.f2098b = str;
        this.f2099c = str2;
        this.f2100d = str3;
        this.f2101e = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f2097a == hVar.f2097a && f2.j.a(this.f2098b, hVar.f2098b) && f2.j.a(this.f2099c, hVar.f2099c) && f2.j.a(this.f2100d, hVar.f2100d) && this.f2101e == hVar.f2101e;
    }

    public final int hashCode() {
        return Long.hashCode(this.f2101e) + A.k.d(A.k.d(A.k.d(Long.hashCode(this.f2097a) * 31, 31, this.f2098b), 31, this.f2099c), 31, this.f2100d);
    }

    public final String toString() {
        return "ClientEntity(id=" + this.f2097a + ", name=" + this.f2098b + ", phone=" + this.f2099c + ", note=" + this.f2100d + ", createdAt=" + this.f2101e + ")";
    }
}
