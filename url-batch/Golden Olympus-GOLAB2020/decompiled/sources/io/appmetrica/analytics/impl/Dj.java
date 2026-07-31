package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public final class Dj implements InterfaceC2778lb {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f37371a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f37372b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Throwable f37373c;

    public Dj(String str, String str2, Throwable th) {
        this.f37371a = str;
        this.f37372b = str2;
        this.f37373c = th;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2778lb
    public final void a(InterfaceC2804mb interfaceC2804mb) {
        interfaceC2804mb.reportError(this.f37371a, this.f37372b, this.f37373c);
    }
}
