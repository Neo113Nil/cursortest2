package defpackage;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class lp0 extends MetricAffectingSpan {
    public final /* synthetic */ int m;
    public final Object n;

    public /* synthetic */ lp0(int i, Object obj) {
        this.m = i;
        this.n = obj;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        int i = this.m;
        Object obj = this.n;
        switch (i) {
            case 0:
                textPaint.setFontFeatureSettings((String) obj);
                break;
            default:
                textPaint.setTypeface((Typeface) obj);
                break;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        int i = this.m;
        Object obj = this.n;
        switch (i) {
            case 0:
                textPaint.setFontFeatureSettings((String) obj);
                break;
            default:
                textPaint.setTypeface((Typeface) obj);
                break;
        }
    }
}
