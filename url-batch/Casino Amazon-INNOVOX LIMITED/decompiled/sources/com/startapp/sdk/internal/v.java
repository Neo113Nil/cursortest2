package com.startapp.sdk.internal;

import android.content.Context;
import android.util.Log;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdDisplayListener;
import java.util.WeakHashMap;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class v implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdDisplayListener f459a;
    public final /* synthetic */ Ad b;

    public v(Context context, AdDisplayListener adDisplayListener, Ad ad) {
        this.f459a = adDisplayListener;
        this.b = ad;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            String str = "Calling method adDisplayed() of " + this.f459a + " with parameter " + this.b;
            WeakHashMap weakHashMap = zh.f528a;
            Log.println(3, "StartAppSDK", str);
            this.f459a.adDisplayed(this.b);
        } catch (Throwable th) {
            String str2 = "Failed method adDisplayed() of " + this.f459a + " with parameter " + this.b;
            WeakHashMap weakHashMap2 = zh.f528a;
            Log.println(5, "StartAppSDK", str2);
            zh.a((Object) this.f459a, th);
        }
    }
}
