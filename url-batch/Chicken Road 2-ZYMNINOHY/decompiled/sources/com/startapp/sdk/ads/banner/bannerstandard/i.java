package com.startapp.sdk.ads.banner.bannerstandard;

import c3.C0297i;
import com.startapp.sdk.ads.external.config.AdUnitConfig;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.internal.ba;
import com.startapp.sdk.internal.f7;
import com.startapp.sdk.internal.g7;
import o3.InterfaceC1339l;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements InterfaceC1339l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6134a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdUnitConfig f6135b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6136c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MetaData f6137d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f6138e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f6139f;

    public /* synthetic */ i(Object obj, Object obj2, AdUnitConfig adUnitConfig, int i4, MetaData metaData, int i5) {
        this.f6134a = i5;
        this.f6138e = obj;
        this.f6139f = obj2;
        this.f6135b = adUnitConfig;
        this.f6136c = i4;
        this.f6137d = metaData;
    }

    @Override // o3.InterfaceC1339l
    public final Object invoke(Object obj) {
        C0297i lambda$loadExternalInline$0;
        C0297i a3;
        switch (this.f6134a) {
            case 0:
                lambda$loadExternalInline$0 = ((BannerStandard) this.f6138e).lambda$loadExternalInline$0((g7) this.f6139f, this.f6135b, this.f6136c, this.f6137d, (ba) obj);
                return lambda$loadExternalInline$0;
            default:
                a3 = ((StartAppAd) this.f6138e).a((AdEventListener) this.f6139f, this.f6135b, this.f6136c, this.f6137d, (f7) obj);
                return a3;
        }
    }
}
