package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public final class Cj implements InterfaceC2778lb {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f37308a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Throwable f37309b;

    public Cj(String str, Throwable th) {
        this.f37308a = str;
        this.f37309b = th;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2778lb
    public final void a(InterfaceC2804mb interfaceC2804mb) {
        interfaceC2804mb.reportError(this.f37308a, this.f37309b);
    }
}
