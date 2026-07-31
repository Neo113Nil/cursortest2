package F0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* loaded from: classes.dex */
public final class i extends ReplacementSpan {

    /* renamed from: a, reason: collision with root package name */
    public Paint.FontMetricsInt f1940a;

    /* renamed from: b, reason: collision with root package name */
    public int f1941b;

    /* renamed from: c, reason: collision with root package name */
    public int f1942c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1943d;

    public final Paint.FontMetricsInt a() {
        Paint.FontMetricsInt fontMetricsInt = this.f1940a;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        f2.j.j("fontMetrics");
        throw null;
    }

    public final int b() {
        if (this.f1943d) {
            return this.f1942c;
        }
        throw new IllegalStateException("PlaceholderSpan is not laid out yet.");
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        this.f1943d = true;
        paint.getTextSize();
        this.f1940a = paint.getFontMetricsInt();
        if (a().descent <= a().ascent) {
            throw new IllegalArgumentException("Invalid fontMetrics: line height can not be negative.");
        }
        this.f1941b = (int) Math.ceil(0.0f);
        this.f1942c = (int) Math.ceil(0.0f);
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
        if (this.f1943d) {
            return this.f1941b;
        }
        throw new IllegalStateException("PlaceholderSpan is not laid out yet.");
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i3, int i4, float f3, int i5, int i6, int i7, Paint paint) {
    }
}
