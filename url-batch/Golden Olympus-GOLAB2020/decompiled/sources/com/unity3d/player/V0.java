package com.unity3d.player;

/* loaded from: classes2.dex */
public final class V0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final VideoPlayer f22100a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f22101b = false;

    public V0(VideoPlayer videoPlayer) {
        this.f22100a = videoPlayer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z4;
        try {
            Thread.sleep(5000L);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
        if (this.f22101b) {
            return;
        }
        z4 = VideoPlayer.LOG;
        if (z4) {
            VideoPlayer.Log("Stopping the video player due to timeout.");
        }
        this.f22100a.cancelOnPrepare();
    }
}
