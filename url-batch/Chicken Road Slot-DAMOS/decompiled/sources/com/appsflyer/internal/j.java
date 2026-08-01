package com.appsflyer.internal;

import android.graphics.text.LineBreakConfig;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class j {
    public static /* synthetic */ LineBreakConfig.Builder e() {
        return new LineBreakConfig.Builder();
    }

    public static /* synthetic */ BoringLayout i(CharSequence charSequence, TextPaint textPaint, int i3, Layout.Alignment alignment, BoringLayout.Metrics metrics, boolean z10, TextUtils.TruncateAt truncateAt, int i10) {
        return new BoringLayout(charSequence, textPaint, i3, alignment, 1.0f, 0.0f, metrics, z10, truncateAt, i10, true);
    }
}
