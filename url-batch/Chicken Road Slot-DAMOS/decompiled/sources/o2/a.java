package o2;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a extends MetricAffectingSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7332d;

    /* renamed from: e, reason: collision with root package name */
    public final float f7333e;

    public /* synthetic */ a(int i3, float f3) {
        this.f7332d = i3;
        this.f7333e = f3;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f7332d) {
            case 0:
                textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.f7333e);
                break;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + this.f7333e);
                break;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        switch (this.f7332d) {
            case 0:
                textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.f7333e);
                break;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + this.f7333e);
                break;
        }
    }
}
