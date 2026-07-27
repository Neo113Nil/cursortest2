package io.appmetrica.analytics.impl;

import com.onesignal.location.internal.common.LocationConstants;
import g4.AbstractC0466k;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.bc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0538bc implements PermissionStrategy, LocationControllerObserver {

    /* renamed from: b, reason: collision with root package name */
    public static final C0512ac f7924b = new C0512ac();

    /* renamed from: c, reason: collision with root package name */
    public static final List f7925c = AbstractC0466k.A0(LocationConstants.ANDROID_FINE_LOCATION_PERMISSION_STRING, LocationConstants.ANDROID_COARSE_LOCATION_PERMISSION_STRING);

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f7926a;

    @Override // io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy
    public final boolean forbidUsePermission(String str) {
        if (f7925c.contains(str)) {
            return !this.f7926a;
        }
        return false;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationControllerObserver
    public final void startLocationTracking() {
        this.f7926a = true;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationControllerObserver
    public final void stopLocationTracking() {
        this.f7926a = false;
    }

    public final String toString() {
        return "LocationFlagStrategy(enabled=" + this.f7926a + ", locationPermissions=" + f7925c + ')';
    }
}
