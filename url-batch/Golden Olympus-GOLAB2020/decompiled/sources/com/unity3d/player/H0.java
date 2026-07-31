package com.unity3d.player;

import android.view.Surface;
import java.util.concurrent.Semaphore;

/* loaded from: classes2.dex */
public final class H0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22019a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Surface f22020b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Semaphore f22021c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ UnityPlayerForActivityOrService f22022d;

    public H0(UnityPlayerForActivityOrService unityPlayerForActivityOrService, int i4, Surface surface, Semaphore semaphore) {
        this.f22022d = unityPlayerForActivityOrService;
        this.f22019a = i4;
        this.f22020b = surface;
        this.f22021c = semaphore;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f22022d.nativeRecreateGfxState(this.f22019a, this.f22020b);
        this.f22021c.release();
    }
}
