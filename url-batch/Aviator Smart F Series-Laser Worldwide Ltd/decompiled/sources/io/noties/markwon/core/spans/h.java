package io.noties.markwon.core.spans;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.LeadingMarginSpan;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* loaded from: classes4.dex */
public class h implements LeadingMarginSpan {
    private int margin;
    private final String number;
    private final Paint paint = g.paint();
    private final io.noties.markwon.core.b theme;

    public h(@NonNull io.noties.markwon.core.b bVar, @NonNull String str) {
        this.theme = bVar;
        this.number = str;
    }

    public static void measure(@NonNull TextView textView, @NonNull CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            h[] hVarArr = (h[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), h.class);
            if (hVarArr != null) {
                TextPaint paint = textView.getPaint();
                for (h hVar : hVarArr) {
                    hVar.margin = (int) (paint.measureText(hVar.number) + 0.5f);
                }
            }
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i8, int i9, int i10, int i11, int i12, CharSequence charSequence, int i13, int i14, boolean z7, Layout layout) {
        if (z7 && x5.c.selfStart(i13, charSequence, this)) {
            this.paint.set(paint);
            this.theme.applyListItemStyle(this.paint);
            int measureText = (int) (this.paint.measureText(this.number) + 0.5f);
            int blockMargin = this.theme.getBlockMargin();
            if (measureText > blockMargin) {
                this.margin = measureText;
                blockMargin = measureText;
            } else {
                this.margin = 0;
            }
            canvas.drawText(this.number, i9 > 0 ? (i8 + (blockMargin * i9)) - measureText : i8 + (i9 * blockMargin) + (blockMargin - measureText), i11, this.paint);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean z7) {
        return Math.max(this.margin, this.theme.getBlockMargin());
    }
}
