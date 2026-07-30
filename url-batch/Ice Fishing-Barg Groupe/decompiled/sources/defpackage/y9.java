package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class y9 implements x9, z9 {
    public final u9 OPXfSBeufaJ8;
    public final float rtx2ld2ELZv4;
    public final float wdg6QnbFHrFF;

    public y9(float f, u9 u9Var) {
        this.rtx2ld2ELZv4 = f;
        this.OPXfSBeufaJ8 = u9Var;
        this.wdg6QnbFHrFF = f;
    }

    @Override // defpackage.x9, defpackage.z9
    public final float PxuCJdSBwIXG() {
        return this.wdg6QnbFHrFF;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y9) {
            y9 y9Var = (y9) obj;
            return k10.lS5Rgt96tfkO(this.rtx2ld2ELZv4, y9Var.rtx2ld2ELZv4) && this.OPXfSBeufaJ8 == y9Var.OPXfSBeufaJ8;
        }
        return false;
    }

    public final int hashCode() {
        return this.OPXfSBeufaJ8.hashCode() + o0.Y1f8riQaR6yg(Float.hashCode(this.rtx2ld2ELZv4) * 31, 31, true);
    }

    @Override // defpackage.x9
    public final void rtx2ld2ELZv4(hy hyVar, int i, int[] iArr, cw0 cw0Var, int[] iArr2) {
        int i2;
        if (iArr.length == 0) {
            return;
        }
        int POWyO8hTM6YC = hyVar.POWyO8hTM6YC(this.rtx2ld2ELZv4);
        boolean z = cw0Var == cw0.OPXfSBeufaJ8;
        if (z) {
            int length = iArr.length;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (i3 < length) {
                int max = Math.max(0, i - iArr[i3]);
                iArr2[i5] = max;
                i4 = Math.min(POWyO8hTM6YC, max);
                i = iArr2[i5] - i4;
                i3++;
                i5++;
            }
            i2 = i + i4;
        } else {
            int length2 = iArr.length;
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            while (i6 < length2) {
                int i10 = iArr[i6];
                int min = Math.min(i7, i - i10);
                iArr2[i9] = min;
                int min2 = Math.min(POWyO8hTM6YC, (i - min) - i10);
                int i11 = iArr2[i9] + i10 + min2;
                i6++;
                i8 = min2;
                i7 = i11;
                i9++;
            }
            i2 = i - (i7 - i8);
        }
        if (i2 > 0) {
            s.Companion.getClass();
            int round = Math.round((1.0f + (cw0Var == cw0.rtx2ld2ELZv4 ? -1.0f : 1.0f)) * (i2 / 2.0f));
            if (z) {
                round -= i2;
            }
            if (round != 0) {
                int length3 = iArr2.length;
                for (int i12 = 0; i12 < length3; i12++) {
                    iArr2[i12] = iArr2[i12] + round;
                }
            }
        }
    }

    public final String toString() {
        return "Arrangement#spacedAligned(" + ((Object) k10.TSizfFm2Yiuu(this.rtx2ld2ELZv4)) + ", " + this.OPXfSBeufaJ8 + ')';
    }

    @Override // defpackage.z9
    public final void wdg6QnbFHrFF(int i, l51 l51Var, int[] iArr, int[] iArr2) {
        rtx2ld2ELZv4(l51Var, i, iArr, cw0.rtx2ld2ELZv4, iArr2);
    }
}
