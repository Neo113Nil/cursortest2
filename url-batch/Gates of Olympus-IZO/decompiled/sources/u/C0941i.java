package u;

import H2.AbstractC0080b;

/* renamed from: u.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0941i {

    /* renamed from: a, reason: collision with root package name */
    public final int f8069a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8070b;

    public C0941i(int i3, int i4) {
        this.f8069a = i3;
        this.f8070b = i4;
        if (i3 < 0) {
            throw new IllegalArgumentException("negative start index");
        }
        if (i4 < i3) {
            throw new IllegalArgumentException("end index greater than start");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0941i)) {
            return false;
        }
        C0941i c0941i = (C0941i) obj;
        return this.f8069a == c0941i.f8069a && this.f8070b == c0941i.f8070b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f8070b) + (Integer.hashCode(this.f8069a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Interval(start=");
        sb.append(this.f8069a);
        sb.append(", end=");
        return AbstractC0080b.k(sb, this.f8070b, ')');
    }
}
