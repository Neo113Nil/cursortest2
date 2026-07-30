package defpackage;

import android.graphics.Paint;
import android.graphics.Shader;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class vf extends uf {
    public b42 PxuCJdSBwIXG;
    public final /* synthetic */ Shader TSizfFm2Yiuu;
    public long lS5Rgt96tfkO;

    public vf(Shader shader) {
        this.TSizfFm2Yiuu = shader;
        a62.Companion.getClass();
        this.lS5Rgt96tfkO = 9205357640488583168L;
    }

    @Override // defpackage.uf
    public final void PxuCJdSBwIXG(float f, long j, j4 j4Var) {
        Paint paint = (Paint) j4Var.TSizfFm2Yiuu;
        b42 b42Var = this.PxuCJdSBwIXG;
        if (b42Var == null || !a62.PxuCJdSBwIXG(this.lS5Rgt96tfkO, j)) {
            if (a62.TSizfFm2Yiuu(j)) {
                this.PxuCJdSBwIXG = null;
                a62.Companion.getClass();
                this.lS5Rgt96tfkO = 9205357640488583168L;
                b42Var = null;
            } else {
                b42Var = this.PxuCJdSBwIXG;
                if (b42Var == null) {
                    b42Var = new b42(11);
                    this.PxuCJdSBwIXG = b42Var;
                }
                b42Var.OPXfSBeufaJ8 = this.TSizfFm2Yiuu;
                this.PxuCJdSBwIXG = b42Var;
                this.lS5Rgt96tfkO = j;
            }
        }
        long TSizfFm2Yiuu = mm2.TSizfFm2Yiuu(paint.getColor());
        hl.Companion.getClass();
        long j2 = hl.lS5Rgt96tfkO;
        if (!hl.TSizfFm2Yiuu(TSizfFm2Yiuu, j2)) {
            j4Var.rtx2ld2ELZv4(j2);
        }
        if (!cs0.wdg6QnbFHrFF((Shader) j4Var.Y1f8riQaR6yg, b42Var != null ? (Shader) b42Var.OPXfSBeufaJ8 : null)) {
            j4Var.dgRBjINgWbAK(b42Var != null ? (Shader) b42Var.OPXfSBeufaJ8 : null);
        }
        if (paint.getAlpha() / 255.0f == f) {
            return;
        }
        j4Var.a92UlCVFR9N8(f);
    }
}
