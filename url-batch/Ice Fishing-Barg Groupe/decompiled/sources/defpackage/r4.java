package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class r4 implements yj1 {
    public final Path PxuCJdSBwIXG;
    public float[] TSizfFm2Yiuu;
    public Matrix Y1f8riQaR6yg;
    public RectF lS5Rgt96tfkO;

    public r4(Path path) {
        this.PxuCJdSBwIXG = path;
    }

    public final void RAsUl2FVSrh6(int i) {
        bk1.Companion.getClass();
        this.PxuCJdSBwIXG.setFillType(i == 1 ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
    }

    public final qt1 Y1f8riQaR6yg() {
        if (this.lS5Rgt96tfkO == null) {
            this.lS5Rgt96tfkO = new RectF();
        }
        RectF rectF = this.lS5Rgt96tfkO;
        rectF.getClass();
        this.PxuCJdSBwIXG.computeBounds(rectF, true);
        return new qt1(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public final void a92UlCVFR9N8() {
        this.PxuCJdSBwIXG.reset();
    }

    public final boolean e9gEMXR7LXtO(yj1 yj1Var, yj1 yj1Var2, int i) {
        zk1.Companion.getClass();
        Path.Op op = i == 0 ? Path.Op.DIFFERENCE : i == 1 ? Path.Op.INTERSECT : i == 4 ? Path.Op.REVERSE_DIFFERENCE : i == 2 ? Path.Op.UNION : Path.Op.XOR;
        if (!(yj1Var instanceof r4)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        Path path = ((r4) yj1Var).PxuCJdSBwIXG;
        if (yj1Var2 instanceof r4) {
            return this.PxuCJdSBwIXG.op(path, ((r4) yj1Var2).PxuCJdSBwIXG, op);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }
}
