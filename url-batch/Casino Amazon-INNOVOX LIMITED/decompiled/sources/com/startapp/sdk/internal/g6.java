package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.cache.DiskAdCacheManager$DiskCachedAd;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class g6 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DiskAdCacheManager$DiskCachedAd f247a;
    public final /* synthetic */ h6 b;

    public g6(h6 h6Var, DiskAdCacheManager$DiskCachedAd diskAdCacheManager$DiskCachedAd) {
        this.b = h6Var;
        this.f247a = diskAdCacheManager$DiskCachedAd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            DiskAdCacheManager$DiskCachedAd diskAdCacheManager$DiskCachedAd = this.f247a;
            if (diskAdCacheManager$DiskCachedAd == null) {
                h6 h6Var = this.b;
                a0.a(h6Var.f259a, (AdEventListener) h6Var.c, (Ad) null, true);
                return;
            }
            if (diskAdCacheManager$DiskCachedAd.a() != null && this.f247a.a().isReady()) {
                boolean hasAdCacheTtlPassed = this.f247a.a().hasAdCacheTtlPassed();
                h6 h6Var2 = this.b;
                Context context = h6Var2.f259a;
                if (hasAdCacheTtlPassed) {
                    a0.a(context, (AdEventListener) h6Var2.c, (Ad) null, true);
                    return;
                } else {
                    j6.a(context, this.f247a, h6Var2.d, h6Var2.c);
                    return;
                }
            }
            h6 h6Var3 = this.b;
            a0.a(h6Var3.f259a, (AdEventListener) h6Var3.c, (Ad) null, true);
        } catch (Throwable th) {
            n8.a(th);
            h6 h6Var4 = this.b;
            a0.a(h6Var4.f259a, (AdEventListener) h6Var4.c, (Ad) null, true);
        }
    }
}
