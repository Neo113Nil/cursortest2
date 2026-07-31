package com.unity3d.player;

/* renamed from: com.unity3d.player.w0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC1783w0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22270a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22271b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ UnityPlayerForActivityOrService f22272c;

    public RunnableC1783w0(UnityPlayerForActivityOrService unityPlayerForActivityOrService, int i4, int i5) {
        this.f22272c = unityPlayerForActivityOrService;
        this.f22270a = i4;
        this.f22271b = i5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h1.Q q4;
        q4 = this.f22272c.mSoftInput;
        if (q4 != null) {
            q4.setSelection(this.f22270a, this.f22271b);
        }
    }
}
