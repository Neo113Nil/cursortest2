package com.unity3d.player;

import android.app.Activity;

/* loaded from: classes.dex */
final class B0 implements Runnable {
    final /* synthetic */ UnityPlayer a;

    B0(UnityPlayer unityPlayer) {
        this.a = unityPlayer;
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0008, code lost:
    
        r1 = (r0 = r2.a).mActivity;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean nativeIsAutorotationOn;
        UnityPlayer unityPlayer;
        Activity activity;
        int i;
        nativeIsAutorotationOn = this.a.nativeIsAutorotationOn();
        if (!nativeIsAutorotationOn || activity == null) {
            return;
        }
        i = unityPlayer.mInitialScreenOrientation;
        activity.setRequestedOrientation(i);
    }
}
