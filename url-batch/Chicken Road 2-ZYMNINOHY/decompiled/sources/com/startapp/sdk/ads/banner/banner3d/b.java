package com.startapp.sdk.ads.banner.banner3d;

/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Banner3D f6092a;

    public b(Banner3D banner3D) {
        this.f6092a = banner3D;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6092a.rotationEnabled = true;
    }
}
