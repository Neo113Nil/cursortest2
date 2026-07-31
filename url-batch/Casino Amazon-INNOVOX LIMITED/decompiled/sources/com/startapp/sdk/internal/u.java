package com.startapp.sdk.internal;

import android.content.Context;
import android.util.Log;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdDisplayListener;
import java.util.WeakHashMap;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class u implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdDisplayListener f445a;
    public final /* synthetic */ Ad b;

    public u(Context context, AdDisplayListener adDisplayListener, Ad ad) {
        this.f445a = adDisplayListener;
        this.b = ad;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            String str = "Calling method adHidden() of " + this.f445a + " with parameter " + this.b;
            WeakHashMap weakHashMap = zh.f528a;
            Log.println(3, "StartAppSDK", str);
            this.f445a.adHidden(this.b);
        } catch (Throwable th) {
            String str2 = "Failed method adHidden() of " + this.f445a + " with parameter " + this.b;
            WeakHashMap weakHashMap2 = zh.f528a;
            Log.println(5, "StartAppSDK", str2);
            zh.a((Object) this.f445a, th);
        }
    }
}
