package com.unity3d.player;

/* loaded from: classes2.dex */
public final class G0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UnityPlayerForActivityOrService f22017a;

    public G0(UnityPlayerForActivityOrService unityPlayerForActivityOrService) {
        this.f22017a = unityPlayerForActivityOrService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f22017a.nativeSendSurfaceChangedEvent();
    }
}
