package com.startapp.sdk.ads.banner;

import com.startapp.sdk.ads.banner.BannerRequest;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements BannerRequest.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3075a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BannerRequest f3076b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BannerRequest.Callback f3077c;

    public /* synthetic */ e(BannerRequest bannerRequest, BannerRequest.Callback callback, int i3) {
        this.f3075a = i3;
        this.f3076b = bannerRequest;
        this.f3077c = callback;
    }

    @Override // com.startapp.sdk.ads.banner.BannerRequest.Callback
    public final void onFinished(BannerCreator bannerCreator, String str) {
        switch (this.f3075a) {
            case 0:
                this.f3076b.lambda$loadInnerAd$2(this.f3077c, bannerCreator, str);
                break;
            default:
                this.f3076b.lambda$load$0(this.f3077c, bannerCreator, str);
                break;
        }
    }
}
