package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public final class Hm {

    /* renamed from: a, reason: collision with root package name */
    public final long f37674a;

    public Hm(long j4) {
        this.f37674a = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && Hm.class == obj.getClass() && this.f37674a == ((Hm) obj).f37674a;
    }

    public final int hashCode() {
        long j4 = this.f37674a;
        return (int) (j4 ^ (j4 >>> 32));
    }

    public final String toString() {
        return "StatSending{disabledReportingInterval=" + this.f37674a + '}';
    }
}
