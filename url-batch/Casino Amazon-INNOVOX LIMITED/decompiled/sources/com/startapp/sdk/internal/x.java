package com.startapp.sdk.internal;

import android.content.Context;
import android.util.Log;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdDisplayListener;
import java.util.WeakHashMap;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class x implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdDisplayListener f488a;
    public final /* synthetic */ Ad b;
    public final /* synthetic */ String c;

    public x(Context context, AdDisplayListener adDisplayListener, Ad ad, String str) {
        this.f488a = adDisplayListener;
        this.b = ad;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            String str = "Calling method adNotDisplayed() of " + this.f488a + " with parameter " + this.b + ", " + this.c;
            WeakHashMap weakHashMap = zh.f528a;
            Log.println(3, "StartAppSDK", str);
            this.f488a.adNotDisplayed(this.b);
        } catch (Throwable th) {
            String str2 = "Failed method adNotDisplayed() of " + this.f488a + " with parameter " + this.b;
            WeakHashMap weakHashMap2 = zh.f528a;
            Log.println(5, "StartAppSDK", str2);
            zh.a((Object) this.f488a, th);
        }
    }
}
