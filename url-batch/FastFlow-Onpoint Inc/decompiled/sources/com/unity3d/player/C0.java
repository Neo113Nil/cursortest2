package com.unity3d.player;

/* loaded from: classes.dex */
public final class C0 implements Runnable {
    public final /* synthetic */ UnityPlayerForActivityOrService a;

    public C0(UnityPlayerForActivityOrService unityPlayerForActivityOrService) {
        this.a = unityPlayerForActivityOrService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.nativeResume();
    }
}
