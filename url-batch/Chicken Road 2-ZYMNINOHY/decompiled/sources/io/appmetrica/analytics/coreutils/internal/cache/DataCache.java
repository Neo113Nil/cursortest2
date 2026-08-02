package io.appmetrica.analytics.coreutils.internal.cache;

import io.appmetrica.analytics.coreapi.internal.cache.CacheUpdateScheduler;
import io.appmetrica.analytics.coreapi.internal.cache.UpdateConditionsChecker;
import io.appmetrica.analytics.coreutils.internal.cache.CachedDataProvider;

/* loaded from: classes.dex */
public abstract class DataCache<T> implements UpdateConditionsChecker {

    /* renamed from: a, reason: collision with root package name */
    private CacheUpdateScheduler f9729a;
    protected final CachedDataProvider.CachedData<T> mCachedData;

    public DataCache(long j4, long j5, String str) {
        this.mCachedData = new CachedDataProvider.CachedData<>(j4, j5, str);
    }

    public CachedDataProvider.CachedData<T> getCachedData() {
        return this.mCachedData;
    }

    public T getData() {
        CacheUpdateScheduler cacheUpdateScheduler;
        if (shouldUpdate() && (cacheUpdateScheduler = this.f9729a) != null) {
            cacheUpdateScheduler.scheduleUpdateIfNeededNow();
        }
        if (this.mCachedData.shouldClearData()) {
            this.mCachedData.setData(null);
        }
        return this.mCachedData.getData();
    }

    public void setUpdateScheduler(CacheUpdateScheduler cacheUpdateScheduler) {
        this.f9729a = cacheUpdateScheduler;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.cache.UpdateConditionsChecker
    public boolean shouldUpdate() {
        return this.mCachedData.isEmpty() || this.mCachedData.shouldUpdateData();
    }

    public abstract boolean shouldUpdate(T t4);

    public void updateCacheControl(long j4, long j5) {
        this.mCachedData.setExpirationPolicy(j4, j5);
    }

    public void updateData(T t4) {
        if (shouldUpdate(t4)) {
            this.mCachedData.setData(t4);
            CacheUpdateScheduler cacheUpdateScheduler = this.f9729a;
            if (cacheUpdateScheduler != null) {
                cacheUpdateScheduler.onStateUpdated();
            }
        }
    }
}
