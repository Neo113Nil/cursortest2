package com.unity3d.player;

import com.onevcat.uniwebview.UniWebViewInterface;

/* loaded from: classes.dex */
public final class W0 implements Runnable {
    public final VideoPlayer a;
    public boolean b = false;

    public W0(VideoPlayer videoPlayer) {
        this.a = videoPlayer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        try {
            Thread.sleep(UniWebViewInterface.RUN_SYNC_WAIT_TIME_MS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
        if (this.b) {
            return;
        }
        z = VideoPlayer.LOG;
        if (z) {
            VideoPlayer.Log("Stopping the video player due to timeout.");
        }
        this.a.cancelOnPrepare();
    }
}
