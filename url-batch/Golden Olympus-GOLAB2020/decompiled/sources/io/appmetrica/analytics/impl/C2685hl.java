package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;

/* renamed from: io.appmetrica.analytics.impl.hl, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2685hl implements InterfaceC2895po {

    /* renamed from: a, reason: collision with root package name */
    public final C3000u0 f39158a;

    public C2685hl(@NonNull C3000u0 c3000u0) {
        this.f39158a = c3000u0;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2895po
    public final C2843no a(Void r32) {
        boolean z4;
        this.f39158a.getClass();
        synchronized (C2974t0.class) {
            z4 = C2974t0.f39821f;
        }
        return z4 ? new C2843no(this, true, "") : new C2843no(this, false, "AppMetrica isn't initialized. Use AppMetrica#activate(android.content.Context, String) method to activate.");
    }

    public final C2843no a() {
        return a((Void) null);
    }
}
