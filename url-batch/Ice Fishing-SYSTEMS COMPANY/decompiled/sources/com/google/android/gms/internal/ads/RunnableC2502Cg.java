package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.Cg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2502Cg implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f24240n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ TextureViewSurfaceTextureListenerC2553Fg f24241u;

    public /* synthetic */ RunnableC2502Cg(TextureViewSurfaceTextureListenerC2553Fg textureViewSurfaceTextureListenerC2553Fg, int i) {
        this.f24240n = i;
        this.f24241u = textureViewSurfaceTextureListenerC2553Fg;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TextureViewSurfaceTextureListenerC2553Fg textureViewSurfaceTextureListenerC2553Fg = this.f24241u;
        switch (this.f24240n) {
            case 0:
                C3965tg c3965tg = textureViewSurfaceTextureListenerC2553Fg.f24991z;
                if (c3965tg != null) {
                    c3965tg.e();
                    break;
                }
                break;
            case 1:
                C3965tg c3965tg2 = textureViewSurfaceTextureListenerC2553Fg.f24991z;
                if (c3965tg2 != null) {
                    c3965tg2.k();
                    break;
                }
                break;
            case 2:
                C3965tg c3965tg3 = textureViewSurfaceTextureListenerC2553Fg.f24991z;
                if (c3965tg3 != null) {
                    c3965tg3.h();
                    break;
                }
                break;
            case 3:
                C3965tg c3965tg4 = textureViewSurfaceTextureListenerC2553Fg.f24991z;
                if (c3965tg4 != null) {
                    c3965tg4.f();
                    break;
                }
                break;
            case 4:
                C3965tg c3965tg5 = textureViewSurfaceTextureListenerC2553Fg.f24991z;
                if (c3965tg5 != null) {
                    c3965tg5.g();
                    break;
                }
                break;
            case 5:
                C3965tg c3965tg6 = textureViewSurfaceTextureListenerC2553Fg.f24991z;
                if (c3965tg6 != null) {
                    RunnableC3911sg runnableC3911sg = c3965tg6.f34440x;
                    runnableC3911sg.f34256v = false;
                    t2.D d2 = t2.G.f40858l;
                    d2.removeCallbacks(runnableC3911sg);
                    d2.postDelayed(runnableC3911sg, 250L);
                    d2.post(new RunnableC3857rg(c3965tg6, 0));
                    break;
                }
                break;
            case 6:
                C3965tg c3965tg7 = textureViewSurfaceTextureListenerC2553Fg.f24991z;
                if (c3965tg7 != null) {
                    c3965tg7.i();
                    break;
                }
                break;
            default:
                C2485Bg c2485Bg = textureViewSurfaceTextureListenerC2553Fg.f33738u;
                float f6 = c2485Bg.f24055c ? c2485Bg.f24057e ? 0.0f : c2485Bg.f24058f : 0.0f;
                C3267gh c3267gh = textureViewSurfaceTextureListenerC2553Fg.f24976B;
                if (c3267gh == null) {
                    int i = t2.C.f40822b;
                    u2.i.f("Trying to set volume before player is initialized.");
                    break;
                } else {
                    try {
                        IO io = c3267gh.f31054z;
                        if (io != null) {
                            io.f25557w.b();
                            io.f25556v.v1(f6);
                            break;
                        }
                    } catch (IOException e6) {
                        int i4 = t2.C.f40822b;
                        u2.i.g("", e6);
                        return;
                    }
                }
                break;
        }
    }
}
