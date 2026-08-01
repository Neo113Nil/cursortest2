package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class ld0 extends pd0 {
    public final nd0 c;
    public final float d;
    public final float e;

    public ld0(nd0 nd0Var, float f, float f2) {
        this.c = nd0Var;
        this.d = f;
        this.e = f2;
    }

    @Override // defpackage.pd0
    public final void a(Matrix matrix, dd0 dd0Var, int i, Canvas canvas) {
        nd0 nd0Var = this.c;
        float f = nd0Var.c;
        float f2 = this.e;
        float f3 = nd0Var.b;
        float f4 = this.d;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f - f2, f3 - f4), 0.0f);
        Matrix matrix2 = this.a;
        matrix2.set(matrix);
        matrix2.preTranslate(f4, f2);
        matrix2.preRotate(b());
        dd0Var.getClass();
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int i2 = dd0Var.f;
        int[] iArr = dd0.i;
        iArr[0] = i2;
        iArr[1] = dd0Var.e;
        iArr[2] = dd0Var.d;
        Paint paint = dd0Var.c;
        float f5 = rectF.left;
        paint.setShader(new LinearGradient(f5, rectF.top, f5, rectF.bottom, iArr, dd0.j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float b() {
        nd0 nd0Var = this.c;
        return (float) Math.toDegrees(Math.atan((nd0Var.c - this.e) / (nd0Var.b - this.d)));
    }
}
