package o2;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class h implements LineHeightSpan {

    /* renamed from: d, reason: collision with root package name */
    public final float f7340d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7341e;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f7342i;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f7343r;

    /* renamed from: s, reason: collision with root package name */
    public final float f7344s;

    /* renamed from: t, reason: collision with root package name */
    public final int f7345t;

    /* renamed from: u, reason: collision with root package name */
    public int f7346u = Integer.MIN_VALUE;

    /* renamed from: v, reason: collision with root package name */
    public int f7347v = Integer.MIN_VALUE;

    /* renamed from: w, reason: collision with root package name */
    public int f7348w = Integer.MIN_VALUE;

    /* renamed from: x, reason: collision with root package name */
    public int f7349x = Integer.MIN_VALUE;

    /* renamed from: y, reason: collision with root package name */
    public int f7350y;

    /* renamed from: z, reason: collision with root package name */
    public int f7351z;

    public h(float f3, int i3, boolean z10, boolean z11, float f10, int i10) {
        this.f7340d = f3;
        this.f7341e = i3;
        this.f7342i = z10;
        this.f7343r = z11;
        this.f7344s = f10;
        this.f7345t = i10;
        if ((0.0f > f10 || f10 > 1.0f) && f10 != -1.0f) {
            r2.a.b("topRatio should be in [0..1] range or -1");
        }
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i3, int i10, int i11, int i12, Paint.FontMetricsInt fontMetricsInt) {
        int i13 = fontMetricsInt.descent;
        int i14 = fontMetricsInt.ascent;
        if (i13 - i14 <= 0) {
            return;
        }
        boolean z10 = i3 == 0;
        boolean z11 = i10 == this.f7341e;
        int i15 = this.f7345t;
        boolean z12 = this.f7343r;
        boolean z13 = this.f7342i;
        if (z10 && z11 && z13 && z12 && i15 != 2) {
            return;
        }
        if (this.f7346u == Integer.MIN_VALUE) {
            int i16 = i13 - i14;
            int ceil = (int) Math.ceil(this.f7340d);
            int i17 = ceil - i16;
            if (i15 != 1 || i17 > 0) {
                float f3 = this.f7344s;
                if (f3 == -1.0f) {
                    f3 = Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent);
                }
                int ceil2 = (int) (i17 <= 0 ? Math.ceil(i17 * f3) : Math.ceil((1.0f - f3) * i17));
                int i18 = fontMetricsInt.descent;
                int i19 = ceil2 + i18;
                this.f7348w = i19;
                int i20 = i19 - ceil;
                this.f7347v = i20;
                if (i15 == 0 || i17 >= 0) {
                    if (z13) {
                        i20 = fontMetricsInt.ascent;
                    }
                    this.f7346u = i20;
                    if (z12) {
                        i19 = i18;
                    }
                    this.f7349x = i19;
                    this.f7350y = fontMetricsInt.ascent - i20;
                    this.f7351z = i19 - i18;
                } else if (i15 == 2) {
                    int i21 = fontMetricsInt.ascent;
                    this.f7346u = z13 ? Math.max(i21, i20) : Math.min(i21, i20);
                    int i22 = fontMetricsInt.descent;
                    int i23 = this.f7348w;
                    this.f7349x = z12 ? Math.min(i22, i23) : Math.max(i22, i23);
                    this.f7350y = 0;
                    this.f7351z = 0;
                }
            } else {
                int i24 = fontMetricsInt.ascent;
                this.f7347v = i24;
                int i25 = fontMetricsInt.descent;
                this.f7348w = i25;
                this.f7346u = i24;
                this.f7349x = i25;
                this.f7350y = 0;
                this.f7351z = 0;
            }
        }
        fontMetricsInt.ascent = z10 ? this.f7346u : this.f7347v;
        fontMetricsInt.descent = z11 ? this.f7349x : this.f7348w;
    }
}
