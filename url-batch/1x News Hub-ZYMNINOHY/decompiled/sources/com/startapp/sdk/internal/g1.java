package com.startapp.sdk.internal;

import android.content.Context;
import android.util.Log;
import com.startapp.sdk.ads.banner.BannerBase;
import com.startapp.sdk.ads.banner.BannerListener;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class g1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BannerListener f3847a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BannerBase f3848b;

    public g1(Context context, BannerListener bannerListener, BannerBase bannerBase) {
        this.f3847a = bannerListener;
        this.f3848b = bannerBase;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            String str = "Calling method onFailedToReceiveAd() of " + this.f3847a + " with parameter " + this.f3848b;
            WeakHashMap weakHashMap = si.f4438a;
            Log.println(3, "StartAppSDK", str);
            this.f3847a.onFailedToReceiveAd(this.f3848b);
        } catch (Throwable th) {
            String str2 = "Failed method onFailedToReceiveAd() of " + this.f3847a + " with parameter " + this.f3848b;
            WeakHashMap weakHashMap2 = si.f4438a;
            Log.println(5, "StartAppSDK", str2);
            si.a((Object) this.f3847a, th);
        }
    }
}
