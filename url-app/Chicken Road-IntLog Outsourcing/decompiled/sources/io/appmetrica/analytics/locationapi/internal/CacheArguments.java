package io.appmetrica.analytics.locationapi.internal;

import b2.AbstractC0279e;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.e;

/* loaded from: classes.dex */
public final class CacheArguments {

    /* renamed from: a, reason: collision with root package name */
    private final long f9749a;

    /* renamed from: b, reason: collision with root package name */
    private final long f9750b;

    public CacheArguments() {
        this(0L, 0L, 3, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!CacheArguments.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.locationapi.internal.CacheArguments");
        }
        CacheArguments cacheArguments = (CacheArguments) obj;
        return this.f9749a == cacheArguments.f9749a && this.f9750b == cacheArguments.f9750b;
    }

    public final long getOutdatedTimeInterval() {
        return this.f9750b;
    }

    public final long getRefreshPeriod() {
        return this.f9749a;
    }

    public int hashCode() {
        return Long.hashCode(this.f9750b) + (Long.hashCode(this.f9749a) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CacheArguments(refreshPeriod=");
        sb.append(this.f9749a);
        sb.append(", outdatedTimeInterval=");
        return AbstractC0279e.g(sb, this.f9750b, ')');
    }

    public CacheArguments(long j2, long j6) {
        this.f9749a = j2;
        this.f9750b = j6;
    }

    public /* synthetic */ CacheArguments(long j2, long j6, int i2, e eVar) {
        this((i2 & 1) != 0 ? TimeUnit.SECONDS.toMillis(10L) : j2, (i2 & 2) != 0 ? TimeUnit.MINUTES.toMillis(2L) : j6);
    }
}
