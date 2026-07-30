package io.noties.markwon.core.spans;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import androidx.annotation.NonNull;

/* loaded from: classes4.dex */
public class k implements LeadingMarginSpan {
    private final io.noties.markwon.core.b theme;
    private final Rect rect = g.rect();
    private final Paint paint = g.paint();

    public k(@NonNull io.noties.markwon.core.b bVar) {
        this.theme = bVar;
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i8, int i9, int i10, int i11, int i12, CharSequence charSequence, int i13, int i14, boolean z7, Layout layout) {
        int i15;
        int i16 = i10 + ((i12 - i10) / 2);
        this.paint.set(paint);
        this.theme.applyThematicBreakStyle(this.paint);
        int strokeWidth = (int) ((((int) (this.paint.getStrokeWidth() + 0.5f)) / 2.0f) + 0.5f);
        if (i9 > 0) {
            i15 = canvas.getWidth();
        } else {
            i15 = i8;
            i8 -= canvas.getWidth();
        }
        this.rect.set(i8, i16 - strokeWidth, i15, i16 + strokeWidth);
        canvas.drawRect(this.rect, this.paint);
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z7) {
        return 0;
    }
}
