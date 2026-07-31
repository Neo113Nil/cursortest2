package com.unity3d.player;

import android.app.Activity;

/* loaded from: classes.dex */
final class G0 implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ UnityPlayer b;

    G0(UnityPlayer unityPlayer, int i) {
        this.b = unityPlayer;
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Activity activity;
        try {
            UnityPlayer unityPlayer = this.b;
            activity = unityPlayer.mActivity;
            AbstractC0007c.a(activity, unityPlayer, this.a);
        } catch (Exception e) {
            AbstractC0053z.Log(6, "Exception when opening Activity Indicator " + e);
        }
    }
}
