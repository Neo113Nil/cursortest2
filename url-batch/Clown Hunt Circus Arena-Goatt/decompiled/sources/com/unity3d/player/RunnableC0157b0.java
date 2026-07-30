package com.unity3d.player;

/* renamed from: com.unity3d.player.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0157b0 implements Runnable {
    public final /* synthetic */ UnityPlayer a;

    public RunnableC0157b0(UnityPlayer unityPlayer) {
        this.a = unityPlayer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        UnityPlayer unityPlayer = this.a;
        e1.a(unityPlayer.mActivity, unityPlayer.getFrameLayout());
        this.a.dispatchFrameLayoutPadding();
    }
}
