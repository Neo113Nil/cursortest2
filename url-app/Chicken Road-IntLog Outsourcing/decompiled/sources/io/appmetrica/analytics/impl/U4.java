package io.appmetrica.analytics.impl;

import g4.AbstractC0466k;
import java.util.List;

/* loaded from: classes.dex */
public final class U4 {

    /* renamed from: a, reason: collision with root package name */
    public final E5 f7584a;

    /* renamed from: b, reason: collision with root package name */
    public final Lc f7585b;

    /* renamed from: c, reason: collision with root package name */
    public final Lc f7586c;

    public U4(S6 s6, Vg vg) {
        C1159ze c1159ze = new C1159ze(s6);
        this.f7584a = new E5(s6);
        this.f7585b = new Lc(c1159ze, new T4(vg));
        this.f7586c = new Lc(c1159ze, S4.f7417a);
    }

    public final List<K8> a() {
        return AbstractC0466k.A0(this.f7584a, this.f7585b);
    }

    public final List<K8> b() {
        return K1.b.W(this.f7586c);
    }
}
