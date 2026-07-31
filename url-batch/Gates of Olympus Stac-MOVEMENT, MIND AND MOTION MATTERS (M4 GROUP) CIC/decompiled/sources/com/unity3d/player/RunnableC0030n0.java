package com.unity3d.player;

/* renamed from: com.unity3d.player.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class RunnableC0030n0 implements Runnable {
    final /* synthetic */ UnityPlayer a;

    RunnableC0030n0(UnityPlayer unityPlayer) {
        this.a = unityPlayer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0020i0 c0020i0;
        c0020i0 = this.a.mGlView;
        if (c0020i0 != null) {
            c0020i0.b();
        }
    }
}
