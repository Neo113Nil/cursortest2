package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.l3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0636l3 {

    /* renamed from: a, reason: collision with root package name */
    public final long f7751a;

    public C0636l3(long j3) {
        this.f7751a = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C0636l3.class == obj.getClass() && this.f7751a == ((C0636l3) obj).f7751a;
    }

    public final int hashCode() {
        long j3 = this.f7751a;
        return (int) (j3 ^ (j3 >>> 32));
    }

    public final String toString() {
        return "CacheControl{lastKnownLocationTtl=" + this.f7751a + '}';
    }
}
