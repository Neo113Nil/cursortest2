package com.unity3d.player;

import java.util.concurrent.Semaphore;

/* loaded from: classes2.dex */
public final class D0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Semaphore f22005a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UnityPlayerForActivityOrService f22006b;

    public D0(UnityPlayerForActivityOrService unityPlayerForActivityOrService, Semaphore semaphore) {
        this.f22006b = unityPlayerForActivityOrService;
        this.f22005a = semaphore;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f22006b.shutdown();
        this.f22005a.release();
    }
}
