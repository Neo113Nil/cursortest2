package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.o1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC0392o1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f1406a;
    public final /* synthetic */ C0541u1 b;

    public RunnableC0392o1(C0541u1 c0541u1, String str) {
        this.b = c0541u1;
        this.f1406a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0541u1.a(this.b).reportEvent(this.f1406a);
    }
}
