package com.unity3d.player;

/* renamed from: com.unity3d.player.a0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC1726a0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UnityPlayer f22135a;

    public RunnableC1726a0(UnityPlayer unityPlayer) {
        this.f22135a = unityPlayer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        UnityPlayer unityPlayer = this.f22135a;
        AbstractC1736d1.a(unityPlayer.mActivity, unityPlayer.getFrameLayout());
        this.f22135a.dispatchFrameLayoutPadding();
    }
}
