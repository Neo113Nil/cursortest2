package i2;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class a extends MetricAffectingSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3390d;

    /* renamed from: e, reason: collision with root package name */
    public final float f3391e;

    public /* synthetic */ a(int i, float f6) {
        this.f3390d = i;
        this.f3391e = f6;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f3390d) {
            case 0:
                textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.f3391e);
                break;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + this.f3391e);
                break;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        switch (this.f3390d) {
            case 0:
                textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.f3391e);
                break;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + this.f3391e);
                break;
        }
    }
}
