package io.appmetrica.analytics.location.impl;

import android.content.Context;
import android.location.LocationListener;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.gpllibrary.internal.GplLibraryWrapper;
import io.appmetrica.analytics.gpllibrary.internal.IGplLibraryWrapper;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class b implements LastKnownLocationExtractor {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8728a;

    /* renamed from: b, reason: collision with root package name */
    public final PermissionResolutionStrategy f8729b;

    /* renamed from: c, reason: collision with root package name */
    public final LocationListener f8730c;

    /* renamed from: d, reason: collision with root package name */
    public final IHandlerExecutor f8731d;

    /* renamed from: e, reason: collision with root package name */
    public final d f8732e = new d();

    public b(Context context, PermissionResolutionStrategy permissionResolutionStrategy, LocationListener locationListener, IHandlerExecutor iHandlerExecutor) {
        this.f8728a = context;
        this.f8729b = permissionResolutionStrategy;
        this.f8730c = locationListener;
        this.f8731d = iHandlerExecutor;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractor
    public final void updateLastKnownLocation() {
        IGplLibraryWrapper gplLibraryWrapper;
        if (this.f8729b.hasNecessaryPermissions(this.f8728a)) {
            try {
                d dVar = this.f8732e;
                Context context = this.f8728a;
                LocationListener locationListener = this.f8730c;
                IHandlerExecutor iHandlerExecutor = this.f8731d;
                dVar.getClass();
                if (ReflectionUtils.detectClassExists("com.google.android.gms.location.LocationRequest")) {
                    try {
                        gplLibraryWrapper = new GplLibraryWrapper(context, locationListener, iHandlerExecutor.getLooper(), iHandlerExecutor, TimeUnit.SECONDS.toMillis(1L));
                    } catch (Throwable unused) {
                    }
                    gplLibraryWrapper.updateLastKnownLocation();
                }
                gplLibraryWrapper = new a();
                gplLibraryWrapper.updateLastKnownLocation();
            } catch (Throwable unused2) {
            }
        }
    }
}
