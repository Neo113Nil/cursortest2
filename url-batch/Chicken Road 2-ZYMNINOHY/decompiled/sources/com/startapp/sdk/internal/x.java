package com.startapp.sdk.internal;

import android.content.Context;
import android.util.Log;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdDisplayListener;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class x implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdDisplayListener f7849a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ad f7850b;

    public x(Context context, AdDisplayListener adDisplayListener, Ad ad) {
        this.f7849a = adDisplayListener;
        this.f7850b = ad;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            String str = "Calling method adNotDisplayed() of " + this.f7849a + " with parameter " + this.f7850b;
            WeakHashMap weakHashMap = si.f7575a;
            Log.println(3, "StartAppSDK", str);
            this.f7849a.adNotDisplayed(this.f7850b);
        } catch (Throwable th) {
            String str2 = "Failed method adNotDisplayed() of " + this.f7849a + " with parameter " + this.f7850b;
            WeakHashMap weakHashMap2 = si.f7575a;
            Log.println(5, "StartAppSDK", str2);
            si.a((Object) this.f7849a, th);
        }
    }
}
