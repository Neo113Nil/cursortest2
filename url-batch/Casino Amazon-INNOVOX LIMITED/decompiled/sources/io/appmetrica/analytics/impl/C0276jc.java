package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AnrListener;

/* renamed from: io.appmetrica.analytics.impl.jc, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0276jc {

    /* renamed from: a, reason: collision with root package name */
    public int f1321a = 5;
    public final C0134e b;

    public C0276jc(InterfaceC0187g0 interfaceC0187g0) {
        this.b = new C0134e(new Eb(interfaceC0187g0));
    }

    public static final void b(AnrListener anrListener) {
        anrListener.onAppNotResponding();
    }

    public final void a(final AnrListener anrListener) {
        C0134e c0134e = this.b;
        c0134e.f1225a.add(new InterfaceC0083c() { // from class: io.appmetrica.analytics.impl.jc$$ExternalSyntheticLambda0
            @Override // io.appmetrica.analytics.impl.InterfaceC0083c
            public final void onAppNotResponding() {
                C0276jc.b(AnrListener.this);
            }
        });
    }
}
