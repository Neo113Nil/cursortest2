package K0;

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
    public final q f450c;

    public o(q qVar) {
        this.f450c = qVar;
    }

    @Override // K0.t
    public final void a(Matrix matrix, J0.a aVar, int i, Canvas canvas) {
        q qVar = this.f450c;
        float f2 = qVar.f457f;
        float f3 = qVar.f458g;
        RectF rectF = new RectF(qVar.f454b, qVar.f455c, qVar.d, qVar.f456e);
        aVar.getClass();
        boolean z2 = f3 < RecyclerView.A0;
        Path path = aVar.f372g;
        int[] iArr = J0.a.f365k;
        if (z2) {
            iArr[0] = 0;
            iArr[1] = aVar.f371f;
            iArr[2] = aVar.f370e;
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
            iArr[2] = aVar.f370e;
            iArr[3] = aVar.f371f;
        }
        float width = rectF.width() / 2.0f;
        if (width <= RecyclerView.A0) {
            return;
        }
        float f5 = 1.0f - (i / width);
        float[] fArr = J0.a.f366l;
        fArr[1] = f5;
        fArr[2] = ((1.0f - f5) / 2.0f) + f5;
        RadialGradient radialGradient = new RadialGradient(rectF.centerX(), rectF.centerY(), width, iArr, fArr, Shader.TileMode.CLAMP);
        Paint paint = aVar.f368b;
        paint.setShader(radialGradient);
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z2) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, aVar.f373h);
        }
        canvas.drawArc(rectF, f2, f3, true, paint);
        canvas.restore();
    }
}
