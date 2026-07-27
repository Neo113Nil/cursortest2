package androidx.compose.foundation.layout;

import M0.e;
import S.n;
import kotlin.Metadata;
import q.k0;
import r0.T;

@Metadata
/* loaded from: classes.dex */
final class UnspecifiedConstraintsElement extends T {

    /* renamed from: a, reason: collision with root package name */
    public final float f5074a;

    /* renamed from: b, reason: collision with root package name */
    public final float f5075b;

    public UnspecifiedConstraintsElement(float f4, float f5) {
        this.f5074a = f4;
        this.f5075b = f5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UnspecifiedConstraintsElement)) {
            return false;
        }
        UnspecifiedConstraintsElement unspecifiedConstraintsElement = (UnspecifiedConstraintsElement) obj;
        return e.a(this.f5074a, unspecifiedConstraintsElement.f5074a) && e.a(this.f5075b, unspecifiedConstraintsElement.f5075b);
    }

    public final int hashCode() {
        return Float.hashCode(this.f5075b) + (Float.hashCode(this.f5074a) * 31);
    }

    @Override // r0.T
    public final n l() {
        k0 k0Var = new k0();
        k0Var.f9272t = this.f5074a;
        k0Var.f9273u = this.f5075b;
        return k0Var;
    }

    @Override // r0.T
    public final void m(n nVar) {
        k0 k0Var = (k0) nVar;
        k0Var.f9272t = this.f5074a;
        k0Var.f9273u = this.f5075b;
    }
}
