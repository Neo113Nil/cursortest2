package com.unity3d.player;

import android.widget.FrameLayout;

/* loaded from: classes2.dex */
public final class X implements Runnable {
    public final /* synthetic */ UnityPlayer a;

    public X(UnityPlayer unityPlayer) {
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
