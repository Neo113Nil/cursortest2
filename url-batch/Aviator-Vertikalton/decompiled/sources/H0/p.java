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
    public final r f328c;

    /* renamed from: d, reason: collision with root package name */
    public final float f329d;

    /* renamed from: e, reason: collision with root package name */
    public final float f330e;

    public p(r rVar, float f2, float f3) {
        this.f328c = rVar;
        this.f329d = f2;
        this.f330e = f3;
    }

    @Override // H0.t
    public final void a(Matrix matrix, G0.a aVar, int i, Canvas canvas) {
        r rVar = this.f328c;
        float f2 = rVar.f338c;
        float f3 = this.f330e;
        float f4 = rVar.f337b;
        float f5 = this.f329d;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f2 - f3, f4 - f5), 0.0f);
        Matrix matrix2 = this.f341a;
        matrix2.set(matrix);
        matrix2.preTranslate(f5, f3);
        matrix2.preRotate(b());
        aVar.getClass();
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int[] iArr = G0.a.i;
        iArr[0] = aVar.f213f;
        iArr[1] = aVar.f212e;
        iArr[2] = aVar.f211d;
        Paint paint = aVar.f210c;
        float f6 = rectF.left;
        paint.setShader(new LinearGradient(f6, rectF.top, f6, rectF.bottom, iArr, G0.a.f205j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float b() {
        r rVar = this.f328c;
        return (float) Math.toDegrees(Math.atan((rVar.f338c - this.f330e) / (rVar.f337b - this.f329d)));
    }
}
