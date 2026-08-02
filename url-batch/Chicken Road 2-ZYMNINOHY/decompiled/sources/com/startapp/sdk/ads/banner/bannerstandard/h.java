package com.startapp.sdk.ads.banner.bannerstandard;

import com.startapp.sdk.internal.g7;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements g7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6131a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BannerStandard f6132b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f6133c;

    public /* synthetic */ h(BannerStandard bannerStandard, String str, int i4) {
        this.f6131a = i4;
        this.f6132b = bannerStandard;
        this.f6133c = str;
    }

    @Override // com.startapp.sdk.internal.g7
    public final Object a(Object obj) {
        Void lambda$reload$2;
        Void lambda$onFailedToReceiveBanner$3;
        switch (this.f6131a) {
            case 0:
                lambda$reload$2 = this.f6132b.lambda$reload$2(this.f6133c, (Boolean) obj);
                return lambda$reload$2;
            default:
                lambda$onFailedToReceiveBanner$3 = this.f6132b.lambda$onFailedToReceiveBanner$3(this.f6133c, (Boolean) obj);
                return lambda$onFailedToReceiveBanner$3;
        }
    }
}
