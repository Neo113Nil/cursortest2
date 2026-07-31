package com.unity3d.player;

import android.app.Activity;

/* renamed from: com.unity3d.player.j0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC1753j0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UnityPlayer f22189a;

    public RunnableC1753j0(UnityPlayer unityPlayer) {
        this.f22189a = unityPlayer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean nativeIsAutorotationOn;
        UnityPlayer unityPlayer;
        Activity activity;
        int i4;
        nativeIsAutorotationOn = this.f22189a.nativeIsAutorotationOn();
        if (!nativeIsAutorotationOn || (activity = (unityPlayer = this.f22189a).mActivity) == null) {
            return;
        }
        i4 = unityPlayer.mInitialScreenOrientation;
        activity.setRequestedOrientation(i4);
    }
}
