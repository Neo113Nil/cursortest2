package defpackage;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dqf extends dqq {
    private final Paint a;
    private final Matrix b;
    private final RectF c;
    private final int d = 1;
    private final kee e;

    public dqf(Resources resources, kee keeVar, int i) {
        this.e = keeVar;
        float f = resources.getDisplayMetrics().density;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        this.a = paint;
        this.b = new Matrix();
        this.c = new RectF();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.getClass();
        RectF rectF = this.c;
        if (rectF.isEmpty()) {
            return;
        }
        canvas.drawArc(rectF, 0.0f, 360.0f, false, this.a);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        rect.getClass();
        super.onBoundsChange(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        float q = this.e.q(rect.width());
        int[] iArr = dqe.a;
        RectF rectF = this.c;
        rectF.set(rect);
        float f = (q / 2.0f) + 1.0f;
        rectF.inset(f, f);
        Paint paint = this.a;
        paint.setStrokeWidth(q);
        int i = this.d;
        if (i == 0) {
            throw null;
        }
        if (i - 1 != 0) {
            throw new koj();
        }
        float width = rect.width();
        float height = rect.height();
        float f2 = rect.left;
        float f3 = rect.top;
        LinearGradient linearGradient = new LinearGradient(25.0f, 50.0f, 75.0f, 50.0f, dqe.a, dqe.b, Shader.TileMode.CLAMP);
        Matrix matrix = new Matrix();
        matrix.reset();
        matrix.postScale(width / 100.0f, height / 100.0f);
        matrix.postTranslate(f2, f3);
        matrix.preTranslate(49.808f, 50.617f);
        matrix.preRotate(-54.205f);
        matrix.preScale(2.014f, 2.014f);
        matrix.preTranslate(-50.0f, -50.0f);
        linearGradient.setLocalMatrix(matrix);
        paint.setShader(linearGradient);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.a.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
