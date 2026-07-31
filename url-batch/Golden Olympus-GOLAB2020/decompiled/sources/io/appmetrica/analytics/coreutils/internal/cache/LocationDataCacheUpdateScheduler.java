package io.appmetrica.analytics.coreutils.internal.cache;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.cache.CacheUpdateScheduler;
import io.appmetrica.analytics.coreapi.internal.cache.UpdateConditionsChecker;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.locationapi.internal.ILastKnownUpdater;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class LocationDataCacheUpdateScheduler implements CacheUpdateScheduler {

    /* renamed from: a, reason: collision with root package name */
    private final ICommonExecutor f37015a;

    /* renamed from: b, reason: collision with root package name */
    private final ILastKnownUpdater f37016b;

    /* renamed from: c, reason: collision with root package name */
    private final UpdateConditionsChecker f37017c;

    /* renamed from: d, reason: collision with root package name */
    private final a f37018d = new a(this);

    /* renamed from: e, reason: collision with root package name */
    private final b f37019e = new b(this);

    public LocationDataCacheUpdateScheduler(@NonNull ICommonExecutor iCommonExecutor, @NonNull ILastKnownUpdater iLastKnownUpdater, @NonNull UpdateConditionsChecker updateConditionsChecker, @NonNull String str) {
        this.f37015a = iCommonExecutor;
        this.f37016b = iLastKnownUpdater;
        this.f37017c = updateConditionsChecker;
        String.format("[LocationDataCacheUpdateScheduler-%s]", str);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.cache.CacheUpdateScheduler
    public void onStateUpdated() {
        this.f37015a.remove(this.f37018d);
        this.f37015a.executeDelayed(this.f37018d, 90L, TimeUnit.SECONDS);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.cache.CacheUpdateScheduler
    public void scheduleUpdateIfNeededNow() {
        this.f37015a.execute(this.f37019e);
    }

    public void startUpdates() {
        onStateUpdated();
    }

    public void stopUpdates() {
        this.f37015a.remove(this.f37018d);
        this.f37015a.remove(this.f37019e);
    }
}
