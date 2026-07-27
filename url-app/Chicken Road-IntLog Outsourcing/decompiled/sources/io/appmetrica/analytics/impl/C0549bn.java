package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.bn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0549bn extends A4 {

    /* renamed from: g, reason: collision with root package name */
    public final Nn f7960g;

    public C0549bn(String str, String str2, Nn nn, InterfaceC1041uo interfaceC1041uo, R2 r22) {
        super(0, str, str2, interfaceC1041uo, r22);
        this.f7960g = nn;
    }

    @Override // io.appmetrica.analytics.impl.A4
    public final void a(C0705ho c0705ho) {
        String str = (String) this.f7960g.a((String) this.f6499f);
        c0705ho.f8372d.f8591a = str == null ? new byte[0] : str.getBytes();
    }

    public final Nn h() {
        return this.f7960g;
    }
}
