package g2;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class t extends x {
    public final v c;

    /* renamed from: d, reason: collision with root package name */
    public final float f1906d;

    /* renamed from: e, reason: collision with root package name */
    public final float f1907e;

    public t(v vVar, float f4, float f5) {
        this.c = vVar;
        this.f1906d = f4;
        this.f1907e = f5;
    }

    @Override // g2.x
    public final void a(Matrix matrix, f2.a aVar, int i4, Canvas canvas) {
        v vVar = this.c;
        float f4 = vVar.c;
        float f5 = this.f1907e;
        float f6 = vVar.f1912b;
        float f7 = this.f1906d;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f4 - f5, f6 - f7), 0.0f);
        Matrix matrix2 = this.f1915a;
        matrix2.set(matrix);
        matrix2.preTranslate(f7, f5);
        matrix2.preRotate(b());
        aVar.getClass();
        rectF.bottom += i4;
        rectF.offset(0.0f, -i4);
        int i5 = aVar.f1736f;
        int[] iArr = f2.a.f1728i;
        iArr[0] = i5;
        iArr[1] = aVar.f1735e;
        iArr[2] = aVar.f1734d;
        Paint paint = aVar.c;
        float f8 = rectF.left;
        paint.setShader(new LinearGradient(f8, rectF.top, f8, rectF.bottom, iArr, f2.a.f1729j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float b() {
        v vVar = this.c;
        return (float) Math.toDegrees(Math.atan((vVar.c - this.f1907e) / (vVar.f1912b - this.f1906d)));
    }
}
