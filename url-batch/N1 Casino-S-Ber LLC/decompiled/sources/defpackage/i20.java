package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class i20 extends m20 {
    public final k20 c;
    public final float d;
    public final float e;

    public i20(k20 k20Var, float f, float f2) {
        this.c = k20Var;
        this.d = f;
        this.e = f2;
    }

    @Override // defpackage.m20
    public final void a(Matrix matrix, a20 a20Var, int i, Canvas canvas) {
        k20 k20Var = this.c;
        float f = k20Var.c;
        float f2 = this.e;
        float f3 = k20Var.b;
        float f4 = this.d;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f - f2, f3 - f4), 0.0f);
        Matrix matrix2 = this.a;
        matrix2.set(matrix);
        matrix2.preTranslate(f4, f2);
        matrix2.preRotate(b());
        a20Var.getClass();
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int i2 = a20Var.f;
        int[] iArr = a20.i;
        iArr[0] = i2;
        iArr[1] = a20Var.e;
        iArr[2] = a20Var.d;
        Paint paint = a20Var.c;
        float f5 = rectF.left;
        paint.setShader(new LinearGradient(f5, rectF.top, f5, rectF.bottom, iArr, a20.j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float b() {
        k20 k20Var = this.c;
        return (float) Math.toDegrees(Math.atan((k20Var.c - this.e) / (k20Var.b - this.d)));
    }
}
