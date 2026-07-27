package io.appmetrica.analytics.locationapi.internal;

import com.onesignal.debug.internal.crash.AnrConstants;
import kotlin.jvm.internal.e;

/* loaded from: classes.dex */
public final class LocationFilter {

    /* renamed from: a, reason: collision with root package name */
    private final long f9751a;

    /* renamed from: b, reason: collision with root package name */
    private final float f9752b;

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
        return this.f9751a == locationFilter.f9751a && this.f9752b == locationFilter.f9752b;
    }

    public final float getUpdateDistanceInterval() {
        return this.f9752b;
    }

    public final long getUpdateTimeInterval() {
        return this.f9751a;
    }

    public int hashCode() {
        return Float.hashCode(this.f9752b) + (Long.hashCode(this.f9751a) * 31);
    }

    public String toString() {
        return "LocationFilter(updateTimeInterval=" + this.f9751a + ", updateDistanceInterval=" + this.f9752b + ')';
    }

    public LocationFilter(long j2, float f3) {
        this.f9751a = j2;
        this.f9752b = f3;
    }

    public /* synthetic */ LocationFilter(long j2, float f3, int i2, e eVar) {
        this((i2 & 1) != 0 ? AnrConstants.DEFAULT_ANR_THRESHOLD_MS : j2, (i2 & 2) != 0 ? 10.0f : f3);
    }
}
