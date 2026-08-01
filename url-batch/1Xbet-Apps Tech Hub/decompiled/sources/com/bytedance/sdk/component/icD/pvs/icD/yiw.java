package com.bytedance.sdk.component.icD.pvs.icD;

import java.util.Arrays;

/* compiled from: SegmentedByteString.java */
/* loaded from: classes.dex */
final class yiw extends Jd {
    final transient int[] so;
    final transient byte[][] yiw;

    yiw(pvs pvsVar, int i) {
        super(null);
        Mxy.pvs(pvsVar.icD, 0L, i);
        NB nb = pvsVar.pvs;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            if (nb.vG == nb.icD) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += nb.vG - nb.icD;
            i4++;
            nb = nb.sUS;
        }
        this.yiw = new byte[i4][];
        this.so = new int[i4 * 2];
        NB nb2 = pvsVar.pvs;
        int i5 = 0;
        while (i2 < i) {
            this.yiw[i5] = nb2.pvs;
            i2 += nb2.vG - nb2.icD;
            if (i2 > i) {
                i2 = i;
            }
            int[] iArr = this.so;
            iArr[i5] = i2;
            iArr[this.yiw.length + i5] = nb2.icD;
            nb2.Jd = true;
            i5++;
            nb2 = nb2.sUS;
        }
    }

    @Override // com.bytedance.sdk.component.icD.pvs.icD.Jd
    public String pvs() {
        return NB().pvs();
    }

    @Override // com.bytedance.sdk.component.icD.pvs.icD.Jd
    public String icD() {
        return NB().icD();
    }

    @Override // com.bytedance.sdk.component.icD.pvs.icD.Jd
    public Jd pvs(int i, int i2) {
        return NB().pvs(i, i2);
    }

    @Override // com.bytedance.sdk.component.icD.pvs.icD.Jd
    public byte pvs(int i) {
        Mxy.pvs(this.so[this.yiw.length - 1], i, 1L);
        int icD = icD(i);
        int i2 = icD == 0 ? 0 : this.so[icD - 1];
        int[] iArr = this.so;
        byte[][] bArr = this.yiw;
        return bArr[icD][(i - i2) + iArr[bArr.length + icD]];
    }

    private int icD(int i) {
        int binarySearch = Arrays.binarySearch(this.so, 0, this.yiw.length, i + 1);
        return binarySearch >= 0 ? binarySearch : ~binarySearch;
    }

    @Override // com.bytedance.sdk.component.icD.pvs.icD.Jd
    public int vG() {
        return this.so[this.yiw.length - 1];
    }

    @Override // com.bytedance.sdk.component.icD.pvs.icD.Jd
    public byte[] Jd() {
        int[] iArr = this.so;
        byte[][] bArr = this.yiw;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr2 = this.so;
            int i3 = iArr2[length + i];
            int i4 = iArr2[i];
            System.arraycopy(this.yiw[i], i3, bArr2, i2, i4 - i2);
            i++;
            i2 = i4;
        }
        return bArr2;
    }

    @Override // com.bytedance.sdk.component.icD.pvs.icD.Jd
    public boolean pvs(int i, Jd jd, int i2, int i3) {
        if (i < 0 || i > vG() - i3) {
            return false;
        }
        int icD = icD(i);
        while (i3 > 0) {
            int i4 = icD == 0 ? 0 : this.so[icD - 1];
            int min = Math.min(i3, ((this.so[icD] - i4) + i4) - i);
            int[] iArr = this.so;
            byte[][] bArr = this.yiw;
            if (!jd.pvs(i2, bArr[icD], (i - i4) + iArr[bArr.length + icD], min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            icD++;
        }
        return true;
    }

    @Override // com.bytedance.sdk.component.icD.pvs.icD.Jd
    public boolean pvs(int i, byte[] bArr, int i2, int i3) {
        if (i < 0 || i > vG() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int icD = icD(i);
        while (i3 > 0) {
            int i4 = icD == 0 ? 0 : this.so[icD - 1];
            int min = Math.min(i3, ((this.so[icD] - i4) + i4) - i);
            int[] iArr = this.so;
            byte[][] bArr2 = this.yiw;
            if (!Mxy.pvs(bArr2[icD], (i - i4) + iArr[bArr2.length + icD], bArr, i2, min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            icD++;
        }
        return true;
    }

    private Jd NB() {
        return new Jd(Jd());
    }

    @Override // com.bytedance.sdk.component.icD.pvs.icD.Jd
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Jd) {
            Jd jd = (Jd) obj;
            if (jd.vG() == vG() && pvs(0, jd, 0, vG())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.sdk.component.icD.pvs.icD.Jd
    public int hashCode() {
        int i = this.NB;
        if (i != 0) {
            return i;
        }
        int length = this.yiw.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            byte[] bArr = this.yiw[i2];
            int[] iArr = this.so;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.NB = i3;
        return i3;
    }

    @Override // com.bytedance.sdk.component.icD.pvs.icD.Jd
    public String toString() {
        return NB().toString();
    }
}
