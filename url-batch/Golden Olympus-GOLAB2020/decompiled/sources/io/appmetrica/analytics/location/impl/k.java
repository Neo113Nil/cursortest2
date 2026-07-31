package io.appmetrica.analytics.location.impl;

import android.content.Context;
import android.location.Location;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.coreutils.internal.cache.LocationDataCacheUpdateScheduler;
import io.appmetrica.analytics.locationapi.internal.ILastKnownUpdater;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractor;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import io.appmetrica.analytics.locationapi.internal.LocationReceiver;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProvider;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class k implements ILastKnownUpdater, LocationControllerObserver {

    /* renamed from: a, reason: collision with root package name */
    public final Context f40438a;

    /* renamed from: b, reason: collision with root package name */
    public final PermissionExtractor f40439b;

    /* renamed from: c, reason: collision with root package name */
    public final p f40440c;

    /* renamed from: d, reason: collision with root package name */
    public final IHandlerExecutor f40441d;

    /* renamed from: e, reason: collision with root package name */
    public final n f40442e;

    /* renamed from: f, reason: collision with root package name */
    public final LocationDataCacheUpdateScheduler f40443f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f40444g;

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f40445h = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f40446i = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    public Location f40447j;

    public k(@NonNull Context context, @NonNull PermissionExtractor permissionExtractor, @NonNull IHandlerExecutor iHandlerExecutor, @NonNull p pVar) {
        this.f40438a = context;
        this.f40440c = pVar;
        this.f40439b = permissionExtractor;
        this.f40441d = iHandlerExecutor;
        this.f40442e = new n(pVar);
        LocationDataCacheUpdateScheduler locationDataCacheUpdateScheduler = new LocationDataCacheUpdateScheduler(iHandlerExecutor, this, pVar.a(), "loc");
        this.f40443f = locationDataCacheUpdateScheduler;
        pVar.a().setUpdateScheduler(locationDataCacheUpdateScheduler);
    }

    public final synchronized Location a() {
        return (Location) this.f40440c.f40458b.getData();
    }

    public final synchronized void b(@NonNull LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
        this.f40445h.remove(lastKnownLocationExtractorProvider.getIdentifier());
    }

    public final synchronized Location c() {
        Location location;
        location = this.f40447j;
        if (location == null) {
            location = a();
        }
        return location;
    }

    public final synchronized void d() {
        try {
            this.f40443f.startUpdates();
            Iterator it = this.f40446i.values().iterator();
            while (it.hasNext()) {
                ((LocationReceiver) it.next()).startLocationUpdates();
            }
            updateLastKnown();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void e() {
        this.f40443f.stopUpdates();
        Iterator it = this.f40446i.values().iterator();
        while (it.hasNext()) {
            ((LocationReceiver) it.next()).stopLocationUpdates();
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationControllerObserver
    public final synchronized void startLocationTracking() {
        if (!this.f40444g) {
            this.f40444g = true;
            d();
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationControllerObserver
    public final synchronized void stopLocationTracking() {
        if (this.f40444g) {
            this.f40444g = false;
            e();
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.ILastKnownUpdater
    public final synchronized void updateLastKnown() {
        Iterator it = this.f40445h.values().iterator();
        while (it.hasNext()) {
            ((LastKnownLocationExtractor) it.next()).updateLastKnownLocation();
        }
    }

    public final synchronized void b(@NonNull LocationReceiverProvider locationReceiverProvider) {
        LocationReceiver locationReceiver = (LocationReceiver) this.f40446i.remove(locationReceiverProvider.getIdentifier());
        if (locationReceiver != null && this.f40444g) {
            locationReceiver.stopLocationUpdates();
        }
    }

    public final void a(@NonNull i iVar) {
        this.f40441d.execute(new j(this, iVar));
    }

    public final synchronized void a(@NonNull LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
        LastKnownLocationExtractor extractor = lastKnownLocationExtractorProvider.getExtractor(this.f40438a, this.f40439b, this.f40441d, this.f40442e);
        this.f40445h.put(lastKnownLocationExtractorProvider.getIdentifier(), extractor);
        if (this.f40444g) {
            extractor.updateLastKnownLocation();
        }
    }

    public final synchronized Location b() {
        return this.f40447j;
    }

    public final synchronized void a(@NonNull LocationReceiverProvider locationReceiverProvider) {
        try {
            LocationReceiver locationReceiver = locationReceiverProvider.getLocationReceiver(this.f40438a, this.f40439b, this.f40441d, this.f40442e);
            LocationReceiver locationReceiver2 = (LocationReceiver) this.f40446i.put(locationReceiverProvider.getIdentifier(), locationReceiver);
            if (this.f40444g) {
                if (locationReceiver2 != null) {
                    locationReceiver2.stopLocationUpdates();
                }
                locationReceiver.startLocationUpdates();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void a(Location location) {
        if (location != null) {
            this.f40447j = location;
        }
    }
}
