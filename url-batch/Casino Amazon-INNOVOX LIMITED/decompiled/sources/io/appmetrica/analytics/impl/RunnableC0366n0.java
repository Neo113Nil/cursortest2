package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.n0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC0366n0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0416p0 f1384a;

    public RunnableC0366n0(C0416p0 c0416p0) {
        this.f1384a = c0416p0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0416p0 c0416p0 = this.f1384a;
        synchronized (c0416p0) {
            if (c0416p0.f1423a != null && c0416p0.a()) {
                try {
                    c0416p0.d = null;
                    c0416p0.f1423a.unbindService(c0416p0.j);
                } catch (Throwable unused) {
                }
            }
            c0416p0.d = null;
        }
    }
}
