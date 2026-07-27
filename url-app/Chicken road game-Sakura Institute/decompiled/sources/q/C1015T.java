package q;

import A.AbstractC0017m;

/* renamed from: q.T, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1015T {

    /* renamed from: a, reason: collision with root package name */
    public final int f9213a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9214b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9215c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9216d;

    public C1015T(int i2, int i4, int i5, int i6) {
        this.f9213a = i2;
        this.f9214b = i4;
        this.f9215c = i5;
        this.f9216d = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1015T)) {
            return false;
        }
        C1015T c1015t = (C1015T) obj;
        return this.f9213a == c1015t.f9213a && this.f9214b == c1015t.f9214b && this.f9215c == c1015t.f9215c && this.f9216d == c1015t.f9216d;
    }

    public final int hashCode() {
        return (((((this.f9213a * 31) + this.f9214b) * 31) + this.f9215c) * 31) + this.f9216d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InsetsValues(left=");
        sb.append(this.f9213a);
        sb.append(", top=");
        sb.append(this.f9214b);
        sb.append(", right=");
        sb.append(this.f9215c);
        sb.append(", bottom=");
        return AbstractC0017m.l(sb, this.f9216d, ')');
    }
}
