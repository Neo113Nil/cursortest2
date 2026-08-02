package com.startapp.sdk.internal;

import android.content.Context;
import android.util.Log;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class z implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdEventListener f7984a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ad f7985b;

    public z(Context context, AdEventListener adEventListener, Ad ad) {
        this.f7984a = adEventListener;
        this.f7985b = ad;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            String str = "Calling method onReceiveAd() of " + this.f7984a + " with parameter " + this.f7985b;
            WeakHashMap weakHashMap = si.f7575a;
            Log.println(3, "StartAppSDK", str);
            this.f7984a.onReceiveAd(this.f7985b);
        } catch (Throwable th) {
            String str2 = "Failed method onReceiveAd() of " + this.f7984a + " with parameter " + this.f7985b;
            WeakHashMap weakHashMap2 = si.f7575a;
            Log.println(5, "StartAppSDK", str2);
            si.a((Object) this.f7984a, th);
        }
    }
}
