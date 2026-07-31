package com.unity3d.player;

/* loaded from: classes2.dex */
public final class Y implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UnityPlayer f22123a;

    public Y(UnityPlayer unityPlayer) {
        this.f22123a = unityPlayer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f22123a.setupUnityToBePaused();
        this.f22123a.windowFocusChanged(false);
        this.f22123a.m_UnityPlayerLifecycleEvents.onUnityPlayerUnloaded();
    }
}
