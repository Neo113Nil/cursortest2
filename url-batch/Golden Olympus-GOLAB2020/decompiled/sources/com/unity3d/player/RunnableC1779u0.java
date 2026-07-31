package com.unity3d.player;

/* renamed from: com.unity3d.player.u0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC1779u0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22258a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UnityPlayerForActivityOrService f22259b;

    public RunnableC1779u0(UnityPlayerForActivityOrService unityPlayerForActivityOrService, int i4) {
        this.f22259b = unityPlayerForActivityOrService;
        this.f22258a = i4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h1.Q q4;
        q4 = this.f22259b.mSoftInput;
        if (q4 != null) {
            q4.setCharacterLimit(this.f22258a);
        }
    }
}
