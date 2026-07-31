package com.unity3d.player;

/* loaded from: classes2.dex */
public final class T0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ VideoPlayer f22079a;

    public T0(VideoPlayer videoPlayer) {
        this.f22079a = videoPlayer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f22079a.destroyPlayer();
        this.f22079a.changeState(3);
    }
}
