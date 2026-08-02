package com.startapp.sdk.ads.banner;

import com.startapp.sdk.ads.banner.BannerRequest;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.internal.q1;

/* loaded from: classes.dex */
public final class c implements AdEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BannerRequest.Callback f3061a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BannerFormat f3062b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdPreferences f3063c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q1 f3064d;

    public c(BannerRequest.Callback callback, BannerFormat bannerFormat, AdPreferences adPreferences, q1 q1Var) {
        this.f3061a = callback;
        this.f3062b = bannerFormat;
        this.f3063c = adPreferences;
        this.f3064d = q1Var;
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public final void onFailedToReceiveAd(Ad ad) {
        this.f3061a.onFinished(null, String.valueOf(this.f3064d.getErrorMessage()));
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public final void onReceiveAd(Ad ad) {
        this.f3061a.onFinished(new b(this), null);
    }
}
