package com.unity3d.player;

/* renamed from: com.unity3d.player.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class RunnableC0027n0 implements Runnable {
    final /* synthetic */ UnityPlayer a;

    RunnableC0027n0(UnityPlayer unityPlayer) {
        this.a = unityPlayer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0017i0 c0017i0;
        c0017i0 = this.a.mGlView;
        if (c0017i0 != null) {
            c0017i0.b();
        }
    }
}
