package io.appmetrica.analytics.coreutils.internal.cache;

import x.AbstractC1514c;

/* loaded from: classes.dex */
public interface CachedDataProvider {

    public static class CachedData<T> {

        /* renamed from: a, reason: collision with root package name */
        private final String f9724a;

        /* renamed from: b, reason: collision with root package name */
        private volatile long f9725b;

        /* renamed from: c, reason: collision with root package name */
        private volatile long f9726c;

        /* renamed from: d, reason: collision with root package name */
        private long f9727d = 0;

        /* renamed from: e, reason: collision with root package name */
        private Object f9728e = null;

        public CachedData(long j4, long j5, String str) {
            this.f9724a = AbstractC1514c.a("[CachedData-", str, "]");
            this.f9725b = j4;
            this.f9726c = j5;
        }

        public T getData() {
            return (T) this.f9728e;
        }

        public long getExpiryTime() {
            return this.f9726c;
        }

        public long getRefreshTime() {
            return this.f9725b;
        }

        public final boolean isEmpty() {
            return this.f9728e == null;
        }

        public void setData(T t4) {
            this.f9728e = t4;
            this.f9727d = System.currentTimeMillis();
        }

        public void setExpirationPolicy(long j4, long j5) {
            this.f9725b = j4;
            this.f9726c = j5;
        }

        public final boolean shouldClearData() {
            if (this.f9727d == 0) {
                return false;
            }
            long currentTimeMillis = System.currentTimeMillis() - this.f9727d;
            return currentTimeMillis > this.f9726c || currentTimeMillis < 0;
        }

        public final boolean shouldUpdateData() {
            long currentTimeMillis = System.currentTimeMillis() - this.f9727d;
            return currentTimeMillis > this.f9725b || currentTimeMillis < 0;
        }

        public String toString() {
            return "CachedData{tag='" + this.f9724a + "', refreshTime=" + this.f9725b + ", expiryTime=" + this.f9726c + ", mCachedTime=" + this.f9727d + ", mCachedData=" + this.f9728e + '}';
        }
    }
}
