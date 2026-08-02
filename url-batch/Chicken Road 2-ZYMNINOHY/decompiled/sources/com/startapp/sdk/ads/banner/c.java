package com.startapp.sdk.ads.banner;

import com.startapp.sdk.ads.banner.BannerRequest;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.internal.q1;

/* loaded from: classes.dex */
public final class c implements AdEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BannerRequest.Callback f6141a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BannerFormat f6142b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdPreferences f6143c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q1 f6144d;

    public c(BannerRequest.Callback callback, BannerFormat bannerFormat, AdPreferences adPreferences, q1 q1Var) {
        this.f6141a = callback;
        this.f6142b = bannerFormat;
        this.f6143c = adPreferences;
        this.f6144d = q1Var;
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public final void onFailedToReceiveAd(Ad ad) {
        this.f6141a.onFinished(null, String.valueOf(this.f6144d.getErrorMessage()));
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public final void onReceiveAd(Ad ad) {
        this.f6141a.onFinished(new b(this), null);
    }
}
