package com.unity3d.player;

/* renamed from: com.unity3d.player.t0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC1777t0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f22254a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UnityPlayerForActivityOrService f22255b;

    public RunnableC1777t0(UnityPlayerForActivityOrService unityPlayerForActivityOrService, String str) {
        this.f22255b = unityPlayerForActivityOrService;
        this.f22254a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h1.Q q4;
        String str;
        q4 = this.f22255b.mSoftInput;
        if (q4 == null || (str = this.f22254a) == null) {
            return;
        }
        q4.setText(str);
    }
}
