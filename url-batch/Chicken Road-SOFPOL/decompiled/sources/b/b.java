package b;

import android.graphics.text.LineBreakConfig;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract /* synthetic */ class b {
    public static /* synthetic */ LineBreakConfig.Builder b() {
        return new LineBreakConfig.Builder();
    }

    public static /* synthetic */ BoringLayout f(CharSequence charSequence, TextPaint textPaint, int i, Layout.Alignment alignment, BoringLayout.Metrics metrics, boolean z3, TextUtils.TruncateAt truncateAt, int i8) {
        return new BoringLayout(charSequence, textPaint, i, alignment, 1.0f, 0.0f, metrics, z3, truncateAt, i8, true);
    }
}
