package com.startapp.sdk.internal;

import android.content.Context;
import android.util.Log;
import com.startapp.sdk.ads.banner.BannerBase;
import com.startapp.sdk.ads.banner.BannerListener;
import java.util.WeakHashMap;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class d1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BannerListener f208a;
    public final /* synthetic */ BannerBase b;
    public final /* synthetic */ String c;

    public d1(Context context, BannerListener bannerListener, BannerBase bannerBase, String str) {
        this.f208a = bannerListener;
        this.b = bannerBase;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            String str = "Calling method onFailedToReceiveAd() of " + this.f208a + " with parameter " + this.b + ", " + this.c;
            WeakHashMap weakHashMap = zh.f528a;
            Log.println(3, "StartAppSDK", str);
            this.f208a.onFailedToReceiveAd(this.b);
        } catch (Throwable th) {
            String str2 = "Failed method onFailedToReceiveAd() of " + this.f208a + " with parameter " + this.b;
            WeakHashMap weakHashMap2 = zh.f528a;
            Log.println(5, "StartAppSDK", str2);
            zh.a((Object) this.f208a, th);
        }
    }
}
