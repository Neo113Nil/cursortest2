package com.unity3d.player;

import java.util.concurrent.Semaphore;

/* loaded from: classes.dex */
public final class x0 implements Runnable {
    public final /* synthetic */ Semaphore a;
    public final /* synthetic */ UnityPlayerForActivityOrService b;

    public x0(UnityPlayerForActivityOrService unityPlayerForActivityOrService, Semaphore semaphore) {
        this.b = unityPlayerForActivityOrService;
        this.a = semaphore;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean nativePause;
        nativePause = this.b.nativePause();
        if (nativePause) {
            UnityPlayerForActivityOrService unityPlayerForActivityOrService = this.b;
            unityPlayerForActivityOrService.mQuitting = true;
            unityPlayerForActivityOrService.shutdown();
            this.b.queueDestroy();
        }
        this.a.release();
    }
}
