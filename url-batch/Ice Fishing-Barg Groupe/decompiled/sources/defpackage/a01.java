package defpackage;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class a01 extends MetricAffectingSpan {
    public final float rtx2ld2ELZv4;

    public a01(float f) {
        this.rtx2ld2ELZv4 = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setLetterSpacing(this.rtx2ld2ELZv4);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setLetterSpacing(this.rtx2ld2ELZv4);
    }
}
