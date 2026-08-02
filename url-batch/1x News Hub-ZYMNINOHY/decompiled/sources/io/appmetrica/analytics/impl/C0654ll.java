package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ll, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0654ll implements InterfaceC0890uo {

    /* renamed from: a, reason: collision with root package name */
    public final C0944x0 f7837a;

    public C0654ll(C0944x0 c0944x0) {
        this.f7837a = c0944x0;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0890uo
    public final C0838so a(Void r3) {
        this.f7837a.getClass();
        return C0944x0.a() ? new C0838so(this, true, "") : new C0838so(this, false, "AppMetrica isn't initialized. Use AppMetrica#activate(android.content.Context, String) method to activate.");
    }

    public final C0838so a() {
        return a((Void) null);
    }
}
