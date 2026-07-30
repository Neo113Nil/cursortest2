package defpackage;

import android.graphics.text.LineBreakConfig;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.inputmethod.EditorBoundsInfo;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract /* synthetic */ class uy1Qfkdvj4xZ {
    public static /* synthetic */ LineBreakConfig.Builder PxuCJdSBwIXG() {
        return new LineBreakConfig.Builder();
    }

    public static /* synthetic */ BoringLayout e9gEMXR7LXtO(CharSequence charSequence, TextPaint textPaint, int i, Layout.Alignment alignment, BoringLayout.Metrics metrics, boolean z, TextUtils.TruncateAt truncateAt, int i2) {
        return new BoringLayout(charSequence, textPaint, i, alignment, 1.0f, 0.0f, metrics, z, truncateAt, i2, true);
    }

    public static /* synthetic */ EditorBoundsInfo.Builder rtx2ld2ELZv4() {
        return new EditorBoundsInfo.Builder();
    }
}
