package i2;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class b extends MetricAffectingSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3392d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f3393e;

    public /* synthetic */ b(int i, Object obj) {
        this.f3392d = i;
        this.f3393e = obj;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f3392d) {
            case 0:
                textPaint.setFontFeatureSettings((String) this.f3393e);
                break;
            default:
                textPaint.setTypeface((Typeface) this.f3393e);
                break;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        switch (this.f3392d) {
            case 0:
                textPaint.setFontFeatureSettings((String) this.f3393e);
                break;
            default:
                textPaint.setTypeface((Typeface) this.f3393e);
                break;
        }
    }
}
