package defpackage;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class vd1 implements LineHeightSpan {
    public final float m;
    public final int n;
    public final boolean o;
    public final boolean p;
    public final float q;
    public final boolean r;
    public int s = Integer.MIN_VALUE;
    public int t = Integer.MIN_VALUE;
    public int u = Integer.MIN_VALUE;
    public int v = Integer.MIN_VALUE;
    public int w;
    public int x;

    public vd1(float f, int i, boolean z, boolean z2, float f2, boolean z3) {
        this.m = f;
        this.n = i;
        this.o = z;
        this.p = z2;
        this.q = f2;
        this.r = z3;
        if ((0.0f > f2 || f2 > 1.0f) && f2 != -1.0f) {
            i21.b("topRatio should be in [0..1] range or -1");
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
        boolean z2 = i2 == this.n;
        boolean z3 = this.p;
        boolean z4 = this.o;
        if (z && z2 && z4 && z3) {
            return;
        }
        if (this.s == Integer.MIN_VALUE) {
            int i7 = i5 - i6;
            int ceil = (int) Math.ceil(this.m);
            int i8 = ceil - i7;
            if (!this.r || i8 > 0) {
                float f = this.q;
                if (f == -1.0f) {
                    f = Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent);
                }
                int ceil2 = (int) (i8 <= 0 ? Math.ceil(i8 * f) : Math.ceil((1.0f - f) * i8));
                int i9 = fontMetricsInt.descent;
                int i10 = ceil2 + i9;
                this.u = i10;
                int i11 = i10 - ceil;
                this.t = i11;
                if (z4) {
                    i11 = fontMetricsInt.ascent;
                }
                this.s = i11;
                if (z3) {
                    i10 = i9;
                }
                this.v = i10;
                this.w = fontMetricsInt.ascent - i11;
                this.x = i10 - i9;
            } else {
                int i12 = fontMetricsInt.ascent;
                this.t = i12;
                int i13 = fontMetricsInt.descent;
                this.u = i13;
                this.s = i12;
                this.v = i13;
                this.w = 0;
                this.x = 0;
            }
        }
        fontMetricsInt.ascent = z ? this.s : this.t;
        fontMetricsInt.descent = z2 ? this.v : this.u;
    }
}
