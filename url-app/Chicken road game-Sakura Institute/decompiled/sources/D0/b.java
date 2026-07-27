package D0;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* loaded from: classes.dex */
public final class b extends MetricAffectingSpan {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2134a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2135b;

    public /* synthetic */ b(int i2, Object obj) {
        this.f2134a = i2;
        this.f2135b = obj;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f2134a) {
            case 0:
                textPaint.setFontFeatureSettings((String) this.f2135b);
                break;
            default:
                textPaint.setTypeface((Typeface) this.f2135b);
                break;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        switch (this.f2134a) {
            case 0:
                textPaint.setFontFeatureSettings((String) this.f2135b);
                break;
            default:
                textPaint.setTypeface((Typeface) this.f2135b);
                break;
        }
    }
}
