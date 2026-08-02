package com.unity3d.player;

/* loaded from: classes.dex */
public final class Z implements Runnable {
    public final /* synthetic */ String a;

    public Z(String str) {
        this.a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        UnityPlayer.nativeSetLaunchURL(this.a);
    }
}
