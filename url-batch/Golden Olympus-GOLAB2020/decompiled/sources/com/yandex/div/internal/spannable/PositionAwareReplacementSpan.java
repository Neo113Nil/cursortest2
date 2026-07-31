package com.yandex.div.internal.spannable;

import android.graphics.Paint;
import android.os.Build;
import android.text.style.ReplacementSpan;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public abstract class PositionAwareReplacementSpan extends ReplacementSpan {
    private final void updateFontMetrics(int i4, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt == null || i4 != 0 || Build.VERSION.SDK_INT >= 28) {
            return;
        }
        fontMetricsInt.top = 0;
        fontMetricsInt.ascent = 0;
        fontMetricsInt.bottom = 0;
        fontMetricsInt.descent = 0;
        fontMetricsInt.leading = 0;
    }

    public abstract int adjustSize(@NotNull Paint paint, @NotNull CharSequence charSequence, int i4, int i5, @Nullable Paint.FontMetricsInt fontMetricsInt);

    @Override // android.text.style.ReplacementSpan
    public final int getSize(@NotNull Paint paint, @NotNull CharSequence text, int i4, int i5, @Nullable Paint.FontMetricsInt fontMetricsInt) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        Intrinsics.checkNotNullParameter(text, "text");
        updateFontMetrics(i4, fontMetricsInt);
        return adjustSize(paint, text, i4, i5, fontMetricsInt);
    }
}
