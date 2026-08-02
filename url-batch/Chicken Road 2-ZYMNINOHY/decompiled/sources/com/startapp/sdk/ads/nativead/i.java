package com.startapp.sdk.ads.nativead;

import com.startapp.sdk.adsbase.adlisteners.AdEventListener;

/* loaded from: classes.dex */
public final class i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public int f6213a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6214b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdEventListener f6215c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ StartAppNativeAd f6216d;

    public i(StartAppNativeAd startAppNativeAd, int i4, AdEventListener adEventListener) {
        this.f6216d = startAppNativeAd;
        this.f6214b = i4;
        this.f6215c = adEventListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i4 = this.f6213a + 1;
        this.f6213a = i4;
        if (i4 == this.f6214b) {
            this.f6216d.onReceiveAd(this.f6215c);
        }
    }
}
