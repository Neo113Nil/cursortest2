package com.startapp.sdk.internal;

import android.content.Context;
import android.util.Log;
import com.startapp.sdk.ads.banner.BannerBase;
import com.startapp.sdk.ads.banner.BannerListener;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class g1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BannerListener f6966a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BannerBase f6967b;

    public g1(Context context, BannerListener bannerListener, BannerBase bannerBase) {
        this.f6966a = bannerListener;
        this.f6967b = bannerBase;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            String str = "Calling method onFailedToReceiveAd() of " + this.f6966a + " with parameter " + this.f6967b;
            WeakHashMap weakHashMap = si.f7575a;
            Log.println(3, "StartAppSDK", str);
            this.f6966a.onFailedToReceiveAd(this.f6967b);
        } catch (Throwable th) {
            String str2 = "Failed method onFailedToReceiveAd() of " + this.f6966a + " with parameter " + this.f6967b;
            WeakHashMap weakHashMap2 = si.f7575a;
            Log.println(5, "StartAppSDK", str2);
            si.a((Object) this.f6966a, th);
        }
    }
}
