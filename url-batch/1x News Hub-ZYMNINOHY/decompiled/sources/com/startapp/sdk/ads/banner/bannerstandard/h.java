package com.startapp.sdk.ads.banner.bannerstandard;

import com.startapp.sdk.internal.g7;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements g7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3052a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BannerStandard f3053b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f3054c;

    public /* synthetic */ h(BannerStandard bannerStandard, String str, int i3) {
        this.f3052a = i3;
        this.f3053b = bannerStandard;
        this.f3054c = str;
    }

    @Override // com.startapp.sdk.internal.g7
    public final Object a(Object obj) {
        Void lambda$reload$2;
        Void lambda$onFailedToReceiveBanner$3;
        Boolean bool = (Boolean) obj;
        switch (this.f3052a) {
            case 0:
                lambda$reload$2 = this.f3053b.lambda$reload$2(this.f3054c, bool);
                return lambda$reload$2;
            default:
                lambda$onFailedToReceiveBanner$3 = this.f3053b.lambda$onFailedToReceiveBanner$3(this.f3054c, bool);
                return lambda$onFailedToReceiveBanner$3;
        }
    }
}
