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
public final class Sb implements Rb, InterfaceC0733om, LocationProvider {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6629a;

    /* renamed from: b, reason: collision with root package name */
    public final Wb f6630b;

    /* renamed from: c, reason: collision with root package name */
    public final LocationClient f6631c;

    /* renamed from: d, reason: collision with root package name */
    public final C0965xl f6632d;

    /* renamed from: e, reason: collision with root package name */
    public final Ck f6633e;
    public final LastKnownLocationExtractorProviderFactory f;

    /* renamed from: g, reason: collision with root package name */
    public final LocationReceiverProviderFactory f6634g;

    public Sb(Context context, Wb wb, LocationClient locationClient) {
        this.f6629a = context;
        this.f6630b = wb;
        this.f6631c = locationClient;
        C0387bc c0387bc = new C0387bc();
        this.f6632d = new C0965xl(new C0768q5(c0387bc, C0876ua.k().p().getAskForPermissionStrategy()));
        this.f6633e = C0876ua.k().p();
        ((Zb) wb).a(c0387bc, true);
        ((Zb) wb).a(locationClient, true);
        this.f = locationClient.getLastKnownExtractorProviderFactory();
        this.f6634g = locationClient.getLocationReceiverProviderFactory();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0733om
    public final void a(C0603jm c0603jm) {
        C0636l3 c0636l3 = c0603jm.f7683x;
        if (c0636l3 != null) {
            long j3 = c0636l3.f7751a;
            this.f6631c.updateCacheArguments(new CacheArguments(j3, 2 * j3));
        }
    }

    public final C0965xl b() {
        return this.f6632d;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final LastKnownLocationExtractorProviderFactory getLastKnownExtractorProviderFactory() {
        return this.f;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final LocationReceiverProviderFactory getLocationReceiverProviderFactory() {
        return this.f6634g;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final PermissionExtractor getPermissionExtractor() {
        return this.f6632d;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationProvider
    public final Location getSystemLocation() {
        return this.f6631c.getSystemLocation();
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationProvider
    public final Location getUserLocation() {
        return this.f6631c.getUserLocation();
    }

    @Override // io.appmetrica.analytics.impl.Rb, io.appmetrica.analytics.impl.Ub
    public final void init() {
        this.f6631c.init(this.f6629a, this.f6632d, C0876ua.f8420H.f8431d.c(), this.f6633e.e());
        ModuleLocationSourcesServiceController f = this.f6633e.f();
        if (f != null) {
            f.init();
        } else {
            LocationClient locationClient = this.f6631c;
            locationClient.registerSystemLocationSource(locationClient.getLastKnownExtractorProviderFactory().getGplLastKnownLocationExtractorProvider());
            LocationClient locationClient2 = this.f6631c;
            locationClient2.registerSystemLocationSource(locationClient2.getLastKnownExtractorProviderFactory().getNetworkLastKnownLocationExtractorProvider());
        }
        ((Zb) this.f6630b).a(this.f6633e.g());
        C0876ua.f8420H.f8446u.a(this);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void registerControllerObserver(LocationControllerObserver locationControllerObserver) {
        ((Zb) this.f6630b).a(locationControllerObserver, true);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void registerSource(LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
        this.f6631c.registerSystemLocationSource(lastKnownLocationExtractorProvider);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void unregisterSource(LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
        this.f6631c.unregisterSystemLocationSource(lastKnownLocationExtractorProvider);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void updateLocationFilter(LocationFilter locationFilter) {
        this.f6631c.updateLocationFilter(locationFilter);
    }

    @Override // io.appmetrica.analytics.impl.Rb, io.appmetrica.analytics.impl.Ub
    public final void b(Object obj) {
        ((Zb) this.f6630b).a(obj);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void registerSource(LocationReceiverProvider locationReceiverProvider) {
        this.f6631c.registerSystemLocationSource(locationReceiverProvider);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void unregisterSource(LocationReceiverProvider locationReceiverProvider) {
        this.f6631c.unregisterSystemLocationSource(locationReceiverProvider);
    }

    @Override // io.appmetrica.analytics.impl.Rb, io.appmetrica.analytics.impl.Ub
    public final void a(Object obj) {
        ((Zb) this.f6630b).b(obj);
    }

    @Override // io.appmetrica.analytics.impl.Rb, io.appmetrica.analytics.impl.Ub
    public final void a(boolean z) {
        ((Zb) this.f6630b).a(z);
    }

    @Override // io.appmetrica.analytics.impl.Rb, io.appmetrica.analytics.impl.Ub
    public final void a(Location location) {
        this.f6631c.updateUserLocation(location);
    }
}
