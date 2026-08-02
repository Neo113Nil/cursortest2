package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Ym extends AbstractC0966t4 {

    /* renamed from: g, reason: collision with root package name */
    public final Ln f11329g;

    public Ym(String str, String str2, Ln ln, InterfaceC0960so interfaceC0960so, J2 j22) {
        super(0, str, str2, interfaceC0960so, j22);
        this.f11329g = ln;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0966t4
    public final void a(C0624fo c0624fo) {
        String str = (String) this.f11329g.a((String) this.f12766f);
        c0624fo.f11893d.f12007a = str == null ? new byte[0] : str.getBytes();
    }

    public final Ln h() {
        return this.f11329g;
    }
}
