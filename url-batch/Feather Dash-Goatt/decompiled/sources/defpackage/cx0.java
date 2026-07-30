package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class cx0 extends ReplacementSpan {
    public Paint.FontMetricsInt d;
    public int e;
    public int g;
    public boolean h;

    public final Paint.FontMetricsInt a() {
        Paint.FontMetricsInt fontMetricsInt = this.d;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        Intrinsics.e("fontMetrics");
        throw null;
    }

    public final int b() {
        if (!this.h) {
            p80.b("PlaceholderSpan is not laid out yet.");
        }
        return this.g;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        this.h = true;
        paint.getTextSize();
        this.d = paint.getFontMetricsInt();
        if (a().descent <= a().ascent) {
            p80.a("Invalid fontMetrics: line height can not be negative.");
        }
        this.e = (int) Math.ceil(0.0d);
        this.g = (int) Math.ceil(0.0d);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = a().ascent;
            fontMetricsInt.descent = a().descent;
            fontMetricsInt.leading = a().leading;
            if (fontMetricsInt.ascent > (-b())) {
                fontMetricsInt.ascent = -b();
            }
            fontMetricsInt.top = Math.min(a().top, fontMetricsInt.ascent);
            fontMetricsInt.bottom = Math.max(a().bottom, fontMetricsInt.descent);
        }
        if (!this.h) {
            p80.b("PlaceholderSpan is not laid out yet.");
        }
        return this.e;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
    }
}
