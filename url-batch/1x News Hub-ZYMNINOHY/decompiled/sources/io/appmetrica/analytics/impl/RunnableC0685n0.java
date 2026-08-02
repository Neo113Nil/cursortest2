package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0685n0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0737p0 f7917a;

    public RunnableC0685n0(C0737p0 c0737p0) {
        this.f7917a = c0737p0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0737p0 c0737p0 = this.f7917a;
        synchronized (c0737p0) {
            if (c0737p0.f8041a != null && c0737p0.a()) {
                try {
                    c0737p0.f8044d = null;
                    c0737p0.f8041a.unbindService(c0737p0.f8048i);
                } catch (Throwable unused) {
                }
            }
            c0737p0.f8044d = null;
        }
    }
}
