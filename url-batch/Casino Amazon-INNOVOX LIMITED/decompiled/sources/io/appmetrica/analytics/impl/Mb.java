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

/* loaded from: classes3.dex */
public final class Mb implements Lb, InterfaceC0338lm, LocationProvider {

    /* renamed from: a, reason: collision with root package name */
    public final Context f953a;
    public final Qb b;
    public final LocationClient c;
    public final C0561ul d;
    public final C0660yk e;
    public final LastKnownLocationExtractorProviderFactory f;
    public final LocationReceiverProviderFactory g;

    public Mb(Context context, Qb qb, LocationClient locationClient) {
        this.f953a = context;
        this.b = qb;
        this.c = locationClient;
        Vb vb = new Vb();
        this.d = new C0561ul(new C0295k5(vb, C0401oa.k().p().getAskForPermissionStrategy()));
        this.e = C0401oa.k().p();
        ((Tb) qb).a(vb, true);
        ((Tb) qb).a(locationClient, true);
        this.f = locationClient.getLastKnownExtractorProviderFactory();
        this.g = locationClient.getLocationReceiverProviderFactory();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0338lm
    public final void a(C0209gm c0209gm) {
        C0138e3 c0138e3 = c0209gm.x;
        if (c0138e3 != null) {
            long j = c0138e3.f1229a;
            this.c.updateCacheArguments(new CacheArguments(j, 2 * j));
        }
    }

    public final C0561ul b() {
        return this.d;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final LastKnownLocationExtractorProviderFactory getLastKnownExtractorProviderFactory() {
        return this.f;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final LocationReceiverProviderFactory getLocationReceiverProviderFactory() {
        return this.g;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final PermissionExtractor getPermissionExtractor() {
        return this.d;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationProvider
    public final Location getSystemLocation() {
        return this.c.getSystemLocation();
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationProvider
    public final Location getUserLocation() {
        return this.c.getUserLocation();
    }

    @Override // io.appmetrica.analytics.impl.Lb, io.appmetrica.analytics.impl.Ob
    public final void init() {
        this.c.init(this.f953a, this.d, C0401oa.I.d.b(), this.e.e());
        ModuleLocationSourcesServiceController f = this.e.f();
        if (f != null) {
            f.init();
        } else {
            LocationClient locationClient = this.c;
            locationClient.registerSystemLocationSource(locationClient.getLastKnownExtractorProviderFactory().getGplLastKnownLocationExtractorProvider());
            LocationClient locationClient2 = this.c;
            locationClient2.registerSystemLocationSource(locationClient2.getLastKnownExtractorProviderFactory().getNetworkLastKnownLocationExtractorProvider());
        }
        ((Tb) this.b).a(this.e.g());
        C0401oa.I.u.a(this);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void registerControllerObserver(LocationControllerObserver locationControllerObserver) {
        ((Tb) this.b).a(locationControllerObserver, true);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void registerSource(LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
        this.c.registerSystemLocationSource(lastKnownLocationExtractorProvider);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void unregisterSource(LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
        this.c.unregisterSystemLocationSource(lastKnownLocationExtractorProvider);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void updateLocationFilter(LocationFilter locationFilter) {
        this.c.updateLocationFilter(locationFilter);
    }

    @Override // io.appmetrica.analytics.impl.Lb, io.appmetrica.analytics.impl.Ob
    public final void b(Object obj) {
        ((Tb) this.b).a(obj);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void registerSource(LocationReceiverProvider locationReceiverProvider) {
        this.c.registerSystemLocationSource(locationReceiverProvider);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void unregisterSource(LocationReceiverProvider locationReceiverProvider) {
        this.c.unregisterSystemLocationSource(locationReceiverProvider);
    }

    @Override // io.appmetrica.analytics.impl.Lb, io.appmetrica.analytics.impl.Ob
    public final void a(Object obj) {
        ((Tb) this.b).b(obj);
    }

    @Override // io.appmetrica.analytics.impl.Lb, io.appmetrica.analytics.impl.Ob
    public final void a(boolean z) {
        ((Tb) this.b).a(z);
    }

    @Override // io.appmetrica.analytics.impl.Lb, io.appmetrica.analytics.impl.Ob
    public final void a(Location location) {
        this.c.updateUserLocation(location);
    }
}
