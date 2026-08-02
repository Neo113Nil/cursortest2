package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* loaded from: classes.dex */
public final class Y implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C1024g f9018a;

    /* renamed from: b, reason: collision with root package name */
    public final c0 f9019b;

    /* renamed from: c, reason: collision with root package name */
    public final r f9020c;

    public Y() {
        this(null, null, null, 7, null);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Q fromModel(W w3) {
        Q q3 = new Q();
        C1022e c1022e = w3.f9012a;
        q3.f9005a = c1022e != null ? this.f9018a.fromModel(c1022e) : null;
        a0 a0Var = w3.f9013b;
        q3.f9006b = a0Var != null ? this.f9019b.fromModel(a0Var) : null;
        C1033p c1033p = w3.f9014c;
        q3.f9007c = c1033p != null ? this.f9020c.fromModel(c1033p) : null;
        return q3;
    }

    public Y(C1024g c1024g, c0 c0Var, r rVar) {
        this.f9018a = c1024g;
        this.f9019b = c0Var;
        this.f9020c = rVar;
    }

    public /* synthetic */ Y(C1024g c1024g, c0 c0Var, r rVar, int i3, kotlin.jvm.internal.f fVar) {
        this((i3 & 1) != 0 ? new C1024g() : c1024g, (i3 & 2) != 0 ? new c0() : c0Var, (i3 & 4) != 0 ? new r() : rVar);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final W toModel(Q q3) {
        C1022e c1022e;
        a0 a0Var;
        N n3 = q3.f9005a;
        if (n3 != null) {
            this.f9018a.getClass();
            c1022e = new C1022e(n3.f8996a);
        } else {
            c1022e = null;
        }
        P p3 = q3.f9006b;
        if (p3 != null) {
            this.f9019b.getClass();
            a0Var = new a0(p3.f9002a, p3.f9003b);
        } else {
            a0Var = null;
        }
        O o = q3.f9007c;
        return new W(c1022e, a0Var, o != null ? this.f9020c.toModel(o) : null);
    }
}
