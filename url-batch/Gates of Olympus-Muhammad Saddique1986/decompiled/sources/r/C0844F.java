package r;

/* renamed from: r.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0844F {

    /* renamed from: a, reason: collision with root package name */
    public final int f7964a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7965b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7966c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7967d;

    public C0844F(int i3, int i4, int i5, int i6) {
        this.f7964a = i3;
        this.f7965b = i4;
        this.f7966c = i5;
        this.f7967d = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0844F)) {
            return false;
        }
        C0844F c0844f = (C0844F) obj;
        return this.f7964a == c0844f.f7964a && this.f7965b == c0844f.f7965b && this.f7966c == c0844f.f7966c && this.f7967d == c0844f.f7967d;
    }

    public final int hashCode() {
        return (((((this.f7964a * 31) + this.f7965b) * 31) + this.f7966c) * 31) + this.f7967d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InsetsValues(left=");
        sb.append(this.f7964a);
        sb.append(", top=");
        sb.append(this.f7965b);
        sb.append(", right=");
        sb.append(this.f7966c);
        sb.append(", bottom=");
        return A.k.j(sb, this.f7967d, ')');
    }
}
