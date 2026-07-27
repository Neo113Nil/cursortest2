package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.kc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0770kc implements InterfaceC1129y9 {

    /* renamed from: a, reason: collision with root package name */
    public final C0944r5 f8619a;

    public C0770kc(C9 c9, S6 s6, Vg vg, C1047v4 c1047v4, X4 x42, C0541bf c0541bf) {
        C0744jc c0744jc = new C0744jc(s6, vg, this, c1047v4, c0541bf);
        this.f8619a = new C0944r5(c9, c0744jc.a(), c0744jc.b(), x42);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1129y9
    public final InterfaceC1104x9 a() {
        return this.f8619a;
    }

    public final C0944r5 b() {
        return this.f8619a;
    }
}
