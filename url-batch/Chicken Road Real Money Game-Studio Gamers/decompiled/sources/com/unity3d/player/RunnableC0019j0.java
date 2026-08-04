package com.unity3d.player;

/* renamed from: com.unity3d.player.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class RunnableC0019j0 implements Runnable {
    final /* synthetic */ UnityPlayer a;

    RunnableC0019j0(UnityPlayer unityPlayer) {
        this.a = unityPlayer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.nativeLowMemory();
    }
}
