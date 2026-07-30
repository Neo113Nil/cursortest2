package com.unity3d.player.a;

/* loaded from: classes.dex */
public final class O implements Runnable {
    public final /* synthetic */ P a;

    public O(P p) {
        this.a = p;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a.getView().releasePointerCapture();
    }
}
