package R0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class o extends t {

    /* renamed from: c, reason: collision with root package name */
    public final q f966c;

    public o(q qVar) {
        this.f966c = qVar;
    }

    @Override // R0.t
    public final void a(Matrix matrix, Q0.a aVar, int i, Canvas canvas) {
        q qVar = this.f966c;
        float f2 = qVar.f972f;
        float f3 = qVar.f973g;
        RectF rectF = new RectF(qVar.f969b, qVar.f970c, qVar.d, qVar.f971e);
        aVar.getClass();
        boolean z2 = f3 < RecyclerView.f1937A0;
        Path path = aVar.f896g;
        int[] iArr = Q0.a.f889k;
        if (z2) {
            iArr[0] = 0;
            iArr[1] = aVar.f895f;
            iArr[2] = aVar.f894e;
            iArr[3] = aVar.d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f2, f3);
            path.close();
            float f4 = -i;
            rectF.inset(f4, f4);
            iArr[0] = 0;
            iArr[1] = aVar.d;
            iArr[2] = aVar.f894e;
            iArr[3] = aVar.f895f;
        }
        float width = rectF.width() / 2.0f;
        if (width <= RecyclerView.f1937A0) {
            return;
        }
        float f5 = 1.0f - (i / width);
        float[] fArr = Q0.a.f890l;
        fArr[1] = f5;
        fArr[2] = ((1.0f - f5) / 2.0f) + f5;
        RadialGradient radialGradient = new RadialGradient(rectF.centerX(), rectF.centerY(), width, iArr, fArr, Shader.TileMode.CLAMP);
        Paint paint = aVar.f892b;
        paint.setShader(radialGradient);
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z2) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, aVar.h);
        }
        canvas.drawArc(rectF, f2, f3, true, paint);
        canvas.restore();
    }
}
