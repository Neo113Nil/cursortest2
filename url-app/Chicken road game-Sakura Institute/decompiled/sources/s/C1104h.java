package s;

import A.AbstractC0017m;

/* renamed from: s.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1104h {

    /* renamed from: a, reason: collision with root package name */
    public final int f9933a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9934b;

    public C1104h(int i2, int i4) {
        this.f9933a = i2;
        this.f9934b = i4;
        if (i2 < 0) {
            throw new IllegalArgumentException("negative start index");
        }
        if (i4 < i2) {
            throw new IllegalArgumentException("end index greater than start");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1104h)) {
            return false;
        }
        C1104h c1104h = (C1104h) obj;
        return this.f9933a == c1104h.f9933a && this.f9934b == c1104h.f9934b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f9934b) + (Integer.hashCode(this.f9933a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Interval(start=");
        sb.append(this.f9933a);
        sb.append(", end=");
        return AbstractC0017m.l(sb, this.f9934b, ')');
    }
}
