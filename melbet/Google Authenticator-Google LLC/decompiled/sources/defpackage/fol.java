package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class fol extends fop {
    private final fon a;
    private final float b;
    private final float e;

    public fol(fon fonVar, float f, float f2) {
        this.a = fonVar;
        this.b = f;
        this.e = f2;
    }

    @Override // defpackage.fop
    public final void a(Matrix matrix, fns fnsVar, int i, Canvas canvas) {
        fon fonVar = this.a;
        float f = fonVar.b;
        float f2 = this.e;
        float f3 = fonVar.a;
        float f4 = this.b;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f - f2, f3 - f4), 0.0f);
        Matrix matrix2 = this.d;
        matrix2.set(matrix);
        matrix2.preTranslate(f4, f2);
        matrix2.preRotate(b());
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int[] iArr = fns.a;
        iArr[0] = fnsVar.j;
        iArr[1] = fnsVar.i;
        iArr[2] = fnsVar.h;
        LinearGradient linearGradient = new LinearGradient(rectF.left, rectF.top, rectF.left, rectF.bottom, iArr, fns.b, Shader.TileMode.CLAMP);
        Paint paint = fnsVar.g;
        paint.setShader(linearGradient);
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    final float b() {
        fon fonVar = this.a;
        return (float) Math.toDegrees(Math.atan((fonVar.b - this.e) / (fonVar.a - this.b)));
    }
}
