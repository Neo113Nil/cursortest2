package F0;

import D0.F;
import D0.H;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import h2.AbstractC0508a;

/* loaded from: classes.dex */
public final class c implements LeadingMarginSpan {
    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i3, int i4, int i5, int i6, int i7, CharSequence charSequence, int i8, int i9, boolean z3, Layout layout) {
        int lineForOffset;
        if (layout == null || paint == null || (lineForOffset = layout.getLineForOffset(i8)) != layout.getLineCount() - 1) {
            return;
        }
        F f3 = H.f839a;
        if (layout.getEllipsisCount(lineForOffset) > 0) {
            float F3 = AbstractC0508a.F(layout, lineForOffset, paint) + AbstractC0508a.E(layout, lineForOffset, paint);
            if (F3 == 0.0f) {
                return;
            }
            f2.j.c(canvas);
            canvas.translate(F3, 0.0f);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z3) {
        return 0;
    }
}
