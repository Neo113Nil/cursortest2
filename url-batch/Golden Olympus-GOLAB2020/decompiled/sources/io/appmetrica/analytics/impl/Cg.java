package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public class Cg {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2701ib f37302a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC3094xg f37303b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC2649gb f37304c;

    public Cg(InterfaceC2701ib interfaceC2701ib, InterfaceC3094xg interfaceC3094xg, InterfaceC2649gb interfaceC2649gb) {
        this.f37302a = interfaceC2701ib;
        this.f37303b = interfaceC3094xg;
        this.f37304c = interfaceC2649gb;
    }

    public final void a(Ag ag) {
        if (this.f37302a.a(ag)) {
            this.f37303b.a(ag);
            this.f37304c.a();
        }
    }

    @NonNull
    public final InterfaceC3094xg b() {
        return this.f37303b;
    }

    @NonNull
    public final InterfaceC2649gb c() {
        return this.f37304c;
    }

    @NonNull
    public final InterfaceC2701ib a() {
        return this.f37302a;
    }
}
