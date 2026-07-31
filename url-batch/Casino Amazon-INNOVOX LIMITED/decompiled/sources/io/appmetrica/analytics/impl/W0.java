package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public final class W0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0541u1 f1096a;

    public W0(C0541u1 c0541u1) {
        this.f1096a = c0541u1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0541u1.a(this.f1096a).sendEventsBuffer();
    }
}
