package com.unity3d.player;

/* loaded from: classes.dex */
public final class M0 implements Runnable {
    public final /* synthetic */ P0 a;

    public M0(P0 p0) {
        this.a = p0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.destroyPlayer();
        this.a.a(3);
    }
}
