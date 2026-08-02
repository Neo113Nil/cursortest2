package com.startapp.sdk.internal;

import android.content.Context;
import android.util.Log;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdDisplayListener;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class w implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdDisplayListener f7785a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ad f7786b;

    public w(Context context, AdDisplayListener adDisplayListener, Ad ad) {
        this.f7785a = adDisplayListener;
        this.f7786b = ad;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            String str = "Calling method adClicked() of " + this.f7785a + " with parameter " + this.f7786b;
            WeakHashMap weakHashMap = si.f7575a;
            Log.println(3, "StartAppSDK", str);
            this.f7785a.adClicked(this.f7786b);
        } catch (Throwable th) {
            String str2 = "Failed method adClicked() of " + this.f7785a + " with parameter " + this.f7786b;
            WeakHashMap weakHashMap2 = si.f7575a;
            Log.println(5, "StartAppSDK", str2);
            si.a((Object) this.f7785a, th);
        }
    }
}
