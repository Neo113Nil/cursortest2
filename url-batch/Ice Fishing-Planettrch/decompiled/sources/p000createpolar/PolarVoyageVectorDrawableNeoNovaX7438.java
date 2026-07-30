package p000createpolar;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageVectorDrawableNeoNovaX7438 extends MetricAffectingSpan {
    public final /* synthetic */ int PolarVoyageItemDecorationUltraDeltaEpic7485;
    public final float PolarVoyageStrictModeLegendEpic1532;

    public /* synthetic */ PolarVoyageVectorDrawableNeoNovaX7438(float f, int i) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = i;
        this.PolarVoyageStrictModeLegendEpic1532 = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        int i = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        float f = this.PolarVoyageStrictModeLegendEpic1532;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * f);
                break;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + f);
                break;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        int i = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        float f = this.PolarVoyageStrictModeLegendEpic1532;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * f);
                break;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + f);
                break;
        }
    }
}
