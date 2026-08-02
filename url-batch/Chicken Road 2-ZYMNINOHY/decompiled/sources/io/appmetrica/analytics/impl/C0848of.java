package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.of, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0848of implements Si {

    /* renamed from: a, reason: collision with root package name */
    public final Ze f12516a;

    public C0848of(Ze ze) {
        this.f12516a = ze;
    }

    @Override // io.appmetrica.analytics.impl.Si
    public final boolean a() {
        return this.f12516a.i();
    }

    @Override // io.appmetrica.analytics.impl.Si
    public final void b() {
        this.f12516a.h().b();
    }

    public C0848of() {
        this(C0817na.k().y());
    }
}
