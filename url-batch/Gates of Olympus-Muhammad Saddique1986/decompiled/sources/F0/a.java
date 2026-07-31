package F0;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* loaded from: classes.dex */
public final class a extends MetricAffectingSpan {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1921a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1922b;

    public /* synthetic */ a(float f3, int i3) {
        this.f1921a = i3;
        this.f1922b = f3;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f1921a) {
            case 0:
                textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.f1922b);
                break;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + this.f1922b);
                break;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        switch (this.f1921a) {
            case 0:
                textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.f1922b);
                break;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + this.f1922b);
                break;
        }
    }
}
