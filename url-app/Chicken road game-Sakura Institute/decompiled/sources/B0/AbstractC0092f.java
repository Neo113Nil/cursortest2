package B0;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* renamed from: B0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0092f {
    public static final BoringLayout a(CharSequence charSequence, TextPaint textPaint, int i2, Layout.Alignment alignment, float f4, float f5, BoringLayout.Metrics metrics, boolean z4, TextUtils.TruncateAt truncateAt, int i4) {
        return new BoringLayout(charSequence, textPaint, i2, alignment, f4, f5, metrics, z4, truncateAt, i4);
    }

    public static final BoringLayout.Metrics b(CharSequence charSequence, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic) {
        if (textDirectionHeuristic.isRtl(charSequence, 0, charSequence.length())) {
            return null;
        }
        return BoringLayout.isBoring(charSequence, textPaint, null);
    }
}
