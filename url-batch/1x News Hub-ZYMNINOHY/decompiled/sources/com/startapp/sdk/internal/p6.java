package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.cache.DiskAdCacheManager$DiskCachedAd;

/* loaded from: classes.dex */
public final class p6 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DiskAdCacheManager$DiskCachedAd f4301a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q6 f4302b;

    public p6(q6 q6Var, DiskAdCacheManager$DiskCachedAd diskAdCacheManager$DiskCachedAd) {
        this.f4302b = q6Var;
        this.f4301a = diskAdCacheManager$DiskCachedAd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            DiskAdCacheManager$DiskCachedAd diskAdCacheManager$DiskCachedAd = this.f4301a;
            if (diskAdCacheManager$DiskCachedAd == null) {
                q6 q6Var = this.f4302b;
                a0.a(q6Var.f4341a, q6Var.f4343c, null, true);
                return;
            }
            if (diskAdCacheManager$DiskCachedAd.a() != null && this.f4301a.a().isReady()) {
                if (this.f4301a.a().hasAdCacheTtlPassed()) {
                    q6 q6Var2 = this.f4302b;
                    a0.a(q6Var2.f4341a, q6Var2.f4343c, null, true);
                    return;
                } else {
                    q6 q6Var3 = this.f4302b;
                    s6.a(q6Var3.f4341a, this.f4301a, q6Var3.f4344d, q6Var3.f4343c);
                    return;
                }
            }
            q6 q6Var4 = this.f4302b;
            a0.a(q6Var4.f4341a, q6Var4.f4343c, null, true);
        } catch (Throwable th) {
            d9.a(th);
            q6 q6Var5 = this.f4302b;
            a0.a(q6Var5.f4341a, q6Var5.f4343c, null, true);
        }
    }
}
