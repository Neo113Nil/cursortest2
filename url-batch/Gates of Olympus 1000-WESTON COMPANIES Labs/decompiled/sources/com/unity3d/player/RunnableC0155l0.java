package com.unity3d.player;

import java.util.concurrent.Semaphore;

/* renamed from: com.unity3d.player.l0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC0155l0 implements Runnable {
    public boolean a = false;
    public boolean b = false;
    public final /* synthetic */ Semaphore c;
    public final /* synthetic */ UnityPlayerForActivityOrService d;
    public final /* synthetic */ UnityPlayerForActivityOrService e;

    public RunnableC0155l0(UnityPlayerForActivityOrService unityPlayerForActivityOrService, Semaphore semaphore, UnityPlayerForActivityOrService unityPlayerForActivityOrService2) {
        this.e = unityPlayerForActivityOrService;
        this.c = semaphore;
        this.d = unityPlayerForActivityOrService2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC0167s abstractC0167s;
        AbstractC0167s abstractC0167s2;
        abstractC0167s = this.e.mSoftInput;
        if (abstractC0167s != null) {
            this.d.setOnHandleFocusListener(new C0151j0(this));
            UnityPlayerForActivityOrService unityPlayerForActivityOrService = this.e;
            abstractC0167s2 = unityPlayerForActivityOrService.mSoftInput;
            abstractC0167s2.g = new C0153k0(this);
            unityPlayerForActivityOrService.dismissSoftInput();
        }
    }
}
