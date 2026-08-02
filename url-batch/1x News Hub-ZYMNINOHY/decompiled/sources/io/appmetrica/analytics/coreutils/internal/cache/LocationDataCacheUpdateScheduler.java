package io.appmetrica.analytics.coreutils.internal.cache;

import io.appmetrica.analytics.coreapi.internal.cache.CacheUpdateScheduler;
import io.appmetrica.analytics.coreapi.internal.cache.UpdateConditionsChecker;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.locationapi.internal.ILastKnownUpdater;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class LocationDataCacheUpdateScheduler implements CacheUpdateScheduler {

    /* renamed from: a, reason: collision with root package name */
    private final ICommonExecutor f5476a;

    /* renamed from: b, reason: collision with root package name */
    private final ILastKnownUpdater f5477b;

    /* renamed from: c, reason: collision with root package name */
    private final UpdateConditionsChecker f5478c;

    /* renamed from: d, reason: collision with root package name */
    private final a f5479d = new a(this);

    /* renamed from: e, reason: collision with root package name */
    private final b f5480e = new b(this);

    public LocationDataCacheUpdateScheduler(ICommonExecutor iCommonExecutor, ILastKnownUpdater iLastKnownUpdater, UpdateConditionsChecker updateConditionsChecker, String str) {
        this.f5476a = iCommonExecutor;
        this.f5477b = iLastKnownUpdater;
        this.f5478c = updateConditionsChecker;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.cache.CacheUpdateScheduler
    public void onStateUpdated() {
        this.f5476a.remove(this.f5479d);
        this.f5476a.executeDelayed(this.f5479d, 90L, TimeUnit.SECONDS);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.cache.CacheUpdateScheduler
    public void scheduleUpdateIfNeededNow() {
        this.f5476a.execute(this.f5480e);
    }

    public void startUpdates() {
        onStateUpdated();
    }

    public void stopUpdates() {
        this.f5476a.remove(this.f5479d);
        this.f5476a.remove(this.f5480e);
    }
}
