package com.unity3d.player;

import com.onevcat.uniwebview.UniWebViewInterface;

/* loaded from: classes.dex */
public final class Z0 implements Runnable {
    private a1 a;
    private boolean b = false;

    public Z0(a1 a1Var) {
        this.a = a1Var;
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
        int i = a1.A;
        this.a.cancelOnPrepare();
    }
}
