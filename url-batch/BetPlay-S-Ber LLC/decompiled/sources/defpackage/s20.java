package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class s20 extends w20 {
    public final u20 c;
    public final float d;
    public final float e;

    public s20(u20 u20Var, float f, float f2) {
        this.c = u20Var;
        this.d = f;
        this.e = f2;
    }

    @Override // defpackage.w20
    public final void a(Matrix matrix, k20 k20Var, int i, Canvas canvas) {
        u20 u20Var = this.c;
        float f = u20Var.c;
        float f2 = this.e;
        float f3 = u20Var.b;
        float f4 = this.d;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f - f2, f3 - f4), 0.0f);
        Matrix matrix2 = this.a;
        matrix2.set(matrix);
        matrix2.preTranslate(f4, f2);
        matrix2.preRotate(b());
        k20Var.getClass();
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int i2 = k20Var.f;
        int[] iArr = k20.i;
        iArr[0] = i2;
        iArr[1] = k20Var.e;
        iArr[2] = k20Var.d;
        Paint paint = k20Var.c;
        float f5 = rectF.left;
        paint.setShader(new LinearGradient(f5, rectF.top, f5, rectF.bottom, iArr, k20.j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float b() {
        u20 u20Var = this.c;
        return (float) Math.toDegrees(Math.atan((u20Var.c - this.e) / (u20Var.b - this.d)));
    }
}
