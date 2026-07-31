package io.appmetrica.analytics.locationapi.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes3.dex */
public final class LocationFilter {

    /* renamed from: a, reason: collision with root package name */
    private final long f40484a;

    /* renamed from: b, reason: collision with root package name */
    private final float f40485b;

    public LocationFilter() {
        this(0L, 0.0f, 3, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(LocationFilter.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.locationapi.internal.LocationFilter");
        }
        LocationFilter locationFilter = (LocationFilter) obj;
        return this.f40484a == locationFilter.f40484a && this.f40485b == locationFilter.f40485b;
    }

    public final float getUpdateDistanceInterval() {
        return this.f40485b;
    }

    public final long getUpdateTimeInterval() {
        return this.f40484a;
    }

    public int hashCode() {
        return Float.hashCode(this.f40485b) + (Long.hashCode(this.f40484a) * 31);
    }

    @NotNull
    public String toString() {
        return "LocationFilter(updateTimeInterval=" + this.f40484a + ", updateDistanceInterval=" + this.f40485b + ')';
    }

    public LocationFilter(long j4, float f4) {
        this.f40484a = j4;
        this.f40485b = f4;
    }

    public /* synthetic */ LocationFilter(long j4, float f4, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 5000L : j4, (i4 & 2) != 0 ? 10.0f : f4);
    }
}
