package defpackage;

import android.graphics.Shader;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class ec1 extends op {
    public final long t;

    public ec1(long j) {
        this.t = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ec1) {
            return hi.c(this.t, ((ec1) obj).t);
        }
        return false;
    }

    public final int hashCode() {
        int i = hi.h;
        jk1 jk1Var = kk1.d;
        return Long.hashCode(this.t);
    }

    @Override // defpackage.op
    public final void p(float f, long j, xu1 xu1Var) {
        xu1Var.c(1.0f);
        long j2 = this.t;
        if (f != 1.0f) {
            j2 = hi.b(hi.d(j2) * f, j2);
        }
        xu1Var.e(j2);
        if (((Shader) xu1Var.c) != null) {
            xu1Var.g(null);
        }
    }

    public final String toString() {
        return "SolidColor(value=" + ((Object) hi.i(this.t)) + ')';
    }
}
