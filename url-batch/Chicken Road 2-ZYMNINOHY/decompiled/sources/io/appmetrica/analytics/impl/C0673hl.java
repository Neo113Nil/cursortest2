package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.hl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0673hl implements InterfaceC0960so {

    /* renamed from: a, reason: collision with root package name */
    public final C1118z0 f12003a;

    public C0673hl(C1118z0 c1118z0) {
        this.f12003a = c1118z0;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0960so
    public final C0909qo a(Void r32) {
        this.f12003a.getClass();
        return C1118z0.a() ? new C0909qo(this, true, "") : new C0909qo(this, false, "AppMetrica isn't initialized. Use AppMetrica#activate(android.content.Context, String) method to activate.");
    }

    public final C0909qo a() {
        return a((Void) null);
    }
}
