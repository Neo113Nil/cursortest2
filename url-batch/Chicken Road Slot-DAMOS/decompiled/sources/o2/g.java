package o2;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g implements LineHeightSpan {

    /* renamed from: d, reason: collision with root package name */
    public final float f7339d;

    public g(float f3) {
        this.f7339d = f3;
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i3, int i10, int i11, int i12, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt.descent - fontMetricsInt.ascent <= 0) {
            return;
        }
        int ceil = (int) Math.ceil(fontMetricsInt.descent * ((r4 * 1.0f) / r3));
        fontMetricsInt.descent = ceil;
        fontMetricsInt.ascent = ceil - ((int) Math.ceil(this.f7339d));
    }
}
