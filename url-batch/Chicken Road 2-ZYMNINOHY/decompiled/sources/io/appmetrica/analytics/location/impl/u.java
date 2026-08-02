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
    public final Context f13169a;

    /* renamed from: b, reason: collision with root package name */
    public final PermissionResolutionStrategy f13170b;

    /* renamed from: c, reason: collision with root package name */
    public final LocationListener f13171c;

    /* renamed from: d, reason: collision with root package name */
    public final String f13172d;

    public u(Context context, PermissionResolutionStrategy permissionResolutionStrategy, LocationListener locationListener, String str) {
        this.f13169a = context;
        this.f13170b = permissionResolutionStrategy;
        this.f13171c = locationListener;
        this.f13172d = str;
    }

    public final Context a() {
        return this.f13169a;
    }

    public final LocationListener b() {
        return this.f13171c;
    }

    public final PermissionResolutionStrategy c() {
        return this.f13170b;
    }

    public final String d() {
        return this.f13172d;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractor
    public final void updateLastKnownLocation() {
        if (this.f13170b.hasNecessaryPermissions(this.f13169a)) {
            Location location = (Location) SystemServiceUtils.accessSystemServiceByNameSafely(this.f13169a, "location", "getting last known location for provider " + this.f13172d, "location manager", new D0.a(9, this));
            if (location != null) {
                this.f13171c.onLocationChanged(location);
            }
        }
    }

    public static final Location a(u uVar, LocationManager locationManager) {
        return locationManager.getLastKnownLocation(uVar.f13172d);
    }
}
