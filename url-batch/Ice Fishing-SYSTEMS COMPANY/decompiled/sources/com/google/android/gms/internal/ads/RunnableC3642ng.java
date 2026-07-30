package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ng, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC3642ng implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f32872n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f32873u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f32874v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AbstractC3804qg f32875w;

    public /* synthetic */ RunnableC3642ng(AbstractC3804qg abstractC3804qg, int i, int i4, int i9) {
        this.f32872n = i9;
        this.f32873u = i;
        this.f32874v = i4;
        this.f32875w = abstractC3804qg;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f32872n) {
            case 0:
                C3965tg c3965tg = ((TextureViewSurfaceTextureListenerC3696og) this.f32875w).J;
                if (c3965tg != null) {
                    c3965tg.j(this.f32873u, this.f32874v);
                    break;
                }
                break;
            default:
                C3965tg c3965tg2 = ((TextureViewSurfaceTextureListenerC2553Fg) this.f32875w).f24991z;
                if (c3965tg2 != null) {
                    c3965tg2.j(this.f32873u, this.f32874v);
                    break;
                }
                break;
        }
    }
}
