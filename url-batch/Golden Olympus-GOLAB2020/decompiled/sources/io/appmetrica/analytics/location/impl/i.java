package io.appmetrica.analytics.location.impl;

import io.appmetrica.analytics.locationapi.internal.CacheArguments;
import io.appmetrica.analytics.locationapi.internal.LocationFilter;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final LocationFilter f40434a;

    /* renamed from: b, reason: collision with root package name */
    public final CacheArguments f40435b;

    public i(LocationFilter locationFilter, CacheArguments cacheArguments) {
        this.f40434a = locationFilter;
        this.f40435b = cacheArguments;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(i.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.location.impl.LocationConfig");
        }
        i iVar = (i) obj;
        return Intrinsics.areEqual(this.f40434a, iVar.f40434a) && Intrinsics.areEqual(this.f40435b, iVar.f40435b);
    }

    public final int hashCode() {
        return this.f40435b.hashCode() + (this.f40434a.hashCode() * 31);
    }

    public final String toString() {
        return "LocationConfig(locationFilter=" + this.f40434a + ", cacheArguments=" + this.f40435b + ')';
    }

    public /* synthetic */ i() {
        this(new LocationFilter(0L, 0.0f, 3, null), new CacheArguments(0L, 0L, 3, null));
    }
}
