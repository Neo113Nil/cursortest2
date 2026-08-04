package com.unity3d.player;

/* loaded from: classes.dex */
final class e1 implements Runnable {
    final /* synthetic */ i1 a;

    e1(i1 i1Var) {
        this.a = i1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        UnityPlayer unityPlayer;
        unityPlayer = this.a.a;
        unityPlayer.onPause();
    }
}
