package androidx.compose.foundation;

import H2.AbstractC0080b;
import U.k;
import Z1.i;
import n.k0;
import n.l0;
import t0.T;

/* loaded from: classes.dex */
public final class ScrollingLayoutElement extends T {

    /* renamed from: a, reason: collision with root package name */
    public final k0 f3603a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3604b;

    public ScrollingLayoutElement(k0 k0Var, boolean z3) {
        this.f3603a = k0Var;
        this.f3604b = z3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ScrollingLayoutElement)) {
            return false;
        }
        ScrollingLayoutElement scrollingLayoutElement = (ScrollingLayoutElement) obj;
        return i.a(this.f3603a, scrollingLayoutElement.f3603a) && this.f3604b == scrollingLayoutElement.f3604b;
    }

    @Override // t0.T
    public final k h() {
        l0 l0Var = new l0();
        l0Var.f6117q = this.f3603a;
        l0Var.f6118r = this.f3604b;
        l0Var.f6119s = true;
        return l0Var;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + AbstractC0080b.f(this.f3603a.hashCode() * 31, 31, this.f3604b);
    }

    @Override // t0.T
    public final void i(k kVar) {
        l0 l0Var = (l0) kVar;
        l0Var.f6117q = this.f3603a;
        l0Var.f6118r = this.f3604b;
        l0Var.f6119s = true;
    }
}
