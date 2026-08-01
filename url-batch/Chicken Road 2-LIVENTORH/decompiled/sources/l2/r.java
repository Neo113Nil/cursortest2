package l2;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class r extends w {

    /* renamed from: c, reason: collision with root package name */
    public final t f2650c;

    public r(t tVar) {
        this.f2650c = tVar;
    }

    @Override // l2.w
    public final void a(Matrix matrix, k2.a aVar, int i, Canvas canvas) {
        float f2;
        t tVar = this.f2650c;
        float f4 = tVar.f2657f;
        float f5 = tVar.f2658g;
        RectF rectF = new RectF(tVar.f2654b, tVar.f2655c, tVar.d, tVar.f2656e);
        Paint paint = aVar.f2234b;
        boolean z3 = f5 < 0.0f;
        Path path = aVar.f2238g;
        int[] iArr = k2.a.f2231k;
        if (z3) {
            iArr[0] = 0;
            iArr[1] = aVar.f2237f;
            iArr[2] = aVar.f2236e;
            iArr[3] = aVar.d;
            f2 = 0.0f;
        } else {
            path.rewind();
            f2 = 0.0f;
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f4, f5);
            path.close();
            float f6 = -i;
            rectF.inset(f6, f6);
            iArr[0] = 0;
            iArr[1] = aVar.d;
            iArr[2] = aVar.f2236e;
            iArr[3] = aVar.f2237f;
        }
        float width = rectF.width() / 2.0f;
        if (width <= f2) {
            return;
        }
        float f7 = 1.0f - (i / width);
        float[] fArr = k2.a.f2232l;
        fArr[1] = f7;
        fArr[2] = ((1.0f - f7) / 2.0f) + f7;
        paint.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, iArr, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z3) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, aVar.f2239h);
        }
        canvas.drawArc(rectF, f4, f5, true, paint);
        canvas.restore();
    }
}
