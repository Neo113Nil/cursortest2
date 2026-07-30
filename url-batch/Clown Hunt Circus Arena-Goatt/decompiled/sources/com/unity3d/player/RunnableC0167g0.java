package com.unity3d.player;

import android.widget.FrameLayout;

/* renamed from: com.unity3d.player.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0167g0 implements Runnable {
    public final /* synthetic */ UnityPlayer a;

    public RunnableC0167g0(UnityPlayer unityPlayer) {
        this.a = unityPlayer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.unity3d.player.a.K k;
        FrameLayout frameLayout = this.a.getFrameLayout();
        k = this.a.m_SplashScreen;
        frameLayout.removeView(k);
        this.a.m_SplashScreen = null;
    }
}
