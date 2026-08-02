package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.dc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0561dc implements InterfaceC0919r9 {

    /* renamed from: a, reason: collision with root package name */
    public final C0734k5 f11679a;

    public C0561dc(InterfaceC1023v9 interfaceC1023v9, L6 l6, Qg qg, C0837o4 c0837o4, Q4 q4, We we) {
        C0535cc c0535cc = new C0535cc(l6, qg, this, c0837o4, we);
        this.f11679a = new C0734k5(interfaceC1023v9, c0535cc.a(), c0535cc.b(), q4);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0919r9
    public final InterfaceC0894q9 a() {
        return this.f11679a;
    }

    public final C0734k5 b() {
        return this.f11679a;
    }
}
