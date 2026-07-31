package com.unity3d.player;

import android.widget.FrameLayout;
import h1.C2449j;

/* renamed from: com.unity3d.player.f0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC1741f0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UnityPlayer f22169a;

    public RunnableC1741f0(UnityPlayer unityPlayer) {
        this.f22169a = unityPlayer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2449j c2449j;
        FrameLayout frameLayout = this.f22169a.getFrameLayout();
        c2449j = this.f22169a.m_SplashScreen;
        frameLayout.removeView(c2449j);
        this.f22169a.m_SplashScreen = null;
    }
}
