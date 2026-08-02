package com.unity3d.player.a;

/* loaded from: classes.dex */
public final class W implements Runnable {
    public final /* synthetic */ Z a;

    public W(Z z) {
        this.a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a.onPause();
    }
}
