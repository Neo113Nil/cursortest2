package androidx.compose.foundation.lazy.layout;

import a0.q;
import a0.u0;
import q6.i;
import u.j0;
import w1.f;
import w1.x0;
import y0.l;
import z.d;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
final class LazyLayoutSemanticsModifier extends x0 {

    /* renamed from: a, reason: collision with root package name */
    public final p6.a f508a;

    /* renamed from: b, reason: collision with root package name */
    public final d f509b;

    /* renamed from: c, reason: collision with root package name */
    public final j0 f510c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f511d;

    public LazyLayoutSemanticsModifier(p6.a aVar, d dVar, j0 j0Var, boolean z3) {
        this.f508a = aVar;
        this.f509b = dVar;
        this.f510c = j0Var;
        this.f511d = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyLayoutSemanticsModifier)) {
            return false;
        }
        LazyLayoutSemanticsModifier lazyLayoutSemanticsModifier = (LazyLayoutSemanticsModifier) obj;
        return this.f508a == lazyLayoutSemanticsModifier.f508a && i.a(this.f509b, lazyLayoutSemanticsModifier.f509b) && this.f510c == lazyLayoutSemanticsModifier.f510c && this.f511d == lazyLayoutSemanticsModifier.f511d;
    }

    @Override // w1.x0
    public final l f() {
        return new u0(this.f508a, this.f509b, this.f510c, this.f511d);
    }

    @Override // w1.x0
    public final void g(l lVar) {
        u0 u0Var = (u0) lVar;
        u0Var.f148r = this.f508a;
        u0Var.f149s = this.f509b;
        j0 j0Var = u0Var.f150t;
        j0 j0Var2 = this.f510c;
        if (j0Var != j0Var2) {
            u0Var.f150t = j0Var2;
            f.n(u0Var);
        }
        boolean z3 = u0Var.f151u;
        boolean z7 = this.f511d;
        if (z3 == z7) {
            return;
        }
        u0Var.f151u = z7;
        u0Var.r0();
        f.n(u0Var);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + q.d((this.f510c.hashCode() + ((this.f509b.hashCode() + (this.f508a.hashCode() * 31)) * 31)) * 31, 31, this.f511d);
    }
}
