package io.noties.markwon.core.spans;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;

/* loaded from: classes4.dex */
public class b implements LeadingMarginSpan {
    private static final boolean IS_NOUGAT;
    private final int level;
    private io.noties.markwon.core.b theme;
    private final Paint paint = g.paint();
    private final RectF circle = g.rectF();
    private final Rect rectangle = g.rect();

    static {
        int i8 = Build.VERSION.SDK_INT;
        IS_NOUGAT = 24 == i8 || 25 == i8;
    }

    public b(@NonNull io.noties.markwon.core.b bVar, @IntRange(from = 0) int i8) {
        this.theme = bVar;
        this.level = i8;
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i8, int i9, int i10, int i11, int i12, CharSequence charSequence, int i13, int i14, boolean z7, Layout layout) {
        int i15;
        int i16;
        if (z7 && x5.c.selfStart(i13, charSequence, this)) {
            this.paint.set(paint);
            this.theme.applyListItemStyle(this.paint);
            int save = canvas.save();
            try {
                int blockMargin = this.theme.getBlockMargin();
                int bulletWidth = this.theme.getBulletWidth((int) ((this.paint.descent() - this.paint.ascent()) + 0.5f));
                int i17 = (blockMargin - bulletWidth) / 2;
                if (IS_NOUGAT) {
                    int width = i9 < 0 ? i8 - (layout.getWidth() - (blockMargin * this.level)) : (blockMargin * this.level) - i8;
                    int i18 = i8 + (i17 * i9);
                    int i19 = (i9 * bulletWidth) + i18;
                    int i20 = i9 * width;
                    i15 = Math.min(i18, i19) + i20;
                    i16 = Math.max(i18, i19) + i20;
                } else {
                    if (i9 <= 0) {
                        i8 -= blockMargin;
                    }
                    i15 = i8 + i17;
                    i16 = i15 + bulletWidth;
                }
                int descent = (i11 + ((int) (((this.paint.descent() + this.paint.ascent()) / 2.0f) + 0.5f))) - (bulletWidth / 2);
                int i21 = bulletWidth + descent;
                int i22 = this.level;
                if (i22 != 0 && i22 != 1) {
                    this.rectangle.set(i15, descent, i16, i21);
                    this.paint.setStyle(Paint.Style.FILL);
                    canvas.drawRect(this.rectangle, this.paint);
                    canvas.restoreToCount(save);
                }
                this.circle.set(i15, descent, i16, i21);
                this.paint.setStyle(this.level == 0 ? Paint.Style.FILL : Paint.Style.STROKE);
                canvas.drawOval(this.circle, this.paint);
                canvas.restoreToCount(save);
            } catch (Throwable th) {
                canvas.restoreToCount(save);
                throw th;
            }
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z7) {
        return this.theme.getBlockMargin();
    }
}
