package com.unity3d.player;

/* renamed from: com.unity3d.player.b1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC1730b1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1733c1 f22146a;

    public RunnableC1730b1(C1733c1 c1733c1) {
        this.f22146a = c1733c1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1733c1 c1733c1 = this.f22146a;
        VideoPlayer videoPlayer = c1733c1.f22155f;
        if (videoPlayer != null) {
            c1733c1.f22150a.removeViewFromPlayer(videoPlayer);
            c1733c1.f22158i = false;
            c1733c1.f22155f.destroyPlayer();
            c1733c1.f22155f = null;
            C1750i0 c1750i0 = c1733c1.f22152c;
            if (c1750i0 != null) {
                c1750i0.a();
            }
        }
        this.f22146a.f22150a.onResume();
    }
}
