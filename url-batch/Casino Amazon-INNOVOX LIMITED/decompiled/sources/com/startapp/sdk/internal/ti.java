package com.startapp.sdk.internal;

import android.os.Handler;
import android.os.Looper;
import android.webkit.JavascriptInterface;
import com.startapp.sdk.ads.interstitials.OverlayActivity;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class ti extends ja {
    public final yi h;
    public final xi i;
    public final wi j;

    public ti(OverlayActivity overlayActivity, s9 s9Var, s9 s9Var2, yi yiVar, xi xiVar, wi wiVar, TrackingParams trackingParams, boolean z) {
        super(overlayActivity, s9Var, trackingParams);
        this.d = s9Var2;
        this.h = yiVar;
        this.i = xiVar;
        this.j = wiVar;
        this.b = z;
    }

    @JavascriptInterface
    public void replayVideo() {
        new Handler(Looper.getMainLooper()).post(this.h);
    }

    @JavascriptInterface
    public void skipVideo() {
        new Handler(Looper.getMainLooper()).post(this.i);
    }

    @JavascriptInterface
    public void toggleSound() {
        new Handler(Looper.getMainLooper()).post(this.j);
    }
}
