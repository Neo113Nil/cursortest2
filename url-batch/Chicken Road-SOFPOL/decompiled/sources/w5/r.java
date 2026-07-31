package w5;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class r extends w {

    /* renamed from: c, reason: collision with root package name */
    public final t f8163c;

    public r(t tVar) {
        this.f8163c = tVar;
    }

    @Override // w5.w
    public final void a(Matrix matrix, v5.a aVar, int i, Canvas canvas) {
        float f6;
        t tVar = this.f8163c;
        float f8 = tVar.f8172f;
        float f9 = tVar.f8173g;
        RectF rectF = new RectF(tVar.f8168b, tVar.f8169c, tVar.f8170d, tVar.f8171e);
        Paint paint = aVar.f7484b;
        boolean z3 = f9 < 0.0f;
        Path path = aVar.f7489g;
        int[] iArr = v5.a.f7481k;
        if (z3) {
            iArr[0] = 0;
            iArr[1] = aVar.f7488f;
            iArr[2] = aVar.f7487e;
            iArr[3] = aVar.f7486d;
            f6 = 0.0f;
        } else {
            path.rewind();
            f6 = 0.0f;
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f8, f9);
            path.close();
            float f10 = -i;
            rectF.inset(f10, f10);
            iArr[0] = 0;
            iArr[1] = aVar.f7486d;
            iArr[2] = aVar.f7487e;
            iArr[3] = aVar.f7488f;
        }
        float width = rectF.width() / 2.0f;
        if (width <= f6) {
            return;
        }
        float f11 = 1.0f - (i / width);
        float[] fArr = v5.a.f7482l;
        fArr[1] = f11;
        fArr[2] = ((1.0f - f11) / 2.0f) + f11;
        paint.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, iArr, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z3) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, aVar.f7490h);
        }
        canvas.drawArc(rectF, f8, f9, true, paint);
        canvas.restore();
    }
}
