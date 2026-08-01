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
    public final r f306c;
    public final float d;

    /* renamed from: e, reason: collision with root package name */
    public final float f307e;

    public p(r rVar, float f2, float f3) {
        this.f306c = rVar;
        this.d = f2;
        this.f307e = f3;
    }

    @Override // H0.t
    public final void a(Matrix matrix, G0.a aVar, int i, Canvas canvas) {
        r rVar = this.f306c;
        float f2 = rVar.f314c;
        float f3 = this.f307e;
        float f4 = rVar.f313b;
        float f5 = this.d;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f2 - f3, f4 - f5), 0.0f);
        Matrix matrix2 = this.f317a;
        matrix2.set(matrix);
        matrix2.preTranslate(f5, f3);
        matrix2.preRotate(b());
        aVar.getClass();
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int[] iArr = G0.a.i;
        iArr[0] = aVar.f202f;
        iArr[1] = aVar.f201e;
        iArr[2] = aVar.d;
        Paint paint = aVar.f200c;
        float f6 = rectF.left;
        paint.setShader(new LinearGradient(f6, rectF.top, f6, rectF.bottom, iArr, G0.a.f195j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float b() {
        r rVar = this.f306c;
        return (float) Math.toDegrees(Math.atan((rVar.f314c - this.f307e) / (rVar.f313b - this.d)));
    }
}
