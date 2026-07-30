package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class jr0 {
    public int[] PxuCJdSBwIXG;
    public int lS5Rgt96tfkO;

    public jr0() {
        this.PxuCJdSBwIXG = new int[10];
    }

    public int PxuCJdSBwIXG(int i) {
        int i2 = this.lS5Rgt96tfkO - 1;
        return i2 >= 0 ? this.PxuCJdSBwIXG[i2] : i;
    }

    public void RAsUl2FVSrh6(int i, int i2) {
        int[] iArr = this.PxuCJdSBwIXG;
        int i3 = iArr[i];
        iArr[i] = iArr[i2];
        iArr[i2] = i3;
        int i4 = i + 1;
        int i5 = i2 + 1;
        int i6 = iArr[i4];
        iArr[i4] = iArr[i5];
        iArr[i5] = i6;
        int i7 = i + 2;
        int i8 = i2 + 2;
        int i9 = iArr[i7];
        iArr[i7] = iArr[i8];
        iArr[i8] = i9;
    }

    public void TSizfFm2Yiuu(int i) {
        int[] iArr = this.PxuCJdSBwIXG;
        if (this.lS5Rgt96tfkO >= iArr.length) {
            iArr = Arrays.copyOf(iArr, iArr.length * 2);
            this.PxuCJdSBwIXG = iArr;
        }
        int i2 = this.lS5Rgt96tfkO;
        this.lS5Rgt96tfkO = i2 + 1;
        iArr[i2] = i;
    }

    public void Y1f8riQaR6yg(int i, int i2, int i3) {
        int i4 = this.lS5Rgt96tfkO;
        int[] iArr = this.PxuCJdSBwIXG;
        int i5 = i4 + 3;
        if (i5 >= iArr.length) {
            iArr = Arrays.copyOf(iArr, iArr.length * 2);
            this.PxuCJdSBwIXG = iArr;
        }
        iArr[i4] = i + i3;
        iArr[i4 + 1] = i2 + i3;
        iArr[i4 + 2] = i3;
        this.lS5Rgt96tfkO = i5;
    }

    public void a92UlCVFR9N8(int i, int i2) {
        if (i < i2) {
            int i3 = i - 3;
            for (int i4 = i; i4 < i2; i4 += 3) {
                int[] iArr = this.PxuCJdSBwIXG;
                int i5 = iArr[i4];
                int i6 = iArr[i2];
                if (i5 < i6 || (i5 == i6 && iArr[i4 + 1] <= iArr[i2 + 1])) {
                    i3 += 3;
                    RAsUl2FVSrh6(i3, i4);
                }
            }
            RAsUl2FVSrh6(i3 + 3, i2);
            a92UlCVFR9N8(i, i3);
            a92UlCVFR9N8(i3 + 6, i2);
        }
    }

    public void e9gEMXR7LXtO(int i, int i2, int i3, int i4) {
        int i5 = this.lS5Rgt96tfkO;
        int[] iArr = this.PxuCJdSBwIXG;
        int i6 = i5 + 4;
        if (i6 >= iArr.length) {
            iArr = Arrays.copyOf(iArr, iArr.length * 2);
            this.PxuCJdSBwIXG = iArr;
        }
        iArr[i5] = i;
        iArr[i5 + 1] = i2;
        iArr[i5 + 2] = i3;
        iArr[i5 + 3] = i4;
        this.lS5Rgt96tfkO = i6;
    }

    public int lS5Rgt96tfkO() {
        int[] iArr = this.PxuCJdSBwIXG;
        int i = this.lS5Rgt96tfkO - 1;
        this.lS5Rgt96tfkO = i;
        return iArr[i];
    }

    public jr0(int i) {
        this.PxuCJdSBwIXG = new int[i];
    }
}
