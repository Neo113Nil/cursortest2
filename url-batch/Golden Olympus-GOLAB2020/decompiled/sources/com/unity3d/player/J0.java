package com.unity3d.player;

/* loaded from: classes2.dex */
public final class J0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UnityPlayerForActivityOrService f22034a;

    public J0(UnityPlayerForActivityOrService unityPlayerForActivityOrService) {
        this.f22034a = unityPlayerForActivityOrService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f22034a.nativeResume();
    }
}
