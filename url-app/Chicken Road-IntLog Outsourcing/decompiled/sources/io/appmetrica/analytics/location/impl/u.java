package io.appmetrica.analytics.location.impl;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import com.onesignal.inAppMessages.internal.prompt.InAppMessagePromptTypes;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractor;

/* loaded from: classes.dex */
public class u implements LastKnownLocationExtractor {

    /* renamed from: a, reason: collision with root package name */
    public final Context f9738a;

    /* renamed from: b, reason: collision with root package name */
    public final PermissionResolutionStrategy f9739b;

    /* renamed from: c, reason: collision with root package name */
    public final LocationListener f9740c;

    /* renamed from: d, reason: collision with root package name */
    public final String f9741d;

    public u(Context context, PermissionResolutionStrategy permissionResolutionStrategy, LocationListener locationListener, String str) {
        this.f9738a = context;
        this.f9739b = permissionResolutionStrategy;
        this.f9740c = locationListener;
        this.f9741d = str;
    }

    public final Context a() {
        return this.f9738a;
    }

    public final LocationListener b() {
        return this.f9740c;
    }

    public final PermissionResolutionStrategy c() {
        return this.f9739b;
    }

    public final String d() {
        return this.f9741d;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractor
    public final void updateLastKnownLocation() {
        if (this.f9739b.hasNecessaryPermissions(this.f9738a)) {
            Location location = (Location) SystemServiceUtils.accessSystemServiceByNameSafely(this.f9738a, InAppMessagePromptTypes.LOCATION_PROMPT_KEY, "getting last known location for provider " + this.f9741d, "location manager", new D3.g(28, this));
            if (location != null) {
                this.f9740c.onLocationChanged(location);
            }
        }
    }

    public static final Location a(u uVar, LocationManager locationManager) {
        return locationManager.getLastKnownLocation(uVar.f9741d);
    }
}
