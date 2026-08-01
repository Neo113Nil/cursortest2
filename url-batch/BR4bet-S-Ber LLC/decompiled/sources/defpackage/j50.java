package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class j50 extends o50 {
    public final l50 c;

    public j50(l50 l50Var) {
        this.c = l50Var;
    }

    @Override // defpackage.o50
    public final void a(Matrix matrix, c50 c50Var, int i, Canvas canvas) {
        l50 l50Var = this.c;
        float f = l50Var.f;
        float f2 = l50Var.g;
        RectF rectF = new RectF(l50Var.b, l50Var.c, l50Var.d, l50Var.e);
        Paint paint = c50Var.b;
        boolean z = f2 < 0.0f;
        Path path = c50Var.g;
        int[] iArr = c50.k;
        if (z) {
            iArr[0] = 0;
            iArr[1] = c50Var.f;
            iArr[2] = c50Var.e;
            iArr[3] = c50Var.d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = -i;
            rectF.inset(f3, f3);
            iArr[0] = 0;
            iArr[1] = c50Var.d;
            iArr[2] = c50Var.e;
            iArr[3] = c50Var.f;
        }
        float width = rectF.width() / 2.0f;
        if (width <= 0.0f) {
            return;
        }
        float f4 = 1.0f - (i / width);
        float[] fArr = c50.l;
        fArr[1] = f4;
        fArr[2] = ((1.0f - f4) / 2.0f) + f4;
        paint.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, iArr, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, c50Var.h);
        }
        canvas.drawArc(rectF, f, f2, true, paint);
        canvas.restore();
    }
}
