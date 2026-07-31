package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public final class Q1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0072be f1011a;
    public final /* synthetic */ C0672z7 b;

    public Q1(S1 s1, C0672z7 c0672z7) {
        this.f1011a = s1;
        this.b = c0672z7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1011a.consume(this.b);
    }
}
