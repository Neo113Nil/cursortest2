package io.appmetrica.analytics.coreutils.internal.cache;

import io.appmetrica.analytics.coreapi.internal.cache.CacheUpdateScheduler;
import io.appmetrica.analytics.coreapi.internal.cache.UpdateConditionsChecker;
import io.appmetrica.analytics.coreutils.internal.cache.CachedDataProvider;

/* loaded from: classes.dex */
public abstract class DataCache<T> implements UpdateConditionsChecker {

    /* renamed from: a, reason: collision with root package name */
    private CacheUpdateScheduler f5475a;
    protected final CachedDataProvider.CachedData<T> mCachedData;

    public DataCache(long j3, long j4, String str) {
        this.mCachedData = new CachedDataProvider.CachedData<>(j3, j4, str);
    }

    public CachedDataProvider.CachedData<T> getCachedData() {
        return this.mCachedData;
    }

    public T getData() {
        CacheUpdateScheduler cacheUpdateScheduler;
        if (shouldUpdate() && (cacheUpdateScheduler = this.f5475a) != null) {
            cacheUpdateScheduler.scheduleUpdateIfNeededNow();
        }
        if (this.mCachedData.shouldClearData()) {
            this.mCachedData.setData(null);
        }
        return this.mCachedData.getData();
    }

    public void setUpdateScheduler(CacheUpdateScheduler cacheUpdateScheduler) {
        this.f5475a = cacheUpdateScheduler;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.cache.UpdateConditionsChecker
    public boolean shouldUpdate() {
        return this.mCachedData.isEmpty() || this.mCachedData.shouldUpdateData();
    }

    public abstract boolean shouldUpdate(T t3);

    public void updateCacheControl(long j3, long j4) {
        this.mCachedData.setExpirationPolicy(j3, j4);
    }

    public void updateData(T t3) {
        if (shouldUpdate(t3)) {
            this.mCachedData.setData(t3);
            CacheUpdateScheduler cacheUpdateScheduler = this.f5475a;
            if (cacheUpdateScheduler != null) {
                cacheUpdateScheduler.onStateUpdated();
            }
        }
    }
}
