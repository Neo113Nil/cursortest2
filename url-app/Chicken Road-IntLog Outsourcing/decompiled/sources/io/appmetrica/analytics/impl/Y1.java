package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Y1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0695he f7721a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ G7 f7722b;

    public Y1(C0502a2 c0502a2, G7 g7) {
        this.f7721a = c0502a2;
        this.f7722b = g7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7721a.consume(this.f7722b);
    }
}
