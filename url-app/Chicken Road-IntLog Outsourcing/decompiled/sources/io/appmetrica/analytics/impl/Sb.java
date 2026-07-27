package io.appmetrica.analytics.impl;

import android.content.Context;
import android.location.Location;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.locationapi.internal.CacheArguments;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory;
import io.appmetrica.analytics.locationapi.internal.LocationClient;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import io.appmetrica.analytics.locationapi.internal.LocationFilter;
import io.appmetrica.analytics.locationapi.internal.LocationProvider;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProvider;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProviderFactory;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleLocationSourcesServiceController;

/* loaded from: classes.dex */
public final class Sb implements Rb, InterfaceC0884om, LocationProvider {

    /* renamed from: a, reason: collision with root package name */
    public final Context f7454a;

    /* renamed from: b, reason: collision with root package name */
    public final Wb f7455b;

    /* renamed from: c, reason: collision with root package name */
    public final LocationClient f7456c;

    /* renamed from: d, reason: collision with root package name */
    public final C1116xl f7457d;

    /* renamed from: e, reason: collision with root package name */
    public final Ck f7458e;

    /* renamed from: f, reason: collision with root package name */
    public final LastKnownLocationExtractorProviderFactory f7459f;

    /* renamed from: g, reason: collision with root package name */
    public final LocationReceiverProviderFactory f7460g;

    public Sb(Context context, Wb wb, LocationClient locationClient) {
        this.f7454a = context;
        this.f7455b = wb;
        this.f7456c = locationClient;
        C0538bc c0538bc = new C0538bc();
        this.f7457d = new C1116xl(new C0919q5(c0538bc, C1027ua.k().p().getAskForPermissionStrategy()));
        this.f7458e = C1027ua.k().p();
        ((Zb) wb).a(c0538bc, true);
        ((Zb) wb).a(locationClient, true);
        this.f7459f = locationClient.getLastKnownExtractorProviderFactory();
        this.f7460g = locationClient.getLocationReceiverProviderFactory();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0884om
    public final void a(C0754jm c0754jm) {
        C0787l3 c0787l3 = c0754jm.f8582x;
        if (c0787l3 != null) {
            long j2 = c0787l3.f8653a;
            this.f7456c.updateCacheArguments(new CacheArguments(j2, 2 * j2));
        }
    }

    public final C1116xl b() {
        return this.f7457d;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final LastKnownLocationExtractorProviderFactory getLastKnownExtractorProviderFactory() {
        return this.f7459f;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final LocationReceiverProviderFactory getLocationReceiverProviderFactory() {
        return this.f7460g;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final PermissionExtractor getPermissionExtractor() {
        return this.f7457d;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationProvider
    public final Location getSystemLocation() {
        return this.f7456c.getSystemLocation();
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationProvider
    public final Location getUserLocation() {
        return this.f7456c.getUserLocation();
    }

    @Override // io.appmetrica.analytics.impl.Rb, io.appmetrica.analytics.impl.Ub
    public final void init() {
        this.f7456c.init(this.f7454a, this.f7457d, C1027ua.f9366H.f9377d.c(), this.f7458e.e());
        ModuleLocationSourcesServiceController f3 = this.f7458e.f();
        if (f3 != null) {
            f3.init();
        } else {
            LocationClient locationClient = this.f7456c;
            locationClient.registerSystemLocationSource(locationClient.getLastKnownExtractorProviderFactory().getGplLastKnownLocationExtractorProvider());
            LocationClient locationClient2 = this.f7456c;
            locationClient2.registerSystemLocationSource(locationClient2.getLastKnownExtractorProviderFactory().getNetworkLastKnownLocationExtractorProvider());
        }
        ((Zb) this.f7455b).a(this.f7458e.g());
        C1027ua.f9366H.f9394u.a(this);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void registerControllerObserver(LocationControllerObserver locationControllerObserver) {
        ((Zb) this.f7455b).a(locationControllerObserver, true);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void registerSource(LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
        this.f7456c.registerSystemLocationSource(lastKnownLocationExtractorProvider);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void unregisterSource(LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
        this.f7456c.unregisterSystemLocationSource(lastKnownLocationExtractorProvider);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void updateLocationFilter(LocationFilter locationFilter) {
        this.f7456c.updateLocationFilter(locationFilter);
    }

    @Override // io.appmetrica.analytics.impl.Rb, io.appmetrica.analytics.impl.Ub
    public final void b(Object obj) {
        ((Zb) this.f7455b).a(obj);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void registerSource(LocationReceiverProvider locationReceiverProvider) {
        this.f7456c.registerSystemLocationSource(locationReceiverProvider);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void unregisterSource(LocationReceiverProvider locationReceiverProvider) {
        this.f7456c.unregisterSystemLocationSource(locationReceiverProvider);
    }

    @Override // io.appmetrica.analytics.impl.Rb, io.appmetrica.analytics.impl.Ub
    public final void a(Object obj) {
        ((Zb) this.f7455b).b(obj);
    }

    @Override // io.appmetrica.analytics.impl.Rb, io.appmetrica.analytics.impl.Ub
    public final void a(boolean z) {
        ((Zb) this.f7455b).a(z);
    }

    @Override // io.appmetrica.analytics.impl.Rb, io.appmetrica.analytics.impl.Ub
    public final void a(Location location) {
        this.f7456c.updateUserLocation(location);
    }
}
