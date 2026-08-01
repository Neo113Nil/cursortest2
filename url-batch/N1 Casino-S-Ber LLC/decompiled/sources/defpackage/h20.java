package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class h20 extends m20 {
    public final j20 c;

    public h20(j20 j20Var) {
        this.c = j20Var;
    }

    @Override // defpackage.m20
    public final void a(Matrix matrix, a20 a20Var, int i, Canvas canvas) {
        j20 j20Var = this.c;
        float f = j20Var.f;
        float f2 = j20Var.g;
        RectF rectF = new RectF(j20Var.b, j20Var.c, j20Var.d, j20Var.e);
        Paint paint = a20Var.b;
        boolean z = f2 < 0.0f;
        Path path = a20Var.g;
        int[] iArr = a20.k;
        if (z) {
            iArr[0] = 0;
            iArr[1] = a20Var.f;
            iArr[2] = a20Var.e;
            iArr[3] = a20Var.d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = -i;
            rectF.inset(f3, f3);
            iArr[0] = 0;
            iArr[1] = a20Var.d;
            iArr[2] = a20Var.e;
            iArr[3] = a20Var.f;
        }
        float width = rectF.width() / 2.0f;
        if (width <= 0.0f) {
            return;
        }
        float f4 = 1.0f - (i / width);
        float[] fArr = a20.l;
        fArr[1] = f4;
        fArr[2] = ((1.0f - f4) / 2.0f) + f4;
        paint.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, iArr, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, a20Var.h);
        }
        canvas.drawArc(rectF, f, f2, true, paint);
        canvas.restore();
    }
}
