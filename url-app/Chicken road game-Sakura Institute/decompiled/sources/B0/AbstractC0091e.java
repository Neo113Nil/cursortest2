package B0;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* renamed from: B0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0091e {
    public static final BoringLayout a(CharSequence charSequence, TextPaint textPaint, int i2, Layout.Alignment alignment, float f4, float f5, BoringLayout.Metrics metrics, boolean z4, boolean z5, TextUtils.TruncateAt truncateAt, int i4) {
        return AbstractC0090d.i(charSequence, textPaint, i2, alignment, f4, f5, metrics, z4, z5, truncateAt, i4);
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
