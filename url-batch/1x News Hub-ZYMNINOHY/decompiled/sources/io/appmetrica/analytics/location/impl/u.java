package io.appmetrica.analytics.location.impl;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractor;

/* loaded from: classes.dex */
public class u implements LastKnownLocationExtractor {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8773a;

    /* renamed from: b, reason: collision with root package name */
    public final PermissionResolutionStrategy f8774b;

    /* renamed from: c, reason: collision with root package name */
    public final LocationListener f8775c;

    /* renamed from: d, reason: collision with root package name */
    public final String f8776d;

    public u(Context context, PermissionResolutionStrategy permissionResolutionStrategy, LocationListener locationListener, String str) {
        this.f8773a = context;
        this.f8774b = permissionResolutionStrategy;
        this.f8775c = locationListener;
        this.f8776d = str;
    }

    public final Context a() {
        return this.f8773a;
    }

    public final LocationListener b() {
        return this.f8775c;
    }

    public final PermissionResolutionStrategy c() {
        return this.f8774b;
    }

    public final String d() {
        return this.f8776d;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractor
    public final void updateLastKnownLocation() {
        if (this.f8774b.hasNecessaryPermissions(this.f8773a)) {
            Location location = (Location) SystemServiceUtils.accessSystemServiceByNameSafely(this.f8773a, "location", "getting last known location for provider " + this.f8776d, "location manager", new B0.g(4, this));
            if (location != null) {
                this.f8775c.onLocationChanged(location);
            }
        }
    }

    public static final Location a(u uVar, LocationManager locationManager) {
        return locationManager.getLastKnownLocation(uVar.f8776d);
    }
}
