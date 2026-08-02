package com.startapp.sdk.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.startapp.sdk.adsbase.cache.DiskAdCacheManager$DiskCachedAd;
import java.io.File;

/* loaded from: classes.dex */
public final class q6 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f7477a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f7478b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r2 f7479c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s2 f7480d;

    public q6(Context context, String str, r2 r2Var, s2 s2Var) {
        this.f7477a = context;
        this.f7478b = str;
        this.f7479c = r2Var;
        this.f7480d = s2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            new Handler(Looper.getMainLooper()).post(new p6(this, (DiskAdCacheManager$DiskCachedAd) e7.a(this.f7477a, "startapp_ads".concat(File.separator).concat("interstitials"), this.f7478b)));
        } catch (Throwable th) {
            d9.a(th);
            a0.a(this.f7477a, this.f7479c, null, true);
        }
    }
}
