package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.kc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0619kc implements InterfaceC0978y9 {

    /* renamed from: a, reason: collision with root package name */
    public final C0793r5 f7719a;

    public C0619kc(C9 c9, S6 s6, Vg vg, C0896v4 c0896v4, X4 x4, C0390bf c0390bf) {
        C0593jc c0593jc = new C0593jc(s6, vg, this, c0896v4, c0390bf);
        this.f7719a = new C0793r5(c9, c0593jc.a(), c0593jc.b(), x4);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0978y9
    public final InterfaceC0953x9 a() {
        return this.f7719a;
    }

    public final C0793r5 b() {
        return this.f7719a;
    }
}
