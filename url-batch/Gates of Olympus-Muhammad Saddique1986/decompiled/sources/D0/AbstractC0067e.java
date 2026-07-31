package D0;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* renamed from: D0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0067e {
    public static final BoringLayout a(CharSequence charSequence, TextPaint textPaint, int i3, Layout.Alignment alignment, float f3, float f4, BoringLayout.Metrics metrics, boolean z3, boolean z4, TextUtils.TruncateAt truncateAt, int i4) {
        return AbstractC0066d.e(charSequence, textPaint, i3, alignment, f3, f4, metrics, z3, z4, truncateAt, i4);
    }

    public static final BoringLayout.Metrics b(CharSequence charSequence, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic) {
        BoringLayout.Metrics isBoring;
        isBoring = BoringLayout.isBoring(charSequence, textPaint, textDirectionHeuristic, true, null);
        return isBoring;
    }

    public static final boolean c(BoringLayout boringLayout) {
        boolean isFallbackLineSpacingEnabled;
        isFallbackLineSpacingEnabled = boringLayout.isFallbackLineSpacingEnabled();
        return isFallbackLineSpacingEnabled;
    }
}
