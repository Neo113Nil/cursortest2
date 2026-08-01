package O0;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* loaded from: classes.dex */
public final class p extends t {

    /* renamed from: c, reason: collision with root package name */
    public final r f577c;
    public final float d;

    /* renamed from: e, reason: collision with root package name */
    public final float f578e;

    public p(r rVar, float f2, float f3) {
        this.f577c = rVar;
        this.d = f2;
        this.f578e = f3;
    }

    @Override // O0.t
    public final void a(Matrix matrix, N0.a aVar, int i, Canvas canvas) {
        r rVar = this.f577c;
        float f2 = rVar.f585c;
        float f3 = this.f578e;
        float f4 = rVar.f584b;
        float f5 = this.d;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f2 - f3, f4 - f5), 0.0f);
        Matrix matrix2 = this.f588a;
        matrix2.set(matrix);
        matrix2.preTranslate(f5, f3);
        matrix2.preRotate(b());
        aVar.getClass();
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int[] iArr = N0.a.i;
        iArr[0] = aVar.f506f;
        iArr[1] = aVar.f505e;
        iArr[2] = aVar.d;
        Paint paint = aVar.f504c;
        float f6 = rectF.left;
        paint.setShader(new LinearGradient(f6, rectF.top, f6, rectF.bottom, iArr, N0.a.f499j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float b() {
        r rVar = this.f577c;
        return (float) Math.toDegrees(Math.atan((rVar.f585c - this.f578e) / (rVar.f584b - this.d)));
    }
}
