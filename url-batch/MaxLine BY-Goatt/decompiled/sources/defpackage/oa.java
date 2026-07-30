package defpackage;

import android.graphics.Path;
import android.graphics.RectF;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class oa {
    public final Path a;
    public RectF b;
    public float[] c;

    public oa(Path path) {
        this.a = path;
    }

    public static void a(oa oaVar, ub2 ub2Var) {
        pz1[] pz1VarArr = pz1.m;
        if (oaVar.b == null) {
            oaVar.b = new RectF();
        }
        RectF rectF = oaVar.b;
        rectF.getClass();
        float f = ub2Var.a;
        long j = ub2Var.h;
        long j2 = ub2Var.g;
        long j3 = ub2Var.f;
        long j4 = ub2Var.e;
        rectF.set(f, ub2Var.b, ub2Var.c, ub2Var.d);
        if (oaVar.c == null) {
            oaVar.c = new float[8];
        }
        float[] fArr = oaVar.c;
        fArr.getClass();
        fArr[0] = Float.intBitsToFloat((int) (j4 >> 32));
        fArr[1] = Float.intBitsToFloat((int) (j4 & 4294967295L));
        fArr[2] = Float.intBitsToFloat((int) (j3 >> 32));
        fArr[3] = Float.intBitsToFloat((int) (j3 & 4294967295L));
        fArr[4] = Float.intBitsToFloat((int) (j2 >> 32));
        fArr[5] = Float.intBitsToFloat((int) (j2 & 4294967295L));
        fArr[6] = Float.intBitsToFloat((int) (j >> 32));
        fArr[7] = Float.intBitsToFloat((int) (j & 4294967295L));
        Path path = oaVar.a;
        RectF rectF2 = oaVar.b;
        rectF2.getClass();
        float[] fArr2 = oaVar.c;
        fArr2.getClass();
        path.addRoundRect(rectF2, fArr2, Path.Direction.CCW);
    }

    public final w72 b() {
        if (this.b == null) {
            this.b = new RectF();
        }
        RectF rectF = this.b;
        rectF.getClass();
        this.a.computeBounds(rectF, true);
        return new w72(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public final void c(float f, float f2) {
        this.a.lineTo(f, f2);
    }

    public final boolean d(oa oaVar, oa oaVar2, int i) {
        Path.Op op = i == 0 ? Path.Op.DIFFERENCE : i == 1 ? Path.Op.INTERSECT : i == 4 ? Path.Op.REVERSE_DIFFERENCE : i == 2 ? Path.Op.UNION : Path.Op.XOR;
        if (!(oaVar instanceof oa)) {
            ch2.h("Unable to obtain android.graphics.Path");
            return false;
        }
        Path path = oaVar.a;
        if (oaVar2 instanceof oa) {
            return this.a.op(path, oaVar2.a, op);
        }
        ch2.h("Unable to obtain android.graphics.Path");
        return false;
    }
}
