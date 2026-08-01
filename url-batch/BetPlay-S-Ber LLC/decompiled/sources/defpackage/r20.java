package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class r20 extends w20 {
    public final t20 c;

    public r20(t20 t20Var) {
        this.c = t20Var;
    }

    @Override // defpackage.w20
    public final void a(Matrix matrix, k20 k20Var, int i, Canvas canvas) {
        t20 t20Var = this.c;
        float f = t20Var.f;
        float f2 = t20Var.g;
        RectF rectF = new RectF(t20Var.b, t20Var.c, t20Var.d, t20Var.e);
        Paint paint = k20Var.b;
        boolean z = f2 < 0.0f;
        Path path = k20Var.g;
        int[] iArr = k20.k;
        if (z) {
            iArr[0] = 0;
            iArr[1] = k20Var.f;
            iArr[2] = k20Var.e;
            iArr[3] = k20Var.d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = -i;
            rectF.inset(f3, f3);
            iArr[0] = 0;
            iArr[1] = k20Var.d;
            iArr[2] = k20Var.e;
            iArr[3] = k20Var.f;
        }
        float width = rectF.width() / 2.0f;
        if (width <= 0.0f) {
            return;
        }
        float f4 = 1.0f - (i / width);
        float[] fArr = k20.l;
        fArr[1] = f4;
        fArr[2] = ((1.0f - f4) / 2.0f) + f4;
        paint.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, iArr, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, k20Var.h);
        }
        canvas.drawArc(rectF, f, f2, true, paint);
        canvas.restore();
    }
}
