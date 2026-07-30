package com.unity3d.player.a;

/* loaded from: classes.dex */
public final class N implements Runnable {
    public final /* synthetic */ P a;

    public N(P p) {
        this.a = p;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a.getView().requestPointerCapture();
    }
}
