package com.unity3d.player;

/* renamed from: com.unity3d.player.w0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0199w0 implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ UnityPlayerForActivityOrService b;

    public RunnableC0199w0(UnityPlayerForActivityOrService unityPlayerForActivityOrService, boolean z) {
        this.b = unityPlayerForActivityOrService;
        this.a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.unity3d.player.a.r rVar;
        rVar = this.b.mSoftInput;
        if (rVar != null) {
            rVar.setHideInputField(this.a);
        }
    }
}
