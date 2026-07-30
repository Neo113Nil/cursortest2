package d2;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b extends MetricAffectingSpan {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2566f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f2567g;

    public /* synthetic */ b(int i7, Object obj) {
        this.f2566f = i7;
        this.f2567g = obj;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f2566f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                textPaint.setFontFeatureSettings((String) this.f2567g);
                break;
            default:
                textPaint.setTypeface((Typeface) this.f2567g);
                break;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        switch (this.f2566f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                textPaint.setFontFeatureSettings((String) this.f2567g);
                break;
            default:
                textPaint.setTypeface((Typeface) this.f2567g);
                break;
        }
    }
}
