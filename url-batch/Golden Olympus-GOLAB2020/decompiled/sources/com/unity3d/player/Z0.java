package com.unity3d.player;

/* loaded from: classes2.dex */
public final class Z0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1733c1 f22134a;

    public Z0(C1733c1 c1733c1) {
        this.f22134a = c1733c1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f22134a.f22150a.onPause();
    }
}
