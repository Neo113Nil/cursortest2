package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AnrListener;

/* loaded from: classes3.dex */
public final class Dc {

    /* renamed from: a, reason: collision with root package name */
    public int f37358a = 5;

    /* renamed from: b, reason: collision with root package name */
    public final C2583e f37359b;

    public Dc(InterfaceC2584e0 interfaceC2584e0) {
        this.f37359b = new C2583e(new Yb(interfaceC2584e0));
    }

    public static final void b(AnrListener anrListener) {
        anrListener.onAppNotResponding();
    }

    public final void a(final AnrListener anrListener) {
        C2583e c2583e = this.f37359b;
        c2583e.f38890a.add(new InterfaceC2530c() { // from class: io.appmetrica.analytics.impl.Ho
            @Override // io.appmetrica.analytics.impl.InterfaceC2530c
            public final void onAppNotResponding() {
                Dc.b(AnrListener.this);
            }
        });
    }
}
