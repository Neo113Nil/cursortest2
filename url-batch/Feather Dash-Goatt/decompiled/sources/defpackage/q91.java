package defpackage;

import android.graphics.Paint;
import android.graphics.Shader;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class q91 extends op {
    public nq0 t;
    public long u = 9205357640488583168L;

    public abstract Shader T(long j);

    @Override // defpackage.op
    public final void p(float f, long j, xu1 xu1Var) {
        Paint paint = (Paint) xu1Var.b;
        nq0 nq0Var = this.t;
        if (nq0Var == null || !va1.a(this.u, j)) {
            if (va1.c(j)) {
                this.t = null;
                this.u = 9205357640488583168L;
                nq0Var = null;
            } else {
                nq0Var = this.t;
                if (nq0Var == null) {
                    nq0Var = new nq0(15, false);
                    this.t = nq0Var;
                }
                nq0Var.e = T(j);
                this.t = nq0Var;
                this.u = j;
            }
        }
        long c = la0.c(paint.getColor());
        long j2 = hi.b;
        if (!hi.c(c, j2)) {
            xu1Var.e(j2);
        }
        if (!Intrinsics.a((Shader) xu1Var.c, nq0Var != null ? (Shader) nq0Var.e : null)) {
            xu1Var.g(nq0Var != null ? (Shader) nq0Var.e : null);
        }
        if (paint.getAlpha() / 255.0f == f) {
            return;
        }
        xu1Var.c(f);
    }
}
