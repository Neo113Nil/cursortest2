package com.startapp.sdk.internal;

import android.os.Handler;
import android.os.Looper;
import android.webkit.JavascriptInterface;
import com.startapp.sdk.ads.interstitials.OverlayActivity;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;

/* loaded from: classes.dex */
public final class lj extends cb {

    /* renamed from: h, reason: collision with root package name */
    public final sj f7244h;

    /* renamed from: i, reason: collision with root package name */
    public final com.startapp.sdk.ads.video.a f7245i;

    /* renamed from: j, reason: collision with root package name */
    public final rj f7246j;

    public lj(OverlayActivity overlayActivity, la laVar, la laVar2, sj sjVar, com.startapp.sdk.ads.video.a aVar, rj rjVar, TrackingParams trackingParams, boolean z) {
        super(overlayActivity, laVar, trackingParams);
        this.f6759d = laVar2;
        this.f7244h = sjVar;
        this.f7245i = aVar;
        this.f7246j = rjVar;
        this.f6757b = z;
    }

    @JavascriptInterface
    public void replayVideo() {
        new Handler(Looper.getMainLooper()).post(this.f7244h);
    }

    @JavascriptInterface
    public void skipVideo() {
        new Handler(Looper.getMainLooper()).post(this.f7245i);
    }

    @JavascriptInterface
    public void toggleSound() {
        new Handler(Looper.getMainLooper()).post(this.f7246j);
    }
}
