package defpackage;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class kh0 implements LineHeightSpan {
    public final float d;
    public final int e;
    public final boolean g;
    public final boolean h;
    public final float i;
    public final int j;
    public int k = Integer.MIN_VALUE;
    public int l = Integer.MIN_VALUE;
    public int m = Integer.MIN_VALUE;
    public int n = Integer.MIN_VALUE;
    public int o;
    public int p;

    public kh0(float f, int i, boolean z, boolean z2, float f2, int i2) {
        this.d = f;
        this.e = i;
        this.g = z;
        this.h = z2;
        this.i = f2;
        this.j = i2;
        if ((0.0f > f2 || f2 > 1.0f) && f2 != -1.0f) {
            p80.b("topRatio should be in [0..1] range or -1");
        }
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        int i5 = fontMetricsInt.descent;
        int i6 = fontMetricsInt.ascent;
        if (i5 - i6 <= 0) {
            return;
        }
        boolean z = i == 0;
        boolean z2 = i2 == this.e;
        int i7 = this.j;
        boolean z3 = this.h;
        boolean z4 = this.g;
        if (z && z2 && z4 && z3 && i7 != 2) {
            return;
        }
        if (this.k == Integer.MIN_VALUE) {
            int i8 = i5 - i6;
            int ceil = (int) Math.ceil(this.d);
            int i9 = ceil - i8;
            if (i7 != 1 || i9 > 0) {
                float f = this.i;
                if (f == -1.0f) {
                    f = Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent);
                }
                int ceil2 = (int) (i9 <= 0 ? Math.ceil(i9 * f) : Math.ceil((1.0f - f) * i9));
                int i10 = fontMetricsInt.descent;
                int i11 = ceil2 + i10;
                this.m = i11;
                int i12 = i11 - ceil;
                this.l = i12;
                if (i7 == 0 || i9 >= 0) {
                    if (z4) {
                        i12 = fontMetricsInt.ascent;
                    }
                    this.k = i12;
                    if (z3) {
                        i11 = i10;
                    }
                    this.n = i11;
                    this.o = fontMetricsInt.ascent - i12;
                    this.p = i11 - i10;
                } else if (i7 == 2) {
                    int i13 = fontMetricsInt.ascent;
                    this.k = z4 ? Math.max(i13, i12) : Math.min(i13, i12);
                    int i14 = fontMetricsInt.descent;
                    int i15 = this.m;
                    this.n = z3 ? Math.min(i14, i15) : Math.max(i14, i15);
                    this.o = 0;
                    this.p = 0;
                }
            } else {
                int i16 = fontMetricsInt.ascent;
                this.l = i16;
                int i17 = fontMetricsInt.descent;
                this.m = i17;
                this.k = i16;
                this.n = i17;
                this.o = 0;
                this.p = 0;
            }
        }
        fontMetricsInt.ascent = z ? this.k : this.l;
        fontMetricsInt.descent = z2 ? this.n : this.m;
    }
}
