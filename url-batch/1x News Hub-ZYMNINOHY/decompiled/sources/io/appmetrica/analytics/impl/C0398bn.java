package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.bn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0398bn extends A4 {

    /* renamed from: g, reason: collision with root package name */
    public final Nn f7106g;

    public C0398bn(String str, String str2, Nn nn, InterfaceC0890uo interfaceC0890uo, R2 r22) {
        super(0, str, str2, interfaceC0890uo, r22);
        this.f7106g = nn;
    }

    @Override // io.appmetrica.analytics.impl.A4
    public final void a(C0554ho c0554ho) {
        String str = (String) this.f7106g.a((String) this.f);
        c0554ho.f7490d.f7691a = str == null ? new byte[0] : str.getBytes();
    }

    public final Nn h() {
        return this.f7106g;
    }
}
