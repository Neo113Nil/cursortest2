package d2;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a extends MetricAffectingSpan {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2564f;

    /* renamed from: g, reason: collision with root package name */
    public final float f2565g;

    public /* synthetic */ a(float f9, int i7) {
        this.f2564f = i7;
        this.f2565g = f9;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f2564f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.f2565g);
                break;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + this.f2565g);
                break;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        switch (this.f2564f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.f2565g);
                break;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + this.f2565g);
                break;
        }
    }
}
