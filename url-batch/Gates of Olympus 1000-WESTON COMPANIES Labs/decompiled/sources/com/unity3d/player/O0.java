package com.unity3d.player;

import com.onevcat.uniwebview.UniWebViewInterface;

/* loaded from: classes2.dex */
public final class O0 implements Runnable {
    public final P0 a;
    public boolean b = false;

    public O0(P0 p0) {
        this.a = p0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Thread.sleep(UniWebViewInterface.RUN_SYNC_WAIT_TIME_MS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
        if (this.b) {
            return;
        }
        int i = P0.A;
        this.a.cancelOnPrepare();
    }
}
