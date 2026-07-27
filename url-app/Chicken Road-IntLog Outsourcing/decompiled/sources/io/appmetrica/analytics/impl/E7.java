package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class E7 {

    /* renamed from: a, reason: collision with root package name */
    public final long f6741a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6742b;

    public E7(int i2, long j2) {
        this.f6741a = j2;
        this.f6742b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E7)) {
            return false;
        }
        E7 e7 = (E7) obj;
        return this.f6741a == e7.f6741a && this.f6742b == e7.f6742b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6742b) + (Long.hashCode(this.f6741a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DecimalProtoModel(mantissa=");
        sb.append(this.f6741a);
        sb.append(", exponent=");
        return B0.o.k(sb, this.f6742b, ')');
    }
}
