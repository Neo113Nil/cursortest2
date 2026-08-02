package com.startapp.sdk.ads.banner.banner3d;

/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Banner3D f6093a;

    public c(Banner3D banner3D) {
        this.f6093a = banner3D;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Banner3D banner3D = this.f6093a;
        banner3D.loadBanners(banner3D.adsItems, false);
    }
}
