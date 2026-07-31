package com.startapp.sdk.internal;

import android.content.Context;
import android.util.Log;
import android.view.View;
import com.startapp.sdk.ads.banner.BannerBase;
import com.startapp.sdk.ads.banner.BannerListener;
import java.util.WeakHashMap;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public abstract class g1 {
    public static void a(Context context, BannerListener bannerListener, View view) {
        try {
            WeakHashMap weakHashMap = zh.f528a;
            Log.println(3, "StartAppSDK", "Calling method onReceiveAd() of " + bannerListener + " with parameter " + view);
            bannerListener.onReceiveAd(view);
        } catch (Throwable th) {
            WeakHashMap weakHashMap2 = zh.f528a;
            Log.println(5, "StartAppSDK", "Failed method onReceiveAd() of " + bannerListener + " with parameter " + view);
            zh.a((Object) bannerListener, th);
        }
    }

    public static void b(final Context context, final BannerListener bannerListener, final BannerBase bannerBase, String str) {
        u6.a("onLoad", bannerListener != null, str, null);
        e0.a(bannerListener != null ? new Runnable() { // from class: com.startapp.sdk.internal.g1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                g1.a(context, bannerListener, bannerBase);
            }
        } : null);
    }

    public static void a(Context context, BannerListener bannerListener, BannerBase bannerBase, String str) {
        u6.a("onLoadFailed", bannerListener != null, str, null);
        e0.a(bannerListener != null ? new d1(context, bannerListener, bannerBase, bannerBase.getErrorMessage()) : null);
    }
}
