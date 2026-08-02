package com.unity3d.player;

/* renamed from: com.unity3d.player.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0054o0 implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ UnityPlayerForActivityOrService b;

    public RunnableC0054o0(UnityPlayerForActivityOrService unityPlayerForActivityOrService, boolean z) {
        this.b = unityPlayerForActivityOrService;
        this.a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC0060s abstractC0060s;
        abstractC0060s = this.b.mSoftInput;
        if (abstractC0060s != null) {
            abstractC0060s.a(this.a);
        }
    }
}
