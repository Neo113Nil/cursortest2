package io.noties.markwon.core.spans;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import io.noties.markwon.core.MarkwonTheme;
import io.noties.markwon.utils.ColorUtils;

/* loaded from: classes9.dex */
public final class BlockQuoteSpan implements LeadingMarginSpan {
    public final /* synthetic */ int $r8$classId;
    public final Paint paint;
    public final Rect rect;
    public final MarkwonTheme theme;

    public BlockQuoteSpan(MarkwonTheme markwonTheme, int i) {
        this.$r8$classId = i;
        switch (i) {
            case 1:
                this.rect = ObjectsPool.RECT;
                this.paint = ObjectsPool.PAINT;
                this.theme = markwonTheme;
                break;
            default:
                this.rect = ObjectsPool.RECT;
                this.paint = ObjectsPool.PAINT;
                this.theme = markwonTheme;
                break;
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int i8;
        int i9 = this.$r8$classId;
        MarkwonTheme markwonTheme = this.theme;
        Paint paint2 = this.paint;
        Rect rect = this.rect;
        switch (i9) {
            case 0:
                int i10 = markwonTheme.blockQuoteWidth;
                if (i10 == 0) {
                    i10 = (int) ((markwonTheme.blockMargin * 0.25f) + 0.5f);
                }
                paint2.set(paint);
                markwonTheme.getClass();
                int applyAlpha = ColorUtils.applyAlpha(paint2.getColor(), 25);
                paint2.setStyle(Paint.Style.FILL);
                paint2.setColor(applyAlpha);
                int i11 = i2 * i10;
                int i12 = i + i11;
                int i13 = i11 + i12;
                rect.set(Math.min(i12, i13), i3, Math.max(i12, i13), i5);
                canvas.drawRect(rect, paint2);
                break;
            default:
                int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i5, i3, 2, i3);
                paint2.set(paint);
                markwonTheme.getClass();
                paint2.setColor(ColorUtils.applyAlpha(paint2.getColor(), 25));
                paint2.setStyle(Paint.Style.FILL);
                int i14 = markwonTheme.thematicBreakHeight;
                if (i14 >= 0) {
                    paint2.setStrokeWidth(i14);
                }
                int strokeWidth = (int) ((((int) (paint2.getStrokeWidth() + 0.5f)) / 2.0f) + 0.5f);
                if (i2 > 0) {
                    i8 = canvas.getWidth();
                } else {
                    i8 = i;
                    i -= canvas.getWidth();
                }
                rect.set(i, m - strokeWidth, i8, m + strokeWidth);
                canvas.drawRect(rect, paint2);
                break;
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        switch (this.$r8$classId) {
            case 0:
                return this.theme.blockMargin;
            default:
                return 0;
        }
    }
}
