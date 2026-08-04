package com.unity3d.player;

/* loaded from: classes.dex */
final class N0 implements Runnable {
    final /* synthetic */ UnityPlayer a;

    N0(UnityPlayer unityPlayer) {
        this.a = unityPlayer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.destroy();
    }
}
