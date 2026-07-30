package com.unity3d.player;

/* loaded from: classes.dex */
public final class a1 implements Runnable {
    public final /* synthetic */ d1 a;

    public a1(d1 d1Var) {
        this.a = d1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a.onPause();
    }
}
