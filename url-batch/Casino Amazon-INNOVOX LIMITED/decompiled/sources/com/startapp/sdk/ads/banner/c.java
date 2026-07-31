package com.startapp.sdk.ads.banner;

import com.startapp.sdk.ads.banner.BannerRequest;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.internal.l1;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class c implements AdEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BannerRequest.Callback f86a;
    public final /* synthetic */ BannerFormat b;
    public final /* synthetic */ AdPreferences c;
    public final /* synthetic */ l1 d;

    public c(BannerRequest.Callback callback, BannerFormat bannerFormat, AdPreferences adPreferences, l1 l1Var) {
        this.f86a = callback;
        this.b = bannerFormat;
        this.c = adPreferences;
        this.d = l1Var;
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public final void onFailedToReceiveAd(Ad ad) {
        this.f86a.onFinished(null, String.valueOf(this.d.getErrorMessage()));
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public final void onReceiveAd(Ad ad) {
        this.f86a.onFinished(new b(this), null);
    }
}
