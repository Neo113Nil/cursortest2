package io.noties.markwon.core.spans;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import androidx.annotation.NonNull;

/* loaded from: classes4.dex */
public class d extends MetricAffectingSpan {
    private final io.noties.markwon.core.b theme;

    public d(@NonNull io.noties.markwon.core.b bVar) {
        this.theme = bVar;
    }

    private void apply(TextPaint textPaint) {
        this.theme.applyCodeTextStyle(textPaint);
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        apply(textPaint);
        textPaint.bgColor = this.theme.getCodeBackgroundColor(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        apply(textPaint);
    }
}
