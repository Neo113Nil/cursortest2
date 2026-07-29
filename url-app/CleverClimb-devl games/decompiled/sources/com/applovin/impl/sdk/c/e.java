package com.applovin.impl.sdk.c;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private long f3038a;

    /* renamed from: b, reason: collision with root package name */
    private long f3039b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f3040c;

    /* renamed from: d, reason: collision with root package name */
    private long f3041d;
    private long e;

    public void a() {
        this.f3040c = true;
    }

    public void a(long j) {
        this.f3038a += j;
    }

    public void b(long j) {
        this.f3039b += j;
    }

    public boolean b() {
        return this.f3040c;
    }

    public long c() {
        return this.f3038a;
    }

    public long d() {
        return this.f3039b;
    }

    public void e() {
        this.f3041d++;
    }

    public void f() {
        this.e++;
    }

    public long g() {
        return this.f3041d;
    }

    public long h() {
        return this.e;
    }

    public String toString() {
        return "CacheStatsTracker{totalDownloadedBytes=" + this.f3038a + ", totalCachedBytes=" + this.f3039b + ", isHTMLCachingCancelled=" + this.f3040c + ", htmlResourceCacheSuccessCount=" + this.f3041d + ", htmlResourceCacheFailureCount=" + this.e + '}';
    }
}
