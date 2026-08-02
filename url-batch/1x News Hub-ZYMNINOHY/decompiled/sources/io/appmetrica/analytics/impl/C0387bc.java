package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.bc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0387bc implements PermissionStrategy, LocationControllerObserver {

    /* renamed from: b, reason: collision with root package name */
    public static final C0361ac f7073b = new C0361ac();

    /* renamed from: c, reason: collision with root package name */
    public static final List f7074c = c2.f.L("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION");

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f7075a;

    @Override // io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy
    public final boolean forbidUsePermission(String str) {
        if (f7074c.contains(str)) {
            return !this.f7075a;
        }
        return false;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationControllerObserver
    public final void startLocationTracking() {
        this.f7075a = true;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationControllerObserver
    public final void stopLocationTracking() {
        this.f7075a = false;
    }

    public final String toString() {
        return "LocationFlagStrategy(enabled=" + this.f7075a + ", locationPermissions=" + f7074c + ')';
    }
}
