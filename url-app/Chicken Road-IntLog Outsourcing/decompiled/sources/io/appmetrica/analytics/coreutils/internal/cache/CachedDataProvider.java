package io.appmetrica.analytics.coreutils.internal.cache;

import b2.AbstractC0279e;

/* loaded from: classes.dex */
public interface CachedDataProvider {

    public static class CachedData<T> {

        /* renamed from: a, reason: collision with root package name */
        private final String f6235a;

        /* renamed from: b, reason: collision with root package name */
        private volatile long f6236b;

        /* renamed from: c, reason: collision with root package name */
        private volatile long f6237c;

        /* renamed from: d, reason: collision with root package name */
        private long f6238d = 0;

        /* renamed from: e, reason: collision with root package name */
        private Object f6239e = null;

        public CachedData(long j2, long j6, String str) {
            this.f6235a = AbstractC0279e.f("[CachedData-", str, "]");
            this.f6236b = j2;
            this.f6237c = j6;
        }

        public T getData() {
            return (T) this.f6239e;
        }

        public long getExpiryTime() {
            return this.f6237c;
        }

        public long getRefreshTime() {
            return this.f6236b;
        }

        public final boolean isEmpty() {
            return this.f6239e == null;
        }

        public void setData(T t5) {
            this.f6239e = t5;
            this.f6238d = System.currentTimeMillis();
        }

        public void setExpirationPolicy(long j2, long j6) {
            this.f6236b = j2;
            this.f6237c = j6;
        }

        public final boolean shouldClearData() {
            if (this.f6238d == 0) {
                return false;
            }
            long currentTimeMillis = System.currentTimeMillis() - this.f6238d;
            return currentTimeMillis > this.f6237c || currentTimeMillis < 0;
        }

        public final boolean shouldUpdateData() {
            long currentTimeMillis = System.currentTimeMillis() - this.f6238d;
            return currentTimeMillis > this.f6236b || currentTimeMillis < 0;
        }

        public String toString() {
            return "CachedData{tag='" + this.f6235a + "', refreshTime=" + this.f6236b + ", expiryTime=" + this.f6237c + ", mCachedTime=" + this.f6238d + ", mCachedData=" + this.f6239e + '}';
        }
    }
}
