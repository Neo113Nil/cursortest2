package io.appmetrica.analytics.location.impl;

import android.content.Context;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Looper;
import b2.AbstractC0279e;
import com.onesignal.inAppMessages.internal.prompt.InAppMessagePromptTypes;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import io.appmetrica.analytics.locationapi.internal.LocationReceiver;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class r extends u implements LocationReceiver {

    /* renamed from: e, reason: collision with root package name */
    public final Looper f9731e;

    /* renamed from: f, reason: collision with root package name */
    public final long f9732f;

    public r(Context context, Looper looper, PermissionResolutionStrategy permissionResolutionStrategy, LocationListener locationListener) {
        super(context, permissionResolutionStrategy, locationListener, "passive");
        this.f9731e = looper;
        this.f9732f = TimeUnit.SECONDS.toMillis(1L);
    }

    public static final f4.v a(r rVar, LocationManager locationManager) {
        locationManager.requestLocationUpdates(rVar.f9741d, rVar.f9732f, 0.0f, rVar.f9740c, rVar.f9731e);
        return f4.v.f5689a;
    }

    public static final f4.v b(r rVar, LocationManager locationManager) {
        locationManager.removeUpdates(rVar.f9740c);
        return f4.v.f5689a;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationReceiver
    public final void startLocationUpdates() {
        if (this.f9739b.hasNecessaryPermissions(this.f9738a)) {
            SystemServiceUtils.accessSystemServiceByNameSafely(this.f9738a, InAppMessagePromptTypes.LOCATION_PROMPT_KEY, AbstractC0279e.h(new StringBuilder("request location updates for "), this.f9741d, " provider"), "location manager", new t2.a(this, 1));
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationReceiver
    public final void stopLocationUpdates() {
        SystemServiceUtils.accessSystemServiceByNameSafely(this.f9738a, InAppMessagePromptTypes.LOCATION_PROMPT_KEY, "stop location updates for passive provider", "location manager", new t2.a(this, 0));
    }
}
