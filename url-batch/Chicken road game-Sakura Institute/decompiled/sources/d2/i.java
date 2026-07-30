package d2;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class i extends ReplacementSpan {

    /* renamed from: f, reason: collision with root package name */
    public Paint.FontMetricsInt f2583f;

    /* renamed from: g, reason: collision with root package name */
    public int f2584g;

    /* renamed from: h, reason: collision with root package name */
    public int f2585h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2586i;

    public final Paint.FontMetricsInt a() {
        Paint.FontMetricsInt fontMetricsInt = this.f2583f;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        r6.k.j("fontMetrics");
        throw null;
    }

    public final int b() {
        if (this.f2586i) {
            return this.f2585h;
        }
        throw new IllegalStateException("PlaceholderSpan is not laid out yet.");
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i8, Paint.FontMetricsInt fontMetricsInt) {
        this.f2586i = true;
        paint.getTextSize();
        this.f2583f = paint.getFontMetricsInt();
        if (a().descent <= a().ascent) {
            throw new IllegalArgumentException("Invalid fontMetrics: line height can not be negative.");
        }
        this.f2584g = (int) Math.ceil(0.0f);
        this.f2585h = (int) Math.ceil(0.0f);
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
        if (this.f2586i) {
            return this.f2584g;
        }
        throw new IllegalStateException("PlaceholderSpan is not laid out yet.");
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i8, float f9, int i9, int i10, int i11, Paint paint) {
    }
}
