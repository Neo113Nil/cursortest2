package io.appmetrica.analytics.location.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import io.appmetrica.analytics.location.impl.u;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractor;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public class u implements LastKnownLocationExtractor {

    /* renamed from: a, reason: collision with root package name */
    public final Context f40471a;

    /* renamed from: b, reason: collision with root package name */
    public final PermissionResolutionStrategy f40472b;

    /* renamed from: c, reason: collision with root package name */
    public final LocationListener f40473c;

    /* renamed from: d, reason: collision with root package name */
    public final String f40474d;

    public u(@NotNull Context context, @NotNull PermissionResolutionStrategy permissionResolutionStrategy, @NotNull LocationListener locationListener, @NotNull String str) {
        this.f40471a = context;
        this.f40472b = permissionResolutionStrategy;
        this.f40473c = locationListener;
        this.f40474d = str;
    }

    @NotNull
    public final Context a() {
        return this.f40471a;
    }

    @NotNull
    public final LocationListener b() {
        return this.f40473c;
    }

    @NotNull
    public final PermissionResolutionStrategy c() {
        return this.f40472b;
    }

    @NotNull
    public final String d() {
        return this.f40474d;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractor
    @SuppressLint({"MissingPermission"})
    public final void updateLastKnownLocation() {
        if (this.f40472b.hasNecessaryPermissions(this.f40471a)) {
            Location location = (Location) SystemServiceUtils.accessSystemServiceByNameSafely(this.f40471a, FirebaseAnalytics.Param.LOCATION, "getting last known location for provider " + this.f40474d, "location manager", new FunctionWithThrowable() { // from class: S1.c
                @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
                public final Object apply(Object obj) {
                    return u.a(u.this, (LocationManager) obj);
                }
            });
            if (location != null) {
                this.f40473c.onLocationChanged(location);
            }
        }
    }

    public static final Location a(u uVar, LocationManager locationManager) {
        return locationManager.getLastKnownLocation(uVar.f40474d);
    }
}
