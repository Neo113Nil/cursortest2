package H0;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* loaded from: classes.dex */
public final class p extends t {

    /* renamed from: c, reason: collision with root package name */
    public final r f327c;

    /* renamed from: d, reason: collision with root package name */
    public final float f328d;

    /* renamed from: e, reason: collision with root package name */
    public final float f329e;

    public p(r rVar, float f2, float f3) {
        this.f327c = rVar;
        this.f328d = f2;
        this.f329e = f3;
    }

    @Override // H0.t
    public final void a(Matrix matrix, G0.a aVar, int i, Canvas canvas) {
        r rVar = this.f327c;
        float f2 = rVar.f337c;
        float f3 = this.f329e;
        float f4 = rVar.f336b;
        float f5 = this.f328d;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f2 - f3, f4 - f5), 0.0f);
        Matrix matrix2 = this.f340a;
        matrix2.set(matrix);
        matrix2.preTranslate(f5, f3);
        matrix2.preRotate(b());
        aVar.getClass();
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int[] iArr = G0.a.i;
        iArr[0] = aVar.f212f;
        iArr[1] = aVar.f211e;
        iArr[2] = aVar.f210d;
        Paint paint = aVar.f209c;
        float f6 = rectF.left;
        paint.setShader(new LinearGradient(f6, rectF.top, f6, rectF.bottom, iArr, G0.a.f204j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float b() {
        r rVar = this.f327c;
        return (float) Math.toDegrees(Math.atan((rVar.f337c - this.f329e) / (rVar.f336b - this.f328d)));
    }
}
