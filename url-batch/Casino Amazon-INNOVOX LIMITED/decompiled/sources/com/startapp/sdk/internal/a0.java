package com.startapp.sdk.internal;

import android.content.Context;
import android.util.Log;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import java.util.WeakHashMap;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public abstract class a0 {
    public static void a(final Context context, final AdEventListener adEventListener, final Ad ad, boolean z) {
        final String errorMessage = ad != null ? ad.getErrorMessage() : null;
        if (!z) {
            u6.a("onLoadFailed", adEventListener != null, null, errorMessage);
        }
        e0.a(adEventListener != null ? new Runnable() { // from class: com.startapp.sdk.internal.a0$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                a0.a(context, adEventListener, ad, errorMessage);
            }
        } : null);
    }

    public static void b(Context context, AdEventListener adEventListener, Ad ad, boolean z) {
        if (!z) {
            u6.a("onLoad", adEventListener != null, null, null);
        }
        e0.a(adEventListener != null ? new z(context, adEventListener, ad) : null);
    }

    public static void a(Context context, AdEventListener adEventListener, Ad ad, String str) {
        try {
            WeakHashMap weakHashMap = zh.f528a;
            Log.println(3, "StartAppSDK", "Calling method onFailedToReceiveAd() of " + adEventListener + " with parameter " + ad + ", " + str);
            adEventListener.onFailedToReceiveAd(ad);
        } catch (Throwable th) {
            WeakHashMap weakHashMap2 = zh.f528a;
            Log.println(5, "StartAppSDK", "Calling method onFailedToReceiveAd() of " + adEventListener + " with parameter " + ad);
            zh.a((Object) adEventListener, th);
        }
    }
}
