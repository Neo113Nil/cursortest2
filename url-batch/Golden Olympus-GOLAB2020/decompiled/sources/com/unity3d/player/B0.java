package com.unity3d.player;

/* loaded from: classes2.dex */
public final class B0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UnityPlayerForActivityOrService f21998a;

    public B0(UnityPlayerForActivityOrService unityPlayerForActivityOrService) {
        this.f21998a = unityPlayerForActivityOrService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f21998a.destroy();
    }
}
