package F0;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* loaded from: classes.dex */
public final class b extends MetricAffectingSpan {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1923a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1924b;

    public /* synthetic */ b(int i3, Object obj) {
        this.f1923a = i3;
        this.f1924b = obj;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f1923a) {
            case 0:
                textPaint.setFontFeatureSettings((String) this.f1924b);
                break;
            default:
                textPaint.setTypeface((Typeface) this.f1924b);
                break;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        switch (this.f1923a) {
            case 0:
                textPaint.setFontFeatureSettings((String) this.f1924b);
                break;
            default:
                textPaint.setTypeface((Typeface) this.f1924b);
                break;
        }
    }
}
