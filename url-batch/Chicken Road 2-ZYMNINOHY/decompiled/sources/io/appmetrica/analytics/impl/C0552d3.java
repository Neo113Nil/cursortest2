package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.d3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0552d3 {

    /* renamed from: a, reason: collision with root package name */
    public final long f11648a;

    public C0552d3(long j4) {
        this.f11648a = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C0552d3.class == obj.getClass() && this.f11648a == ((C0552d3) obj).f11648a;
    }

    public final int hashCode() {
        long j4 = this.f11648a;
        return (int) (j4 ^ (j4 >>> 32));
    }

    public final String toString() {
        return "CacheControl{lastKnownLocationTtl=" + this.f11648a + '}';
    }
}
