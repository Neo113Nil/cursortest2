package com.unity3d.player;

/* loaded from: classes2.dex */
public final class W0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ X0 f22111a;

    public W0(X0 x02) {
        this.f22111a = x02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1733c1 c1733c1 = this.f22111a.f22122a.f22131h;
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
        this.f22111a.f22122a.f22131h.f22150a.onResume();
    }
}
