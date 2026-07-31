package com.startapp.sdk.internal;

import android.content.Context;
import android.util.Log;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import java.util.WeakHashMap;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class z implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdEventListener f515a;
    public final /* synthetic */ Ad b;

    public z(Context context, AdEventListener adEventListener, Ad ad) {
        this.f515a = adEventListener;
        this.b = ad;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            String str = "Calling method onReceiveAd() of " + this.f515a + " with parameter " + this.b;
            WeakHashMap weakHashMap = zh.f528a;
            Log.println(3, "StartAppSDK", str);
            this.f515a.onReceiveAd(this.b);
        } catch (Throwable th) {
            String str2 = "Failed method onReceiveAd() of " + this.f515a + " with parameter " + this.b;
            WeakHashMap weakHashMap2 = zh.f528a;
            Log.println(5, "StartAppSDK", str2);
            zh.a((Object) this.f515a, th);
        }
    }
}
