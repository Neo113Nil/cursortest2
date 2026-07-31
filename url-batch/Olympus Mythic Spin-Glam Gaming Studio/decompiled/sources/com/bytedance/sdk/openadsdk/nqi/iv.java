package com.bytedance.sdk.openadsdk.nqi;

/* loaded from: classes5.dex */
final class iv {
    private final int[] fs;
    private final bvs zmn;

    iv(bvs bvsVar, int[] iArr) {
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        this.zmn = bvsVar;
        int length = iArr.length;
        int i = 1;
        if (length > 1 && iArr[0] == 0) {
            while (i < length && iArr[i] == 0) {
                i++;
            }
            if (i == length) {
                this.fs = new int[]{0};
                return;
            }
            int[] iArr2 = new int[length - i];
            this.fs = iArr2;
            System.arraycopy(iArr, i, iArr2, 0, iArr2.length);
            return;
        }
        this.fs = iArr;
    }

    int[] zmn() {
        return this.fs;
    }

    int fs() {
        return this.fs.length - 1;
    }

    boolean zn() {
        return this.fs[0] == 0;
    }

    int zmn(int i) {
        return this.fs[(r0.length - 1) - i];
    }

    iv zmn(iv ivVar) {
        if (!this.zmn.equals(ivVar.zmn)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (zn()) {
            return ivVar;
        }
        if (ivVar.zn()) {
            return this;
        }
        int[] iArr = this.fs;
        int[] iArr2 = ivVar.fs;
        if (iArr.length <= iArr2.length) {
            iArr = iArr2;
            iArr2 = iArr;
        }
        int[] iArr3 = new int[iArr.length];
        int length = iArr.length - iArr2.length;
        System.arraycopy(iArr, 0, iArr3, 0, length);
        for (int i = length; i < iArr.length; i++) {
            iArr3[i] = bvs.fs(iArr2[i - length], iArr[i]);
        }
        return new iv(this.zmn, iArr3);
    }

    iv fs(iv ivVar) {
        if (!this.zmn.equals(ivVar.zmn)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (zn() || ivVar.zn()) {
            return this.zmn.zmn();
        }
        int[] iArr = this.fs;
        int length = iArr.length;
        int[] iArr2 = ivVar.fs;
        int length2 = iArr2.length;
        int[] iArr3 = new int[(length + length2) - 1];
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            for (int i3 = 0; i3 < length2; i3++) {
                int i4 = i + i3;
                iArr3[i4] = bvs.fs(iArr3[i4], this.zmn.zn(i2, iArr2[i3]));
            }
        }
        return new iv(this.zmn, iArr3);
    }

    iv zmn(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        if (i2 == 0) {
            return this.zmn.zmn();
        }
        int length = this.fs.length;
        int[] iArr = new int[i + length];
        for (int i3 = 0; i3 < length; i3++) {
            iArr[i3] = this.zmn.zn(this.fs[i3], i2);
        }
        return new iv(this.zmn, iArr);
    }

    iv[] zn(iv ivVar) {
        if (!this.zmn.equals(ivVar.zmn)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (ivVar.zn()) {
            throw new IllegalArgumentException("Divide by 0");
        }
        iv zmn = this.zmn.zmn();
        int fs = this.zmn.fs(ivVar.zmn(ivVar.fs()));
        iv ivVar2 = this;
        while (ivVar2.fs() >= ivVar.fs() && !ivVar2.zn()) {
            int fs2 = ivVar2.fs() - ivVar.fs();
            int zn = this.zmn.zn(ivVar2.zmn(ivVar2.fs()), fs);
            iv zmn2 = ivVar.zmn(fs2, zn);
            zmn = zmn.zmn(this.zmn.zmn(fs2, zn));
            ivVar2 = ivVar2.zmn(zmn2);
        }
        return new iv[]{zmn, ivVar2};
    }
}
