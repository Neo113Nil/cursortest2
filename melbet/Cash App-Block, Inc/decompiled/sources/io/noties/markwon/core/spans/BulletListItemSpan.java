package io.noties.markwon.core.spans;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
import io.noties.markwon.core.MarkwonTheme;

/* loaded from: classes9.dex */
public final class BulletListItemSpan implements LeadingMarginSpan {
    public final int level;
    public final MarkwonTheme theme;
    public final Paint paint = ObjectsPool.PAINT;
    public final RectF circle = ObjectsPool.RECT_F;
    public final Rect rectangle = ObjectsPool.RECT;

    public BulletListItemSpan(MarkwonTheme markwonTheme, int i) {
        this.theme = markwonTheme;
        this.level = i;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        RectF rectF = this.circle;
        Rect rect = this.rectangle;
        if (z && (charSequence instanceof Spanned) && ((Spanned) charSequence).getSpanStart(this) == i6) {
            Paint paint2 = this.paint;
            paint2.set(paint);
            MarkwonTheme markwonTheme = this.theme;
            markwonTheme.getClass();
            int i8 = markwonTheme.blockMargin;
            paint2.setColor(paint2.getColor());
            int i9 = markwonTheme.bulletListItemStrokeWidth;
            if (i9 != 0) {
                paint2.setStrokeWidth(i9);
            }
            int save = canvas.save();
            try {
                int min = Math.min(i8, (int) ((paint2.descent() - paint2.ascent()) + 0.5f)) / 2;
                int i10 = (i8 - min) / 2;
                if (i2 <= 0) {
                    i -= i8;
                }
                int i11 = i + i10;
                int i12 = i11 + min;
                int descent = (i4 + ((int) (((paint2.descent() + paint2.ascent()) / 2.0f) + 0.5f))) - (min / 2);
                int i13 = min + descent;
                int i14 = this.level;
                if (i14 == 0 || i14 == 1) {
                    rectF.set(i11, descent, i12, i13);
                    paint2.setStyle(i14 == 0 ? Paint.Style.FILL : Paint.Style.STROKE);
                    canvas.drawOval(rectF, paint2);
                } else {
                    rect.set(i11, descent, i12, i13);
                    paint2.setStyle(Paint.Style.FILL);
                    canvas.drawRect(rect, paint2);
                }
                canvas.restoreToCount(save);
            } catch (Throwable th) {
                canvas.restoreToCount(save);
                throw th;
            }
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return this.theme.blockMargin;
    }
}
