package com.unity3d.player;

/* renamed from: com.unity3d.player.u, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC1778u implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final long f22256a;

    /* renamed from: b, reason: collision with root package name */
    public final long f22257b;

    public RunnableC1778u(long j4, long j5) {
        this.f22256a = j4;
        this.f22257b = j5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (ReflectionHelper.beginProxyCall(this.f22256a)) {
            try {
                ReflectionHelper.nativeProxyFinalize(this.f22257b);
            } finally {
                ReflectionHelper.endProxyCall();
            }
        }
    }
}
