package androidx.compose.foundation.layout;

import r2.f;
import w1.x0;
import x.p0;
import y0.l;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
final class UnspecifiedConstraintsElement extends x0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f500a;

    /* renamed from: b, reason: collision with root package name */
    public final float f501b;

    public UnspecifiedConstraintsElement(float f6, float f8) {
        this.f500a = f6;
        this.f501b = f8;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UnspecifiedConstraintsElement)) {
            return false;
        }
        UnspecifiedConstraintsElement unspecifiedConstraintsElement = (UnspecifiedConstraintsElement) obj;
        return f.a(this.f500a, unspecifiedConstraintsElement.f500a) && f.a(this.f501b, unspecifiedConstraintsElement.f501b);
    }

    @Override // w1.x0
    public final l f() {
        p0 p0Var = new p0();
        p0Var.f8264r = this.f500a;
        p0Var.f8265s = this.f501b;
        return p0Var;
    }

    @Override // w1.x0
    public final void g(l lVar) {
        p0 p0Var = (p0) lVar;
        p0Var.f8264r = this.f500a;
        p0Var.f8265s = this.f501b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f501b) + (Float.hashCode(this.f500a) * 31);
    }
}
