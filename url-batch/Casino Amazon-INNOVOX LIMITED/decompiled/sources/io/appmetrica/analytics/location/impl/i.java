package io.appmetrica.analytics.location.impl;

import io.appmetrica.analytics.locationapi.internal.CacheArguments;
import io.appmetrica.analytics.locationapi.internal.LocationFilter;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final LocationFilter f1615a;
    public final CacheArguments b;

    public i(LocationFilter locationFilter, CacheArguments cacheArguments) {
        this.f1615a = locationFilter;
        this.b = cacheArguments;
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
        return Intrinsics.areEqual(this.f1615a, iVar.f1615a) && Intrinsics.areEqual(this.b, iVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f1615a.hashCode() * 31);
    }

    public final String toString() {
        return "LocationConfig(locationFilter=" + this.f1615a + ", cacheArguments=" + this.b + ')';
    }

    public /* synthetic */ i() {
        this(new LocationFilter(0L, 0.0f, 3, null), new CacheArguments(0L, 0L, 3, null));
    }
}
