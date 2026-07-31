package e5;

/* renamed from: e5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0346a {

    /* renamed from: a, reason: collision with root package name */
    public final W4.c f4007a;

    /* renamed from: b, reason: collision with root package name */
    public final W4.d f4008b;

    /* renamed from: c, reason: collision with root package name */
    public final C0352g f4009c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4010d;

    public C0346a(W4.c cVar, W4.d dVar, C0352g c0352g, int i7) {
        this.f4007a = cVar;
        this.f4008b = dVar;
        this.f4009c = c0352g;
        this.f4010d = i7;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0346a)) {
            return false;
        }
        C0346a c0346a = (C0346a) obj;
        if (!this.f4007a.equals(c0346a.f4007a) || !this.f4008b.equals(c0346a.f4008b) || !this.f4009c.equals(c0346a.f4009c) || this.f4010d != c0346a.f4010d) {
            return false;
        }
        Object obj2 = Z4.b.f3107f;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        return ((((((((this.f4007a.hashCode() ^ 1000003) * 1000003) ^ this.f4008b.hashCode()) * 1000003) ^ this.f4009c.hashCode()) * 1000003) ^ this.f4010d) * 1000003) ^ Z4.b.f3107f.hashCode();
    }

    public final String toString() {
        return "RegisteredView{instrumentSelector=" + this.f4007a + ", view=" + this.f4008b + "}";
    }
}
