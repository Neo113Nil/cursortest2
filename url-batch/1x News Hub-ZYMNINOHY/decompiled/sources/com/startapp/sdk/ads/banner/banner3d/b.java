package com.startapp.sdk.ads.banner.banner3d;

/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Banner3D f3015a;

    public b(Banner3D banner3D) {
        this.f3015a = banner3D;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f3015a.rotationEnabled = true;
    }
}
