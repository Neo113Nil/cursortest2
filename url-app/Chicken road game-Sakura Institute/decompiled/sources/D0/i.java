package D0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i extends ReplacementSpan {

    /* renamed from: a, reason: collision with root package name */
    public Paint.FontMetricsInt f2151a;

    /* renamed from: b, reason: collision with root package name */
    public int f2152b;

    /* renamed from: c, reason: collision with root package name */
    public int f2153c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2154d;

    public final Paint.FontMetricsInt a() {
        Paint.FontMetricsInt fontMetricsInt = this.f2151a;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        Intrinsics.g("fontMetrics");
        throw null;
    }

    public final int b() {
        if (this.f2154d) {
            return this.f2153c;
        }
        throw new IllegalStateException("PlaceholderSpan is not laid out yet.");
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i2, int i4, float f4, int i5, int i6, int i7, Paint paint) {
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i2, int i4, Paint.FontMetricsInt fontMetricsInt) {
        this.f2154d = true;
        paint.getTextSize();
        this.f2151a = paint.getFontMetricsInt();
        if (a().descent <= a().ascent) {
            throw new IllegalArgumentException("Invalid fontMetrics: line height can not be negative.");
        }
        this.f2152b = (int) Math.ceil(0.0f);
        this.f2153c = (int) Math.ceil(0.0f);
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
        if (this.f2154d) {
            return this.f2152b;
        }
        throw new IllegalStateException("PlaceholderSpan is not laid out yet.");
    }
}
