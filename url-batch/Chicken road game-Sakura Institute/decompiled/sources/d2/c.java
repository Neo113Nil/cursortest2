package d2;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import b2.c0;
import b2.e0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c implements LeadingMarginSpan {
    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i7, int i8, int i9, int i10, int i11, CharSequence charSequence, int i12, int i13, boolean z8, Layout layout) {
        int lineForOffset;
        if (layout == null || paint == null || (lineForOffset = layout.getLineForOffset(i12)) != layout.getLineCount() - 1) {
            return;
        }
        c0 c0Var = e0.f1279a;
        if (layout.getEllipsisCount(lineForOffset) > 0) {
            float D = t6.a.D(layout, lineForOffset, paint) + t6.a.C(layout, lineForOffset, paint);
            if (D == 0.0f) {
                return;
            }
            r6.k.c(canvas);
            canvas.translate(D, 0.0f);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z8) {
        return 0;
    }
}
