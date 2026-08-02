package io.appmetrica.analytics.location.impl;

import E.AbstractC0005f;
import android.content.Context;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Looper;
import c3.C0297i;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import io.appmetrica.analytics.locationapi.internal.LocationReceiver;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class r extends u implements LocationReceiver {

    /* renamed from: e, reason: collision with root package name */
    public final Looper f13162e;

    /* renamed from: f, reason: collision with root package name */
    public final long f13163f;

    public r(Context context, Looper looper, PermissionResolutionStrategy permissionResolutionStrategy, LocationListener locationListener) {
        super(context, permissionResolutionStrategy, locationListener, "passive");
        this.f13162e = looper;
        this.f13163f = TimeUnit.SECONDS.toMillis(1L);
    }

    public static final C0297i a(r rVar, LocationManager locationManager) {
        locationManager.requestLocationUpdates(rVar.f13172d, rVar.f13163f, 0.0f, rVar.f13171c, rVar.f13162e);
        return C0297i.f5732a;
    }

    public static final C0297i b(r rVar, LocationManager locationManager) {
        locationManager.removeUpdates(rVar.f13171c);
        return C0297i.f5732a;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationReceiver
    public final void startLocationUpdates() {
        if (this.f13170b.hasNecessaryPermissions(this.f13169a)) {
            SystemServiceUtils.accessSystemServiceByNameSafely(this.f13169a, "location", AbstractC0005f.q(new StringBuilder("request location updates for "), this.f13172d, " provider"), "location manager", new W2.a(this, 1));
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationReceiver
    public final void stopLocationUpdates() {
        SystemServiceUtils.accessSystemServiceByNameSafely(this.f13169a, "location", "stop location updates for passive provider", "location manager", new W2.a(this, 0));
    }
}
