package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Gm {

    /* renamed from: a, reason: collision with root package name */
    public final long f10340a;

    public Gm(long j4) {
        this.f10340a = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && Gm.class == obj.getClass() && this.f10340a == ((Gm) obj).f10340a;
    }

    public final int hashCode() {
        long j4 = this.f10340a;
        return (int) (j4 ^ (j4 >>> 32));
    }

    public final String toString() {
        return "StatSending{disabledReportingInterval=" + this.f10340a + '}';
    }
}
