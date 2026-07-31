package io.appmetrica.analytics.locationapi.internal;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes3.dex */
public final class CacheArguments {

    /* renamed from: a, reason: collision with root package name */
    private final long f40482a;

    /* renamed from: b, reason: collision with root package name */
    private final long f40483b;

    public CacheArguments() {
        this(0L, 0L, 3, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(CacheArguments.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.locationapi.internal.CacheArguments");
        }
        CacheArguments cacheArguments = (CacheArguments) obj;
        return this.f40482a == cacheArguments.f40482a && this.f40483b == cacheArguments.f40483b;
    }

    public final long getOutdatedTimeInterval() {
        return this.f40483b;
    }

    public final long getRefreshPeriod() {
        return this.f40482a;
    }

    public int hashCode() {
        return Long.hashCode(this.f40483b) + (Long.hashCode(this.f40482a) * 31);
    }

    @NotNull
    public String toString() {
        return "CacheArguments(refreshPeriod=" + this.f40482a + ", outdatedTimeInterval=" + this.f40483b + ')';
    }

    public CacheArguments(long j4, long j5) {
        this.f40482a = j4;
        this.f40483b = j5;
    }

    public /* synthetic */ CacheArguments(long j4, long j5, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? TimeUnit.SECONDS.toMillis(10L) : j4, (i4 & 2) != 0 ? TimeUnit.MINUTES.toMillis(2L) : j5);
    }
}
