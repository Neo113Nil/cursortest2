package io.noties.markwon.core.spans;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* loaded from: classes9.dex */
public final class EmphasisSpan extends MetricAffectingSpan {
    public final /* synthetic */ int $r8$classId;

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.$r8$classId) {
            case 0:
                textPaint.setTextSkewX(-0.25f);
                break;
            default:
                textPaint.setFakeBoldText(true);
                break;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        switch (this.$r8$classId) {
            case 0:
                textPaint.setTextSkewX(-0.25f);
                break;
            default:
                textPaint.setFakeBoldText(true);
                break;
        }
    }
}
