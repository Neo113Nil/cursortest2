package J0;

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
    public final r f385c;
    public final float d;

    /* renamed from: e, reason: collision with root package name */
    public final float f386e;

    public p(r rVar, float f2, float f3) {
        this.f385c = rVar;
        this.d = f2;
        this.f386e = f3;
    }

    @Override // J0.t
    public final void a(Matrix matrix, I0.a aVar, int i, Canvas canvas) {
        r rVar = this.f385c;
        float f2 = rVar.f393c;
        float f3 = this.f386e;
        float f4 = rVar.f392b;
        float f5 = this.d;
        RectF rectF = new RectF(RecyclerView.f1530C0, RecyclerView.f1530C0, (float) Math.hypot(f2 - f3, f4 - f5), RecyclerView.f1530C0);
        Matrix matrix2 = this.f396a;
        matrix2.set(matrix);
        matrix2.preTranslate(f5, f3);
        matrix2.preRotate(b());
        aVar.getClass();
        rectF.bottom += i;
        rectF.offset(RecyclerView.f1530C0, -i);
        int[] iArr = I0.a.i;
        iArr[0] = aVar.f311f;
        iArr[1] = aVar.f310e;
        iArr[2] = aVar.d;
        Paint paint = aVar.f309c;
        float f6 = rectF.left;
        paint.setShader(new LinearGradient(f6, rectF.top, f6, rectF.bottom, iArr, I0.a.f304j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float b() {
        r rVar = this.f385c;
        return (float) Math.toDegrees(Math.atan((rVar.f393c - this.f386e) / (rVar.f392b - this.d)));
    }
}
