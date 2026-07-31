package androidx.compose.foundation.layout;

import w1.x0;
import x.c0;
import y0.l;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class LayoutWeightElement extends x0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f488a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f489b;

    public LayoutWeightElement(float f6, boolean z3) {
        this.f488a = f6;
        this.f489b = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        LayoutWeightElement layoutWeightElement = obj instanceof LayoutWeightElement ? (LayoutWeightElement) obj : null;
        return layoutWeightElement != null && this.f488a == layoutWeightElement.f488a && this.f489b == layoutWeightElement.f489b;
    }

    @Override // w1.x0
    public final l f() {
        c0 c0Var = new c0();
        c0Var.f8204r = this.f488a;
        c0Var.f8205s = this.f489b;
        return c0Var;
    }

    @Override // w1.x0
    public final void g(l lVar) {
        c0 c0Var = (c0) lVar;
        c0Var.f8204r = this.f488a;
        c0Var.f8205s = this.f489b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f489b) + (Float.hashCode(this.f488a) * 31);
    }
}
