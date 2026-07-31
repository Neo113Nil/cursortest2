package androidx.compose.foundation.layout;

import M0.e;
import U.k;
import r.S;
import t0.T;

/* loaded from: classes.dex */
final class UnspecifiedConstraintsElement extends T {

    /* renamed from: a, reason: collision with root package name */
    public final float f3642a;

    /* renamed from: b, reason: collision with root package name */
    public final float f3643b;

    public UnspecifiedConstraintsElement(float f3, float f4) {
        this.f3642a = f3;
        this.f3643b = f4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UnspecifiedConstraintsElement)) {
            return false;
        }
        UnspecifiedConstraintsElement unspecifiedConstraintsElement = (UnspecifiedConstraintsElement) obj;
        return e.a(this.f3642a, unspecifiedConstraintsElement.f3642a) && e.a(this.f3643b, unspecifiedConstraintsElement.f3643b);
    }

    @Override // t0.T
    public final k h() {
        S s3 = new S();
        s3.f7024q = this.f3642a;
        s3.f7025r = this.f3643b;
        return s3;
    }

    public final int hashCode() {
        return Float.hashCode(this.f3643b) + (Float.hashCode(this.f3642a) * 31);
    }

    @Override // t0.T
    public final void i(k kVar) {
        S s3 = (S) kVar;
        s3.f7024q = this.f3642a;
        s3.f7025r = this.f3643b;
    }
}
