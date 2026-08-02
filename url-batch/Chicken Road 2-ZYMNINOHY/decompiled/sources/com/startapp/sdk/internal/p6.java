package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.cache.DiskAdCacheManager$DiskCachedAd;

/* loaded from: classes.dex */
public final class p6 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DiskAdCacheManager$DiskCachedAd f7436a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q6 f7437b;

    public p6(q6 q6Var, DiskAdCacheManager$DiskCachedAd diskAdCacheManager$DiskCachedAd) {
        this.f7437b = q6Var;
        this.f7436a = diskAdCacheManager$DiskCachedAd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            DiskAdCacheManager$DiskCachedAd diskAdCacheManager$DiskCachedAd = this.f7436a;
            if (diskAdCacheManager$DiskCachedAd == null) {
                q6 q6Var = this.f7437b;
                a0.a(q6Var.f7477a, q6Var.f7479c, null, true);
                return;
            }
            if (diskAdCacheManager$DiskCachedAd.a() != null && this.f7436a.a().isReady()) {
                if (this.f7436a.a().hasAdCacheTtlPassed()) {
                    q6 q6Var2 = this.f7437b;
                    a0.a(q6Var2.f7477a, q6Var2.f7479c, null, true);
                    return;
                } else {
                    q6 q6Var3 = this.f7437b;
                    s6.a(q6Var3.f7477a, this.f7436a, q6Var3.f7480d, q6Var3.f7479c);
                    return;
                }
            }
            q6 q6Var4 = this.f7437b;
            a0.a(q6Var4.f7477a, q6Var4.f7479c, null, true);
        } catch (Throwable th) {
            d9.a(th);
            q6 q6Var5 = this.f7437b;
            a0.a(q6Var5.f7477a, q6Var5.f7479c, null, true);
        }
    }
}
