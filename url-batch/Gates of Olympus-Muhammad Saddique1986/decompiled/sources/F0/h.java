package F0;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* loaded from: classes.dex */
public final class h implements LineHeightSpan {

    /* renamed from: a, reason: collision with root package name */
    public final float f1929a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1930b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1931c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f1932d;

    /* renamed from: e, reason: collision with root package name */
    public final float f1933e;

    /* renamed from: f, reason: collision with root package name */
    public int f1934f = Integer.MIN_VALUE;

    /* renamed from: g, reason: collision with root package name */
    public int f1935g = Integer.MIN_VALUE;

    /* renamed from: h, reason: collision with root package name */
    public int f1936h = Integer.MIN_VALUE;

    /* renamed from: i, reason: collision with root package name */
    public int f1937i = Integer.MIN_VALUE;

    /* renamed from: j, reason: collision with root package name */
    public int f1938j;

    /* renamed from: k, reason: collision with root package name */
    public int f1939k;

    public h(float f3, int i3, boolean z3, boolean z4, float f4) {
        this.f1929a = f3;
        this.f1930b = i3;
        this.f1931c = z3;
        this.f1932d = z4;
        this.f1933e = f4;
        if ((0.0f > f4 || f4 > 1.0f) && f4 != -1.0f) {
            throw new IllegalStateException("topRatio should be in [0..1] range or -1");
        }
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i3, int i4, int i5, int i6, Paint.FontMetricsInt fontMetricsInt) {
        int i7 = fontMetricsInt.descent;
        int i8 = fontMetricsInt.ascent;
        if (i7 - i8 <= 0) {
            return;
        }
        boolean z3 = i3 == 0;
        boolean z4 = i4 == this.f1930b;
        boolean z5 = this.f1932d;
        boolean z6 = this.f1931c;
        if (z3 && z4 && z6 && z5) {
            return;
        }
        if (this.f1934f == Integer.MIN_VALUE) {
            int i9 = i7 - i8;
            int ceil = (int) Math.ceil(this.f1929a);
            int i10 = ceil - i9;
            float f3 = this.f1933e;
            if (f3 == -1.0f) {
                f3 = Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent);
            }
            int ceil2 = (int) (i10 <= 0 ? Math.ceil(i10 * f3) : Math.ceil((1.0f - f3) * i10));
            int i11 = fontMetricsInt.descent;
            int i12 = ceil2 + i11;
            this.f1936h = i12;
            int i13 = i12 - ceil;
            this.f1935g = i13;
            if (z6) {
                i13 = fontMetricsInt.ascent;
            }
            this.f1934f = i13;
            if (z5) {
                i12 = i11;
            }
            this.f1937i = i12;
            this.f1938j = fontMetricsInt.ascent - i13;
            this.f1939k = i12 - i11;
        }
        fontMetricsInt.ascent = z3 ? this.f1934f : this.f1935g;
        fontMetricsInt.descent = z4 ? this.f1937i : this.f1936h;
    }
}
