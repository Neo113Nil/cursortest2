package io.appmetrica.analytics.impl;

import a.AbstractC0124a;
import java.util.List;

/* loaded from: classes.dex */
public final class N4 {

    /* renamed from: a, reason: collision with root package name */
    public final C1071x5 f10686a;

    /* renamed from: b, reason: collision with root package name */
    public final Ec f10687b;

    /* renamed from: c, reason: collision with root package name */
    public final Ec f10688c;

    public N4(L6 l6, Qg qg) {
        C0976te c0976te = new C0976te(l6);
        this.f10686a = new C1071x5(l6);
        this.f10687b = new Ec(c0976te, new M4(qg));
        this.f10688c = new Ec(c0976te, L4.f10563a);
    }

    public final List<F8> a() {
        return d3.j.W(this.f10686a, this.f10687b);
    }

    public final List<F8> b() {
        return AbstractC0124a.H(this.f10688c);
    }
}
