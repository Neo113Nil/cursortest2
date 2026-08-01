package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class kd0 extends pd0 {
    public final md0 c;

    public kd0(md0 md0Var) {
        this.c = md0Var;
    }

    @Override // defpackage.pd0
    public final void a(Matrix matrix, dd0 dd0Var, int i, Canvas canvas) {
        md0 md0Var = this.c;
        float f = md0Var.f;
        float f2 = md0Var.g;
        RectF rectF = new RectF(md0Var.b, md0Var.c, md0Var.d, md0Var.e);
        Paint paint = dd0Var.b;
        boolean z = f2 < 0.0f;
        Path path = dd0Var.g;
        int[] iArr = dd0.k;
        if (z) {
            iArr[0] = 0;
            iArr[1] = dd0Var.f;
            iArr[2] = dd0Var.e;
            iArr[3] = dd0Var.d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = -i;
            rectF.inset(f3, f3);
            iArr[0] = 0;
            iArr[1] = dd0Var.d;
            iArr[2] = dd0Var.e;
            iArr[3] = dd0Var.f;
        }
        float width = rectF.width() / 2.0f;
        if (width <= 0.0f) {
            return;
        }
        float f4 = 1.0f - (i / width);
        float[] fArr = dd0.l;
        fArr[1] = f4;
        fArr[2] = ((1.0f - f4) / 2.0f) + f4;
        paint.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, iArr, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, dd0Var.h);
        }
        canvas.drawArc(rectF, f, f2, true, paint);
        canvas.restore();
    }
}
