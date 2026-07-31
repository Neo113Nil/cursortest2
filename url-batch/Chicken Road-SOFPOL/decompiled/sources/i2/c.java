package i2;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class c implements LeadingMarginSpan {
    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i8, int i9, int i10, int i11, CharSequence charSequence, int i12, int i13, boolean z3, Layout layout) {
        int lineForOffset;
        if (layout == null || paint == null || (lineForOffset = layout.getLineForOffset(i12)) != layout.getLineCount() - 1) {
            return;
        }
        h2.i iVar = h2.k.f3118a;
        if (layout.getEllipsisCount(lineForOffset) > 0) {
            float F = h0.a.F(layout, lineForOffset, paint) + h0.a.E(layout, lineForOffset, paint);
            if (F == 0.0f) {
                return;
            }
            q6.i.b(canvas);
            canvas.translate(F, 0.0f);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z3) {
        return 0;
    }
}
