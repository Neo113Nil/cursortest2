package p000createpolar;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageTextRecognitionHyperionSparkNebula1517 extends MetricAffectingSpan {
    public final float PolarVoyageItemDecorationUltraDeltaEpic7485;

    public PolarVoyageTextRecognitionHyperionSparkNebula1517(float f) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setLetterSpacing(this.PolarVoyageItemDecorationUltraDeltaEpic7485);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setLetterSpacing(this.PolarVoyageItemDecorationUltraDeltaEpic7485);
    }
}
