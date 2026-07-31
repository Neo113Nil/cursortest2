package io.appmetrica.analytics.coreutils.internal.cache;

import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public interface CachedDataProvider {

    public static class CachedData<T> {

        /* renamed from: a, reason: collision with root package name */
        private final String f37009a;

        /* renamed from: b, reason: collision with root package name */
        private volatile long f37010b;

        /* renamed from: c, reason: collision with root package name */
        private volatile long f37011c;

        /* renamed from: d, reason: collision with root package name */
        private long f37012d = 0;

        /* renamed from: e, reason: collision with root package name */
        private Object f37013e = null;

        public CachedData(long j4, long j5, @NonNull String str) {
            this.f37009a = String.format("[CachedData-%s]", str);
            this.f37010b = j4;
            this.f37011c = j5;
        }

        public T getData() {
            return (T) this.f37013e;
        }

        public long getExpiryTime() {
            return this.f37011c;
        }

        public long getRefreshTime() {
            return this.f37010b;
        }

        public final boolean isEmpty() {
            return this.f37013e == null;
        }

        public void setData(T t4) {
            this.f37013e = t4;
            this.f37012d = System.currentTimeMillis();
        }

        public void setExpirationPolicy(long j4, long j5) {
            this.f37010b = j4;
            this.f37011c = j5;
        }

        public final boolean shouldClearData() {
            if (this.f37012d == 0) {
                return false;
            }
            long currentTimeMillis = System.currentTimeMillis() - this.f37012d;
            return currentTimeMillis > this.f37011c || currentTimeMillis < 0;
        }

        public final boolean shouldUpdateData() {
            long currentTimeMillis = System.currentTimeMillis() - this.f37012d;
            return currentTimeMillis > this.f37010b || currentTimeMillis < 0;
        }

        @NonNull
        public String toString() {
            return "CachedData{tag='" + this.f37009a + "', refreshTime=" + this.f37010b + ", expiryTime=" + this.f37011c + ", mCachedTime=" + this.f37012d + ", mCachedData=" + this.f37013e + '}';
        }
    }
}
