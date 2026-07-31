package com.startapp.sdk.ads.nativead;

import com.startapp.sdk.adsbase.adlisteners.AdEventListener;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public int f101a;
    public final /* synthetic */ int b;
    public final /* synthetic */ AdEventListener c;
    public final /* synthetic */ StartAppNativeAd d;

    public i(StartAppNativeAd startAppNativeAd, int i, AdEventListener adEventListener) {
        this.d = startAppNativeAd;
        this.b = i;
        this.c = adEventListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f101a + 1;
        this.f101a = i;
        if (i == this.b) {
            this.d.onReceiveAd(this.c);
        }
    }
}
