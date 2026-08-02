package com.startapp.sdk.ads.banner.bannerstandard;

import b2.C0195i;
import com.startapp.sdk.ads.external.config.AdUnitConfig;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.internal.ba;
import com.startapp.sdk.internal.f7;
import com.startapp.sdk.internal.g7;
import l2.l;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3055a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdUnitConfig f3056b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3057c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MetaData f3058d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3059e;
    public final /* synthetic */ Object f;

    public /* synthetic */ i(Object obj, Object obj2, AdUnitConfig adUnitConfig, int i3, MetaData metaData, int i4) {
        this.f3055a = i4;
        this.f3059e = obj;
        this.f = obj2;
        this.f3056b = adUnitConfig;
        this.f3057c = i3;
        this.f3058d = metaData;
    }

    @Override // l2.l
    public final Object invoke(Object obj) {
        C0195i lambda$loadExternalInline$0;
        C0195i a3;
        switch (this.f3055a) {
            case 0:
                BannerStandard bannerStandard = (BannerStandard) this.f3059e;
                AdUnitConfig adUnitConfig = this.f3056b;
                int i3 = this.f3057c;
                lambda$loadExternalInline$0 = bannerStandard.lambda$loadExternalInline$0((g7) this.f, adUnitConfig, i3, this.f3058d, (ba) obj);
                return lambda$loadExternalInline$0;
            default:
                StartAppAd startAppAd = (StartAppAd) this.f3059e;
                AdUnitConfig adUnitConfig2 = this.f3056b;
                int i4 = this.f3057c;
                a3 = startAppAd.a((AdEventListener) this.f, adUnitConfig2, i4, this.f3058d, (f7) obj);
                return a3;
        }
    }
}
