package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class fok extends fop {
    private final fom a;

    public fok(fom fomVar) {
        this.a = fomVar;
    }

    @Override // defpackage.fop
    public final void a(Matrix matrix, fns fnsVar, int i, Canvas canvas) {
        fom fomVar = this.a;
        float f = fomVar.e;
        float f2 = fomVar.f;
        RectF rectF = new RectF(fomVar.a, fomVar.b, fomVar.c, fomVar.d);
        boolean z = f2 < 0.0f;
        Path path = fnsVar.k;
        if (z) {
            int[] iArr = fns.c;
            iArr[0] = 0;
            iArr[1] = fnsVar.j;
            iArr[2] = fnsVar.i;
            iArr[3] = fnsVar.h;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = -i;
            rectF.inset(f3, f3);
            int[] iArr2 = fns.c;
            iArr2[0] = 0;
            iArr2[1] = fnsVar.h;
            iArr2[2] = fnsVar.i;
            iArr2[3] = fnsVar.j;
        }
        float width = rectF.width() / 2.0f;
        if (width <= 0.0f) {
            return;
        }
        float f4 = 1.0f - (i / width);
        float[] fArr = fns.d;
        fArr[1] = f4;
        fArr[2] = f4 + ((1.0f - f4) / 2.0f);
        RadialGradient radialGradient = new RadialGradient(rectF.centerX(), rectF.centerY(), width, fns.c, fArr, Shader.TileMode.CLAMP);
        Paint paint = fnsVar.f;
        paint.setShader(radialGradient);
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, fnsVar.l);
        }
        canvas.drawArc(rectF, f, f2, true, paint);
        canvas.restore();
    }
}
