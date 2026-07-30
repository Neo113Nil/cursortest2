package com.unity3d.player;

import com.unity3d.player.a.AbstractC0139c;

/* renamed from: com.unity3d.player.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0159c0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ UnityPlayer b;

    public RunnableC0159c0(UnityPlayer unityPlayer, int i) {
        this.b = unityPlayer;
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            UnityPlayer unityPlayer = this.b;
            AbstractC0139c.a(unityPlayer.mActivity, unityPlayer.getFrameLayout(), this.a);
        } catch (Exception e) {
            com.unity3d.player.a.t.Log(6, "Exception when opening Activity Indicator " + e);
        }
    }
}
