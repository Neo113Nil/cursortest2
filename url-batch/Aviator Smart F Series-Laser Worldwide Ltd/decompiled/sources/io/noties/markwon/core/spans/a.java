package io.noties.markwon.core.spans;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import androidx.annotation.NonNull;

/* loaded from: classes4.dex */
public class a implements LeadingMarginSpan {
    private final io.noties.markwon.core.b theme;
    private final Rect rect = g.rect();
    private final Paint paint = g.paint();

    public a(@NonNull io.noties.markwon.core.b bVar) {
        this.theme = bVar;
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i8, int i9, int i10, int i11, int i12, CharSequence charSequence, int i13, int i14, boolean z7, Layout layout) {
        int blockQuoteWidth = this.theme.getBlockQuoteWidth();
        this.paint.set(paint);
        this.theme.applyBlockQuoteStyle(this.paint);
        int i15 = i9 * blockQuoteWidth;
        int i16 = i8 + i15;
        int i17 = i15 + i16;
        this.rect.set(Math.min(i16, i17), i10, Math.max(i16, i17), i12);
        canvas.drawRect(this.rect, this.paint);
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z7) {
        return this.theme.getBlockMargin();
    }
}
