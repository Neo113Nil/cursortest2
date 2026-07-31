package com.unity3d.player;

/* renamed from: com.unity3d.player.v, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC0170v implements Runnable {
    public final /* synthetic */ C0172x a;

    public RunnableC0170v(C0172x c0172x) {
        this.a = c0172x;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.c.requestFocus();
        this.a.e();
    }
}
