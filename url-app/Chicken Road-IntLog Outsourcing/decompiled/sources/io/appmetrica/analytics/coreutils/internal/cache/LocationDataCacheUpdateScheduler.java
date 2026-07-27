package io.appmetrica.analytics.coreutils.internal.cache;

import io.appmetrica.analytics.coreapi.internal.cache.CacheUpdateScheduler;
import io.appmetrica.analytics.coreapi.internal.cache.UpdateConditionsChecker;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.locationapi.internal.ILastKnownUpdater;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class LocationDataCacheUpdateScheduler implements CacheUpdateScheduler {

    /* renamed from: a, reason: collision with root package name */
    private final ICommonExecutor f6241a;

    /* renamed from: b, reason: collision with root package name */
    private final ILastKnownUpdater f6242b;

    /* renamed from: c, reason: collision with root package name */
    private final UpdateConditionsChecker f6243c;

    /* renamed from: d, reason: collision with root package name */
    private final a f6244d = new a(this);

    /* renamed from: e, reason: collision with root package name */
    private final b f6245e = new b(this);

    public LocationDataCacheUpdateScheduler(ICommonExecutor iCommonExecutor, ILastKnownUpdater iLastKnownUpdater, UpdateConditionsChecker updateConditionsChecker, String str) {
        this.f6241a = iCommonExecutor;
        this.f6242b = iLastKnownUpdater;
        this.f6243c = updateConditionsChecker;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.cache.CacheUpdateScheduler
    public void onStateUpdated() {
        this.f6241a.remove(this.f6244d);
        this.f6241a.executeDelayed(this.f6244d, 90L, TimeUnit.SECONDS);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.cache.CacheUpdateScheduler
    public void scheduleUpdateIfNeededNow() {
        this.f6241a.execute(this.f6245e);
    }

    public void startUpdates() {
        onStateUpdated();
    }

    public void stopUpdates() {
        this.f6241a.remove(this.f6244d);
        this.f6241a.remove(this.f6245e);
    }
}
