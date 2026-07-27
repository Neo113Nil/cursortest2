package D0;

import B0.E;
import B0.G;
import a.AbstractC0345a;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c implements LeadingMarginSpan {
    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i2, int i4, int i5, int i6, int i7, CharSequence charSequence, int i8, int i9, boolean z4, Layout layout) {
        int lineForOffset;
        if (layout == null || paint == null || (lineForOffset = layout.getLineForOffset(i8)) != layout.getLineCount() - 1) {
            return;
        }
        E e4 = G.f917a;
        if (layout.getEllipsisCount(lineForOffset) > 0) {
            float u4 = AbstractC0345a.u(layout, lineForOffset, paint) + AbstractC0345a.t(layout, lineForOffset, paint);
            if (u4 == 0.0f) {
                return;
            }
            Intrinsics.c(canvas);
            canvas.translate(u4, 0.0f);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z4) {
        return 0;
    }
}
