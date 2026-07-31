package androidx.compose.foundation.layout;

import U.p;
import r.C0846H;
import t0.U;

/* loaded from: classes.dex */
public final class LayoutWeightElement extends U {

    /* renamed from: a, reason: collision with root package name */
    public final float f4809a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4810b;

    public LayoutWeightElement(float f3, boolean z3) {
        this.f4809a = f3;
        this.f4810b = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        LayoutWeightElement layoutWeightElement = obj instanceof LayoutWeightElement ? (LayoutWeightElement) obj : null;
        if (layoutWeightElement == null) {
            return false;
        }
        return this.f4809a == layoutWeightElement.f4809a && this.f4810b == layoutWeightElement.f4810b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f4810b) + (Float.hashCode(this.f4809a) * 31);
    }

    @Override // t0.U
    public final p l() {
        C0846H c0846h = new C0846H();
        c0846h.f7970q = this.f4809a;
        c0846h.f7971r = this.f4810b;
        return c0846h;
    }

    @Override // t0.U
    public final void m(p pVar) {
        C0846H c0846h = (C0846H) pVar;
        c0846h.f7970q = this.f4809a;
        c0846h.f7971r = this.f4810b;
    }
}
