package com.unity3d.player;

/* loaded from: classes.dex */
final class M0 implements Runnable {
    final /* synthetic */ UnityPlayer a;

    M0(UnityPlayer unityPlayer) {
        this.a = unityPlayer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        C0017i0 c0017i0;
        C0017i0 c0017i02;
        C0017i0 c0017i03;
        UnityPlayer unityPlayer = this.a;
        z = unityPlayer.mMainDisplayOverride;
        if (z) {
            c0017i03 = unityPlayer.mGlView;
            unityPlayer.removeView(c0017i03);
            return;
        }
        c0017i0 = unityPlayer.mGlView;
        if (c0017i0.getParent() != null) {
            AbstractC0050z.Log(5, "Couldn't add view, because it's already assigned to another parent");
            return;
        }
        UnityPlayer unityPlayer2 = this.a;
        c0017i02 = unityPlayer2.mGlView;
        unityPlayer2.addView(c0017i02);
    }
}
