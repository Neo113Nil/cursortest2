package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class B9 {

    /* renamed from: a, reason: collision with root package name */
    public final long f10094a;

    public B9(long j4) {
        this.f10094a = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof B9) && this.f10094a == ((B9) obj).f10094a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f10094a);
    }

    public final String toString() {
        return "ExternalAttributionConfig(collectingInterval=" + this.f10094a + ')';
    }
}
