package com.unity3d.player;

import java.util.concurrent.Semaphore;

/* renamed from: com.unity3d.player.s0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC1775s0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f22247a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f22248b = false;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Semaphore f22249c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ UnityPlayerForActivityOrService f22250d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ UnityPlayerForActivityOrService f22251e;

    public RunnableC1775s0(UnityPlayerForActivityOrService unityPlayerForActivityOrService, Semaphore semaphore, UnityPlayerForActivityOrService unityPlayerForActivityOrService2) {
        this.f22251e = unityPlayerForActivityOrService;
        this.f22249c = semaphore;
        this.f22250d = unityPlayerForActivityOrService2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h1.Q q4;
        h1.Q q5;
        q4 = this.f22251e.mSoftInput;
        if (q4 != null) {
            this.f22250d.setOnHandleFocusListener(new C1771q0(this));
            q5 = this.f22251e.mSoftInput;
            q5.a(new C1773r0(this));
            this.f22251e.dismissSoftInput();
        }
    }
}
