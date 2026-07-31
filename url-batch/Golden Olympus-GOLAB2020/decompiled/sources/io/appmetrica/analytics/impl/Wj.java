package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public final class Wj implements InterfaceC2778lb {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f38482a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f38483b;

    public Wj(String str, String str2) {
        this.f38482a = str;
        this.f38483b = str2;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2778lb
    public final void a(InterfaceC2804mb interfaceC2804mb) {
        interfaceC2804mb.putAppEnvironmentValue(this.f38482a, this.f38483b);
    }
}
