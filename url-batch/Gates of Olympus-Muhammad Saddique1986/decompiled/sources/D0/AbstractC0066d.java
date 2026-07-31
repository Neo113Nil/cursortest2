package D0;

import android.graphics.text.LineBreakConfig;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.inputmethod.EditorBoundsInfo;

/* renamed from: D0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0066d {
    public static /* synthetic */ LineBreakConfig.Builder a() {
        return new LineBreakConfig.Builder();
    }

    public static /* synthetic */ BoringLayout e(CharSequence charSequence, TextPaint textPaint, int i3, Layout.Alignment alignment, float f3, float f4, BoringLayout.Metrics metrics, boolean z3, boolean z4, TextUtils.TruncateAt truncateAt, int i4) {
        return new BoringLayout(charSequence, textPaint, i3, alignment, f3, f4, metrics, z3, truncateAt, i4, z4);
    }

    public static /* synthetic */ EditorBoundsInfo.Builder h() {
        return new EditorBoundsInfo.Builder();
    }
}
