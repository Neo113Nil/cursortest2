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
    public final Context f9705a;

    /* renamed from: b, reason: collision with root package name */
    public final PermissionExtractor f9706b;

    /* renamed from: c, reason: collision with root package name */
    public final p f9707c;

    /* renamed from: d, reason: collision with root package name */
    public final IHandlerExecutor f9708d;

    /* renamed from: e, reason: collision with root package name */
    public final n f9709e;

    /* renamed from: f, reason: collision with root package name */
    public final LocationDataCacheUpdateScheduler f9710f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f9711g;

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f9712h = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f9713i = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    public Location f9714j;

    public k(Context context, PermissionExtractor permissionExtractor, IHandlerExecutor iHandlerExecutor, p pVar) {
        this.f9705a = context;
        this.f9707c = pVar;
        this.f9706b = permissionExtractor;
        this.f9708d = iHandlerExecutor;
        this.f9709e = new n(pVar);
        LocationDataCacheUpdateScheduler locationDataCacheUpdateScheduler = new LocationDataCacheUpdateScheduler(iHandlerExecutor, this, pVar.a(), "loc");
        this.f9710f = locationDataCacheUpdateScheduler;
        pVar.a().setUpdateScheduler(locationDataCacheUpdateScheduler);
    }

    public final synchronized Location a() {
        return (Location) this.f9707c.f9725b.getData();
    }

    public final synchronized void b(LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
        this.f9712h.remove(lastKnownLocationExtractorProvider.getIdentifier());
    }

    public final synchronized Location c() {
        Location location;
        location = this.f9714j;
        if (location == null) {
            location = a();
        }
        return location;
    }

    public final synchronized void d() {
        try {
            this.f9710f.startUpdates();
            Iterator it = this.f9713i.values().iterator();
            while (it.hasNext()) {
                ((LocationReceiver) it.next()).startLocationUpdates();
            }
            updateLastKnown();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void e() {
        this.f9710f.stopUpdates();
        Iterator it = this.f9713i.values().iterator();
        while (it.hasNext()) {
            ((LocationReceiver) it.next()).stopLocationUpdates();
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationControllerObserver
    public final synchronized void startLocationTracking() {
        if (!this.f9711g) {
            this.f9711g = true;
            d();
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LocationControllerObserver
    public final synchronized void stopLocationTracking() {
        if (this.f9711g) {
            this.f9711g = false;
            e();
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.ILastKnownUpdater
    public final synchronized void updateLastKnown() {
        Iterator it = this.f9712h.values().iterator();
        while (it.hasNext()) {
            ((LastKnownLocationExtractor) it.next()).updateLastKnownLocation();
        }
    }

    public final synchronized void b(LocationReceiverProvider locationReceiverProvider) {
        LocationReceiver locationReceiver = (LocationReceiver) this.f9713i.remove(locationReceiverProvider.getIdentifier());
        if (locationReceiver != null && this.f9711g) {
            locationReceiver.stopLocationUpdates();
        }
    }

    public final void a(i iVar) {
        this.f9708d.execute(new j(this, iVar));
    }

    public final synchronized void a(LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
        LastKnownLocationExtractor extractor = lastKnownLocationExtractorProvider.getExtractor(this.f9705a, this.f9706b, this.f9708d, this.f9709e);
        this.f9712h.put(lastKnownLocationExtractorProvider.getIdentifier(), extractor);
        if (this.f9711g) {
            extractor.updateLastKnownLocation();
        }
    }

    public final synchronized Location b() {
        return this.f9714j;
    }

    public final synchronized void a(LocationReceiverProvider locationReceiverProvider) {
        try {
            LocationReceiver locationReceiver = locationReceiverProvider.getLocationReceiver(this.f9705a, this.f9706b, this.f9708d, this.f9709e);
            LocationReceiver locationReceiver2 = (LocationReceiver) this.f9713i.put(locationReceiverProvider.getIdentifier(), locationReceiver);
            if (this.f9711g) {
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
            this.f9714j = location;
        }
    }
}
