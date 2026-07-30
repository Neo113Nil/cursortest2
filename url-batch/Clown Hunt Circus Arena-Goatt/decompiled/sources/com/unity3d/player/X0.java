package com.unity3d.player;

/* loaded from: classes.dex */
public final class X0 implements Runnable {
    public final /* synthetic */ Y0 a;

    public X0(Y0 y0) {
        this.a = y0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d1 d1Var = this.a.a.h;
        VideoPlayer videoPlayer = d1Var.f;
        if (videoPlayer != null) {
            d1Var.a.removeViewFromPlayer(videoPlayer);
            d1Var.i = false;
            d1Var.f.destroyPlayer();
            d1Var.f = null;
            C0173j0 c0173j0 = d1Var.c;
            if (c0173j0 != null) {
                c0173j0.a();
            }
        }
        this.a.a.h.a.onResume();
    }
}
