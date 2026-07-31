package com.yandex.div.core.view2.spannable;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.text.style.LineBackgroundSpan;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class LineMetricsSpan implements LineBackgroundSpan {

    @NotNull
    private final Paint linePaint;

    public LineMetricsSpan() {
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(false);
        paint.setStrokeWidth(0.0f);
        this.linePaint = paint;
    }

    @Override // android.text.style.LineBackgroundSpan
    public void drawBackground(@NotNull Canvas canvas, @NotNull Paint paint, int i4, int i5, int i6, int i7, int i8, @NotNull CharSequence text, int i9, int i10, int i11) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Intrinsics.checkNotNullParameter(text, "text");
        this.linePaint.setColor(-16764855);
        float f4 = i6;
        float f5 = i4;
        float f6 = i5;
        canvas.drawLine(f5, f4, f6, f4, this.linePaint);
        this.linePaint.setColor(-557312);
        this.linePaint.setPathEffect(new DashPathEffect(new float[]{8.0f, 4.0f, 1.0f, 4.0f}, 0.0f));
        float f7 = f4 + ((i8 - i6) / 2.0f);
        canvas.drawLine(f5, f7, f6, f7, this.linePaint);
        this.linePaint.setColor(-2742232);
        this.linePaint.setPathEffect(null);
        float f8 = i7 - 1;
        canvas.drawLine(f5, f8, f6, f8, this.linePaint);
        this.linePaint.setColor(-213175);
        float f9 = i8 - 1;
        canvas.drawLine(f5, f9, f6, f9, this.linePaint);
    }
}
