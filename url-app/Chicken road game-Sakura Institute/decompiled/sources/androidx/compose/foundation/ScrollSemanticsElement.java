package androidx.compose.foundation;

import A.AbstractC0017m;
import S.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m.r0;
import m.u0;
import o.C0898m;
import r0.T;

@Metadata
/* loaded from: classes.dex */
final class ScrollSemanticsElement extends T {

    /* renamed from: a, reason: collision with root package name */
    public final u0 f5030a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5031b;

    /* renamed from: c, reason: collision with root package name */
    public final C0898m f5032c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f5033d;

    public ScrollSemanticsElement(u0 u0Var, boolean z4, C0898m c0898m, boolean z5) {
        this.f5030a = u0Var;
        this.f5031b = z4;
        this.f5032c = c0898m;
        this.f5033d = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScrollSemanticsElement)) {
            return false;
        }
        ScrollSemanticsElement scrollSemanticsElement = (ScrollSemanticsElement) obj;
        return Intrinsics.a(this.f5030a, scrollSemanticsElement.f5030a) && this.f5031b == scrollSemanticsElement.f5031b && Intrinsics.a(this.f5032c, scrollSemanticsElement.f5032c) && this.f5033d == scrollSemanticsElement.f5033d;
    }

    public final int hashCode() {
        int d4 = AbstractC0017m.d(this.f5030a.hashCode() * 31, 31, this.f5031b);
        C0898m c0898m = this.f5032c;
        return Boolean.hashCode(true) + AbstractC0017m.d((d4 + (c0898m == null ? 0 : c0898m.hashCode())) * 31, 31, this.f5033d);
    }

    @Override // r0.T
    public final n l() {
        r0 r0Var = new r0();
        r0Var.f8172t = this.f5030a;
        r0Var.f8173u = this.f5031b;
        r0Var.f8174v = true;
        return r0Var;
    }

    @Override // r0.T
    public final void m(n nVar) {
        r0 r0Var = (r0) nVar;
        r0Var.f8172t = this.f5030a;
        r0Var.f8173u = this.f5031b;
        r0Var.f8174v = true;
    }

    public final String toString() {
        return "ScrollSemanticsElement(state=" + this.f5030a + ", reverseScrolling=" + this.f5031b + ", flingBehavior=" + this.f5032c + ", isScrollable=" + this.f5033d + ", isVertical=true)";
    }
}
