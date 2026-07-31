package D0;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* loaded from: classes.dex */
public final class b extends MetricAffectingSpan {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f488a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f489b;

    public /* synthetic */ b(int i3, Object obj) {
        this.f488a = i3;
        this.f489b = obj;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f488a) {
            case 0:
                textPaint.setFontFeatureSettings((String) this.f489b);
                break;
            default:
                textPaint.setTypeface((Typeface) this.f489b);
                break;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        switch (this.f488a) {
            case 0:
                textPaint.setFontFeatureSettings((String) this.f489b);
                break;
            default:
                textPaint.setTypeface((Typeface) this.f489b);
                break;
        }
    }
}
