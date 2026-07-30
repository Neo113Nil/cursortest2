package com.unity3d.player;

/* loaded from: classes.dex */
public final class c1 implements Runnable {
    public final /* synthetic */ d1 a;

    public c1(d1 d1Var) {
        this.a = d1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d1 d1Var = this.a;
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
        this.a.a.onResume();
    }
}
