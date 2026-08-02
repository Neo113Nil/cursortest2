package com.startapp.sdk.internal;

import android.os.Handler;
import android.os.Looper;
import android.webkit.JavascriptInterface;
import com.startapp.sdk.ads.interstitials.OverlayActivity;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;

/* loaded from: classes.dex */
public final class lj extends cb {

    /* renamed from: h, reason: collision with root package name */
    public final sj f4116h;

    /* renamed from: i, reason: collision with root package name */
    public final com.startapp.sdk.ads.video.a f4117i;

    /* renamed from: j, reason: collision with root package name */
    public final rj f4118j;

    public lj(OverlayActivity overlayActivity, la laVar, la laVar2, sj sjVar, com.startapp.sdk.ads.video.a aVar, rj rjVar, TrackingParams trackingParams, boolean z) {
        super(overlayActivity, laVar, trackingParams);
        this.f3649d = laVar2;
        this.f4116h = sjVar;
        this.f4117i = aVar;
        this.f4118j = rjVar;
        this.f3647b = z;
    }

    @JavascriptInterface
    public void replayVideo() {
        new Handler(Looper.getMainLooper()).post(this.f4116h);
    }

    @JavascriptInterface
    public void skipVideo() {
        new Handler(Looper.getMainLooper()).post(this.f4117i);
    }

    @JavascriptInterface
    public void toggleSound() {
        new Handler(Looper.getMainLooper()).post(this.f4118j);
    }
}
