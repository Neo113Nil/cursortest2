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
    public final Context f13121a;

    /* renamed from: b, reason: collision with root package name */
    public final PermissionResolutionStrategy f13122b;

    /* renamed from: c, reason: collision with root package name */
    public final LocationListener f13123c;

    /* renamed from: d, reason: collision with root package name */
    public final IHandlerExecutor f13124d;

    /* renamed from: e, reason: collision with root package name */
    public final d f13125e = new d();

    public b(Context context, PermissionResolutionStrategy permissionResolutionStrategy, LocationListener locationListener, IHandlerExecutor iHandlerExecutor) {
        this.f13121a = context;
        this.f13122b = permissionResolutionStrategy;
        this.f13123c = locationListener;
        this.f13124d = iHandlerExecutor;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractor
    public final void updateLastKnownLocation() {
        IGplLibraryWrapper gplLibraryWrapper;
        if (this.f13122b.hasNecessaryPermissions(this.f13121a)) {
            try {
                d dVar = this.f13125e;
                Context context = this.f13121a;
                LocationListener locationListener = this.f13123c;
                IHandlerExecutor iHandlerExecutor = this.f13124d;
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
