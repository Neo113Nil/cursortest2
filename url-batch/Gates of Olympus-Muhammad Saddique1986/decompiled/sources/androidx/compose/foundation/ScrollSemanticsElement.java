package androidx.compose.foundation;

import A.k;
import U.p;
import f2.j;
import n.v0;
import n.y0;
import p.C0775m;
import t0.U;

/* loaded from: classes.dex */
final class ScrollSemanticsElement extends U {

    /* renamed from: a, reason: collision with root package name */
    public final y0 f4777a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4778b;

    /* renamed from: c, reason: collision with root package name */
    public final C0775m f4779c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f4780d;

    public ScrollSemanticsElement(y0 y0Var, boolean z3, C0775m c0775m, boolean z4) {
        this.f4777a = y0Var;
        this.f4778b = z3;
        this.f4779c = c0775m;
        this.f4780d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScrollSemanticsElement)) {
            return false;
        }
        ScrollSemanticsElement scrollSemanticsElement = (ScrollSemanticsElement) obj;
        return j.a(this.f4777a, scrollSemanticsElement.f4777a) && this.f4778b == scrollSemanticsElement.f4778b && j.a(this.f4779c, scrollSemanticsElement.f4779c) && this.f4780d == scrollSemanticsElement.f4780d;
    }

    public final int hashCode() {
        int e3 = k.e(this.f4777a.hashCode() * 31, 31, this.f4778b);
        C0775m c0775m = this.f4779c;
        return Boolean.hashCode(true) + k.e((e3 + (c0775m == null ? 0 : c0775m.hashCode())) * 31, 31, this.f4780d);
    }

    @Override // t0.U
    public final p l() {
        v0 v0Var = new v0();
        v0Var.f7211q = this.f4777a;
        v0Var.f7212r = this.f4778b;
        v0Var.f7213s = true;
        return v0Var;
    }

    @Override // t0.U
    public final void m(p pVar) {
        v0 v0Var = (v0) pVar;
        v0Var.f7211q = this.f4777a;
        v0Var.f7212r = this.f4778b;
        v0Var.f7213s = true;
    }

    public final String toString() {
        return "ScrollSemanticsElement(state=" + this.f4777a + ", reverseScrolling=" + this.f4778b + ", flingBehavior=" + this.f4779c + ", isScrollable=" + this.f4780d + ", isVertical=true)";
    }
}
