package C3;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* loaded from: classes2.dex */
public final class o extends t {

    /* renamed from: c, reason: collision with root package name */
    public final q f458c;

    public o(q qVar) {
        this.f458c = qVar;
    }

    @Override // C3.t
    public final void a(Matrix matrix, B3.a aVar, int i, Canvas canvas) {
        q qVar = this.f458c;
        float f6 = qVar.f467f;
        float f9 = qVar.f468g;
        RectF rectF = new RectF(qVar.f463b, qVar.f464c, qVar.f465d, qVar.f466e);
        aVar.getClass();
        boolean z8 = f9 < 0.0f;
        Path path = aVar.f333g;
        int[] iArr = B3.a.f325k;
        if (z8) {
            iArr[0] = 0;
            iArr[1] = aVar.f332f;
            iArr[2] = aVar.f331e;
            iArr[3] = aVar.f330d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f6, f9);
            path.close();
            float f10 = -i;
            rectF.inset(f10, f10);
            iArr[0] = 0;
            iArr[1] = aVar.f330d;
            iArr[2] = aVar.f331e;
            iArr[3] = aVar.f332f;
        }
        float width = rectF.width() / 2.0f;
        if (width <= 0.0f) {
            return;
        }
        float f11 = 1.0f - (i / width);
        float[] fArr = B3.a.f326l;
        fArr[1] = f11;
        fArr[2] = ((1.0f - f11) / 2.0f) + f11;
        RadialGradient radialGradient = new RadialGradient(rectF.centerX(), rectF.centerY(), width, iArr, fArr, Shader.TileMode.CLAMP);
        Paint paint = aVar.f328b;
        paint.setShader(radialGradient);
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z8) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, aVar.f334h);
        }
        canvas.drawArc(rectF, f6, f9, true, paint);
        canvas.restore();
    }
}
