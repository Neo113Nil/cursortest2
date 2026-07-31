package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.x7, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0622x7 {

    /* renamed from: a, reason: collision with root package name */
    public final long f1562a;
    public final int b;

    public C0622x7(long j, int i) {
        this.f1562a = j;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0622x7)) {
            return false;
        }
        C0622x7 c0622x7 = (C0622x7) obj;
        return this.f1562a == c0622x7.f1562a && this.b == c0622x7.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Long.hashCode(this.f1562a) * 31);
    }

    public final String toString() {
        return "DecimalProtoModel(mantissa=" + this.f1562a + ", exponent=" + this.b + ')';
    }
}
