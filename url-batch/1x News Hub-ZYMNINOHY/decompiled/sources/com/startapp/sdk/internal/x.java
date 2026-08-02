package com.startapp.sdk.internal;

import android.content.Context;
import android.util.Log;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdDisplayListener;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class x implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdDisplayListener f4703a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ad f4704b;

    public x(Context context, AdDisplayListener adDisplayListener, Ad ad) {
        this.f4703a = adDisplayListener;
        this.f4704b = ad;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            String str = "Calling method adNotDisplayed() of " + this.f4703a + " with parameter " + this.f4704b;
            WeakHashMap weakHashMap = si.f4438a;
            Log.println(3, "StartAppSDK", str);
            this.f4703a.adNotDisplayed(this.f4704b);
        } catch (Throwable th) {
            String str2 = "Failed method adNotDisplayed() of " + this.f4703a + " with parameter " + this.f4704b;
            WeakHashMap weakHashMap2 = si.f4438a;
            Log.println(5, "StartAppSDK", str2);
            si.a((Object) this.f4703a, th);
        }
    }
}
