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
    public final Context f8743a;

    /* renamed from: b, reason: collision with root package name */
    public final PermissionExtractor f8744b;

    /* renamed from: c, reason: collision with root package name */
    public final p f8745c;

    /* renamed from: d, reason: collision with root package name */
    public final IHandlerExecutor f8746d;

    /* renamed from: e, reason: collision with root package name */
    public final n f8747e;
    public final LocationDataCacheUpdateScheduler f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f8748g;

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f8749h = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f8750i = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    public Location f8751j;

    public k(Context context, PermissionExtractor permissionExtractor, IHandlerExecutor iHandlerExecutor, p pVar) {
        this.f8743a = context;
        this.f8745c = pVar;
        this.f8744b = permissionExtractor;
        this.f8746d = iHandlerExecutor;
        this.f8747e = new n(pVar);
        LocationDataCacheUpdateScheduler locationDataCacheUpdateScheduler = new LocationDataCacheUpdateScheduler(iHandlerExecutor, this, pVar.a(), "loc");
        this.f = locationDataCacheUpdateScheduler;
        pVar.a().setUpdateScheduler(locationDataCacheUpdateScheduler);
    }

    public final synchronized Location a() {
        return (Location) this.f8745c.f8761b.getData();
    }

    public final synchronized void b(LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
        this.f8749h.remove(lastKnownLocationExtractorProvider.getIdentifier());
    }

    public final synchronized Location c() {
        Location location;
        location = this.f8751j;
        if (location == null) {
            location = a();
        }
        return location;
    }

    public final synchronized void d() {
        try {
            this.f.startUpdates();
            Iterator it = this.f8750i.values().iterator();
            while (it.hasNext()) {
                ((LocationReceiver) it.next()).startLocationUpdates();
            }
            updateLastKnown();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void e() {
        this.f.stopUpdates();
        Iterator it = this.f8750i.values().iterator();
        while (it.hasNext()) {
            ((LocationReceiver) it.next()).stopLocationUpdates();
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationControllerObserver
    public final synchronized void startLocationTracking() {
        if (!this.f8748g) {
            this.f8748g = true;
            d();
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationControllerObserver
    public final synchronized void stopLocationTracking() {
        if (this.f8748g) {
            this.f8748g = false;
            e();
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.ILastKnownUpdater
    public final synchronized void updateLastKnown() {
        Iterator it = this.f8749h.values().iterator();
        while (it.hasNext()) {
            ((LastKnownLocationExtractor) it.next()).updateLastKnownLocation();
        }
    }

    public final synchronized void b(LocationReceiverProvider locationReceiverProvider) {
        LocationReceiver locationReceiver = (LocationReceiver) this.f8750i.remove(locationReceiverProvider.getIdentifier());
        if (locationReceiver != null && this.f8748g) {
            locationReceiver.stopLocationUpdates();
        }
    }

    public final void a(i iVar) {
        this.f8746d.execute(new j(this, iVar));
    }

    public final synchronized void a(LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
        LastKnownLocationExtractor extractor = lastKnownLocationExtractorProvider.getExtractor(this.f8743a, this.f8744b, this.f8746d, this.f8747e);
        this.f8749h.put(lastKnownLocationExtractorProvider.getIdentifier(), extractor);
        if (this.f8748g) {
            extractor.updateLastKnownLocation();
        }
    }

    public final synchronized Location b() {
        return this.f8751j;
    }

    public final synchronized void a(LocationReceiverProvider locationReceiverProvider) {
        try {
            LocationReceiver locationReceiver = locationReceiverProvider.getLocationReceiver(this.f8743a, this.f8744b, this.f8746d, this.f8747e);
            LocationReceiver locationReceiver2 = (LocationReceiver) this.f8750i.put(locationReceiverProvider.getIdentifier(), locationReceiver);
            if (this.f8748g) {
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
            this.f8751j = location;
        }
    }
}
