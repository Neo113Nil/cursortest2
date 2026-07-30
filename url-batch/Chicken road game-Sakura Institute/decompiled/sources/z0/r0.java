package z0;

import android.graphics.Shader;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class r0 extends p {

    /* renamed from: a, reason: collision with root package name */
    public final long f10045a;

    public r0(long j8) {
        this.f10045a = j8;
    }

    @Override // z0.p
    public final void a(float f9, long j8, f7.i0 i0Var) {
        i0Var.c(1.0f);
        long j9 = this.f10045a;
        if (f9 != 1.0f) {
            j9 = u.b(j9, u.d(j9) * f9);
        }
        i0Var.e(j9);
        if (((Shader) i0Var.f3489c) != null) {
            i0Var.h(null);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r0) {
            return u.c(this.f10045a, ((r0) obj).f10045a);
        }
        return false;
    }

    public final int hashCode() {
        int i7 = u.f10058h;
        return Long.hashCode(this.f10045a);
    }

    public final String toString() {
        return "SolidColor(value=" + ((Object) u.i(this.f10045a)) + ')';
    }
}
