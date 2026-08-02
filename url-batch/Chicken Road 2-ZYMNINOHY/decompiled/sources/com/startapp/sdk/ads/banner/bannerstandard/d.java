package com.startapp.sdk.ads.banner.bannerstandard;

/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f6125a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BannerStandard f6126b;

    public d(BannerStandard bannerStandard, String str) {
        this.f6126b = bannerStandard;
        this.f6125a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6126b.reloadImpl(this.f6125a);
    }
}
