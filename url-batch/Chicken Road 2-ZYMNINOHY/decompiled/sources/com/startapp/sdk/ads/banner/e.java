package com.startapp.sdk.ads.banner;

import com.startapp.sdk.ads.banner.BannerRequest;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements BannerRequest.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6156a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BannerRequest f6157b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BannerRequest.Callback f6158c;

    public /* synthetic */ e(BannerRequest bannerRequest, BannerRequest.Callback callback, int i4) {
        this.f6156a = i4;
        this.f6157b = bannerRequest;
        this.f6158c = callback;
    }

    @Override // com.startapp.sdk.ads.banner.BannerRequest.Callback
    public final void onFinished(BannerCreator bannerCreator, String str) {
        switch (this.f6156a) {
            case 0:
                this.f6157b.lambda$loadInnerAd$2(this.f6158c, bannerCreator, str);
                break;
            default:
                this.f6157b.lambda$load$0(this.f6158c, bannerCreator, str);
                break;
        }
    }
}
