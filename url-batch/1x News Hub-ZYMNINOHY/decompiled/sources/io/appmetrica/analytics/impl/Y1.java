package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Y1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0544he f6883a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ G7 f6884b;

    public Y1(C0351a2 c0351a2, G7 g7) {
        this.f6883a = c0351a2;
        this.f6884b = g7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6883a.consume(this.f6884b);
    }
}
