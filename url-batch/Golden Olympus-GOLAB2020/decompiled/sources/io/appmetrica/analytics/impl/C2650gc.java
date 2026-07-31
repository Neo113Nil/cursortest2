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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.gc, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2650gc implements InterfaceC2623fc, InterfaceC2763km, LocationProvider {

    /* renamed from: a, reason: collision with root package name */
    public final Context f39076a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC2753kc f39077b;

    /* renamed from: c, reason: collision with root package name */
    public final LocationClient f39078c;

    /* renamed from: d, reason: collision with root package name */
    public final C2995tl f39079d;

    /* renamed from: e, reason: collision with root package name */
    public final C3124yk f39080e;

    /* renamed from: f, reason: collision with root package name */
    public final LastKnownLocationExtractorProviderFactory f39081f;

    /* renamed from: g, reason: collision with root package name */
    public final LocationReceiverProviderFactory f39082g;

    public C2650gc(@NotNull Context context, @NotNull InterfaceC2753kc interfaceC2753kc, @NotNull LocationClient locationClient) {
        this.f39076a = context;
        this.f39077b = interfaceC2753kc;
        this.f39078c = locationClient;
        C2883pc c2883pc = new C2883pc();
        this.f39079d = new C2995tl(new E5(c2883pc, Ia.j().o().getAskForPermissionStrategy()));
        this.f39080e = Ia.j().o();
        ((C2831nc) interfaceC2753kc).a(c2883pc, true);
        ((C2831nc) interfaceC2753kc).a(locationClient, true);
        this.f39081f = locationClient.getLastKnownExtractorProviderFactory();
        this.f39082g = locationClient.getLocationReceiverProviderFactory();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2763km
    public final void a(@NotNull C2633fm c2633fm) {
        C3133z3 c3133z3 = c2633fm.f39003y;
        if (c3133z3 != null) {
            long j4 = c3133z3.f40301a;
            this.f39078c.updateCacheArguments(new CacheArguments(j4, 2 * j4));
        }
    }

    @NotNull
    public final C2995tl b() {
        return this.f39079d;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    @NotNull
    public final LastKnownLocationExtractorProviderFactory getLastKnownExtractorProviderFactory() {
        return this.f39081f;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    @NotNull
    public final LocationReceiverProviderFactory getLocationReceiverProviderFactory() {
        return this.f39082g;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final PermissionExtractor getPermissionExtractor() {
        return this.f39079d;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationProvider
    @Nullable
    public final Location getSystemLocation() {
        return this.f39078c.getSystemLocation();
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationProvider
    @Nullable
    public final Location getUserLocation() {
        return this.f39078c.getUserLocation();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2623fc, io.appmetrica.analytics.impl.InterfaceC2702ic
    public final void init() {
        this.f39078c.init(this.f39076a, this.f39079d, Ia.f37730F.f37739d.c(), this.f39080e.e());
        ModuleLocationSourcesServiceController f4 = this.f39080e.f();
        if (f4 != null) {
            f4.init();
        } else {
            LocationClient locationClient = this.f39078c;
            locationClient.registerSystemLocationSource(locationClient.getLastKnownExtractorProviderFactory().getGplLastKnownLocationExtractorProvider());
            LocationClient locationClient2 = this.f39078c;
            locationClient2.registerSystemLocationSource(locationClient2.getLastKnownExtractorProviderFactory().getNetworkLastKnownLocationExtractorProvider());
        }
        ((C2831nc) this.f39077b).a(this.f39080e.g());
        Ia.f37730F.f37756u.a(this);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void registerControllerObserver(@NotNull LocationControllerObserver locationControllerObserver) {
        ((C2831nc) this.f39077b).a(locationControllerObserver, true);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void registerSource(@NotNull LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
        this.f39078c.registerSystemLocationSource(lastKnownLocationExtractorProvider);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void unregisterSource(@NotNull LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
        this.f39078c.unregisterSystemLocationSource(lastKnownLocationExtractorProvider);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void updateLocationFilter(@NotNull LocationFilter locationFilter) {
        this.f39078c.updateLocationFilter(locationFilter);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2623fc, io.appmetrica.analytics.impl.InterfaceC2702ic
    public final void b(@NotNull Object obj) {
        ((C2831nc) this.f39077b).a(obj);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void registerSource(@NotNull LocationReceiverProvider locationReceiverProvider) {
        this.f39078c.registerSystemLocationSource(locationReceiverProvider);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi
    public final void unregisterSource(@NotNull LocationReceiverProvider locationReceiverProvider) {
        this.f39078c.unregisterSystemLocationSource(locationReceiverProvider);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2623fc, io.appmetrica.analytics.impl.InterfaceC2702ic
    public final void a(@NotNull Object obj) {
        ((C2831nc) this.f39077b).b(obj);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2623fc, io.appmetrica.analytics.impl.InterfaceC2702ic
    public final void a(boolean z4) {
        ((C2831nc) this.f39077b).a(z4);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2623fc, io.appmetrica.analytics.impl.InterfaceC2702ic
    public final void a(@Nullable Location location) {
        this.f39078c.updateUserLocation(location);
    }
}
