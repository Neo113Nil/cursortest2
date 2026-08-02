package io.appmetrica.analytics.locationapi.internal;

import kotlin.jvm.internal.e;

/* loaded from: classes.dex */
public final class LocationFilter {

    /* renamed from: a, reason: collision with root package name */
    private final long f13182a;

    /* renamed from: b, reason: collision with root package name */
    private final float f13183b;

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
        return this.f13182a == locationFilter.f13182a && this.f13183b == locationFilter.f13183b;
    }

    public final float getUpdateDistanceInterval() {
        return this.f13183b;
    }

    public final long getUpdateTimeInterval() {
        return this.f13182a;
    }

    public int hashCode() {
        return Float.hashCode(this.f13183b) + (Long.hashCode(this.f13182a) * 31);
    }

    public String toString() {
        return "LocationFilter(updateTimeInterval=" + this.f13182a + ", updateDistanceInterval=" + this.f13183b + ')';
    }

    public LocationFilter(long j4, float f4) {
        this.f13182a = j4;
        this.f13183b = f4;
    }

    public /* synthetic */ LocationFilter(long j4, float f4, int i4, e eVar) {
        this((i4 & 1) != 0 ? 5000L : j4, (i4 & 2) != 0 ? 10.0f : f4);
    }
}
