package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* loaded from: classes.dex */
public final class Y implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C1175g f9998a;

    /* renamed from: b, reason: collision with root package name */
    public final c0 f9999b;

    /* renamed from: c, reason: collision with root package name */
    public final r f10000c;

    public Y() {
        this(null, null, null, 7, null);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Q fromModel(W w3) {
        Q q5 = new Q();
        C1173e c1173e = w3.f9992a;
        q5.f9985a = c1173e != null ? this.f9998a.fromModel(c1173e) : null;
        a0 a0Var = w3.f9993b;
        q5.f9986b = a0Var != null ? this.f9999b.fromModel(a0Var) : null;
        C1184p c1184p = w3.f9994c;
        q5.f9987c = c1184p != null ? this.f10000c.fromModel(c1184p) : null;
        return q5;
    }

    public Y(C1175g c1175g, c0 c0Var, r rVar) {
        this.f9998a = c1175g;
        this.f9999b = c0Var;
        this.f10000c = rVar;
    }

    public /* synthetic */ Y(C1175g c1175g, c0 c0Var, r rVar, int i2, kotlin.jvm.internal.e eVar) {
        this((i2 & 1) != 0 ? new C1175g() : c1175g, (i2 & 2) != 0 ? new c0() : c0Var, (i2 & 4) != 0 ? new r() : rVar);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final W toModel(Q q5) {
        C1173e c1173e;
        a0 a0Var;
        N n6 = q5.f9985a;
        if (n6 != null) {
            this.f9998a.getClass();
            c1173e = new C1173e(n6.f9976a);
        } else {
            c1173e = null;
        }
        P p5 = q5.f9986b;
        if (p5 != null) {
            this.f9999b.getClass();
            a0Var = new a0(p5.f9982a, p5.f9983b);
        } else {
            a0Var = null;
        }
        O o2 = q5.f9987c;
        return new W(c1173e, a0Var, o2 != null ? this.f10000c.toModel(o2) : null);
    }
}
