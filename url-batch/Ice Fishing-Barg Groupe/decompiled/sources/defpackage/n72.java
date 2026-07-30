package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class n72 {
    public int PxuCJdSBwIXG;
    public int[] TSizfFm2Yiuu;
    public int[] Y1f8riQaR6yg;
    public int e9gEMXR7LXtO;
    public long[] lS5Rgt96tfkO;

    public final int PxuCJdSBwIXG(long j) {
        int i = this.PxuCJdSBwIXG + 1;
        long[] jArr = this.lS5Rgt96tfkO;
        int length = jArr.length;
        if (i > length) {
            int i2 = length * 2;
            long[] jArr2 = new long[i2];
            int[] iArr = new int[i2];
            na.JTxCbbCwomzt(jArr, jArr2, 0, 0, jArr.length);
            na.rxipThha848g(this.TSizfFm2Yiuu, iArr, 0, 0, 14);
            this.lS5Rgt96tfkO = jArr2;
            this.TSizfFm2Yiuu = iArr;
        }
        int i3 = this.PxuCJdSBwIXG;
        this.PxuCJdSBwIXG = i3 + 1;
        int length2 = this.Y1f8riQaR6yg.length;
        if (this.e9gEMXR7LXtO >= length2) {
            int i4 = length2 * 2;
            int[] iArr2 = new int[i4];
            int i5 = 0;
            while (i5 < i4) {
                int i6 = i5 + 1;
                iArr2[i5] = i6;
                i5 = i6;
            }
            na.rxipThha848g(this.Y1f8riQaR6yg, iArr2, 0, 0, 14);
            this.Y1f8riQaR6yg = iArr2;
        }
        int i7 = this.e9gEMXR7LXtO;
        int[] iArr3 = this.Y1f8riQaR6yg;
        this.e9gEMXR7LXtO = iArr3[i7];
        long[] jArr3 = this.lS5Rgt96tfkO;
        jArr3[i3] = j;
        this.TSizfFm2Yiuu[i3] = i7;
        iArr3[i7] = i3;
        while (i3 > 0) {
            int i8 = ((i3 + 1) >> 1) - 1;
            if (cs0.BRwzKIf41E4i(jArr3[i8], j) <= 0) {
                break;
            }
            lS5Rgt96tfkO(i8, i3);
            i3 = i8;
        }
        return i7;
    }

    public final void lS5Rgt96tfkO(int i, int i2) {
        long[] jArr = this.lS5Rgt96tfkO;
        int[] iArr = this.TSizfFm2Yiuu;
        int[] iArr2 = this.Y1f8riQaR6yg;
        long j = jArr[i];
        jArr[i] = jArr[i2];
        jArr[i2] = j;
        int i3 = iArr[i];
        int i4 = iArr[i2];
        iArr[i] = i4;
        iArr[i2] = i3;
        iArr2[i4] = i;
        iArr2[i3] = i2;
    }
}
