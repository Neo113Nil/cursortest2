package io.appmetrica.analytics.impl;

import com.onesignal.location.internal.common.LocationConstants;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes3.dex */
public final class Vb implements PermissionStrategy, LocationControllerObserver {
    public static final Ub b = new Ub();
    public static final List c = CollectionsKt.listOf((Object[]) new String[]{LocationConstants.ANDROID_FINE_LOCATION_PERMISSION_STRING, LocationConstants.ANDROID_COARSE_LOCATION_PERMISSION_STRING});

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f1087a;

    @Override // io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy
    public final boolean forbidUsePermission(String str) {
        if (c.contains(str)) {
            return !this.f1087a;
        }
        return false;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationControllerObserver
    public final void startLocationTracking() {
        this.f1087a = true;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationControllerObserver
    public final void stopLocationTracking() {
        this.f1087a = false;
    }

    public final String toString() {
        return "LocationFlagStrategy(enabled=" + this.f1087a + ", locationPermissions=" + c + ')';
    }
}
