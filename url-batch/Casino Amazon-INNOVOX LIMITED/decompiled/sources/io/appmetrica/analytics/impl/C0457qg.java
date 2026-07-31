package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.qg, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0457qg {

    /* renamed from: a, reason: collision with root package name */
    public final Oa f1455a;
    public final InterfaceC0332lg b;
    public final Ma c;

    public C0457qg(Oa oa, InterfaceC0332lg interfaceC0332lg, Ma ma) {
        this.f1455a = oa;
        this.b = interfaceC0332lg;
        this.c = ma;
    }

    public final void a(C0407og c0407og) {
        if (this.f1455a.a(c0407og)) {
            this.b.a(c0407og);
            this.c.a();
        }
    }

    public final InterfaceC0332lg b() {
        return this.b;
    }

    public final Ma c() {
        return this.c;
    }

    public final Oa a() {
        return this.f1455a;
    }
}
