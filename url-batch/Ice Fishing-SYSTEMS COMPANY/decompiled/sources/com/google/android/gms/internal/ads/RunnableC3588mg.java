package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.mg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC3588mg implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f32702n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ TextureViewSurfaceTextureListenerC3696og f32703u;

    public /* synthetic */ RunnableC3588mg(TextureViewSurfaceTextureListenerC3696og textureViewSurfaceTextureListenerC3696og, int i, boolean z8) {
        this.f32702n = i;
        this.f32703u = textureViewSurfaceTextureListenerC3696og;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f32702n) {
            case 0:
                C3965tg c3965tg = this.f32703u.J;
                if (c3965tg != null) {
                    c3965tg.h();
                    break;
                }
                break;
            case 1:
                C3965tg c3965tg2 = this.f32703u.J;
                if (c3965tg2 != null) {
                    RunnableC3911sg runnableC3911sg = c3965tg2.f34440x;
                    runnableC3911sg.f34256v = false;
                    t2.D d2 = t2.G.f40858l;
                    d2.removeCallbacks(runnableC3911sg);
                    d2.postDelayed(runnableC3911sg, 250L);
                    d2.post(new RunnableC3857rg(c3965tg2, 0));
                    break;
                }
                break;
            case 2:
                TextureViewSurfaceTextureListenerC3696og textureViewSurfaceTextureListenerC3696og = this.f32703u;
                C3965tg c3965tg3 = textureViewSurfaceTextureListenerC3696og.J;
                if (c3965tg3 != null) {
                    c3965tg3.g();
                    textureViewSurfaceTextureListenerC3696og.J.i();
                    break;
                }
                break;
            case 3:
                TextureViewSurfaceTextureListenerC3696og textureViewSurfaceTextureListenerC3696og2 = this.f32703u;
                C3965tg c3965tg4 = textureViewSurfaceTextureListenerC3696og2.J;
                if (c3965tg4 != null) {
                    if (!textureViewSurfaceTextureListenerC3696og2.f33170K) {
                        c3965tg4.k();
                        textureViewSurfaceTextureListenerC3696og2.f33170K = true;
                    }
                    textureViewSurfaceTextureListenerC3696og2.J.f();
                    break;
                }
                break;
            default:
                C3965tg c3965tg5 = this.f32703u.J;
                if (c3965tg5 != null) {
                    c3965tg5.g();
                    break;
                }
                break;
        }
    }

    public RunnableC3588mg(TextureViewSurfaceTextureListenerC3696og textureViewSurfaceTextureListenerC3696og, int i) {
        this.f32702n = i;
        switch (i) {
            case 4:
                Objects.requireNonNull(textureViewSurfaceTextureListenerC3696og);
                this.f32703u = textureViewSurfaceTextureListenerC3696og;
                break;
            default:
                Objects.requireNonNull(textureViewSurfaceTextureListenerC3696og);
                this.f32703u = textureViewSurfaceTextureListenerC3696og;
                break;
        }
    }
}
