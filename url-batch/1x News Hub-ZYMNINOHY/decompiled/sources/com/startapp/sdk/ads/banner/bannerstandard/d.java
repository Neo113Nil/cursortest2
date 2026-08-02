package com.startapp.sdk.ads.banner.bannerstandard;

/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f3046a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BannerStandard f3047b;

    public d(BannerStandard bannerStandard, String str) {
        this.f3047b = bannerStandard;
        this.f3046a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f3047b.reloadImpl(this.f3046a);
    }
}
