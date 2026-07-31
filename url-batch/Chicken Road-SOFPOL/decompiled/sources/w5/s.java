package w5;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class s extends w {

    /* renamed from: c, reason: collision with root package name */
    public final u f8164c;

    /* renamed from: d, reason: collision with root package name */
    public final float f8165d;

    /* renamed from: e, reason: collision with root package name */
    public final float f8166e;

    public s(u uVar, float f6, float f8) {
        this.f8164c = uVar;
        this.f8165d = f6;
        this.f8166e = f8;
    }

    @Override // w5.w
    public final void a(Matrix matrix, v5.a aVar, int i, Canvas canvas) {
        u uVar = this.f8164c;
        float f6 = uVar.f8175c;
        float f8 = this.f8166e;
        float f9 = uVar.f8174b;
        float f10 = this.f8165d;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f6 - f8, f9 - f10), 0.0f);
        Matrix matrix2 = this.f8178a;
        matrix2.set(matrix);
        matrix2.preTranslate(f10, f8);
        matrix2.preRotate(b());
        aVar.getClass();
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int i8 = aVar.f7488f;
        int[] iArr = v5.a.i;
        iArr[0] = i8;
        iArr[1] = aVar.f7487e;
        iArr[2] = aVar.f7486d;
        Paint paint = aVar.f7485c;
        float f11 = rectF.left;
        paint.setShader(new LinearGradient(f11, rectF.top, f11, rectF.bottom, iArr, v5.a.f7480j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float b() {
        u uVar = this.f8164c;
        return (float) Math.toDegrees(Math.atan((uVar.f8175c - this.f8166e) / (uVar.f8174b - this.f8165d)));
    }
}
