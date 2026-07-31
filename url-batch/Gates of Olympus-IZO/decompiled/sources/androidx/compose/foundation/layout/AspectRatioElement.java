package androidx.compose.foundation.layout;

import U.k;
import r.C0814k;
import t0.T;

/* loaded from: classes.dex */
final class AspectRatioElement extends T {

    /* renamed from: a, reason: collision with root package name */
    public final float f3626a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3627b;

    public AspectRatioElement(float f3, boolean z3) {
        this.f3626a = f3;
        this.f3627b = z3;
        if (f3 > 0.0f) {
            return;
        }
        throw new IllegalArgumentException(("aspectRatio " + f3 + " must be > 0").toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        AspectRatioElement aspectRatioElement = obj instanceof AspectRatioElement ? (AspectRatioElement) obj : null;
        if (aspectRatioElement == null) {
            return false;
        }
        if (this.f3626a == aspectRatioElement.f3626a) {
            if (this.f3627b == ((AspectRatioElement) obj).f3627b) {
                return true;
            }
        }
        return false;
    }

    @Override // t0.T
    public final k h() {
        C0814k c0814k = new C0814k();
        c0814k.f7066q = this.f3626a;
        c0814k.f7067r = this.f3627b;
        return c0814k;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f3627b) + (Float.hashCode(this.f3626a) * 31);
    }

    @Override // t0.T
    public final void i(k kVar) {
        C0814k c0814k = (C0814k) kVar;
        c0814k.f7066q = this.f3626a;
        c0814k.f7067r = this.f3627b;
    }
}
