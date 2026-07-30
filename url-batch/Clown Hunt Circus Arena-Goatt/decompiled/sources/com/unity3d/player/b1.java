package com.unity3d.player;

/* loaded from: classes.dex */
public final class b1 implements Runnable {
    public final /* synthetic */ d1 a;

    public b1(d1 d1Var) {
        this.a = d1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d1 d1Var = this.a;
        VideoPlayer videoPlayer = d1Var.f;
        if (videoPlayer != null) {
            d1Var.a.addViewToPlayer(videoPlayer, true);
            d1 d1Var2 = this.a;
            d1Var2.i = true;
            d1Var2.f.requestFocus();
        }
    }
}
