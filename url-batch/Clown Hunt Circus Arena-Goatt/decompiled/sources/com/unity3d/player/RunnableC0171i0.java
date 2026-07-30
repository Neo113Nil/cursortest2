package com.unity3d.player;

/* renamed from: com.unity3d.player.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0171i0 implements Runnable {
    public final /* synthetic */ String a;

    public RunnableC0171i0(String str) {
        this.a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        UnityPlayer.nativeSetLaunchURL(this.a);
    }
}
