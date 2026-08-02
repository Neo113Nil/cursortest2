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
public final class Lb implements Kb, InterfaceC0751km, LocationProvider {

    /* renamed from: a, reason: collision with root package name */
    public final Context f10584a;

    /* renamed from: b, reason: collision with root package name */
    public final Pb f10585b;

    /* renamed from: c, reason: collision with root package name */
    public final LocationClient f10586c;

    /* renamed from: d, reason: collision with root package name */
    public final C0983tl f10587d;

    /* renamed from: e, reason: collision with root package name */
    public final C1086xk f10588e;

    /* renamed from: f, reason: collision with root package name */
    public final LastKnownLocationExtractorProviderFactory f10589f;

    /* renamed from: g, reason: collision with root package name */
    public final LocationReceiverProviderFactory f10590g;

    public Lb(Context context, Pb pb, LocationClient locationClient) {
        this.f10584a = context;
        this.f10585b = pb;
        this.f10586c = locationClient;
        Ub ub = new Ub();
        this.f10587d = new C0983tl(new C0708j5(ub, C0817na.k().p().getAskForPermissionStrategy()));
        this.f10588e = C0817na.k().p();
        ((Sb) pb).a(ub, true);
        ((Sb) pb).a(locationClient, true);
        this.f10589f = locationClient.getLastKnownExtractorProviderFactory();
        this.f10590g = locationClient.getLocationReceiverProviderFactory();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0751km
    public final void a(C0622fm c0622fm) {
        C0552d3 c0552d3 = c0622fm.f11880x;
        if (c0552d3 != null) {
            long j4 = c0552d3.f11648a;
            this.f10586c.updateCacheArguments(new CacheArguments(j4, 2 * j4));
        }
    }

    public final C0983tl b() {
        return this.f10587d;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final LastKnownLocationExtractorProviderFactory getLastKnownExtractorProviderFactory() {
        return this.f10589f;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final LocationReceiverProviderFactory getLocationReceiverProviderFactory() {
        return this.f10590g;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final PermissionExtractor getPermissionExtractor() {
        return this.f10587d;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationProvider
    public final Location getSystemLocation() {
        return this.f10586c.getSystemLocation();
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationProvider
    public final Location getUserLocation() {
        return this.f10586c.getUserLocation();
    }

    @Override // io.appmetrica.analytics.impl.Kb, io.appmetrica.analytics.impl.Nb
    public final void init() {
        this.f10586c.init(this.f10584a, this.f10587d, C0817na.f12417I.f12429d.b(), this.f10588e.e());
        ModuleLocationSourcesServiceController f4 = this.f10588e.f();
        if (f4 != null) {
            f4.init();
        } else {
            LocationClient locationClient = this.f10586c;
            locationClient.registerSystemLocationSource(locationClient.getLastKnownExtractorProviderFactory().getGplLastKnownLocationExtractorProvider());
            LocationClient locationClient2 = this.f10586c;
            locationClient2.registerSystemLocationSource(locationClient2.getLastKnownExtractorProviderFactory().getNetworkLastKnownLocationExtractorProvider());
        }
        ((Sb) this.f10585b).a(this.f10588e.g());
        C0817na.f12417I.f12444u.a(this);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void registerControllerObserver(LocationControllerObserver locationControllerObserver) {
        ((Sb) this.f10585b).a(locationControllerObserver, true);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void registerSource(LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
        this.f10586c.registerSystemLocationSource(lastKnownLocationExtractorProvider);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void unregisterSource(LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
        this.f10586c.unregisterSystemLocationSource(lastKnownLocationExtractorProvider);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void updateLocationFilter(LocationFilter locationFilter) {
        this.f10586c.updateLocationFilter(locationFilter);
    }

    @Override // io.appmetrica.analytics.impl.Kb, io.appmetrica.analytics.impl.Nb
    public final void b(Object obj) {
        ((Sb) this.f10585b).a(obj);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void registerSource(LocationReceiverProvider locationReceiverProvider) {
        this.f10586c.registerSystemLocationSource(locationReceiverProvider);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void unregisterSource(LocationReceiverProvider locationReceiverProvider) {
        this.f10586c.unregisterSystemLocationSource(locationReceiverProvider);
    }

    @Override // io.appmetrica.analytics.impl.Kb, io.appmetrica.analytics.impl.Nb
    public final void a(Object obj) {
        ((Sb) this.f10585b).b(obj);
    }

    @Override // io.appmetrica.analytics.impl.Kb, io.appmetrica.analytics.impl.Nb
    public final void a(boolean z) {
        ((Sb) this.f10585b).a(z);
    }

    @Override // io.appmetrica.analytics.impl.Kb, io.appmetrica.analytics.impl.Nb
    public final void a(Location location) {
        this.f10586c.updateUserLocation(location);
    }
}
