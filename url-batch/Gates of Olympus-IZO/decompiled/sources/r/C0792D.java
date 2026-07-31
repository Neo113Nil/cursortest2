package r;

import H2.AbstractC0080b;

/* renamed from: r.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0792D {

    /* renamed from: a, reason: collision with root package name */
    public final int f6993a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6994b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6995c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6996d;

    public C0792D(int i3, int i4, int i5, int i6) {
        this.f6993a = i3;
        this.f6994b = i4;
        this.f6995c = i5;
        this.f6996d = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0792D)) {
            return false;
        }
        C0792D c0792d = (C0792D) obj;
        return this.f6993a == c0792d.f6993a && this.f6994b == c0792d.f6994b && this.f6995c == c0792d.f6995c && this.f6996d == c0792d.f6996d;
    }

    public final int hashCode() {
        return (((((this.f6993a * 31) + this.f6994b) * 31) + this.f6995c) * 31) + this.f6996d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InsetsValues(left=");
        sb.append(this.f6993a);
        sb.append(", top=");
        sb.append(this.f6994b);
        sb.append(", right=");
        sb.append(this.f6995c);
        sb.append(", bottom=");
        return AbstractC0080b.k(sb, this.f6996d, ')');
    }
}
