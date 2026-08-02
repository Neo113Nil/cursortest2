package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* loaded from: classes.dex */
public final class Y implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C1149g f13447a;

    /* renamed from: b, reason: collision with root package name */
    public final c0 f13448b;

    /* renamed from: c, reason: collision with root package name */
    public final r f13449c;

    public Y() {
        this(null, null, null, 7, null);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Q fromModel(W w4) {
        Q q4 = new Q();
        C1147e c1147e = w4.f13441a;
        q4.f13434a = c1147e != null ? this.f13447a.fromModel(c1147e) : null;
        a0 a0Var = w4.f13442b;
        q4.f13435b = a0Var != null ? this.f13448b.fromModel(a0Var) : null;
        C1158p c1158p = w4.f13443c;
        q4.f13436c = c1158p != null ? this.f13449c.fromModel(c1158p) : null;
        return q4;
    }

    public Y(C1149g c1149g, c0 c0Var, r rVar) {
        this.f13447a = c1149g;
        this.f13448b = c0Var;
        this.f13449c = rVar;
    }

    public /* synthetic */ Y(C1149g c1149g, c0 c0Var, r rVar, int i4, kotlin.jvm.internal.e eVar) {
        this((i4 & 1) != 0 ? new C1149g() : c1149g, (i4 & 2) != 0 ? new c0() : c0Var, (i4 & 4) != 0 ? new r() : rVar);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final W toModel(Q q4) {
        C1147e c1147e;
        a0 a0Var;
        N n = q4.f13434a;
        if (n != null) {
            this.f13447a.getClass();
            c1147e = new C1147e(n.f13425a);
        } else {
            c1147e = null;
        }
        P p2 = q4.f13435b;
        if (p2 != null) {
            this.f13448b.getClass();
            a0Var = new a0(p2.f13431a, p2.f13432b);
        } else {
            a0Var = null;
        }
        O o = q4.f13436c;
        return new W(c1147e, a0Var, o != null ? this.f13449c.toModel(o) : null);
    }
}
