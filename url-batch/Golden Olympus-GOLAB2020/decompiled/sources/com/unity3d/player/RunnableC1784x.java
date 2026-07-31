package com.unity3d.player;

/* renamed from: com.unity3d.player.x, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC1784x implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DialogC1786y f22273a;

    public RunnableC1784x(DialogC1786y dialogC1786y) {
        this.f22273a = dialogC1786y;
    }

    @Override // java.lang.Runnable
    public final void run() {
        D d4 = this.f22273a.f22281d;
        d4.a(d4.b(), true);
    }
}
