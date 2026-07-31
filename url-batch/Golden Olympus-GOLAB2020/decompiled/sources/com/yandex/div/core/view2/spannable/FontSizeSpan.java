package com.yandex.div.core.view2.spannable;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import android.text.style.ParagraphStyle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class FontSizeSpan extends MetricAffectingSpan implements ParagraphStyle {
    private final int fontSize;
    private final int lineHeight;

    public FontSizeSpan(int i4, int i5) {
        this.fontSize = i4;
        this.lineHeight = i5;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(@NotNull TextPaint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        paint.setTextSize(this.fontSize);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(@NotNull TextPaint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        int i4 = this.lineHeight;
        if (i4 == 0) {
            paint.setTextSize(this.fontSize);
        } else if (i4 >= paint.getTextSize()) {
            paint.setTextScaleX(this.fontSize / paint.getTextSize());
        } else {
            paint.setTextScaleX(this.fontSize / this.lineHeight);
            paint.setTextSize(this.lineHeight);
        }
    }
}
