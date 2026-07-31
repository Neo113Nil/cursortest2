package com.unity3d.player;

/* renamed from: com.unity3d.player.v0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC1781v0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f22261a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UnityPlayerForActivityOrService f22262b;

    public RunnableC1781v0(UnityPlayerForActivityOrService unityPlayerForActivityOrService, boolean z4) {
        this.f22262b = unityPlayerForActivityOrService;
        this.f22261a = z4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h1.Q q4;
        q4 = this.f22262b.mSoftInput;
        if (q4 != null) {
            q4.setHideInputField(this.f22261a);
        }
    }
}
