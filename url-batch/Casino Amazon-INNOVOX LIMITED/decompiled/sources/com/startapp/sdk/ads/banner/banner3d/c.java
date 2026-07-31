package com.startapp.sdk.ads.banner.banner3d;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Banner3D f78a;

    public c(Banner3D banner3D) {
        this.f78a = banner3D;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Banner3D banner3D = this.f78a;
        banner3D.loadBanners(banner3D.adsItems, false);
    }
}
