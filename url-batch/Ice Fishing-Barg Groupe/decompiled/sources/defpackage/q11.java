package defpackage;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class q11 implements LineHeightSpan {
    public final int OPXfSBeufaJ8;
    public int RfyTYNmI9Srp;
    public int XL4ISE6Oc65B;
    public final int cpQdD2nAriOS;
    public final boolean dgRBjINgWbAK;
    public final float rtx2ld2ELZv4;
    public final boolean wdg6QnbFHrFF;
    public final float x50lh2ztY7Y5;
    public int r3s1LDPKFs1S = Integer.MIN_VALUE;
    public int QrzZRwfaDlRX = Integer.MIN_VALUE;
    public int gPXPFXrUH4XX = Integer.MIN_VALUE;
    public int BRwzKIf41E4i = Integer.MIN_VALUE;

    public q11(float f, int i, boolean z, boolean z2, float f2, int i2) {
        this.rtx2ld2ELZv4 = f;
        this.OPXfSBeufaJ8 = i;
        this.wdg6QnbFHrFF = z;
        this.dgRBjINgWbAK = z2;
        this.x50lh2ztY7Y5 = f2;
        this.cpQdD2nAriOS = i2;
        if ((0.0f > f2 || f2 > 1.0f) && f2 != -1.0f) {
            fp0.lS5Rgt96tfkO("topRatio should be in [0..1] range or -1");
        }
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt.descent - fontMetricsInt.ascent <= 0) {
            return;
        }
        boolean z = i == 0;
        boolean z2 = i2 == this.OPXfSBeufaJ8;
        int i5 = this.cpQdD2nAriOS;
        boolean z3 = this.dgRBjINgWbAK;
        boolean z4 = this.wdg6QnbFHrFF;
        if (z && z2 && z4 && z3) {
            m11.Companion.getClass();
            if (i5 != 2) {
                return;
            }
        }
        if (this.r3s1LDPKFs1S == Integer.MIN_VALUE) {
            int ceil = (int) Math.ceil(this.rtx2ld2ELZv4);
            int i6 = ceil - (fontMetricsInt.descent - fontMetricsInt.ascent);
            m11.Companion.getClass();
            if (i5 != 1 || i6 > 0) {
                float f = this.x50lh2ztY7Y5;
                if (f == -1.0f) {
                    f = Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent);
                }
                int ceil2 = (int) (i6 <= 0 ? Math.ceil(i6 * f) : Math.ceil((1.0f - f) * i6));
                int i7 = fontMetricsInt.descent;
                int i8 = ceil2 + i7;
                this.gPXPFXrUH4XX = i8;
                int i9 = i8 - ceil;
                this.QrzZRwfaDlRX = i9;
                if (i5 == 0 || i6 >= 0) {
                    if (z4) {
                        i9 = fontMetricsInt.ascent;
                    }
                    this.r3s1LDPKFs1S = i9;
                    if (z3) {
                        i8 = i7;
                    }
                    this.BRwzKIf41E4i = i8;
                    this.XL4ISE6Oc65B = fontMetricsInt.ascent - i9;
                    this.RfyTYNmI9Srp = i8 - i7;
                } else if (i5 == 2) {
                    int i10 = fontMetricsInt.ascent;
                    this.r3s1LDPKFs1S = z4 ? Math.max(i10, i9) : Math.min(i10, i9);
                    int i11 = fontMetricsInt.descent;
                    int i12 = this.gPXPFXrUH4XX;
                    this.BRwzKIf41E4i = z3 ? Math.min(i11, i12) : Math.max(i11, i12);
                    this.XL4ISE6Oc65B = 0;
                    this.RfyTYNmI9Srp = 0;
                }
            } else {
                int i13 = fontMetricsInt.ascent;
                this.QrzZRwfaDlRX = i13;
                int i14 = fontMetricsInt.descent;
                this.gPXPFXrUH4XX = i14;
                this.r3s1LDPKFs1S = i13;
                this.BRwzKIf41E4i = i14;
                this.XL4ISE6Oc65B = 0;
                this.RfyTYNmI9Srp = 0;
            }
        }
        fontMetricsInt.ascent = z ? this.r3s1LDPKFs1S : this.QrzZRwfaDlRX;
        fontMetricsInt.descent = z2 ? this.BRwzKIf41E4i : this.gPXPFXrUH4XX;
    }
}
