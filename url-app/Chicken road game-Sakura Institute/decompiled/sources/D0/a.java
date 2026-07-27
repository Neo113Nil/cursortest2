package D0;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* loaded from: classes.dex */
public final class a extends MetricAffectingSpan {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2132a;

    /* renamed from: b, reason: collision with root package name */
    public final float f2133b;

    public /* synthetic */ a(float f4, int i2) {
        this.f2132a = i2;
        this.f2133b = f4;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f2132a) {
            case 0:
                textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.f2133b);
                break;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + this.f2133b);
                break;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        switch (this.f2132a) {
            case 0:
                textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.f2133b);
                break;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + this.f2133b);
                break;
        }
    }
}
