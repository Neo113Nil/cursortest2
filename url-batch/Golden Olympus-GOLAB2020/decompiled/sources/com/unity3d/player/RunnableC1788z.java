package com.unity3d.player;

/* renamed from: com.unity3d.player.z, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC1788z implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ B f22286a;

    public RunnableC1788z(B b4) {
        this.f22286a = b4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f22286a.f22265c.requestFocus();
        this.f22286a.c();
    }
}
