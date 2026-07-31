package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ak, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2497ak implements InterfaceC2778lb {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f38681a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f38682b;

    public C2497ak(String str, String str2) {
        this.f38681a = str;
        this.f38682b = str2;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2778lb
    public final void a(InterfaceC2804mb interfaceC2804mb) {
        interfaceC2804mb.reportEvent(this.f38681a, this.f38682b);
    }
}
