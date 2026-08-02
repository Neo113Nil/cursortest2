package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AnrListener;

/* renamed from: io.appmetrica.analytics.impl.pc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0749pc {

    /* renamed from: a, reason: collision with root package name */
    public int f8077a = 5;

    /* renamed from: b, reason: collision with root package name */
    public final C0451e f8078b;

    public C0749pc(InterfaceC0504g0 interfaceC0504g0) {
        this.f8078b = new C0451e(new Kb(interfaceC0504g0));
    }

    public static final void b(AnrListener anrListener) {
        anrListener.onAppNotResponding();
    }

    public final void a(final AnrListener anrListener) {
        C0451e c0451e = this.f8078b;
        c0451e.f7203a.add(new InterfaceC0400c() { // from class: io.appmetrica.analytics.impl.Vo
            @Override // io.appmetrica.analytics.impl.InterfaceC0400c
            public final void onAppNotResponding() {
                C0749pc.b(AnrListener.this);
            }
        });
    }
}
