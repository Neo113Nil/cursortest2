package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class Y implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C0695g f1719a;
    public final c0 b;
    public final r c;

    public Y() {
        this(null, null, null, 7, null);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Q fromModel(W w) {
        Q q = new Q();
        C0693e c0693e = w.f1717a;
        q.f1714a = c0693e != null ? this.f1719a.fromModel(c0693e) : null;
        a0 a0Var = w.b;
        q.b = a0Var != null ? this.b.fromModel(a0Var) : null;
        C0704p c0704p = w.c;
        q.c = c0704p != null ? this.c.fromModel(c0704p) : null;
        return q;
    }

    public Y(C0695g c0695g, c0 c0Var, r rVar) {
        this.f1719a = c0695g;
        this.b = c0Var;
        this.c = rVar;
    }

    public /* synthetic */ Y(C0695g c0695g, c0 c0Var, r rVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C0695g() : c0695g, (i & 2) != 0 ? new c0() : c0Var, (i & 4) != 0 ? new r() : rVar);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final W toModel(Q q) {
        C0693e c0693e;
        a0 a0Var;
        N n = q.f1714a;
        if (n != null) {
            this.f1719a.getClass();
            c0693e = new C0693e(n.f1711a);
        } else {
            c0693e = null;
        }
        P p = q.b;
        if (p != null) {
            this.b.getClass();
            a0Var = new a0(p.f1713a, p.b);
        } else {
            a0Var = null;
        }
        O o = q.c;
        return new W(c0693e, a0Var, o != null ? this.c.toModel(o) : null);
    }
}
