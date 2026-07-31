package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.il, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0259il implements to {

    /* renamed from: a, reason: collision with root package name */
    public final C0665z0 f1310a;

    public C0259il(C0665z0 c0665z0) {
        this.f1310a = c0665z0;
    }

    @Override // io.appmetrica.analytics.impl.to
    public final ro a(Void r3) {
        this.f1310a.getClass();
        return C0665z0.a() ? new ro(this, true, "") : new ro(this, false, "AppMetrica isn't initialized. Use AppMetrica#activate(android.content.Context, String) method to activate.");
    }

    public final ro a() {
        return a((Void) null);
    }
}
