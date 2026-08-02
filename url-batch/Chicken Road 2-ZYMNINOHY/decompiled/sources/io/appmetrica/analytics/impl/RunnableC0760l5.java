package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.l5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0760l5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0485ae f12265a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0786m5 f12266b;

    public RunnableC0760l5(C0786m5 c0786m5, InterfaceC0485ae interfaceC0485ae) {
        this.f12266b = c0786m5;
        this.f12265a = interfaceC0485ae;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f12266b) {
            try {
                C0786m5 c0786m5 = this.f12266b;
                Object obj = c0786m5.f12324a;
                if (obj == null) {
                    c0786m5.f12325b.add(this.f12265a);
                } else {
                    this.f12265a.consume(obj);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
