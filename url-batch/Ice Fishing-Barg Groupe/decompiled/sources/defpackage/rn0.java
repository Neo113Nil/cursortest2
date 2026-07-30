package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class rn0 implements LeadingMarginSpan {
    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int lineForOffset;
        if (layout == null || paint == null || (lineForOffset = layout.getLineForOffset(i6)) != layout.getLineCount() - 1) {
            return;
        }
        ThreadLocal threadLocal = li2.PxuCJdSBwIXG;
        if (layout.getEllipsisCount(lineForOffset) > 0) {
            float aF05bpZJlKEP = xi0.aF05bpZJlKEP(layout, lineForOffset, paint) + xi0.jyegZNwi31qc(layout, lineForOffset, paint);
            if (aF05bpZJlKEP == 0.0f) {
                return;
            }
            canvas.getClass();
            canvas.translate(aF05bpZJlKEP, 0.0f);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return 0;
    }
}
