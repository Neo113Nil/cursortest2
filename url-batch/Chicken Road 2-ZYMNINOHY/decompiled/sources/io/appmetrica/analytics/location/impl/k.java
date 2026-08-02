package io.appmetrica.analytics.location.impl;

import android.content.Context;
import android.location.Location;
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

/* loaded from: classes.dex */
public final class k implements ILastKnownUpdater, LocationControllerObserver {

    /* renamed from: a, reason: collision with root package name */
    public final Context f13136a;

    /* renamed from: b, reason: collision with root package name */
    public final PermissionExtractor f13137b;

    /* renamed from: c, reason: collision with root package name */
    public final p f13138c;

    /* renamed from: d, reason: collision with root package name */
    public final IHandlerExecutor f13139d;

    /* renamed from: e, reason: collision with root package name */
    public final n f13140e;

    /* renamed from: f, reason: collision with root package name */
    public final LocationDataCacheUpdateScheduler f13141f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f13142g;

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f13143h = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f13144i = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    public Location f13145j;

    public k(Context context, PermissionExtractor permissionExtractor, IHandlerExecutor iHandlerExecutor, p pVar) {
        this.f13136a = context;
        this.f13138c = pVar;
        this.f13137b = permissionExtractor;
        this.f13139d = iHandlerExecutor;
        this.f13140e = new n(pVar);
        LocationDataCacheUpdateScheduler locationDataCacheUpdateScheduler = new LocationDataCacheUpdateScheduler(iHandlerExecutor, this, pVar.a(), "loc");
        this.f13141f = locationDataCacheUpdateScheduler;
        pVar.a().setUpdateScheduler(locationDataCacheUpdateScheduler);
    }

    public final synchronized Location a() {
        return (Location) this.f13138c.f13156b.getData();
    }

    public final synchronized void b(LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
        this.f13143h.remove(lastKnownLocationExtractorProvider.getIdentifier());
    }

    public final synchronized Location c() {
        Location location;
        location = this.f13145j;
        if (location == null) {
            location = a();
        }
        return location;
    }

    public final synchronized void d() {
        try {
            this.f13141f.startUpdates();
            Iterator it = this.f13144i.values().iterator();
            while (it.hasNext()) {
                ((LocationReceiver) it.next()).startLocationUpdates();
            }
            updateLastKnown();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void e() {
        this.f13141f.stopUpdates();
        Iterator it = this.f13144i.values().iterator();
        while (it.hasNext()) {
            ((LocationReceiver) it.next()).stopLocationUpdates();
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationControllerObserver
    public final synchronized void startLocationTracking() {
        if (!this.f13142g) {
            this.f13142g = true;
            d();
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationControllerObserver
    public final synchronized void stopLocationTracking() {
        if (this.f13142g) {
            this.f13142g = false;
            e();
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.ILastKnownUpdater
    public final synchronized void updateLastKnown() {
        Iterator it = this.f13143h.values().iterator();
        while (it.hasNext()) {
            ((LastKnownLocationExtractor) it.next()).updateLastKnownLocation();
        }
    }

    public final synchronized void b(LocationReceiverProvider locationReceiverProvider) {
        LocationReceiver locationReceiver = (LocationReceiver) this.f13144i.remove(locationReceiverProvider.getIdentifier());
        if (locationReceiver != null && this.f13142g) {
            locationReceiver.stopLocationUpdates();
        }
    }

    public final void a(i iVar) {
        this.f13139d.execute(new j(this, iVar));
    }

    public final synchronized void a(LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
        LastKnownLocationExtractor extractor = lastKnownLocationExtractorProvider.getExtractor(this.f13136a, this.f13137b, this.f13139d, this.f13140e);
        this.f13143h.put(lastKnownLocationExtractorProvider.getIdentifier(), extractor);
        if (this.f13142g) {
            extractor.updateLastKnownLocation();
        }
    }

    public final synchronized Location b() {
        return this.f13145j;
    }

    public final synchronized void a(LocationReceiverProvider locationReceiverProvider) {
        try {
            LocationReceiver locationReceiver = locationReceiverProvider.getLocationReceiver(this.f13136a, this.f13137b, this.f13139d, this.f13140e);
            LocationReceiver locationReceiver2 = (LocationReceiver) this.f13144i.put(locationReceiverProvider.getIdentifier(), locationReceiver);
            if (this.f13142g) {
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
            this.f13145j = location;
        }
    }
}
