package o2;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class t extends x {

    /* renamed from: c, reason: collision with root package name */
    public final v f3005c;
    public final float d;

    /* renamed from: e, reason: collision with root package name */
    public final float f3006e;

    public t(v vVar, float f5, float f6) {
        this.f3005c = vVar;
        this.d = f5;
        this.f3006e = f6;
    }

    @Override // o2.x
    public final void a(Matrix matrix, n2.a aVar, int i, Canvas canvas) {
        v vVar = this.f3005c;
        float f5 = vVar.f3013c;
        float f6 = this.f3006e;
        float f7 = vVar.f3012b;
        float f8 = this.d;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f5 - f6, f7 - f8), 0.0f);
        Matrix matrix2 = this.f3016a;
        matrix2.set(matrix);
        matrix2.preTranslate(f8, f6);
        matrix2.preRotate(b());
        aVar.getClass();
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int i4 = aVar.f2865f;
        int[] iArr = n2.a.i;
        iArr[0] = i4;
        iArr[1] = aVar.f2864e;
        iArr[2] = aVar.d;
        Paint paint = aVar.f2863c;
        float f9 = rectF.left;
        paint.setShader(new LinearGradient(f9, rectF.top, f9, rectF.bottom, iArr, n2.a.f2858j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float b() {
        v vVar = this.f3005c;
        return (float) Math.toDegrees(Math.atan((vVar.f3013c - this.f3006e) / (vVar.f3012b - this.d)));
    }
}
