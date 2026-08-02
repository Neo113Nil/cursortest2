package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.w7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1047w7 {

    /* renamed from: a, reason: collision with root package name */
    public final long f12922a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12923b;

    public C1047w7(long j4, int i4) {
        this.f12922a = j4;
        this.f12923b = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1047w7)) {
            return false;
        }
        C1047w7 c1047w7 = (C1047w7) obj;
        return this.f12922a == c1047w7.f12922a && this.f12923b == c1047w7.f12923b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f12923b) + (Long.hashCode(this.f12922a) * 31);
    }

    public final String toString() {
        return "DecimalProtoModel(mantissa=" + this.f12922a + ", exponent=" + this.f12923b + ')';
    }
}
