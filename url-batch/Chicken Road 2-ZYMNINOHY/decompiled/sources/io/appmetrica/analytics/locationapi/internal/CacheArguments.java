package io.appmetrica.analytics.locationapi.internal;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.e;

/* loaded from: classes.dex */
public final class CacheArguments {

    /* renamed from: a, reason: collision with root package name */
    private final long f13180a;

    /* renamed from: b, reason: collision with root package name */
    private final long f13181b;

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
        return this.f13180a == cacheArguments.f13180a && this.f13181b == cacheArguments.f13181b;
    }

    public final long getOutdatedTimeInterval() {
        return this.f13181b;
    }

    public final long getRefreshPeriod() {
        return this.f13180a;
    }

    public int hashCode() {
        return Long.hashCode(this.f13181b) + (Long.hashCode(this.f13180a) * 31);
    }

    public String toString() {
        return "CacheArguments(refreshPeriod=" + this.f13180a + ", outdatedTimeInterval=" + this.f13181b + ')';
    }

    public CacheArguments(long j4, long j5) {
        this.f13180a = j4;
        this.f13181b = j5;
    }

    public /* synthetic */ CacheArguments(long j4, long j5, int i4, e eVar) {
        this((i4 & 1) != 0 ? TimeUnit.SECONDS.toMillis(10L) : j4, (i4 & 2) != 0 ? TimeUnit.MINUTES.toMillis(2L) : j5);
    }
}
