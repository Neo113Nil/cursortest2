package com.unity3d.player;

/* renamed from: com.unity3d.player.h0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC1747h0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f22181a;

    public RunnableC1747h0(String str) {
        this.f22181a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        UnityPlayer.nativeSetLaunchURL(this.f22181a);
    }
}
