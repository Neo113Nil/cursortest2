package com.unity3d.player;

/* loaded from: classes2.dex */
public final class Z implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f22132a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UnityPlayer f22133b;

    public Z(UnityPlayer unityPlayer, boolean z4) {
        this.f22133b = unityPlayer;
        this.f22132a = z4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        UnityPlayer unityPlayer = this.f22133b;
        AbstractC1736d1.a(unityPlayer.mActivity, unityPlayer.getFrameLayout(), this.f22132a, DisplayCutoutSupport.getDisplayCutoutSupport(this.f22133b.mActivity));
        this.f22133b.dispatchFrameLayoutPadding();
    }
}
