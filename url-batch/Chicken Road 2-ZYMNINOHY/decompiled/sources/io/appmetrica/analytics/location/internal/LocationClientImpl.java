package io.appmetrica.analytics.location.internal;

import android.content.Context;
import android.location.Location;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.location.impl.g;
import io.appmetrica.analytics.location.impl.i;
import io.appmetrica.analytics.location.impl.j;
import io.appmetrica.analytics.location.impl.k;
import io.appmetrica.analytics.location.impl.o;
import io.appmetrica.analytics.location.impl.p;
import io.appmetrica.analytics.location.impl.q;
import io.appmetrica.analytics.locationapi.internal.CacheArguments;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory;
import io.appmetrica.analytics.locationapi.internal.LocationClient;
import io.appmetrica.analytics.locationapi.internal.LocationFilter;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProvider;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProviderFactory;
import java.util.List;

/* loaded from: classes.dex */
public final class LocationClientImpl implements LocationClient {

    /* renamed from: a, reason: collision with root package name */
    private k f13176a;

    /* renamed from: b, reason: collision with root package name */
    private final g f13177b;

    /* renamed from: c, reason: collision with root package name */
    private final o f13178c;

    /* renamed from: d, reason: collision with root package name */
    private i f13179d;

    public LocationClientImpl() {
        q qVar = new q();
        this.f13177b = new g(qVar);
        this.f13178c = new o(qVar);
        this.f13179d = new i();
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationClient
    public LastKnownLocationExtractorProviderFactory getLastKnownExtractorProviderFactory() {
        return this.f13177b;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationClient
    public LocationReceiverProviderFactory getLocationReceiverProviderFactory() {
        return this.f13178c;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationProvider
    public synchronized Location getSystemLocation() {
        k kVar;
        kVar = this.f13176a;
        return kVar != null ? kVar.a() : null;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationProvider
    public synchronized Location getUserLocation() {
        k kVar;
        kVar = this.f13176a;
        return kVar != null ? kVar.b() : null;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationClient
    public synchronized void init(Context context, PermissionExtractor permissionExtractor, IHandlerExecutor iHandlerExecutor, List<? extends Consumer<Location>> list) {
        if (this.f13176a == null) {
            this.f13176a = new k(context, permissionExtractor, iHandlerExecutor, new p(list, this.f13179d));
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationClient
    public synchronized void registerSystemLocationSource(LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
        k kVar = this.f13176a;
        if (kVar != null) {
            kVar.a(lastKnownLocationExtractorProvider);
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationControllerObserver
    public synchronized void startLocationTracking() {
        k kVar = this.f13176a;
        if (kVar != null) {
            kVar.startLocationTracking();
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationControllerObserver
    public synchronized void stopLocationTracking() {
        k kVar = this.f13176a;
        if (kVar != null) {
            kVar.stopLocationTracking();
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationClient
    public synchronized void unregisterSystemLocationSource(LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
        k kVar = this.f13176a;
        if (kVar != null) {
            kVar.b(lastKnownLocationExtractorProvider);
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationClient
    public synchronized void updateCacheArguments(CacheArguments cacheArguments) {
        i iVar = new i(this.f13179d.f13132a, cacheArguments);
        this.f13179d = iVar;
        k kVar = this.f13176a;
        if (kVar != null) {
            kVar.f13139d.execute(new j(kVar, iVar));
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationClient
    public synchronized void updateLocationFilter(LocationFilter locationFilter) {
        i iVar = new i(locationFilter, this.f13179d.f13133b);
        this.f13179d = iVar;
        k kVar = this.f13176a;
        if (kVar != null) {
            kVar.f13139d.execute(new j(kVar, iVar));
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationClient
    public synchronized void updateUserLocation(Location location) {
        k kVar = this.f13176a;
        if (kVar != null) {
            kVar.a(location);
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationClient
    public synchronized void registerSystemLocationSource(LocationReceiverProvider locationReceiverProvider) {
        k kVar = this.f13176a;
        if (kVar != null) {
            kVar.a(locationReceiverProvider);
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationClient
    public synchronized void unregisterSystemLocationSource(LocationReceiverProvider locationReceiverProvider) {
        k kVar = this.f13176a;
        if (kVar != null) {
            kVar.b(locationReceiverProvider);
        }
    }
}
