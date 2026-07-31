package com.startapp.sdk.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.cache.DiskAdCacheManager$DiskCachedAd;
import java.io.File;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class h6 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f259a;
    public final /* synthetic */ String b;
    public final /* synthetic */ l2 c;
    public final /* synthetic */ m2 d;

    public h6(Context context, String str, l2 l2Var, m2 m2Var) {
        this.f259a = context;
        this.b = str;
        this.c = l2Var;
        this.d = m2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            new Handler(Looper.getMainLooper()).post(new g6(this, (DiskAdCacheManager$DiskCachedAd) z6.a(this.f259a, "startapp_ads".concat(File.separator).concat("interstitials"), this.b)));
        } catch (Throwable th) {
            n8.a(th);
            a0.a(this.f259a, (AdEventListener) this.c, (Ad) null, true);
        }
    }
}
