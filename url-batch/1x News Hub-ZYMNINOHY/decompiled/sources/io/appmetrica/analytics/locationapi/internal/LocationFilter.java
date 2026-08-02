package io.appmetrica.analytics.locationapi.internal;

import kotlin.jvm.internal.f;

/* loaded from: classes.dex */
public final class LocationFilter {

    /* renamed from: a, reason: collision with root package name */
    private final long f8786a;

    /* renamed from: b, reason: collision with root package name */
    private final float f8787b;

    public LocationFilter() {
        this(0L, 0.0f, 3, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!LocationFilter.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.locationapi.internal.LocationFilter");
        }
        LocationFilter locationFilter = (LocationFilter) obj;
        return this.f8786a == locationFilter.f8786a && this.f8787b == locationFilter.f8787b;
    }

    public final float getUpdateDistanceInterval() {
        return this.f8787b;
    }

    public final long getUpdateTimeInterval() {
        return this.f8786a;
    }

    public int hashCode() {
        return Float.hashCode(this.f8787b) + (Long.hashCode(this.f8786a) * 31);
    }

    public String toString() {
        return "LocationFilter(updateTimeInterval=" + this.f8786a + ", updateDistanceInterval=" + this.f8787b + ')';
    }

    public LocationFilter(long j3, float f) {
        this.f8786a = j3;
        this.f8787b = f;
    }

    public /* synthetic */ LocationFilter(long j3, float f, int i3, f fVar) {
        this((i3 & 1) != 0 ? 5000L : j3, (i3 & 2) != 0 ? 10.0f : f);
    }
}
