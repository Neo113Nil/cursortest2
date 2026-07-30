package com.unity3d.player;

/* renamed from: com.unity3d.player.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0202y implements Runnable {
    public final /* synthetic */ DialogC0204z a;

    public RunnableC0202y(DialogC0204z dialogC0204z) {
        this.a = dialogC0204z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        E e = this.a.d;
        e.a(e.b(), true);
    }
}
