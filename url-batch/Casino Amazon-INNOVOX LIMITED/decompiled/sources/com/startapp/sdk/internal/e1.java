package com.startapp.sdk.internal;

import android.content.Context;
import android.util.Log;
import com.startapp.sdk.ads.banner.BannerListener;
import com.startapp.sdk.ads.banner.bannerstandard.BannerStandard;
import java.util.WeakHashMap;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class e1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BannerListener f219a;
    public final /* synthetic */ BannerStandard b;

    public e1(Context context, BannerListener bannerListener, BannerStandard bannerStandard) {
        this.f219a = bannerListener;
        this.b = bannerStandard;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            String str = "Calling method onImpression() of " + this.f219a + " with parameter " + this.b;
            WeakHashMap weakHashMap = zh.f528a;
            Log.println(3, "StartAppSDK", str);
            this.f219a.onImpression(this.b);
        } catch (Throwable th) {
            String str2 = "Calling method onImpression() of " + this.f219a + " with parameter " + this.b;
            WeakHashMap weakHashMap2 = zh.f528a;
            Log.println(5, "StartAppSDK", str2);
            zh.a((Object) this.f219a, th);
        }
    }
}
