package com.startapp.sdk.internal;

import android.content.Context;
import android.util.Log;
import android.view.View;
import com.startapp.sdk.ads.banner.BannerBase;
import com.startapp.sdk.ads.banner.BannerListener;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class j1 {
    public static void a(Context context, BannerListener bannerListener, View view) {
        try {
            WeakHashMap weakHashMap = si.f7575a;
            Log.println(3, "StartAppSDK", "Calling method onReceiveAd() of " + bannerListener + " with parameter " + view);
            bannerListener.onReceiveAd(view);
        } catch (Throwable th) {
            WeakHashMap weakHashMap2 = si.f7575a;
            Log.println(5, "StartAppSDK", "Failed method onReceiveAd() of " + bannerListener + " with parameter " + view);
            si.a((Object) bannerListener, th);
        }
    }

    public static void b(Context context, BannerListener bannerListener, View view, String str) {
        v6.a("onLoad", bannerListener != null, str, null);
        g0.a(bannerListener != null ? new Q1.a(context, bannerListener, view, 8) : null);
    }

    public static void a(Context context, BannerListener bannerListener, BannerBase bannerBase, String str) {
        v6.a("onLoadFailed", bannerListener != null, str, null);
        g0.a(bannerListener != null ? new g1(context, bannerListener, bannerBase) : null);
    }

    public static void a(Context context, BannerListener bannerListener, View view, String str) {
        v6.a("onClicked", bannerListener != null, str, null);
        g0.a(bannerListener != null ? new i1(context, bannerListener, view) : null);
    }
}
