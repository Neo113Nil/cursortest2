package J1;

import A.k;
import f2.j;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final long f3175a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f3176b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3177c;

    /* renamed from: d, reason: collision with root package name */
    public final String f3178d;

    /* renamed from: e, reason: collision with root package name */
    public final double f3179e;

    /* renamed from: f, reason: collision with root package name */
    public final String f3180f;

    /* renamed from: g, reason: collision with root package name */
    public final long f3181g;

    public d(long j3, Long l3, String str, String str2, double d3, String str3, long j4) {
        j.f(str, "clientName");
        j.f(str2, "service");
        j.f(str3, "note");
        this.f3175a = j3;
        this.f3176b = l3;
        this.f3177c = str;
        this.f3178d = str2;
        this.f3179e = d3;
        this.f3180f = str3;
        this.f3181g = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f3175a == dVar.f3175a && j.a(this.f3176b, dVar.f3176b) && j.a(this.f3177c, dVar.f3177c) && j.a(this.f3178d, dVar.f3178d) && Double.compare(this.f3179e, dVar.f3179e) == 0 && j.a(this.f3180f, dVar.f3180f) && this.f3181g == dVar.f3181g;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.f3175a) * 31;
        Long l3 = this.f3176b;
        return Long.hashCode(this.f3181g) + k.d((Double.hashCode(this.f3179e) + k.d(k.d((hashCode + (l3 == null ? 0 : l3.hashCode())) * 31, 31, this.f3177c), 31, this.f3178d)) * 31, 31, this.f3180f);
    }

    public final String toString() {
        return "Haircut(id=" + this.f3175a + ", clientId=" + this.f3176b + ", clientName=" + this.f3177c + ", service=" + this.f3178d + ", price=" + this.f3179e + ", note=" + this.f3180f + ", timestamp=" + this.f3181g + ")";
    }
}
