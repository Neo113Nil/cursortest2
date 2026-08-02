package io.appmetrica.analytics.coreutils.internal.cache;

import w0.AbstractC1234c;

/* loaded from: classes.dex */
public interface CachedDataProvider {

    public static class CachedData<T> {

        /* renamed from: a, reason: collision with root package name */
        private final String f5470a;

        /* renamed from: b, reason: collision with root package name */
        private volatile long f5471b;

        /* renamed from: c, reason: collision with root package name */
        private volatile long f5472c;

        /* renamed from: d, reason: collision with root package name */
        private long f5473d = 0;

        /* renamed from: e, reason: collision with root package name */
        private Object f5474e = null;

        public CachedData(long j3, long j4, String str) {
            this.f5470a = AbstractC1234c.a("[CachedData-", str, "]");
            this.f5471b = j3;
            this.f5472c = j4;
        }

        public T getData() {
            return (T) this.f5474e;
        }

        public long getExpiryTime() {
            return this.f5472c;
        }

        public long getRefreshTime() {
            return this.f5471b;
        }

        public final boolean isEmpty() {
            return this.f5474e == null;
        }

        public void setData(T t3) {
            this.f5474e = t3;
            this.f5473d = System.currentTimeMillis();
        }

        public void setExpirationPolicy(long j3, long j4) {
            this.f5471b = j3;
            this.f5472c = j4;
        }

        public final boolean shouldClearData() {
            if (this.f5473d == 0) {
                return false;
            }
            long currentTimeMillis = System.currentTimeMillis() - this.f5473d;
            return currentTimeMillis > this.f5472c || currentTimeMillis < 0;
        }

        public final boolean shouldUpdateData() {
            long currentTimeMillis = System.currentTimeMillis() - this.f5473d;
            return currentTimeMillis > this.f5471b || currentTimeMillis < 0;
        }

        public String toString() {
            return "CachedData{tag='" + this.f5470a + "', refreshTime=" + this.f5471b + ", expiryTime=" + this.f5472c + ", mCachedTime=" + this.f5473d + ", mCachedData=" + this.f5474e + '}';
        }
    }
}
