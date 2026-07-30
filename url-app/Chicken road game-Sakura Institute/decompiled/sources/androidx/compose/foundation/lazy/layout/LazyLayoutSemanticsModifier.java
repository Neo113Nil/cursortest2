package androidx.compose.foundation.lazy.layout;

import a0.m;
import o.j0;
import r1.f;
import r1.s0;
import r6.k;
import s.d0;
import s0.n;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
final class LazyLayoutSemanticsModifier extends s0 {

    /* renamed from: a, reason: collision with root package name */
    public final q6.a f646a;

    /* renamed from: b, reason: collision with root package name */
    public final r.c f647b;

    /* renamed from: c, reason: collision with root package name */
    public final j0 f648c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f649d;

    public LazyLayoutSemanticsModifier(q6.a aVar, r.c cVar, j0 j0Var, boolean z8) {
        this.f646a = aVar;
        this.f647b = cVar;
        this.f648c = j0Var;
        this.f649d = z8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyLayoutSemanticsModifier)) {
            return false;
        }
        LazyLayoutSemanticsModifier lazyLayoutSemanticsModifier = (LazyLayoutSemanticsModifier) obj;
        return this.f646a == lazyLayoutSemanticsModifier.f646a && k.a(this.f647b, lazyLayoutSemanticsModifier.f647b) && this.f648c == lazyLayoutSemanticsModifier.f648c && this.f649d == lazyLayoutSemanticsModifier.f649d;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + m.e((this.f648c.hashCode() + ((this.f647b.hashCode() + (this.f646a.hashCode() * 31)) * 31)) * 31, 31, this.f649d);
    }

    @Override // r1.s0
    public final n l() {
        return new d0(this.f646a, this.f647b, this.f648c, this.f649d);
    }

    @Override // r1.s0
    public final void m(n nVar) {
        d0 d0Var = (d0) nVar;
        d0Var.f7991s = this.f646a;
        d0Var.f7992t = this.f647b;
        j0 j0Var = d0Var.f7993u;
        j0 j0Var2 = this.f648c;
        if (j0Var != j0Var2) {
            d0Var.f7993u = j0Var2;
            f.o(d0Var);
        }
        boolean z8 = d0Var.f7994v;
        boolean z9 = this.f649d;
        if (z8 == z9) {
            return;
        }
        d0Var.f7994v = z9;
        d0Var.A0();
        f.o(d0Var);
    }
}
