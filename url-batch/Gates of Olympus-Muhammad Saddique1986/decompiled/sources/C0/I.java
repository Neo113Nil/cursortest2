package C0;

/* loaded from: classes.dex */
public final class I {

    /* renamed from: a, reason: collision with root package name */
    public final D f563a;

    /* renamed from: b, reason: collision with root package name */
    public final D f564b;

    /* renamed from: c, reason: collision with root package name */
    public final D f565c;

    /* renamed from: d, reason: collision with root package name */
    public final D f566d;

    public I(D d3, D d4, D d5, D d6) {
        this.f563a = d3;
        this.f564b = d4;
        this.f565c = d5;
        this.f566d = d6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof I)) {
            return false;
        }
        I i3 = (I) obj;
        return f2.j.a(this.f563a, i3.f563a) && f2.j.a(this.f564b, i3.f564b) && f2.j.a(this.f565c, i3.f565c) && f2.j.a(this.f566d, i3.f566d);
    }

    public final int hashCode() {
        D d3 = this.f563a;
        int hashCode = (d3 != null ? d3.hashCode() : 0) * 31;
        D d4 = this.f564b;
        int hashCode2 = (hashCode + (d4 != null ? d4.hashCode() : 0)) * 31;
        D d5 = this.f565c;
        int hashCode3 = (hashCode2 + (d5 != null ? d5.hashCode() : 0)) * 31;
        D d6 = this.f566d;
        return hashCode3 + (d6 != null ? d6.hashCode() : 0);
    }
}
