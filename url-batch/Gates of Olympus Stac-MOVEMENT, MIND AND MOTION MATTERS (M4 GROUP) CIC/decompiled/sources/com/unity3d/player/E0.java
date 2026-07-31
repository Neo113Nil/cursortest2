package com.unity3d.player;

/* loaded from: classes.dex */
final class E0 implements Runnable {
    final /* synthetic */ float a;
    final /* synthetic */ UnityPlayer b;

    E0(UnityPlayer unityPlayer, float f) {
        this.b = unityPlayer;
        this.a = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0020i0 c0020i0;
        c0020i0 = this.b.mGlView;
        c0020i0.a(this.a);
    }
}
