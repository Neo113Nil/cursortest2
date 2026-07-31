package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public final class S7 {

    /* renamed from: a, reason: collision with root package name */
    public final long f38246a;

    /* renamed from: b, reason: collision with root package name */
    public final int f38247b;

    public S7(int i4, long j4) {
        this.f38246a = j4;
        this.f38247b = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S7)) {
            return false;
        }
        S7 s7 = (S7) obj;
        return this.f38246a == s7.f38246a && this.f38247b == s7.f38247b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f38247b) + (Long.hashCode(this.f38246a) * 31);
    }

    public final String toString() {
        return "DecimalProtoModel(mantissa=" + this.f38246a + ", exponent=" + this.f38247b + ')';
    }
}
