package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public final class C9 {

    /* renamed from: a, reason: collision with root package name */
    public final long f793a;

    public C9(long j) {
        this.f793a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9) && this.f793a == ((C9) obj).f793a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f793a);
    }

    public final String toString() {
        return "ExternalAttributionConfig(collectingInterval=" + this.f793a + ')';
    }
}
