package o2;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b extends MetricAffectingSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7334d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f7335e;

    public /* synthetic */ b(int i3, Object obj) {
        this.f7334d = i3;
        this.f7335e = obj;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f7334d) {
            case 0:
                textPaint.setFontFeatureSettings((String) this.f7335e);
                break;
            default:
                textPaint.setTypeface((Typeface) this.f7335e);
                break;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        switch (this.f7334d) {
            case 0:
                textPaint.setFontFeatureSettings((String) this.f7335e);
                break;
            default:
                textPaint.setTypeface((Typeface) this.f7335e);
                break;
        }
    }
}
