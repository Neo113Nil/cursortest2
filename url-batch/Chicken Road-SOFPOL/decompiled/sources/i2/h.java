package i2;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class h implements LineHeightSpan {

    /* renamed from: d, reason: collision with root package name */
    public final float f3398d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3399e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f3400f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f3401g;

    /* renamed from: h, reason: collision with root package name */
    public final float f3402h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public int f3403j = Integer.MIN_VALUE;

    /* renamed from: k, reason: collision with root package name */
    public int f3404k = Integer.MIN_VALUE;

    /* renamed from: l, reason: collision with root package name */
    public int f3405l = Integer.MIN_VALUE;

    /* renamed from: m, reason: collision with root package name */
    public int f3406m = Integer.MIN_VALUE;

    /* renamed from: n, reason: collision with root package name */
    public int f3407n;

    /* renamed from: o, reason: collision with root package name */
    public int f3408o;

    public h(float f6, int i, boolean z3, boolean z7, float f8, boolean z8) {
        this.f3398d = f6;
        this.f3399e = i;
        this.f3400f = z3;
        this.f3401g = z7;
        this.f3402h = f8;
        this.i = z8;
        if ((0.0f > f8 || f8 > 1.0f) && f8 != -1.0f) {
            l2.a.b("topRatio should be in [0..1] range or -1");
        }
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i8, int i9, int i10, Paint.FontMetricsInt fontMetricsInt) {
        int i11 = fontMetricsInt.descent;
        int i12 = fontMetricsInt.ascent;
        if (i11 - i12 <= 0) {
            return;
        }
        boolean z3 = i == 0;
        boolean z7 = i8 == this.f3399e;
        boolean z8 = this.f3401g;
        boolean z9 = this.f3400f;
        if (z3 && z7 && z9 && z8) {
            return;
        }
        if (this.f3403j == Integer.MIN_VALUE) {
            int i13 = i11 - i12;
            int ceil = (int) Math.ceil(this.f3398d);
            int i14 = ceil - i13;
            if (!this.i || i14 > 0) {
                float f6 = this.f3402h;
                if (f6 == -1.0f) {
                    f6 = Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent);
                }
                int ceil2 = (int) (i14 <= 0 ? Math.ceil(i14 * f6) : Math.ceil((1.0f - f6) * i14));
                int i15 = fontMetricsInt.descent;
                int i16 = ceil2 + i15;
                this.f3405l = i16;
                int i17 = i16 - ceil;
                this.f3404k = i17;
                if (z9) {
                    i17 = fontMetricsInt.ascent;
                }
                this.f3403j = i17;
                if (z8) {
                    i16 = i15;
                }
                this.f3406m = i16;
                this.f3407n = fontMetricsInt.ascent - i17;
                this.f3408o = i16 - i15;
            } else {
                int i18 = fontMetricsInt.ascent;
                this.f3404k = i18;
                int i19 = fontMetricsInt.descent;
                this.f3405l = i19;
                this.f3403j = i18;
                this.f3406m = i19;
                this.f3407n = 0;
                this.f3408o = 0;
            }
        }
        fontMetricsInt.ascent = z3 ? this.f3403j : this.f3404k;
        fontMetricsInt.descent = z7 ? this.f3406m : this.f3405l;
    }
}
