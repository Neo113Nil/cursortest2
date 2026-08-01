package N0;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* loaded from: classes.dex */
public final class p extends t {

    /* renamed from: c, reason: collision with root package name */
    public final r f951c;

    /* renamed from: d, reason: collision with root package name */
    public final float f952d;
    public final float e;

    public p(r rVar, float f2, float f3) {
        this.f951c = rVar;
        this.f952d = f2;
        this.e = f3;
    }

    @Override // N0.t
    public final void a(Matrix matrix, M0.a aVar, int i, Canvas canvas) {
        r rVar = this.f951c;
        float f2 = rVar.f960c;
        float f3 = this.e;
        float f4 = rVar.f959b;
        float f5 = this.f952d;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f2 - f3, f4 - f5), 0.0f);
        Matrix matrix2 = this.f963a;
        matrix2.set(matrix);
        matrix2.preTranslate(f5, f3);
        matrix2.preRotate(b());
        aVar.getClass();
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int[] iArr = M0.a.i;
        iArr[0] = aVar.f811f;
        iArr[1] = aVar.e;
        iArr[2] = aVar.f810d;
        Paint paint = aVar.f809c;
        float f6 = rectF.left;
        paint.setShader(new LinearGradient(f6, rectF.top, f6, rectF.bottom, iArr, M0.a.j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float b() {
        r rVar = this.f951c;
        return (float) Math.toDegrees(Math.atan((rVar.f960c - this.e) / (rVar.f959b - this.f952d)));
    }
}
