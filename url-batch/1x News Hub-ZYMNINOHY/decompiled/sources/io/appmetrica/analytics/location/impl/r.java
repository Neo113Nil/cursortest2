package io.appmetrica.analytics.location.impl;

import E1.AbstractC0033i;
import android.content.Context;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Looper;
import b2.C0195i;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import io.appmetrica.analytics.locationapi.internal.LocationReceiver;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class r extends u implements LocationReceiver {

    /* renamed from: e, reason: collision with root package name */
    public final Looper f8767e;
    public final long f;

    public r(Context context, Looper looper, PermissionResolutionStrategy permissionResolutionStrategy, LocationListener locationListener) {
        super(context, permissionResolutionStrategy, locationListener, "passive");
        this.f8767e = looper;
        this.f = TimeUnit.SECONDS.toMillis(1L);
    }

    public static final C0195i a(r rVar, LocationManager locationManager) {
        locationManager.requestLocationUpdates(rVar.f8776d, rVar.f, 0.0f, rVar.f8775c, rVar.f8767e);
        return C0195i.f2555a;
    }

    public static final C0195i b(r rVar, LocationManager locationManager) {
        locationManager.removeUpdates(rVar.f8775c);
        return C0195i.f2555a;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationReceiver
    public final void startLocationUpdates() {
        if (this.f8774b.hasNecessaryPermissions(this.f8773a)) {
            SystemServiceUtils.accessSystemServiceByNameSafely(this.f8773a, "location", AbstractC0033i.m(new StringBuilder("request location updates for "), this.f8776d, " provider"), "location manager", new B1.a(this, 1));
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationReceiver
    public final void stopLocationUpdates() {
        SystemServiceUtils.accessSystemServiceByNameSafely(this.f8773a, "location", "stop location updates for passive provider", "location manager", new B1.a(this, 0));
    }
}
