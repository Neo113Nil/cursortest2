package io.appmetrica.analytics.impl;

import a.AbstractC0129a;
import java.util.List;

/* loaded from: classes.dex */
public final class U4 {

    /* renamed from: a, reason: collision with root package name */
    public final E5 f6752a;

    /* renamed from: b, reason: collision with root package name */
    public final Lc f6753b;

    /* renamed from: c, reason: collision with root package name */
    public final Lc f6754c;

    public U4(S6 s6, Vg vg) {
        C1008ze c1008ze = new C1008ze(s6);
        this.f6752a = new E5(s6);
        this.f6753b = new Lc(c1008ze, new T4(vg));
        this.f6754c = new Lc(c1008ze, S4.f6595a);
    }

    public final List<K8> a() {
        return c2.f.L(this.f6752a, this.f6753b);
    }

    public final List<K8> b() {
        return AbstractC0129a.r(this.f6754c);
    }
}
