package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.z3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3133z3 {

    /* renamed from: a, reason: collision with root package name */
    public final long f40301a;

    public C3133z3(long j4) {
        this.f40301a = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C3133z3.class == obj.getClass() && this.f40301a == ((C3133z3) obj).f40301a;
    }

    public final int hashCode() {
        long j4 = this.f40301a;
        return (int) (j4 ^ (j4 >>> 32));
    }

    public final String toString() {
        return "CacheControl{lastKnownLocationTtl=" + this.f40301a + '}';
    }
}
