package D0;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* loaded from: classes.dex */
public final class h implements LineHeightSpan {

    /* renamed from: a, reason: collision with root package name */
    public final float f2140a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2141b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2142c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f2143d;

    /* renamed from: e, reason: collision with root package name */
    public final float f2144e;

    /* renamed from: f, reason: collision with root package name */
    public int f2145f = Integer.MIN_VALUE;

    /* renamed from: g, reason: collision with root package name */
    public int f2146g = Integer.MIN_VALUE;

    /* renamed from: h, reason: collision with root package name */
    public int f2147h = Integer.MIN_VALUE;

    /* renamed from: i, reason: collision with root package name */
    public int f2148i = Integer.MIN_VALUE;

    /* renamed from: j, reason: collision with root package name */
    public int f2149j;

    /* renamed from: k, reason: collision with root package name */
    public int f2150k;

    public h(float f4, int i2, boolean z4, boolean z5, float f5) {
        this.f2140a = f4;
        this.f2141b = i2;
        this.f2142c = z4;
        this.f2143d = z5;
        this.f2144e = f5;
        if ((0.0f > f5 || f5 > 1.0f) && f5 != -1.0f) {
            throw new IllegalStateException("topRatio should be in [0..1] range or -1");
        }
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i2, int i4, int i5, int i6, Paint.FontMetricsInt fontMetricsInt) {
        int i7 = fontMetricsInt.descent;
        int i8 = fontMetricsInt.ascent;
        if (i7 - i8 <= 0) {
            return;
        }
        boolean z4 = i2 == 0;
        boolean z5 = i4 == this.f2141b;
        boolean z6 = this.f2143d;
        boolean z7 = this.f2142c;
        if (z4 && z5 && z7 && z6) {
            return;
        }
        if (this.f2145f == Integer.MIN_VALUE) {
            int i9 = i7 - i8;
            int ceil = (int) Math.ceil(this.f2140a);
            int i10 = ceil - i9;
            float f4 = this.f2144e;
            if (f4 == -1.0f) {
                f4 = Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent);
            }
            int ceil2 = (int) (i10 <= 0 ? Math.ceil(i10 * f4) : Math.ceil((1.0f - f4) * i10));
            int i11 = fontMetricsInt.descent;
            int i12 = ceil2 + i11;
            this.f2147h = i12;
            int i13 = i12 - ceil;
            this.f2146g = i13;
            if (z7) {
                i13 = fontMetricsInt.ascent;
            }
            this.f2145f = i13;
            if (z6) {
                i12 = i11;
            }
            this.f2148i = i12;
            this.f2149j = fontMetricsInt.ascent - i13;
            this.f2150k = i12 - i11;
        }
        fontMetricsInt.ascent = z4 ? this.f2145f : this.f2146g;
        fontMetricsInt.descent = z5 ? this.f2148i : this.f2147h;
    }
}
