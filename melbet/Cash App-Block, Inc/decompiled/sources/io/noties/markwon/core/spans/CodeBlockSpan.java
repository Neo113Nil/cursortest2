package io.noties.markwon.core.spans;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.TextPaint;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;
import io.noties.markwon.core.MarkwonTheme;
import io.noties.markwon.utils.ColorUtils;

/* loaded from: classes9.dex */
public final class CodeBlockSpan extends MetricAffectingSpan implements LeadingMarginSpan {
    public final MarkwonTheme theme;
    public final Rect rect = ObjectsPool.RECT;
    public final Paint paint = ObjectsPool.PAINT;

    public CodeBlockSpan(MarkwonTheme markwonTheme) {
        this.theme = markwonTheme;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int i8;
        Paint.Style style = Paint.Style.FILL;
        Paint paint2 = this.paint;
        paint2.setStyle(style);
        this.theme.getClass();
        paint2.setColor(ColorUtils.applyAlpha(paint.getColor(), 25));
        if (i2 > 0) {
            i8 = canvas.getWidth();
        } else {
            i -= canvas.getWidth();
            i8 = i;
        }
        Rect rect = this.rect;
        rect.set(i, i3, i8, i5);
        canvas.drawRect(rect, paint2);
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return this.theme.codeBlockMargin;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        this.theme.getClass();
        textPaint.setTypeface(Typeface.MONOSPACE);
        textPaint.setTextSize(textPaint.getTextSize() * 0.87f);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        this.theme.getClass();
        textPaint.setTypeface(Typeface.MONOSPACE);
        textPaint.setTextSize(textPaint.getTextSize() * 0.87f);
    }
}
