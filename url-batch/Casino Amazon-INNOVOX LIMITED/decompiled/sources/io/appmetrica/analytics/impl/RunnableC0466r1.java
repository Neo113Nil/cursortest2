package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.r1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC0466r1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f1462a;
    public final /* synthetic */ Throwable b;
    public final /* synthetic */ C0541u1 c;

    public RunnableC0466r1(C0541u1 c0541u1, String str, Throwable th) {
        this.c = c0541u1;
        this.f1462a = str;
        this.b = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0541u1.a(this.c).reportError(this.f1462a, this.b);
    }
}
