package com.unity3d.player;

import h1.AbstractC2460v;

/* renamed from: com.unity3d.player.b0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC1729b0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22144a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UnityPlayer f22145b;

    public RunnableC1729b0(UnityPlayer unityPlayer, int i4) {
        this.f22145b = unityPlayer;
        this.f22144a = i4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            UnityPlayer unityPlayer = this.f22145b;
            AbstractC2460v.a(unityPlayer.mActivity, unityPlayer.getFrameLayout(), this.f22144a);
        } catch (Exception e4) {
            h1.T.a(6, "Exception when opening Activity Indicator " + e4);
        }
    }
}
