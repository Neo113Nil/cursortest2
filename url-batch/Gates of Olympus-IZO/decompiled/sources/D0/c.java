package D0;

import C0.B;
import C0.D;
import a.AbstractC0157a;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;

/* loaded from: classes.dex */
public final class c implements LeadingMarginSpan {
    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i3, int i4, int i5, int i6, int i7, CharSequence charSequence, int i8, int i9, boolean z3, Layout layout) {
        int lineForOffset;
        if (layout == null || paint == null || (lineForOffset = layout.getLineForOffset(i8)) != layout.getLineCount() - 1) {
            return;
        }
        B b2 = D.f440a;
        if (layout.getEllipsisCount(lineForOffset) > 0) {
            float E3 = AbstractC0157a.E(layout, lineForOffset, paint) + AbstractC0157a.D(layout, lineForOffset, paint);
            if (E3 == 0.0f) {
                return;
            }
            Z1.i.c(canvas);
            canvas.translate(E3, 0.0f);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z3) {
        return 0;
    }
}
