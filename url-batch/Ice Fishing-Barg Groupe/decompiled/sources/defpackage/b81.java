package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class b81 {
    public int[] PxuCJdSBwIXG;
    public int lS5Rgt96tfkO;

    public b81(int i) {
        this.PxuCJdSBwIXG = i == 0 ? gr0.PxuCJdSBwIXG : new int[i];
    }

    public final void PxuCJdSBwIXG(int i) {
        int i2 = this.lS5Rgt96tfkO + 1;
        int[] iArr = this.PxuCJdSBwIXG;
        if (iArr.length < i2) {
            this.PxuCJdSBwIXG = Arrays.copyOf(iArr, Math.max(i2, (iArr.length * 3) / 2));
        }
        int[] iArr2 = this.PxuCJdSBwIXG;
        int i3 = this.lS5Rgt96tfkO;
        iArr2[i3] = i;
        this.lS5Rgt96tfkO = i3 + 1;
    }

    public final int TSizfFm2Yiuu() {
        int i = this.lS5Rgt96tfkO;
        if (i != 0) {
            return this.PxuCJdSBwIXG[i - 1];
        }
        rc1.RAsUl2FVSrh6("IntList is empty.");
        return 0;
    }

    public final void Y1f8riQaR6yg(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.lS5Rgt96tfkO)) {
            throw new IndexOutOfBoundsException("Index must be between 0 and size");
        }
        int[] iArr = this.PxuCJdSBwIXG;
        int i3 = iArr[i];
        if (i != i2 - 1) {
            na.PsecLrZVVK61(iArr, iArr, i, i + 1, i2);
        }
        this.lS5Rgt96tfkO--;
    }

    public final void e9gEMXR7LXtO(int i, int i2) {
        if (i < 0 || i >= this.lS5Rgt96tfkO) {
            throw new IndexOutOfBoundsException("Index must be between 0 and size");
        }
        int[] iArr = this.PxuCJdSBwIXG;
        int i3 = iArr[i];
        iArr[i] = i2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b81) {
            b81 b81Var = (b81) obj;
            int i = b81Var.lS5Rgt96tfkO;
            int i2 = this.lS5Rgt96tfkO;
            if (i == i2) {
                int[] iArr = this.PxuCJdSBwIXG;
                int[] iArr2 = b81Var.PxuCJdSBwIXG;
                br0 nLZGh9p8gVSu = ng0.nLZGh9p8gVSu(0, i2);
                int i3 = nLZGh9p8gVSu.rtx2ld2ELZv4;
                int i4 = nLZGh9p8gVSu.OPXfSBeufaJ8;
                if (i3 > i4) {
                    return true;
                }
                while (iArr[i3] == iArr2[i3]) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        int[] iArr = this.PxuCJdSBwIXG;
        int i = this.lS5Rgt96tfkO;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += Integer.hashCode(iArr[i3]) * 31;
        }
        return i2;
    }

    public final int lS5Rgt96tfkO(int i) {
        if (i < 0 || i >= this.lS5Rgt96tfkO) {
            throw new IndexOutOfBoundsException("Index must be between 0 and size");
        }
        return this.PxuCJdSBwIXG[i];
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        int[] iArr = this.PxuCJdSBwIXG;
        int i = this.lS5Rgt96tfkO;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                sb.append((CharSequence) "]");
                break;
            }
            int i3 = iArr[i2];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append(i3);
            i2++;
        }
        return sb.toString();
    }

    public /* synthetic */ b81() {
        this(16);
    }
}
