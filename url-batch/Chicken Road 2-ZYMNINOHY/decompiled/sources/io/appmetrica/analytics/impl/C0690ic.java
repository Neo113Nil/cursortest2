package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AnrListener;

/* renamed from: io.appmetrica.analytics.impl.ic, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0690ic {

    /* renamed from: a, reason: collision with root package name */
    public int f12038a = 5;

    /* renamed from: b, reason: collision with root package name */
    public final C0573e f12039b;

    public C0690ic(InterfaceC0626g0 interfaceC0626g0) {
        this.f12039b = new C0573e(new Db(interfaceC0626g0));
    }

    public static final void b(AnrListener anrListener) {
        anrListener.onAppNotResponding();
    }

    public final void a(final AnrListener anrListener) {
        C0573e c0573e = this.f12039b;
        c0573e.f11713a.add(new InterfaceC0522c() { // from class: io.appmetrica.analytics.impl.Xo
            @Override // io.appmetrica.analytics.impl.InterfaceC0522c
            public final void onAppNotResponding() {
                C0690ic.b(AnrListener.this);
            }
        });
    }
}
