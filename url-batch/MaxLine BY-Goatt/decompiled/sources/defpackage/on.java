package defpackage;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class on extends MetricAffectingSpan {
    public final /* synthetic */ int m;
    public final float n;

    public /* synthetic */ on(int i, float f) {
        this.m = i;
        this.n = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        int i = this.m;
        float f = this.n;
        switch (i) {
            case 0:
                textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * f);
                break;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + f);
                break;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        int i = this.m;
        float f = this.n;
        switch (i) {
            case 0:
                textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * f);
                break;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + f);
                break;
        }
    }
}
