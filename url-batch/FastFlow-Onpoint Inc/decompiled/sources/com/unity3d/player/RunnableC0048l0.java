package com.unity3d.player;

import java.util.concurrent.Semaphore;

/* renamed from: com.unity3d.player.l0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0048l0 implements Runnable {
    public boolean a = false;
    public boolean b = false;
    public final /* synthetic */ Semaphore c;
    public final /* synthetic */ UnityPlayerForActivityOrService d;
    public final /* synthetic */ UnityPlayerForActivityOrService e;

    public RunnableC0048l0(UnityPlayerForActivityOrService unityPlayerForActivityOrService, Semaphore semaphore, UnityPlayerForActivityOrService unityPlayerForActivityOrService2) {
        this.e = unityPlayerForActivityOrService;
        this.c = semaphore;
        this.d = unityPlayerForActivityOrService2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC0060s abstractC0060s;
        AbstractC0060s abstractC0060s2;
        abstractC0060s = this.e.mSoftInput;
        if (abstractC0060s != null) {
            this.d.setOnHandleFocusListener(new C0044j0(this));
            UnityPlayerForActivityOrService unityPlayerForActivityOrService = this.e;
            abstractC0060s2 = unityPlayerForActivityOrService.mSoftInput;
            abstractC0060s2.g = new C0046k0(this);
            unityPlayerForActivityOrService.dismissSoftInput();
        }
    }
}
