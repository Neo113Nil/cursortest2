package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public final class Ej implements InterfaceC2778lb {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Throwable f37473a;

    public Ej(Throwable th) {
        this.f37473a = th;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2778lb
    public final void a(InterfaceC2804mb interfaceC2804mb) {
        interfaceC2804mb.reportUnhandledException(this.f37473a);
    }
}
