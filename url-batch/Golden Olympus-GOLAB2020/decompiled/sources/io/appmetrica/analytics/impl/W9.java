package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public final class W9 {

    /* renamed from: a, reason: collision with root package name */
    public final long f38461a;

    public W9(long j4) {
        this.f38461a = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof W9) && this.f38461a == ((W9) obj).f38461a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f38461a);
    }

    public final String toString() {
        return "ExternalAttributionConfig(collectingInterval=" + this.f38461a + ')';
    }
}
