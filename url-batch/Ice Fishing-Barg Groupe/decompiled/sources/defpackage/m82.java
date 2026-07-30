package defpackage;

import android.graphics.Shader;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class m82 extends uf {
    public final long PxuCJdSBwIXG;

    public m82(long j) {
        this.PxuCJdSBwIXG = j;
    }

    @Override // defpackage.uf
    public final void PxuCJdSBwIXG(float f, long j, j4 j4Var) {
        j4Var.a92UlCVFR9N8(1.0f);
        long j2 = this.PxuCJdSBwIXG;
        if (f != 1.0f) {
            j2 = hl.lS5Rgt96tfkO(j2, hl.Y1f8riQaR6yg(j2) * f);
        }
        j4Var.rtx2ld2ELZv4(j2);
        if (((Shader) j4Var.Y1f8riQaR6yg) != null) {
            j4Var.dgRBjINgWbAK(null);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m82) {
            return hl.TSizfFm2Yiuu(this.PxuCJdSBwIXG, ((m82) obj).PxuCJdSBwIXG);
        }
        return false;
    }

    public final int hashCode() {
        gl glVar = hl.Companion;
        return Long.hashCode(this.PxuCJdSBwIXG);
    }

    public final String toString() {
        return "SolidColor(value=" + ((Object) hl.OPXfSBeufaJ8(this.PxuCJdSBwIXG)) + ')';
    }
}
