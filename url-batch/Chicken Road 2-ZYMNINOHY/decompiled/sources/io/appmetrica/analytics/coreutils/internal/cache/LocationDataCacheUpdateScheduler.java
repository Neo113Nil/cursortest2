package io.appmetrica.analytics.coreutils.internal.cache;

import io.appmetrica.analytics.coreapi.internal.cache.CacheUpdateScheduler;
import io.appmetrica.analytics.coreapi.internal.cache.UpdateConditionsChecker;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.locationapi.internal.ILastKnownUpdater;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class LocationDataCacheUpdateScheduler implements CacheUpdateScheduler {

    /* renamed from: a, reason: collision with root package name */
    private final ICommonExecutor f9730a;

    /* renamed from: b, reason: collision with root package name */
    private final ILastKnownUpdater f9731b;

    /* renamed from: c, reason: collision with root package name */
    private final UpdateConditionsChecker f9732c;

    /* renamed from: d, reason: collision with root package name */
    private final a f9733d = new a(this);

    /* renamed from: e, reason: collision with root package name */
    private final b f9734e = new b(this);

    public LocationDataCacheUpdateScheduler(ICommonExecutor iCommonExecutor, ILastKnownUpdater iLastKnownUpdater, UpdateConditionsChecker updateConditionsChecker, String str) {
        this.f9730a = iCommonExecutor;
        this.f9731b = iLastKnownUpdater;
        this.f9732c = updateConditionsChecker;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.cache.CacheUpdateScheduler
    public void onStateUpdated() {
        this.f9730a.remove(this.f9733d);
        this.f9730a.executeDelayed(this.f9733d, 90L, TimeUnit.SECONDS);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.cache.CacheUpdateScheduler
    public void scheduleUpdateIfNeededNow() {
        this.f9730a.execute(this.f9734e);
    }

    public void startUpdates() {
        onStateUpdated();
    }

    public void stopUpdates() {
        this.f9730a.remove(this.f9733d);
        this.f9730a.remove(this.f9734e);
    }
}
