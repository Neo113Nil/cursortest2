package io.appmetrica.analytics.location.impl;

import android.content.Context;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Looper;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import io.appmetrica.analytics.location.impl.r;
import io.appmetrica.analytics.locationapi.internal.LocationReceiver;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class r extends u implements LocationReceiver {

    /* renamed from: e, reason: collision with root package name */
    public final Looper f40464e;

    /* renamed from: f, reason: collision with root package name */
    public final long f40465f;

    public r(@NotNull Context context, @NotNull Looper looper, @NotNull PermissionResolutionStrategy permissionResolutionStrategy, @NotNull LocationListener locationListener) {
        super(context, permissionResolutionStrategy, locationListener, "passive");
        this.f40464e = looper;
        this.f40465f = TimeUnit.SECONDS.toMillis(1L);
    }

    public static final Unit a(r rVar, LocationManager locationManager) {
        locationManager.requestLocationUpdates(rVar.f40474d, rVar.f40465f, 0.0f, rVar.f40473c, rVar.f40464e);
        return Unit.f41027a;
    }

    public static final Unit b(r rVar, LocationManager locationManager) {
        locationManager.removeUpdates(rVar.f40473c);
        return Unit.f41027a;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationReceiver
    public final void startLocationUpdates() {
        if (this.f40472b.hasNecessaryPermissions(this.f40471a)) {
            SystemServiceUtils.accessSystemServiceByNameSafely(this.f40471a, FirebaseAnalytics.Param.LOCATION, "request location updates for " + this.f40474d + " provider", "location manager", new FunctionWithThrowable() { // from class: S1.b
                @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
                public final Object apply(Object obj) {
                    return r.a(r.this, (LocationManager) obj);
                }
            });
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationReceiver
    public final void stopLocationUpdates() {
        SystemServiceUtils.accessSystemServiceByNameSafely(this.f40471a, FirebaseAnalytics.Param.LOCATION, "stop location updates for passive provider", "location manager", new FunctionWithThrowable() { // from class: S1.a
            @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
            public final Object apply(Object obj) {
                return r.b(r.this, (LocationManager) obj);
            }
        });
    }
}
