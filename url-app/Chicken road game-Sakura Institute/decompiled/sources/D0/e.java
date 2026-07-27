package D0;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* loaded from: classes.dex */
public final class e extends MetricAffectingSpan {

    /* renamed from: a, reason: collision with root package name */
    public final float f2137a;

    public e(float f4) {
        this.f2137a = f4;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setLetterSpacing(this.f2137a);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setLetterSpacing(this.f2137a);
    }
}
