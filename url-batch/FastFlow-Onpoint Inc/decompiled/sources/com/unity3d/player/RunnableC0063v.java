package com.unity3d.player;

/* renamed from: com.unity3d.player.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0063v implements Runnable {
    public final /* synthetic */ C0065x a;

    public RunnableC0063v(C0065x c0065x) {
        this.a = c0065x;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.c.requestFocus();
        this.a.e();
    }
}
