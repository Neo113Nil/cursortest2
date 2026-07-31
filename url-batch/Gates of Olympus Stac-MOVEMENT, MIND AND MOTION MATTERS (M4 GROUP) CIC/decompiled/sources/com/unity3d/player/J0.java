package com.unity3d.player;

/* loaded from: classes.dex */
final class J0 implements Runnable {
    final /* synthetic */ UnityPlayer a;

    J0(UnityPlayer unityPlayer) {
        this.a = unityPlayer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.unity3d.player.a.f fVar;
        UnityPlayer unityPlayer = this.a;
        fVar = unityPlayer.m_SplashScreen;
        unityPlayer.removeView(fVar);
        this.a.m_SplashScreen = null;
    }
}
