package com.startapp.sdk.ads.banner.bannerstandard;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f83a;
    public final /* synthetic */ BannerStandard b;

    public c(BannerStandard bannerStandard, String str) {
        this.b = bannerStandard;
        this.f83a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.reloadImpl(this.f83a);
    }
}
