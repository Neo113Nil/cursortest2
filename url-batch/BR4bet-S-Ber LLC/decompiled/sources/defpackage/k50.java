package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class k50 extends o50 {
    public final m50 c;
    public final float d;
    public final float e;

    public k50(m50 m50Var, float f, float f2) {
        this.c = m50Var;
        this.d = f;
        this.e = f2;
    }

    @Override // defpackage.o50
    public final void a(Matrix matrix, c50 c50Var, int i, Canvas canvas) {
        m50 m50Var = this.c;
        float f = m50Var.c;
        float f2 = this.e;
        float f3 = m50Var.b;
        float f4 = this.d;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f - f2, f3 - f4), 0.0f);
        Matrix matrix2 = this.a;
        matrix2.set(matrix);
        matrix2.preTranslate(f4, f2);
        matrix2.preRotate(b());
        c50Var.getClass();
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int i2 = c50Var.f;
        int[] iArr = c50.i;
        iArr[0] = i2;
        iArr[1] = c50Var.e;
        iArr[2] = c50Var.d;
        Paint paint = c50Var.c;
        float f5 = rectF.left;
        paint.setShader(new LinearGradient(f5, rectF.top, f5, rectF.bottom, iArr, c50.j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float b() {
        m50 m50Var = this.c;
        return (float) Math.toDegrees(Math.atan((m50Var.c - this.e) / (m50Var.b - this.d)));
    }
}
