package B0;

import android.graphics.text.LineBreakConfig;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.inputmethod.EditorBoundsInfo;

/* renamed from: B0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0090d {
    public static /* synthetic */ LineBreakConfig.Builder e() {
        return new LineBreakConfig.Builder();
    }

    public static /* synthetic */ BoringLayout i(CharSequence charSequence, TextPaint textPaint, int i2, Layout.Alignment alignment, float f4, float f5, BoringLayout.Metrics metrics, boolean z4, boolean z5, TextUtils.TruncateAt truncateAt, int i4) {
        return new BoringLayout(charSequence, textPaint, i2, alignment, f4, f5, metrics, z4, truncateAt, i4, z5);
    }

    public static /* synthetic */ EditorBoundsInfo.Builder l() {
        return new EditorBoundsInfo.Builder();
    }
}
