package io.noties.markwon.core.spans;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.TextPaint;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;
import androidx.annotation.NonNull;

/* loaded from: classes4.dex */
public class c extends MetricAffectingSpan implements LeadingMarginSpan {
    private final io.noties.markwon.core.b theme;
    private final Rect rect = g.rect();
    private final Paint paint = g.paint();

    public c(@NonNull io.noties.markwon.core.b bVar) {
        this.theme = bVar;
    }

    private void apply(TextPaint textPaint) {
        this.theme.applyCodeBlockTextStyle(textPaint);
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i8, int i9, int i10, int i11, int i12, CharSequence charSequence, int i13, int i14, boolean z7, Layout layout) {
        int i15;
        this.paint.setStyle(Paint.Style.FILL);
        this.paint.setColor(this.theme.getCodeBlockBackgroundColor(paint));
        if (i9 > 0) {
            i15 = canvas.getWidth();
        } else {
            i8 -= canvas.getWidth();
            i15 = i8;
        }
        this.rect.set(i8, i10, i15, i12);
        canvas.drawRect(this.rect, this.paint);
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z7) {
        return this.theme.getCodeBlockMargin();
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        apply(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        apply(textPaint);
    }
}
