package io.appmetrica.analytics.impl;

import b2.AbstractC0279e;

/* loaded from: classes.dex */
public final class I9 {

    /* renamed from: a, reason: collision with root package name */
    public final long f6941a;

    public I9(long j2) {
        this.f6941a = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof I9) && this.f6941a == ((I9) obj).f6941a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f6941a);
    }

    public final String toString() {
        return AbstractC0279e.g(new StringBuilder("ExternalAttributionConfig(collectingInterval="), this.f6941a, ')');
    }
}
