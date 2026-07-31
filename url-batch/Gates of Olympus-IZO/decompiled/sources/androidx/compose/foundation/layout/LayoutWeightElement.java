package androidx.compose.foundation.layout;

import U.k;
import r.C0793E;
import t0.T;

/* loaded from: classes.dex */
public final class LayoutWeightElement extends T {

    /* renamed from: a, reason: collision with root package name */
    public final float f3630a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3631b;

    public LayoutWeightElement(float f3, boolean z3) {
        this.f3630a = f3;
        this.f3631b = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        LayoutWeightElement layoutWeightElement = obj instanceof LayoutWeightElement ? (LayoutWeightElement) obj : null;
        if (layoutWeightElement == null) {
            return false;
        }
        return this.f3630a == layoutWeightElement.f3630a && this.f3631b == layoutWeightElement.f3631b;
    }

    @Override // t0.T
    public final k h() {
        C0793E c0793e = new C0793E();
        c0793e.f6997q = this.f3630a;
        c0793e.f6998r = this.f3631b;
        return c0793e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f3631b) + (Float.hashCode(this.f3630a) * 31);
    }

    @Override // t0.T
    public final void i(k kVar) {
        C0793E c0793e = (C0793E) kVar;
        c0793e.f6997q = this.f3630a;
        c0793e.f6998r = this.f3631b;
    }
}
