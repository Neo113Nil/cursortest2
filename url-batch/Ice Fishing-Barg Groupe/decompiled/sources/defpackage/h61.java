package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final /* synthetic */ class h61 implements le0 {
    public final /* synthetic */ Object OPXfSBeufaJ8;
    public final /* synthetic */ int dgRBjINgWbAK;
    public final /* synthetic */ int rtx2ld2ELZv4;
    public final /* synthetic */ int wdg6QnbFHrFF;

    public /* synthetic */ h61(int i, int i2, em1 em1Var) {
        this.rtx2ld2ELZv4 = 0;
        this.wdg6QnbFHrFF = i;
        this.OPXfSBeufaJ8 = em1Var;
        this.dgRBjINgWbAK = i2;
    }

    @Override // defpackage.le0
    public final Object OPXfSBeufaJ8(Object obj) {
        int i = this.rtx2ld2ELZv4;
        no2 no2Var = no2.PxuCJdSBwIXG;
        int i2 = this.dgRBjINgWbAK;
        int i3 = this.wdg6QnbFHrFF;
        Object obj2 = this.OPXfSBeufaJ8;
        switch (i) {
            case 0:
                dm1.RAsUl2FVSrh6((dm1) obj, (em1) obj2, b51.IXK6ba3ucyzm((i3 - r11.rtx2ld2ELZv4) / 2.0f), b51.IXK6ba3ucyzm((i2 - r11.OPXfSBeufaJ8) / 2.0f));
                break;
            case 1:
                dm1.RAsUl2FVSrh6((dm1) obj, (em1) obj2, i3, i2);
                break;
            default:
                r4 r4Var = (r4) obj2;
                xi1 xi1Var = (xi1) obj;
                m4 m4Var = xi1Var.PxuCJdSBwIXG;
                int Y1f8riQaR6yg = xi1Var.Y1f8riQaR6yg(i3);
                int Y1f8riQaR6yg2 = xi1Var.Y1f8riQaR6yg(i2);
                CharSequence charSequence = m4Var.e9gEMXR7LXtO;
                if (Y1f8riQaR6yg < 0 || Y1f8riQaR6yg > Y1f8riQaR6yg2 || Y1f8riQaR6yg2 > charSequence.length()) {
                    fp0.PxuCJdSBwIXG("start(" + Y1f8riQaR6yg + ") or end(" + Y1f8riQaR6yg2 + ") is out of range [0.." + charSequence.length() + "], or start > end!");
                }
                Path path = new Path();
                hi2 hi2Var = m4Var.Y1f8riQaR6yg;
                hi2Var.a92UlCVFR9N8.getSelectionPath(Y1f8riQaR6yg, Y1f8riQaR6yg2, path);
                int i4 = hi2Var.rtx2ld2ELZv4;
                if (i4 != 0 && !path.isEmpty()) {
                    path.offset(0.0f, i4);
                }
                r4 r4Var2 = new r4(path);
                float f = xi1Var.a92UlCVFR9N8;
                long floatToRawIntBits = (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L);
                Matrix matrix = r4Var2.Y1f8riQaR6yg;
                if (matrix == null) {
                    r4Var2.Y1f8riQaR6yg = new Matrix();
                } else {
                    matrix.reset();
                }
                Matrix matrix2 = r4Var2.Y1f8riQaR6yg;
                matrix2.getClass();
                matrix2.setTranslate(Float.intBitsToFloat((int) (floatToRawIntBits >> 32)), Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)));
                Matrix matrix3 = r4Var2.Y1f8riQaR6yg;
                matrix3.getClass();
                path.transform(matrix3);
                yj1.lS5Rgt96tfkO(r4Var, r4Var2);
                break;
        }
        return no2Var;
    }

    public /* synthetic */ h61(Object obj, int i, int i2, int i3) {
        this.rtx2ld2ELZv4 = i3;
        this.OPXfSBeufaJ8 = obj;
        this.wdg6QnbFHrFF = i;
        this.dgRBjINgWbAK = i2;
    }
}
