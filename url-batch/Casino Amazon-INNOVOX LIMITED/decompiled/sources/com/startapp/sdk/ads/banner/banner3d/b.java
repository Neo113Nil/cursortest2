package com.startapp.sdk.ads.banner.banner3d;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Banner3D f77a;

    public b(Banner3D banner3D) {
        this.f77a = banner3D;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f77a.rotationEnabled = true;
    }
}
