package com.unity3d.player;

/* loaded from: classes.dex */
final class V implements Runnable {
    final /* synthetic */ X a;

    V(X x) {
        this.a = x;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.c.requestFocus();
        this.a.f();
    }
}
