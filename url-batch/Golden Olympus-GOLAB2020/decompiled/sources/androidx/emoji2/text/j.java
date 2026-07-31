package androidx.emoji2.text;

import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* loaded from: classes.dex */
public abstract class j extends ReplacementSpan {

    /* renamed from: c, reason: collision with root package name */
    private final p f12185c;

    /* renamed from: b, reason: collision with root package name */
    private final Paint.FontMetricsInt f12184b = new Paint.FontMetricsInt();

    /* renamed from: d, reason: collision with root package name */
    private short f12186d = -1;

    /* renamed from: e, reason: collision with root package name */
    private short f12187e = -1;

    /* renamed from: f, reason: collision with root package name */
    private float f12188f = 1.0f;

    j(p pVar) {
        A.h.g(pVar, "rasterizer cannot be null");
        this.f12185c = pVar;
    }

    public final p a() {
        return this.f12185c;
    }

    final int b() {
        return this.f12186d;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i4, int i5, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f12184b);
        Paint.FontMetricsInt fontMetricsInt2 = this.f12184b;
        this.f12188f = (Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f) / this.f12185c.e();
        this.f12187e = (short) (this.f12185c.e() * this.f12188f);
        short i6 = (short) (this.f12185c.i() * this.f12188f);
        this.f12186d = i6;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f12184b;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return i6;
    }
}
