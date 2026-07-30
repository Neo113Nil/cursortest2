package defpackage;

import android.graphics.Path;
import android.graphics.RectF;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class c6 {
    public final Path a;
    public RectF b;
    public float[] c;

    public c6(Path path) {
        this.a = path;
    }

    public static void a(c6 c6Var, c6 c6Var2) {
        c6Var.a.addPath(c6Var2.a, Float.intBitsToFloat(0), Float.intBitsToFloat(0));
    }

    public static void b(c6 c6Var, l41 l41Var) {
        ev0[] ev0VarArr = ev0.d;
        if (c6Var.b == null) {
            c6Var.b = new RectF();
        }
        RectF rectF = c6Var.b;
        rectF.getClass();
        float f = l41Var.a;
        long j = l41Var.h;
        long j2 = l41Var.g;
        long j3 = l41Var.f;
        long j4 = l41Var.e;
        rectF.set(f, l41Var.b, l41Var.c, l41Var.d);
        if (c6Var.c == null) {
            c6Var.c = new float[8];
        }
        float[] fArr = c6Var.c;
        fArr.getClass();
        fArr[0] = Float.intBitsToFloat((int) (j4 >> 32));
        fArr[1] = Float.intBitsToFloat((int) (j4 & 4294967295L));
        fArr[2] = Float.intBitsToFloat((int) (j3 >> 32));
        fArr[3] = Float.intBitsToFloat((int) (j3 & 4294967295L));
        fArr[4] = Float.intBitsToFloat((int) (j2 >> 32));
        fArr[5] = Float.intBitsToFloat((int) (j2 & 4294967295L));
        fArr[6] = Float.intBitsToFloat((int) (j >> 32));
        fArr[7] = Float.intBitsToFloat((int) (j & 4294967295L));
        Path path = c6Var.a;
        RectF rectF2 = c6Var.b;
        rectF2.getClass();
        float[] fArr2 = c6Var.c;
        fArr2.getClass();
        path.addRoundRect(rectF2, fArr2, Path.Direction.CCW);
    }

    public final void c() {
        this.a.reset();
    }
}
