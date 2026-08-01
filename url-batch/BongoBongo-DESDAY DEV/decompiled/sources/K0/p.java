package K0;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class p extends t {

    /* renamed from: c, reason: collision with root package name */
    public final r f451c;
    public final float d;

    /* renamed from: e, reason: collision with root package name */
    public final float f452e;

    public p(r rVar, float f2, float f3) {
        this.f451c = rVar;
        this.d = f2;
        this.f452e = f3;
    }

    @Override // K0.t
    public final void a(Matrix matrix, J0.a aVar, int i, Canvas canvas) {
        r rVar = this.f451c;
        float f2 = rVar.f460c;
        float f3 = this.f452e;
        float f4 = rVar.f459b;
        float f5 = this.d;
        RectF rectF = new RectF(RecyclerView.A0, RecyclerView.A0, (float) Math.hypot(f2 - f3, f4 - f5), RecyclerView.A0);
        Matrix matrix2 = this.f463a;
        matrix2.set(matrix);
        matrix2.preTranslate(f5, f3);
        matrix2.preRotate(b());
        aVar.getClass();
        rectF.bottom += i;
        rectF.offset(RecyclerView.A0, -i);
        int[] iArr = J0.a.i;
        iArr[0] = aVar.f371f;
        iArr[1] = aVar.f370e;
        iArr[2] = aVar.d;
        Paint paint = aVar.f369c;
        float f6 = rectF.left;
        paint.setShader(new LinearGradient(f6, rectF.top, f6, rectF.bottom, iArr, J0.a.f364j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float b() {
        r rVar = this.f451c;
        return (float) Math.toDegrees(Math.atan((rVar.f460c - this.f452e) / (rVar.f459b - this.d)));
    }
}
