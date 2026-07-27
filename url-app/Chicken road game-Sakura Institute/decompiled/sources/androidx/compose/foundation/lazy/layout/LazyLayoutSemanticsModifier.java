package androidx.compose.foundation.lazy.layout;

import A.AbstractC0017m;
import S.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.N;
import r.d;
import r0.AbstractC1065f;
import r0.T;
import s.C1089E;

@Metadata
/* loaded from: classes.dex */
final class LazyLayoutSemanticsModifier extends T {

    /* renamed from: a, reason: collision with root package name */
    public final S2.c f5088a;

    /* renamed from: b, reason: collision with root package name */
    public final d f5089b;

    /* renamed from: c, reason: collision with root package name */
    public final N f5090c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f5091d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f5092e;

    public LazyLayoutSemanticsModifier(S2.c cVar, d dVar, N n2, boolean z4, boolean z5) {
        this.f5088a = cVar;
        this.f5089b = dVar;
        this.f5090c = n2;
        this.f5091d = z4;
        this.f5092e = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyLayoutSemanticsModifier)) {
            return false;
        }
        LazyLayoutSemanticsModifier lazyLayoutSemanticsModifier = (LazyLayoutSemanticsModifier) obj;
        return this.f5088a == lazyLayoutSemanticsModifier.f5088a && Intrinsics.a(this.f5089b, lazyLayoutSemanticsModifier.f5089b) && this.f5090c == lazyLayoutSemanticsModifier.f5090c && this.f5091d == lazyLayoutSemanticsModifier.f5091d && this.f5092e == lazyLayoutSemanticsModifier.f5092e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f5092e) + AbstractC0017m.d((this.f5090c.hashCode() + ((this.f5089b.hashCode() + (this.f5088a.hashCode() * 31)) * 31)) * 31, 31, this.f5091d);
    }

    @Override // r0.T
    public final n l() {
        return new C1089E(this.f5088a, this.f5089b, this.f5090c, this.f5091d, this.f5092e);
    }

    @Override // r0.T
    public final void m(n nVar) {
        C1089E c1089e = (C1089E) nVar;
        c1089e.f9884t = this.f5088a;
        c1089e.f9885u = this.f5089b;
        N n2 = c1089e.f9886v;
        N n4 = this.f5090c;
        if (n2 != n4) {
            c1089e.f9886v = n4;
            AbstractC1065f.p(c1089e);
        }
        boolean z4 = c1089e.f9887w;
        boolean z5 = this.f5091d;
        boolean z6 = this.f5092e;
        if (z4 == z5 && c1089e.f9888x == z6) {
            return;
        }
        c1089e.f9887w = z5;
        c1089e.f9888x = z6;
        c1089e.B0();
        AbstractC1065f.p(c1089e);
    }
}
