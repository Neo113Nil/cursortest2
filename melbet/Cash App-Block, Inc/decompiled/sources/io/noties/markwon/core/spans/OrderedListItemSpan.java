package io.noties.markwon.core.spans;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
import io.noties.markwon.core.MarkwonTheme;

/* loaded from: classes9.dex */
public final class OrderedListItemSpan implements LeadingMarginSpan {
    public int margin;
    public final String number;
    public final Paint paint = ObjectsPool.PAINT;
    public final MarkwonTheme theme;

    public OrderedListItemSpan(MarkwonTheme markwonTheme, String str) {
        this.theme = markwonTheme;
        this.number = str;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int i8;
        if (z && (charSequence instanceof Spanned) && ((Spanned) charSequence).getSpanStart(this) == i6) {
            Paint paint2 = this.paint;
            paint2.set(paint);
            MarkwonTheme markwonTheme = this.theme;
            markwonTheme.getClass();
            paint2.setColor(paint2.getColor());
            int i9 = markwonTheme.bulletListItemStrokeWidth;
            if (i9 != 0) {
                paint2.setStrokeWidth(i9);
            }
            String str = this.number;
            int measureText = (int) (paint2.measureText(str) + 0.5f);
            int i10 = markwonTheme.blockMargin;
            if (measureText > i10) {
                this.margin = measureText;
                i10 = measureText;
            } else {
                this.margin = 0;
            }
            if (i2 > 0) {
                i8 = ((i10 * i2) + i) - measureText;
            } else {
                i8 = (i10 - measureText) + (i2 * i10) + i;
            }
            canvas.drawText(str, i8, i4, paint2);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return Math.max(this.margin, this.theme.blockMargin);
    }
}
