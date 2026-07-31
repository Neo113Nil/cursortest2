package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public final class Sj implements InterfaceC2778lb {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f38260a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ byte[] f38261b;

    public Sj(String str, byte[] bArr) {
        this.f38260a = str;
        this.f38261b = bArr;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2778lb
    public final void a(InterfaceC2804mb interfaceC2804mb) {
        interfaceC2804mb.setSessionExtra(this.f38260a, this.f38261b);
    }
}
