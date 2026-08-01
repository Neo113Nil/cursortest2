package l2;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class s extends w {

    /* renamed from: c, reason: collision with root package name */
    public final u f2651c;
    public final float d;

    /* renamed from: e, reason: collision with root package name */
    public final float f2652e;

    public s(u uVar, float f2, float f4) {
        this.f2651c = uVar;
        this.d = f2;
        this.f2652e = f4;
    }

    @Override // l2.w
    public final void a(Matrix matrix, k2.a aVar, int i, Canvas canvas) {
        u uVar = this.f2651c;
        float f2 = uVar.f2660c;
        float f4 = this.f2652e;
        float f5 = uVar.f2659b;
        float f6 = this.d;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f2 - f4, f5 - f6), 0.0f);
        Matrix matrix2 = this.f2663a;
        matrix2.set(matrix);
        matrix2.preTranslate(f6, f4);
        matrix2.preRotate(b());
        aVar.getClass();
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int i4 = aVar.f2237f;
        int[] iArr = k2.a.i;
        iArr[0] = i4;
        iArr[1] = aVar.f2236e;
        iArr[2] = aVar.d;
        Paint paint = aVar.f2235c;
        float f7 = rectF.left;
        paint.setShader(new LinearGradient(f7, rectF.top, f7, rectF.bottom, iArr, k2.a.f2230j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float b() {
        u uVar = this.f2651c;
        return (float) Math.toDegrees(Math.atan((uVar.f2660c - this.f2652e) / (uVar.f2659b - this.d)));
    }
}
