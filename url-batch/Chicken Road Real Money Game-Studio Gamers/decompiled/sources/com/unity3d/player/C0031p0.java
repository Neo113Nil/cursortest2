package com.unity3d.player;

/* renamed from: com.unity3d.player.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0031p0 implements G {
    final /* synthetic */ RunnableC0033q0 a;

    C0031p0(RunnableC0033q0 runnableC0033q0) {
        this.a = runnableC0033q0;
    }

    public final void a() {
        RunnableC0033q0 runnableC0033q0 = this.a;
        runnableC0033q0.a = true;
        if (runnableC0033q0.b) {
            runnableC0033q0.c.release();
        }
    }
}
