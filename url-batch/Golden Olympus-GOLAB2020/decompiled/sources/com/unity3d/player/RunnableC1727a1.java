package com.unity3d.player;

/* renamed from: com.unity3d.player.a1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC1727a1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1733c1 f22136a;

    public RunnableC1727a1(C1733c1 c1733c1) {
        this.f22136a = c1733c1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1733c1 c1733c1 = this.f22136a;
        VideoPlayer videoPlayer = c1733c1.f22155f;
        if (videoPlayer != null) {
            c1733c1.f22150a.addViewToPlayer(videoPlayer, true);
            C1733c1 c1733c12 = this.f22136a;
            c1733c12.f22158i = true;
            c1733c12.f22155f.requestFocus();
        }
    }
}
