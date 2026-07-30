package androidx.compose.foundation.layout;

import m2.e;
import q.q0;
import r1.s0;
import s0.n;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
final class UnspecifiedConstraintsElement extends s0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f632a;

    /* renamed from: b, reason: collision with root package name */
    public final float f633b;

    public UnspecifiedConstraintsElement(float f9, float f10) {
        this.f632a = f9;
        this.f633b = f10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UnspecifiedConstraintsElement)) {
            return false;
        }
        UnspecifiedConstraintsElement unspecifiedConstraintsElement = (UnspecifiedConstraintsElement) obj;
        return e.a(this.f632a, unspecifiedConstraintsElement.f632a) && e.a(this.f633b, unspecifiedConstraintsElement.f633b);
    }

    public final int hashCode() {
        return Float.hashCode(this.f633b) + (Float.hashCode(this.f632a) * 31);
    }

    @Override // r1.s0
    public final n l() {
        q0 q0Var = new q0();
        q0Var.f7330s = this.f632a;
        q0Var.f7331t = this.f633b;
        return q0Var;
    }

    @Override // r1.s0
    public final void m(n nVar) {
        q0 q0Var = (q0) nVar;
        q0Var.f7330s = this.f632a;
        q0Var.f7331t = this.f633b;
    }
}
