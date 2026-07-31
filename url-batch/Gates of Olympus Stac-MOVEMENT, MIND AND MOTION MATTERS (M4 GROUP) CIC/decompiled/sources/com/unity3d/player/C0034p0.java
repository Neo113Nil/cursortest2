package com.unity3d.player;

/* renamed from: com.unity3d.player.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0034p0 implements G {
    final /* synthetic */ RunnableC0036q0 a;

    C0034p0(RunnableC0036q0 runnableC0036q0) {
        this.a = runnableC0036q0;
    }

    public final void a() {
        RunnableC0036q0 runnableC0036q0 = this.a;
        runnableC0036q0.a = true;
        if (runnableC0036q0.b) {
            runnableC0036q0.c.release();
        }
    }
}
