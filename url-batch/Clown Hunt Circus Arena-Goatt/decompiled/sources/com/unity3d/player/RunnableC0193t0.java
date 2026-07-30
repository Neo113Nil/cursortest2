package com.unity3d.player;

import java.util.concurrent.Semaphore;

/* renamed from: com.unity3d.player.t0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0193t0 implements Runnable {
    public boolean a = false;
    public boolean b = false;
    public final /* synthetic */ Semaphore c;
    public final /* synthetic */ UnityPlayerForActivityOrService d;
    public final /* synthetic */ UnityPlayerForActivityOrService e;

    public RunnableC0193t0(UnityPlayerForActivityOrService unityPlayerForActivityOrService, Semaphore semaphore, UnityPlayerForActivityOrService unityPlayerForActivityOrService2) {
        this.e = unityPlayerForActivityOrService;
        this.c = semaphore;
        this.d = unityPlayerForActivityOrService2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.unity3d.player.a.r rVar;
        com.unity3d.player.a.r rVar2;
        rVar = this.e.mSoftInput;
        if (rVar != null) {
            this.d.setOnHandleFocusListener(new C0189r0(this));
            rVar2 = this.e.mSoftInput;
            rVar2.a(new C0191s0(this));
            this.e.dismissSoftInput();
        }
    }
}
