package defpackage;

import android.graphics.Paint;
import android.graphics.Shader;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class bk2 extends cq {
    public ot2 a;
    public long b = 9205357640488583168L;

    @Override // defpackage.cq
    public final void a(float f, long j, vs3 vs3Var) {
        Paint paint = (Paint) vs3Var.b;
        ot2 ot2Var = this.a;
        if (ot2Var == null || !ql2.a(this.b, j)) {
            if (ql2.e(j)) {
                this.a = null;
                this.b = 9205357640488583168L;
                ot2Var = null;
            } else {
                ot2Var = this.a;
                if (ot2Var == null) {
                    ot2Var = new ot2(3, false);
                    this.a = ot2Var;
                }
                ot2Var.n = b(j);
                this.a = ot2Var;
                this.b = j;
            }
        }
        long c = ap.c(paint.getColor());
        long j2 = aw.b;
        if (!aw.c(c, j2)) {
            vs3Var.e(j2);
        }
        if (!Intrinsics.b((Shader) vs3Var.c, ot2Var != null ? (Shader) ot2Var.n : null)) {
            Shader shader = ot2Var != null ? (Shader) ot2Var.n : null;
            vs3Var.c = shader;
            paint.setShader(shader);
        }
        if (paint.getAlpha() / 255.0f == f) {
            return;
        }
        vs3Var.c(f);
    }

    public abstract Shader b(long j);
}
