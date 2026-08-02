package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0807n0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0859p0 f12387a;

    public RunnableC0807n0(C0859p0 c0859p0) {
        this.f12387a = c0859p0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0859p0 c0859p0 = this.f12387a;
        synchronized (c0859p0) {
            if (c0859p0.f12540a != null && c0859p0.a()) {
                try {
                    c0859p0.f12543d = null;
                    c0859p0.f12540a.unbindService(c0859p0.f12549j);
                } catch (Throwable unused) {
                }
            }
            c0859p0.f12543d = null;
        }
    }
}
