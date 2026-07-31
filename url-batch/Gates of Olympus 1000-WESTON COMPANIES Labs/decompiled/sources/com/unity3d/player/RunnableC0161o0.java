package com.unity3d.player;

/* renamed from: com.unity3d.player.o0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC0161o0 implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ UnityPlayerForActivityOrService b;

    public RunnableC0161o0(UnityPlayerForActivityOrService unityPlayerForActivityOrService, boolean z) {
        this.b = unityPlayerForActivityOrService;
        this.a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC0167s abstractC0167s;
        abstractC0167s = this.b.mSoftInput;
        if (abstractC0167s != null) {
            abstractC0167s.a(this.a);
        }
    }
}
