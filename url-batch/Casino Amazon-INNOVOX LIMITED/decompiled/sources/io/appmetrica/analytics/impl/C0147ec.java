package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ec, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0147ec implements InterfaceC0499s9 {

    /* renamed from: a, reason: collision with root package name */
    public final C0321l5 f1236a;

    public C0147ec(InterfaceC0599w9 interfaceC0599w9, M6 m6, Rg rg, C0420p4 c0420p4, R4 r4, Xe xe) {
        C0122dc c0122dc = new C0122dc(m6, rg, this, c0420p4, xe);
        this.f1236a = new C0321l5(interfaceC0599w9, c0122dc.a(), c0122dc.b(), r4);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0499s9
    public final InterfaceC0474r9 a() {
        return this.f1236a;
    }

    public final C0321l5 b() {
        return this.f1236a;
    }
}
