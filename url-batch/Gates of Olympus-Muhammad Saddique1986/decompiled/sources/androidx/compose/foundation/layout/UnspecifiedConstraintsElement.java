package androidx.compose.foundation.layout;

import O0.e;
import U.p;
import r.V;
import t0.U;

/* loaded from: classes.dex */
final class UnspecifiedConstraintsElement extends U {

    /* renamed from: a, reason: collision with root package name */
    public final float f4821a;

    /* renamed from: b, reason: collision with root package name */
    public final float f4822b;

    public UnspecifiedConstraintsElement(float f3, float f4) {
        this.f4821a = f3;
        this.f4822b = f4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UnspecifiedConstraintsElement)) {
            return false;
        }
        UnspecifiedConstraintsElement unspecifiedConstraintsElement = (UnspecifiedConstraintsElement) obj;
        return e.a(this.f4821a, unspecifiedConstraintsElement.f4821a) && e.a(this.f4822b, unspecifiedConstraintsElement.f4822b);
    }

    public final int hashCode() {
        return Float.hashCode(this.f4822b) + (Float.hashCode(this.f4821a) * 31);
    }

    @Override // t0.U
    public final p l() {
        V v3 = new V();
        v3.f7998q = this.f4821a;
        v3.f7999r = this.f4822b;
        return v3;
    }

    @Override // t0.U
    public final void m(p pVar) {
        V v3 = (V) pVar;
        v3.f7998q = this.f4821a;
        v3.f7999r = this.f4822b;
    }
}
