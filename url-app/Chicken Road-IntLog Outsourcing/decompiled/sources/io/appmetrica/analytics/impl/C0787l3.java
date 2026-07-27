package io.appmetrica.analytics.impl;

import b2.AbstractC0279e;

/* renamed from: io.appmetrica.analytics.impl.l3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0787l3 {

    /* renamed from: a, reason: collision with root package name */
    public final long f8653a;

    public C0787l3(long j2) {
        this.f8653a = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C0787l3.class == obj.getClass() && this.f8653a == ((C0787l3) obj).f8653a;
    }

    public final int hashCode() {
        long j2 = this.f8653a;
        return (int) (j2 ^ (j2 >>> 32));
    }

    public final String toString() {
        return AbstractC0279e.g(new StringBuilder("CacheControl{lastKnownLocationTtl="), this.f8653a, '}');
    }
}
