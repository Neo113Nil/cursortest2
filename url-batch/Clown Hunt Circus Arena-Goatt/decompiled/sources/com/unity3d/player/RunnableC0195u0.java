package com.unity3d.player;

/* renamed from: com.unity3d.player.u0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0195u0 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ UnityPlayerForActivityOrService b;

    public RunnableC0195u0(UnityPlayerForActivityOrService unityPlayerForActivityOrService, String str) {
        this.b = unityPlayerForActivityOrService;
        this.a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.unity3d.player.a.r rVar;
        String str;
        rVar = this.b.mSoftInput;
        if (rVar == null || (str = this.a) == null) {
            return;
        }
        rVar.setText(str);
    }
}
