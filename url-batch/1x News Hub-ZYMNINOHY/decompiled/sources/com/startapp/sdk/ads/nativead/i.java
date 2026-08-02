package com.startapp.sdk.ads.nativead;

import com.startapp.sdk.adsbase.adlisteners.AdEventListener;

/* loaded from: classes.dex */
public final class i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public int f3130a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3131b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdEventListener f3132c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ StartAppNativeAd f3133d;

    public i(StartAppNativeAd startAppNativeAd, int i3, AdEventListener adEventListener) {
        this.f3133d = startAppNativeAd;
        this.f3131b = i3;
        this.f3132c = adEventListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.f3130a + 1;
        this.f3130a = i3;
        if (i3 == this.f3131b) {
            this.f3133d.onReceiveAd(this.f3132c);
        }
    }
}
