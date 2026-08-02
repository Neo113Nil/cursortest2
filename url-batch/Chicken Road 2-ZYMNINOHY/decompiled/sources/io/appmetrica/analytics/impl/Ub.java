package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import java.util.List;

/* loaded from: classes.dex */
public final class Ub implements PermissionStrategy, LocationControllerObserver {

    /* renamed from: b, reason: collision with root package name */
    public static final Tb f11045b = new Tb();

    /* renamed from: c, reason: collision with root package name */
    public static final List f11046c = d3.j.W("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION");

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f11047a;

    @Override // io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy
    public final boolean forbidUsePermission(String str) {
        if (f11046c.contains(str)) {
            return !this.f11047a;
        }
        return false;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationControllerObserver
    public final void startLocationTracking() {
        this.f11047a = true;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationControllerObserver
    public final void stopLocationTracking() {
        this.f11047a = false;
    }

    public final String toString() {
        return "LocationFlagStrategy(enabled=" + this.f11047a + ", locationPermissions=" + f11046c + ')';
    }
}
