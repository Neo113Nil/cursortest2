package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public final class A4 {

    /* renamed from: a, reason: collision with root package name */
    public final Gb f757a;

    public A4() {
        this(C0401oa.k().l());
    }

    public static F4 a(C0644y4 c0644y4) {
        return new F4(new D4(c0644y4), c0644y4);
    }

    public A4(Gb gb) {
        this.f757a = gb;
    }

    public final C0364mn a(C0644y4 c0644y4, Bm bm) {
        C0364mn c0364mn = new C0364mn(c0644y4, new Jg(bm));
        Gb gb = this.f757a;
        synchronized (gb) {
            gb.c.add(c0364mn);
        }
        return c0364mn;
    }
}
