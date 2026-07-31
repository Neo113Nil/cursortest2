package D0;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* loaded from: classes.dex */
public final class g implements LineHeightSpan {

    /* renamed from: a, reason: collision with root package name */
    public final float f493a;

    /* renamed from: b, reason: collision with root package name */
    public final int f494b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f495c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f496d;

    /* renamed from: e, reason: collision with root package name */
    public final float f497e;

    /* renamed from: f, reason: collision with root package name */
    public int f498f = Integer.MIN_VALUE;

    /* renamed from: g, reason: collision with root package name */
    public int f499g = Integer.MIN_VALUE;

    /* renamed from: h, reason: collision with root package name */
    public int f500h = Integer.MIN_VALUE;

    /* renamed from: i, reason: collision with root package name */
    public int f501i = Integer.MIN_VALUE;

    /* renamed from: j, reason: collision with root package name */
    public int f502j;

    /* renamed from: k, reason: collision with root package name */
    public int f503k;

    public g(float f3, int i3, boolean z3, boolean z4, float f4) {
        this.f493a = f3;
        this.f494b = i3;
        this.f495c = z3;
        this.f496d = z4;
        this.f497e = f4;
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
        boolean z4 = i4 == this.f494b;
        boolean z5 = this.f496d;
        boolean z6 = this.f495c;
        if (z3 && z4 && z6 && z5) {
            return;
        }
        if (this.f498f == Integer.MIN_VALUE) {
            int i9 = i7 - i8;
            int ceil = (int) Math.ceil(this.f493a);
            int i10 = ceil - i9;
            float f3 = this.f497e;
            if (f3 == -1.0f) {
                f3 = Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent);
            }
            int ceil2 = (int) (i10 <= 0 ? Math.ceil(i10 * f3) : Math.ceil((1.0f - f3) * i10));
            int i11 = fontMetricsInt.descent;
            int i12 = ceil2 + i11;
            this.f500h = i12;
            int i13 = i12 - ceil;
            this.f499g = i13;
            if (z6) {
                i13 = fontMetricsInt.ascent;
            }
            this.f498f = i13;
            if (z5) {
                i12 = i11;
            }
            this.f501i = i12;
            this.f502j = fontMetricsInt.ascent - i13;
            this.f503k = i12 - i11;
        }
        fontMetricsInt.ascent = z3 ? this.f498f : this.f499g;
        fontMetricsInt.descent = z4 ? this.f501i : this.f500h;
    }
}
