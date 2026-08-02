package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.s5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0819s5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0544he f8294a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0845t5 f8295b;

    public RunnableC0819s5(C0845t5 c0845t5, InterfaceC0544he interfaceC0544he) {
        this.f8295b = c0845t5;
        this.f8294a = interfaceC0544he;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f8295b) {
            try {
                C0845t5 c0845t5 = this.f8295b;
                Object obj = c0845t5.f8336a;
                if (obj == null) {
                    c0845t5.f8337b.add(this.f8294a);
                } else {
                    this.f8294a.consume(obj);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
