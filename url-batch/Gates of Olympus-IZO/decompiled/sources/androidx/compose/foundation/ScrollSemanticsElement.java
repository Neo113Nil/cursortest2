package androidx.compose.foundation;

import H2.AbstractC0080b;
import U.k;
import Z1.i;
import n.h0;
import n.k0;
import o.C0737m;
import t0.T;

/* loaded from: classes.dex */
final class ScrollSemanticsElement extends T {

    /* renamed from: a, reason: collision with root package name */
    public final k0 f3599a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3600b;

    /* renamed from: c, reason: collision with root package name */
    public final C0737m f3601c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f3602d;

    public ScrollSemanticsElement(k0 k0Var, boolean z3, C0737m c0737m, boolean z4) {
        this.f3599a = k0Var;
        this.f3600b = z3;
        this.f3601c = c0737m;
        this.f3602d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScrollSemanticsElement)) {
            return false;
        }
        ScrollSemanticsElement scrollSemanticsElement = (ScrollSemanticsElement) obj;
        return i.a(this.f3599a, scrollSemanticsElement.f3599a) && this.f3600b == scrollSemanticsElement.f3600b && i.a(this.f3601c, scrollSemanticsElement.f3601c) && this.f3602d == scrollSemanticsElement.f3602d;
    }

    @Override // t0.T
    public final k h() {
        h0 h0Var = new h0();
        h0Var.f6088q = this.f3599a;
        h0Var.f6089r = this.f3600b;
        h0Var.f6090s = true;
        return h0Var;
    }

    public final int hashCode() {
        int f3 = AbstractC0080b.f(this.f3599a.hashCode() * 31, 31, this.f3600b);
        C0737m c0737m = this.f3601c;
        return Boolean.hashCode(true) + AbstractC0080b.f((f3 + (c0737m == null ? 0 : c0737m.hashCode())) * 31, 31, this.f3602d);
    }

    @Override // t0.T
    public final void i(k kVar) {
        h0 h0Var = (h0) kVar;
        h0Var.f6088q = this.f3599a;
        h0Var.f6089r = this.f3600b;
        h0Var.f6090s = true;
    }

    public final String toString() {
        return "ScrollSemanticsElement(state=" + this.f3599a + ", reverseScrolling=" + this.f3600b + ", flingBehavior=" + this.f3601c + ", isScrollable=" + this.f3602d + ", isVertical=true)";
    }
}
