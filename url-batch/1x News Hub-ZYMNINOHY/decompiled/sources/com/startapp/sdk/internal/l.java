package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.cache.CacheKey;
import com.startapp.sdk.adsbase.cache.DiskAdCacheManager$DiskCacheKey;
import com.startapp.sdk.adsbase.cache.DiskAdCacheManager$DiskCachedAd;
import com.startapp.sdk.adsbase.model.AdPreferences;
import java.io.File;
import java.util.Map;

/* loaded from: classes.dex */
public final class l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f4072a;

    public l(p pVar) {
        this.f4072a = pVar;
    }

    /* JADX WARN: Type inference failed for: r4v8, types: [com.startapp.sdk.adsbase.Ad, com.startapp.sdk.adsbase.f] */
    @Override // java.lang.Runnable
    public final void run() {
        try {
            Context context = this.f4072a.f;
            String str = File.separator;
            e7.a(context, "startapp_ads".concat(str).concat("keys"));
            e7.a(this.f4072a.f, "startapp_ads".concat(str).concat("interstitials"));
            for (Map.Entry entry : this.f4072a.f4276a.entrySet()) {
                CacheKey cacheKey = (CacheKey) entry.getKey();
                w2 w2Var = (w2) entry.getValue();
                Context context2 = this.f4072a.f;
                AdPreferences.Placement a3 = cacheKey.a();
                AdPreferences adPreferences = w2Var.f4658n;
                String replace = String.valueOf(cacheKey.hashCode()).replace('-', '_');
                int i3 = w2Var.f4665w;
                DiskAdCacheManager$DiskCacheKey diskAdCacheManager$DiskCacheKey = new DiskAdCacheManager$DiskCacheKey(a3, adPreferences);
                diskAdCacheManager$DiskCacheKey.a(i3);
                String str2 = File.separator;
                e7.a(context2, "startapp_ads".concat(str2).concat("keys"), replace, diskAdCacheManager$DiskCacheKey);
                e7.a(this.f4072a.f, "startapp_ads".concat(str2).concat("interstitials"), String.valueOf(cacheKey.hashCode()).replace('-', '_'), new DiskAdCacheManager$DiskCachedAd(w2Var.o));
            }
        } catch (Throwable th) {
            d9.a(th);
        }
    }
}
