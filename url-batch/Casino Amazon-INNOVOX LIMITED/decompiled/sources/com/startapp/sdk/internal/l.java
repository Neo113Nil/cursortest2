package com.startapp.sdk.internal;

import android.content.Context;
import com.startapp.sdk.adsbase.cache.CacheKey;
import com.startapp.sdk.adsbase.cache.DiskAdCacheManager$DiskCacheKey;
import com.startapp.sdk.adsbase.cache.DiskAdCacheManager$DiskCachedAd;
import com.startapp.sdk.adsbase.model.AdPreferences;
import java.io.File;
import java.util.Map;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f311a;

    public l(p pVar) {
        this.f311a = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Context context = this.f311a.f;
            String str = File.separator;
            z6.a(context, "startapp_ads".concat(str).concat("keys"));
            z6.a(this.f311a.f, "startapp_ads".concat(str).concat("interstitials"));
            for (Map.Entry entry : this.f311a.f371a.entrySet()) {
                CacheKey cacheKey = (CacheKey) entry.getKey();
                q2 q2Var = (q2) entry.getValue();
                Context context2 = this.f311a.f;
                AdPreferences.Placement a2 = cacheKey.a();
                AdPreferences adPreferences = q2Var.n;
                String replace = String.valueOf(cacheKey.hashCode()).replace('-', '_');
                int i = q2Var.w;
                DiskAdCacheManager$DiskCacheKey diskAdCacheManager$DiskCacheKey = new DiskAdCacheManager$DiskCacheKey(a2, adPreferences);
                diskAdCacheManager$DiskCacheKey.a(i);
                String str2 = File.separator;
                z6.a(context2, "startapp_ads".concat(str2).concat("keys"), replace, diskAdCacheManager$DiskCacheKey);
                z6.a(this.f311a.f, "startapp_ads".concat(str2).concat("interstitials"), String.valueOf(cacheKey.hashCode()).replace('-', '_'), new DiskAdCacheManager$DiskCachedAd(q2Var.o));
            }
        } catch (Throwable th) {
            n8.a(th);
        }
    }
}
