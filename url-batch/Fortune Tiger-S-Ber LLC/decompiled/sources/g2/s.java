package g2;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class s extends x {
    public final u c;

    public s(u uVar) {
        this.c = uVar;
    }

    @Override // g2.x
    public final void a(Matrix matrix, f2.a aVar, int i4, Canvas canvas) {
        float f4;
        u uVar = this.c;
        float f5 = uVar.f1911f;
        float f6 = uVar.g;
        RectF rectF = new RectF(uVar.f1908b, uVar.c, uVar.f1909d, uVar.f1910e);
        Paint paint = aVar.f1733b;
        boolean z3 = f6 < 0.0f;
        Path path = aVar.g;
        int[] iArr = f2.a.f1730k;
        if (z3) {
            iArr[0] = 0;
            iArr[1] = aVar.f1736f;
            iArr[2] = aVar.f1735e;
            iArr[3] = aVar.f1734d;
            f4 = 0.0f;
        } else {
            path.rewind();
            f4 = 0.0f;
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f5, f6);
            path.close();
            float f7 = -i4;
            rectF.inset(f7, f7);
            iArr[0] = 0;
            iArr[1] = aVar.f1734d;
            iArr[2] = aVar.f1735e;
            iArr[3] = aVar.f1736f;
        }
        float width = rectF.width() / 2.0f;
        if (width <= f4) {
            return;
        }
        float f8 = 1.0f - (i4 / width);
        float[] fArr = f2.a.f1731l;
        fArr[1] = f8;
        fArr[2] = ((1.0f - f8) / 2.0f) + f8;
        paint.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, iArr, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z3) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, aVar.h);
        }
        canvas.drawArc(rectF, f5, f6, true, paint);
        canvas.restore();
    }
}
