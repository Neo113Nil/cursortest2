package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class E7 {

    /* renamed from: a, reason: collision with root package name */
    public final long f5952a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5953b;

    public E7(int i3, long j3) {
        this.f5952a = j3;
        this.f5953b = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E7)) {
            return false;
        }
        E7 e7 = (E7) obj;
        return this.f5952a == e7.f5952a && this.f5953b == e7.f5953b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f5953b) + (Long.hashCode(this.f5952a) * 31);
    }

    public final String toString() {
        return "DecimalProtoModel(mantissa=" + this.f5952a + ", exponent=" + this.f5953b + ')';
    }
}
