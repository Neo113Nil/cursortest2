package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Dg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2519Dg implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f24457n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ TextureViewSurfaceTextureListenerC2553Fg f24458u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f24459v;

    public /* synthetic */ RunnableC2519Dg(TextureViewSurfaceTextureListenerC2553Fg textureViewSurfaceTextureListenerC2553Fg, String str, int i) {
        this.f24457n = i;
        this.f24458u = textureViewSurfaceTextureListenerC2553Fg;
        this.f24459v = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f24457n) {
            case 0:
                C3965tg c3965tg = this.f24458u.f24991z;
                if (c3965tg != null) {
                    c3965tg.c(com.anythink.expressad.foundation.d.g.i, "what", "ExoPlayerAdapter exception", "extra", this.f24459v);
                    break;
                }
                break;
            default:
                C3965tg c3965tg2 = this.f24458u.f24991z;
                if (c3965tg2 != null) {
                    c3965tg2.c("error", "what", "ExoPlayerAdapter error", "extra", this.f24459v);
                    break;
                }
                break;
        }
    }
}
