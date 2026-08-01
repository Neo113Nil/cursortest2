package o2;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class s extends x {

    /* renamed from: c, reason: collision with root package name */
    public final u f3004c;

    public s(u uVar) {
        this.f3004c = uVar;
    }

    @Override // o2.x
    public final void a(Matrix matrix, n2.a aVar, int i, Canvas canvas) {
        float f5;
        u uVar = this.f3004c;
        float f6 = uVar.f3010f;
        float f7 = uVar.f3011g;
        RectF rectF = new RectF(uVar.f3007b, uVar.f3008c, uVar.d, uVar.f3009e);
        Paint paint = aVar.f2862b;
        boolean z4 = f7 < 0.0f;
        Path path = aVar.f2866g;
        int[] iArr = n2.a.f2859k;
        if (z4) {
            iArr[0] = 0;
            iArr[1] = aVar.f2865f;
            iArr[2] = aVar.f2864e;
            iArr[3] = aVar.d;
            f5 = 0.0f;
        } else {
            path.rewind();
            f5 = 0.0f;
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f6, f7);
            path.close();
            float f8 = -i;
            rectF.inset(f8, f8);
            iArr[0] = 0;
            iArr[1] = aVar.d;
            iArr[2] = aVar.f2864e;
            iArr[3] = aVar.f2865f;
        }
        float width = rectF.width() / 2.0f;
        if (width <= f5) {
            return;
        }
        float f9 = 1.0f - (i / width);
        float[] fArr = n2.a.f2860l;
        fArr[1] = f9;
        fArr[2] = ((1.0f - f9) / 2.0f) + f9;
        paint.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, iArr, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z4) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, aVar.h);
        }
        canvas.drawArc(rectF, f6, f7, true, paint);
        canvas.restore();
    }
}
