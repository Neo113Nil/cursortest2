package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.m5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC0346m5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0072be f1370a;
    public final /* synthetic */ C0371n5 b;

    public RunnableC0346m5(C0371n5 c0371n5, InterfaceC0072be interfaceC0072be) {
        this.b = c0371n5;
        this.f1370a = interfaceC0072be;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.b) {
            C0371n5 c0371n5 = this.b;
            Object obj = c0371n5.f1389a;
            if (obj == null) {
                c0371n5.b.add(this.f1370a);
            } else {
                this.f1370a.consume(obj);
            }
        }
    }
}
