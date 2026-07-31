package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.k0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2741k0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2793m0 f39323a;

    public RunnableC2741k0(C2793m0 c2793m0) {
        this.f39323a = c2793m0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2793m0 c2793m0 = this.f39323a;
        synchronized (c2793m0) {
            if (c2793m0.f39422a != null && c2793m0.a()) {
                try {
                    c2793m0.f39425d = null;
                    c2793m0.f39422a.unbindService(c2793m0.f39430i);
                } catch (Throwable unused) {
                }
            }
            c2793m0.f39425d = null;
        }
    }
}
