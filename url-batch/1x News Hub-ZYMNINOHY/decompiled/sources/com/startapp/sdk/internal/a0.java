package com.startapp.sdk.internal;

import android.content.Context;
import android.util.Log;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class a0 {
    public static void a(Context context, AdEventListener adEventListener, Ad ad, boolean z) {
        if (!z) {
            v6.a("onLoadFailed", adEventListener != null, null, ad != null ? ad.getErrorMessage() : null);
        }
        g0.a(adEventListener != null ? new A0.a(context, adEventListener, ad, 3) : null);
    }

    public static void b(Context context, AdEventListener adEventListener, Ad ad, boolean z) {
        if (!z) {
            v6.a("onLoad", adEventListener != null, null, null);
        }
        g0.a(adEventListener != null ? new z(context, adEventListener, ad) : null);
    }

    public static void a(Context context, AdEventListener adEventListener, Ad ad) {
        try {
            WeakHashMap weakHashMap = si.f4438a;
            Log.println(3, "StartAppSDK", "Calling method onFailedToReceiveAd() of " + adEventListener + " with parameter " + ad);
            adEventListener.onFailedToReceiveAd(ad);
        } catch (Throwable th) {
            WeakHashMap weakHashMap2 = si.f4438a;
            Log.println(5, "StartAppSDK", "Calling method onFailedToReceiveAd() of " + adEventListener + " with parameter " + ad);
            si.a((Object) adEventListener, th);
        }
    }
}
