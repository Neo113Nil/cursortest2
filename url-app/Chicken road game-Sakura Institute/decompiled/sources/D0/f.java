package D0;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* loaded from: classes.dex */
public final class f extends MetricAffectingSpan {

    /* renamed from: a, reason: collision with root package name */
    public final float f2138a;

    public f(float f4) {
        this.f2138a = f4;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        float textScaleX = textPaint.getTextScaleX() * textPaint.getTextSize();
        if (textScaleX == 0.0f) {
            return;
        }
        textPaint.setLetterSpacing(this.f2138a / textScaleX);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        float textScaleX = textPaint.getTextScaleX() * textPaint.getTextSize();
        if (textScaleX == 0.0f) {
            return;
        }
        textPaint.setLetterSpacing(this.f2138a / textScaleX);
    }
}
