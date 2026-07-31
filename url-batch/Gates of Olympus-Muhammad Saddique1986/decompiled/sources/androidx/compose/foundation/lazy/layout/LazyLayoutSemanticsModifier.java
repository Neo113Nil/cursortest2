package androidx.compose.foundation.lazy.layout;

import A.k;
import U.p;
import f2.j;
import l2.InterfaceC0602c;
import p.P;
import s.C0935d;
import t.F;
import t0.AbstractC0993f;
import t0.U;

/* loaded from: classes.dex */
final class LazyLayoutSemanticsModifier extends U {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0602c f4833a;

    /* renamed from: b, reason: collision with root package name */
    public final C0935d f4834b;

    /* renamed from: c, reason: collision with root package name */
    public final P f4835c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f4836d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f4837e;

    public LazyLayoutSemanticsModifier(InterfaceC0602c interfaceC0602c, C0935d c0935d, P p3, boolean z3, boolean z4) {
        this.f4833a = interfaceC0602c;
        this.f4834b = c0935d;
        this.f4835c = p3;
        this.f4836d = z3;
        this.f4837e = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyLayoutSemanticsModifier)) {
            return false;
        }
        LazyLayoutSemanticsModifier lazyLayoutSemanticsModifier = (LazyLayoutSemanticsModifier) obj;
        return this.f4833a == lazyLayoutSemanticsModifier.f4833a && j.a(this.f4834b, lazyLayoutSemanticsModifier.f4834b) && this.f4835c == lazyLayoutSemanticsModifier.f4835c && this.f4836d == lazyLayoutSemanticsModifier.f4836d && this.f4837e == lazyLayoutSemanticsModifier.f4837e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f4837e) + k.e((this.f4835c.hashCode() + ((this.f4834b.hashCode() + (this.f4833a.hashCode() * 31)) * 31)) * 31, 31, this.f4836d);
    }

    @Override // t0.U
    public final p l() {
        return new F(this.f4833a, this.f4834b, this.f4835c, this.f4836d, this.f4837e);
    }

    @Override // t0.U
    public final void m(p pVar) {
        F f3 = (F) pVar;
        f3.f8431q = this.f4833a;
        f3.f8432r = this.f4834b;
        P p3 = f3.f8433s;
        P p4 = this.f4835c;
        if (p3 != p4) {
            f3.f8433s = p4;
            AbstractC0993f.o(f3);
        }
        boolean z3 = f3.f8434t;
        boolean z4 = this.f4836d;
        boolean z5 = this.f4837e;
        if (z3 == z4 && f3.f8435u == z5) {
            return;
        }
        f3.f8434t = z4;
        f3.f8435u = z5;
        f3.y0();
        AbstractC0993f.o(f3);
    }
}
