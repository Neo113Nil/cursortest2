package com.yandex.div.core.util.text;

import O1.AbstractC0853he;
import O1.C0942me;
import O1.C1119wc;
import O1.Qc;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.DisplayMetrics;
import com.yandex.div.core.view2.divs.widgets.DivBorderDrawerKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
final class BackgroundDrawer {

    @Nullable
    private final AbstractC0853he background;

    @Nullable
    private final C0942me border;

    @NotNull
    private final Paint borerPaint;

    @NotNull
    private final Canvas canvas;

    @NotNull
    private final DisplayMetrics metrics;

    @Nullable
    private final float[] radii;

    @NotNull
    private final ExpressionResolver resolver;

    public BackgroundDrawer(@NotNull DisplayMetrics metrics, @Nullable C0942me c0942me, @Nullable AbstractC0853he abstractC0853he, @NotNull Canvas canvas, @NotNull ExpressionResolver resolver) {
        float[] cornerRadii;
        Expression expression;
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        this.metrics = metrics;
        this.border = c0942me;
        this.background = abstractC0853he;
        this.canvas = canvas;
        this.resolver = resolver;
        Paint paint = new Paint();
        this.borerPaint = paint;
        if (c0942me == null) {
            this.radii = null;
            return;
        }
        cornerRadii = DivTextRangesBackgroundRendererKt.getCornerRadii(c0942me, metrics, resolver);
        this.radii = cornerRadii;
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        paint.setStrokeWidth(DivBorderDrawerKt.widthPx(c0942me.f7097b, resolver, metrics));
        Qc qc = c0942me.f7097b;
        if (qc == null || (expression = qc.f4476a) == null) {
            return;
        }
        paint.setColor(((Number) expression.evaluate(resolver)).intValue());
    }

    private final void drawBorder(float[] fArr, float f4, float f5, float f6, float f7) {
        C0942me c0942me = this.border;
        if ((c0942me != null ? c0942me.f7097b : null) == null) {
            return;
        }
        RectF rectF = new RectF();
        Qc qc = this.border.f7097b;
        Intrinsics.checkNotNull(qc);
        float widthPx = DivBorderDrawerKt.widthPx(qc, this.resolver, this.metrics) / 2.0f;
        rectF.set(Math.max(0.0f, f4 + widthPx), Math.max(0.0f, f5 + widthPx), Math.max(0.0f, f6 - widthPx), Math.max(0.0f, f7 - widthPx));
        float[] fArr2 = fArr != null ? (float[]) fArr.clone() : null;
        if (fArr2 != null) {
            int length = fArr2.length;
            for (int i4 = 0; i4 < length; i4++) {
                fArr2[i4] = Math.max(0.0f, fArr[i4] - widthPx);
            }
        }
        this.canvas.drawPath(getPath(fArr2, rectF), this.borerPaint);
    }

    private final Path getPath(float[] fArr, RectF rectF) {
        Path path = new Path();
        path.reset();
        if (fArr == null) {
            path.addRect(rectF, Path.Direction.CW);
        } else {
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
        }
        path.close();
        return path;
    }

    public final void drawBackground(float f4, float f5, float f6, float f7) {
        drawBackground(this.radii, f4, f5, f6, f7);
    }

    public final void drawBackgroundEnd(float f4, float f5, float f6, float f7) {
        float[] fArr = new float[8];
        float[] fArr2 = this.radii;
        if (fArr2 != null) {
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            fArr[2] = fArr2[2];
            fArr[3] = fArr2[3];
            fArr[4] = fArr2[4];
            fArr[5] = fArr2[5];
            fArr[6] = 0.0f;
            fArr[7] = 0.0f;
        }
        drawBackground(fArr, f4, f5, f6, f7);
    }

    public final void drawBackgroundMiddle(float f4, float f5, float f6, float f7) {
        drawBackground(new float[8], f4, f5, f6, f7);
    }

    public final void drawBackgroundStart(float f4, float f5, float f6, float f7) {
        float[] fArr = new float[8];
        float[] fArr2 = this.radii;
        if (fArr2 != null) {
            fArr[0] = fArr2[0];
            fArr[1] = fArr2[1];
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = fArr2[6];
            fArr[7] = fArr2[7];
        }
        drawBackground(fArr, f4, f5, f6, f7);
    }

    private final void drawBackground(float[] fArr, float f4, float f5, float f6, float f7) {
        RectF rectF = new RectF();
        rectF.set(f4, f5, f6, f7);
        AbstractC0853he abstractC0853he = this.background;
        Object b4 = abstractC0853he != null ? abstractC0853he.b() : null;
        if (b4 instanceof C1119wc) {
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(((Number) ((C1119wc) b4).f8341a.evaluate(this.resolver)).intValue());
            this.canvas.drawPath(getPath(fArr, rectF), paint);
        }
        drawBorder(fArr, f4, f5, f6, f7);
    }
}
