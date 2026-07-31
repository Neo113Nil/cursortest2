package com.bytedance.sdk.component.fs.zmn.fs;

import java.util.Arrays;

/* loaded from: classes6.dex */
final class nps extends fb {
    final transient byte[][] nps;
    final transient int[] zg;

    nps(zmn zmnVar, int i) {
        super(null);
        bvs.zmn(zmnVar.fs, 0L, i);
        btk btkVar = zmnVar.zmn;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            int i5 = btkVar.zn;
            int i6 = btkVar.fs;
            if (i5 != i6) {
                i3 += i5 - i6;
                i4++;
                btkVar = btkVar.hhw;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        this.nps = new byte[i4][];
        this.zg = new int[i4 * 2];
        btk btkVar2 = zmnVar.zmn;
        int i7 = 0;
        while (i2 < i) {
            byte[][] bArr = this.nps;
            bArr[i7] = btkVar2.zmn;
            int i8 = btkVar2.zn;
            int i9 = btkVar2.fs;
            i2 += i8 - i9;
            if (i2 > i) {
                i2 = i;
            }
            int[] iArr = this.zg;
            iArr[i7] = i2;
            iArr[bArr.length + i7] = i9;
            btkVar2.fb = true;
            i7++;
            btkVar2 = btkVar2.hhw;
        }
    }

    @Override // com.bytedance.sdk.component.fs.zmn.fs.fb
    public String zmn() {
        return btk().zmn();
    }

    @Override // com.bytedance.sdk.component.fs.zmn.fs.fb
    public String fs() {
        return btk().fs();
    }

    @Override // com.bytedance.sdk.component.fs.zmn.fs.fb
    public fb zmn(int i, int i2) {
        return btk().zmn(i, i2);
    }

    @Override // com.bytedance.sdk.component.fs.zmn.fs.fb
    public byte zmn(int i) {
        bvs.zmn(this.zg[this.nps.length - 1], i, 1L);
        int fs = fs(i);
        int i2 = fs == 0 ? 0 : this.zg[fs - 1];
        int[] iArr = this.zg;
        byte[][] bArr = this.nps;
        return bArr[fs][(i - i2) + iArr[bArr.length + fs]];
    }

    private int fs(int i) {
        int binarySearch = Arrays.binarySearch(this.zg, 0, this.nps.length, i + 1);
        return binarySearch >= 0 ? binarySearch : ~binarySearch;
    }

    @Override // com.bytedance.sdk.component.fs.zmn.fs.fb
    public int zn() {
        return this.zg[this.nps.length - 1];
    }

    @Override // com.bytedance.sdk.component.fs.zmn.fs.fb
    public byte[] fb() {
        int[] iArr = this.zg;
        byte[][] bArr = this.nps;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr2 = this.zg;
            int i3 = iArr2[length + i];
            int i4 = iArr2[i];
            System.arraycopy(this.nps[i], i3, bArr2, i2, i4 - i2);
            i++;
            i2 = i4;
        }
        return bArr2;
    }

    @Override // com.bytedance.sdk.component.fs.zmn.fs.fb
    public boolean zmn(int i, fb fbVar, int i2, int i3) {
        if (i < 0 || i > zn() - i3) {
            return false;
        }
        int fs = fs(i);
        while (i3 > 0) {
            int i4 = fs == 0 ? 0 : this.zg[fs - 1];
            int min = Math.min(i3, ((this.zg[fs] - i4) + i4) - i);
            int[] iArr = this.zg;
            byte[][] bArr = this.nps;
            if (!fbVar.zmn(i2, bArr[fs], (i - i4) + iArr[bArr.length + fs], min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            fs++;
        }
        return true;
    }

    @Override // com.bytedance.sdk.component.fs.zmn.fs.fb
    public boolean zmn(int i, byte[] bArr, int i2, int i3) {
        if (i < 0 || i > zn() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int fs = fs(i);
        while (i3 > 0) {
            int i4 = fs == 0 ? 0 : this.zg[fs - 1];
            int min = Math.min(i3, ((this.zg[fs] - i4) + i4) - i);
            int[] iArr = this.zg;
            byte[][] bArr2 = this.nps;
            if (!bvs.zmn(bArr2[fs], (i - i4) + iArr[bArr2.length + fs], bArr, i2, min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            fs++;
        }
        return true;
    }

    private fb btk() {
        return new fb(fb());
    }

    @Override // com.bytedance.sdk.component.fs.zmn.fs.fb
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fb) {
            fb fbVar = (fb) obj;
            if (fbVar.zn() == zn() && zmn(0, fbVar, 0, zn())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.sdk.component.fs.zmn.fs.fb
    public int hashCode() {
        int i = this.btk;
        if (i != 0) {
            return i;
        }
        int length = this.nps.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            byte[] bArr = this.nps[i2];
            int[] iArr = this.zg;
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
        this.btk = i3;
        return i3;
    }

    @Override // com.bytedance.sdk.component.fs.zmn.fs.fb
    public String toString() {
        return btk().toString();
    }
}
