package i2;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class i extends ReplacementSpan {

    /* renamed from: d, reason: collision with root package name */
    public Paint.FontMetricsInt f3409d;

    /* renamed from: e, reason: collision with root package name */
    public int f3410e;

    /* renamed from: f, reason: collision with root package name */
    public int f3411f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3412g;

    public final Paint.FontMetricsInt a() {
        Paint.FontMetricsInt fontMetricsInt = this.f3409d;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        q6.i.j("fontMetrics");
        throw null;
    }

    public final int b() {
        if (!this.f3412g) {
            l2.a.b("PlaceholderSpan is not laid out yet.");
        }
        return this.f3411f;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i8, Paint.FontMetricsInt fontMetricsInt) {
        this.f3412g = true;
        paint.getTextSize();
        this.f3409d = paint.getFontMetricsInt();
        if (a().descent <= a().ascent) {
            l2.a.a("Invalid fontMetrics: line height can not be negative.");
        }
        this.f3410e = (int) Math.ceil(0.0f);
        this.f3411f = (int) Math.ceil(0.0f);
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
        if (!this.f3412g) {
            l2.a.b("PlaceholderSpan is not laid out yet.");
        }
        return this.f3410e;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i8, float f6, int i9, int i10, int i11, Paint paint) {
    }
}
