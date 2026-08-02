package com.startapp.sdk.internal;

import android.content.Context;
import android.util.Log;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdDisplayListener;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class v implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdDisplayListener f7734a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ad f7735b;

    public v(Context context, AdDisplayListener adDisplayListener, Ad ad) {
        this.f7734a = adDisplayListener;
        this.f7735b = ad;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            String str = "Calling method adDisplayed() of " + this.f7734a + " with parameter " + this.f7735b;
            WeakHashMap weakHashMap = si.f7575a;
            Log.println(3, "StartAppSDK", str);
            this.f7734a.adDisplayed(this.f7735b);
        } catch (Throwable th) {
            String str2 = "Failed method adDisplayed() of " + this.f7734a + " with parameter " + this.f7735b;
            WeakHashMap weakHashMap2 = si.f7575a;
            Log.println(5, "StartAppSDK", str2);
            si.a((Object) this.f7734a, th);
        }
    }
}
