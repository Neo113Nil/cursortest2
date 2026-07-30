package d2;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class h implements LineHeightSpan {

    /* renamed from: f, reason: collision with root package name */
    public final float f2572f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2573g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f2574h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f2575i;

    /* renamed from: j, reason: collision with root package name */
    public final float f2576j;

    /* renamed from: k, reason: collision with root package name */
    public int f2577k = Integer.MIN_VALUE;

    /* renamed from: l, reason: collision with root package name */
    public int f2578l = Integer.MIN_VALUE;

    /* renamed from: m, reason: collision with root package name */
    public int f2579m = Integer.MIN_VALUE;

    /* renamed from: n, reason: collision with root package name */
    public int f2580n = Integer.MIN_VALUE;

    /* renamed from: o, reason: collision with root package name */
    public int f2581o;

    /* renamed from: p, reason: collision with root package name */
    public int f2582p;

    public h(float f9, int i7, boolean z8, boolean z9, float f10) {
        this.f2572f = f9;
        this.f2573g = i7;
        this.f2574h = z8;
        this.f2575i = z9;
        this.f2576j = f10;
        if ((0.0f > f10 || f10 > 1.0f) && f10 != -1.0f) {
            throw new IllegalStateException("topRatio should be in [0..1] range or -1");
        }
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i7, int i8, int i9, int i10, Paint.FontMetricsInt fontMetricsInt) {
        int i11 = fontMetricsInt.descent;
        int i12 = fontMetricsInt.ascent;
        if (i11 - i12 <= 0) {
            return;
        }
        boolean z8 = i7 == 0;
        boolean z9 = i8 == this.f2573g;
        boolean z10 = this.f2575i;
        boolean z11 = this.f2574h;
        if (z8 && z9 && z11 && z10) {
            return;
        }
        if (this.f2577k == Integer.MIN_VALUE) {
            int i13 = i11 - i12;
            int ceil = (int) Math.ceil(this.f2572f);
            int i14 = ceil - i13;
            float f9 = this.f2576j;
            if (f9 == -1.0f) {
                f9 = Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent);
            }
            int ceil2 = (int) (i14 <= 0 ? Math.ceil(i14 * f9) : Math.ceil((1.0f - f9) * i14));
            int i15 = fontMetricsInt.descent;
            int i16 = ceil2 + i15;
            this.f2579m = i16;
            int i17 = i16 - ceil;
            this.f2578l = i17;
            if (z11) {
                i17 = fontMetricsInt.ascent;
            }
            this.f2577k = i17;
            if (z10) {
                i16 = i15;
            }
            this.f2580n = i16;
            this.f2581o = fontMetricsInt.ascent - i17;
            this.f2582p = i16 - i15;
        }
        fontMetricsInt.ascent = z8 ? this.f2577k : this.f2578l;
        fontMetricsInt.descent = z9 ? this.f2580n : this.f2579m;
    }
}
