package io.appmetrica.analytics.impl;

import b2.AbstractC0279e;

/* loaded from: classes.dex */
public final class Km {

    /* renamed from: a, reason: collision with root package name */
    public final long f7051a;

    public Km(long j2) {
        this.f7051a = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && Km.class == obj.getClass() && this.f7051a == ((Km) obj).f7051a;
    }

    public final int hashCode() {
        long j2 = this.f7051a;
        return (int) (j2 ^ (j2 >>> 32));
    }

    public final String toString() {
        return AbstractC0279e.g(new StringBuilder("StatSending{disabledReportingInterval="), this.f7051a, '}');
    }
}
