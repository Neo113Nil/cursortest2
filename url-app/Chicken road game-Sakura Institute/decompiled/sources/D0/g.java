package D0;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* loaded from: classes.dex */
public final class g implements LineHeightSpan {

    /* renamed from: a, reason: collision with root package name */
    public final float f2139a;

    public g(float f4) {
        this.f2139a = f4;
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i2, int i4, int i5, int i6, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt.descent - fontMetricsInt.ascent <= 0) {
            return;
        }
        int ceil = (int) Math.ceil(fontMetricsInt.descent * ((r4 * 1.0f) / r3));
        fontMetricsInt.descent = ceil;
        fontMetricsInt.ascent = ceil - ((int) Math.ceil(this.f2139a));
    }
}
