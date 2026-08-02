package io.appmetrica.analytics.coreutils.internal.cache;

/* loaded from: classes.dex */
public abstract class SynchronizedDataCache<T> extends DataCache<T> {
    public SynchronizedDataCache(long j3, long j4, String str) {
        super(j3, j4, str);
    }

    @Override // io.appmetrica.analytics.coreutils.internal.cache.DataCache
    public synchronized T getData() {
        return (T) super.getData();
    }

    @Override // io.appmetrica.analytics.coreutils.internal.cache.DataCache, io.appmetrica.analytics.coreapi.internal.cache.UpdateConditionsChecker
    public synchronized boolean shouldUpdate() {
        return super.shouldUpdate();
    }

    @Override // io.appmetrica.analytics.coreutils.internal.cache.DataCache
    public synchronized void updateData(T t3) {
        super.updateData(t3);
    }
}
