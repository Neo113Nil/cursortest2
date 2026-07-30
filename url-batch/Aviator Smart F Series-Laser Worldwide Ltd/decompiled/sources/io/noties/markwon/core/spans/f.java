package io.noties.markwon.core.spans;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.TextPaint;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;

/* loaded from: classes4.dex */
public class f extends MetricAffectingSpan implements LeadingMarginSpan {
    private final int level;
    private final io.noties.markwon.core.b theme;
    private final Rect rect = g.rect();
    private final Paint paint = g.paint();

    public f(@NonNull io.noties.markwon.core.b bVar, @IntRange(from = 1, to = 6) int i8) {
        this.theme = bVar;
        this.level = i8;
    }

    private void apply(TextPaint textPaint) {
        this.theme.applyHeadingTextStyle(textPaint, this.level);
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i8, int i9, int i10, int i11, int i12, CharSequence charSequence, int i13, int i14, boolean z7, Layout layout) {
        int i15;
        int i16 = this.level;
        if ((i16 == 1 || i16 == 2) && x5.c.selfEnd(i14, charSequence, this)) {
            this.paint.set(paint);
            this.theme.applyHeadingBreakStyle(this.paint);
            float strokeWidth = this.paint.getStrokeWidth();
            if (strokeWidth > 0.0f) {
                int i17 = (int) ((i12 - strokeWidth) + 0.5f);
                if (i9 > 0) {
                    i15 = canvas.getWidth();
                } else {
                    i15 = i8;
                    i8 -= canvas.getWidth();
                }
                this.rect.set(i8, i17, i15, i12);
                canvas.drawRect(this.rect, this.paint);
            }
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z7) {
        return 0;
    }

    public int getLevel() {
        return this.level;
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
