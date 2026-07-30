package com.unity3d.player;

/* renamed from: com.unity3d.player.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0155a0 implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ UnityPlayer b;

    public RunnableC0155a0(UnityPlayer unityPlayer, boolean z) {
        this.b = unityPlayer;
        this.a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        UnityPlayer unityPlayer = this.b;
        e1.a(unityPlayer.mActivity, unityPlayer.getFrameLayout(), this.a, DisplayCutoutSupport.getDisplayCutoutSupport(this.b.mActivity));
        this.b.dispatchFrameLayoutPadding();
    }
}
