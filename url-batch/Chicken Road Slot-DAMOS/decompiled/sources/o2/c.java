package o2;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c implements LeadingMarginSpan {
    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i3, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14, int i15, boolean z10, Layout layout) {
        int lineForOffset;
        if (layout == null || paint == null || (lineForOffset = layout.getLineForOffset(i14)) != layout.getLineCount() - 1) {
            return;
        }
        ThreadLocal threadLocal = n2.i.f7021a;
        if (layout.getEllipsisCount(lineForOffset) > 0) {
            float z11 = a.a.z(layout, lineForOffset, paint) + a.a.y(layout, lineForOffset, paint);
            if (z11 == 0.0f) {
                return;
            }
            canvas.getClass();
            canvas.translate(z11, 0.0f);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z10) {
        return 0;
    }
}
