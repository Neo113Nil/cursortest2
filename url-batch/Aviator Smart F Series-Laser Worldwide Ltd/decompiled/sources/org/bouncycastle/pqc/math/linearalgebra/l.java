package org.bouncycastle.pqc.math.linearalgebra;

import java.security.SecureRandom;

/* loaded from: classes5.dex */
public class l {
    private int[] perm;

    public l(int i8) {
        if (i8 <= 0) {
            throw new IllegalArgumentException("invalid length");
        }
        this.perm = new int[i8];
        for (int i9 = i8 - 1; i9 >= 0; i9--) {
            this.perm[i9] = i9;
        }
    }

    private boolean isPermutation(int[] iArr) {
        int length = iArr.length;
        boolean[] zArr = new boolean[length];
        for (int i8 : iArr) {
            if (i8 < 0 || i8 >= length || zArr[i8]) {
                return false;
            }
            zArr[i8] = true;
        }
        return true;
    }

    public l computeInverse() {
        l lVar = new l(this.perm.length);
        for (int length = this.perm.length - 1; length >= 0; length--) {
            lVar.perm[this.perm[length]] = length;
        }
        return lVar;
    }

    public boolean equals(Object obj) {
        if (obj instanceof l) {
            return h.equals(this.perm, ((l) obj).perm);
        }
        return false;
    }

    public byte[] getEncoded() {
        int length = this.perm.length;
        int ceilLog256 = i.ceilLog256(length - 1);
        byte[] bArr = new byte[(length * ceilLog256) + 4];
        j.I2OSP(length, bArr, 0);
        for (int i8 = 0; i8 < length; i8++) {
            j.I2OSP(this.perm[i8], bArr, (i8 * ceilLog256) + 4, ceilLog256);
        }
        return bArr;
    }

    public int[] getVector() {
        return h.clone(this.perm);
    }

    public int hashCode() {
        return org.bouncycastle.util.a.hashCode(this.perm);
    }

    public l rightMultiply(l lVar) {
        int length = lVar.perm.length;
        int[] iArr = this.perm;
        if (length != iArr.length) {
            throw new IllegalArgumentException("length mismatch");
        }
        l lVar2 = new l(iArr.length);
        for (int length2 = this.perm.length - 1; length2 >= 0; length2--) {
            lVar2.perm[length2] = this.perm[lVar.perm[length2]];
        }
        return lVar2;
    }

    public String toString() {
        String str = "[" + this.perm[0];
        for (int i8 = 1; i8 < this.perm.length; i8++) {
            str = str + ", " + this.perm[i8];
        }
        return str + "]";
    }

    public l(int i8, SecureRandom secureRandom) {
        if (i8 <= 0) {
            throw new IllegalArgumentException("invalid length");
        }
        this.perm = new int[i8];
        int[] iArr = new int[i8];
        for (int i9 = 0; i9 < i8; i9++) {
            iArr[i9] = i9;
        }
        int i10 = i8;
        for (int i11 = 0; i11 < i8; i11++) {
            int nextInt = p.nextInt(secureRandom, i10);
            i10--;
            this.perm[i11] = iArr[nextInt];
            iArr[nextInt] = iArr[i10];
        }
    }

    public l(byte[] bArr) {
        if (bArr.length <= 4) {
            throw new IllegalArgumentException("invalid encoding");
        }
        int OS2IP = j.OS2IP(bArr, 0);
        int ceilLog256 = i.ceilLog256(OS2IP - 1);
        if (bArr.length != (OS2IP * ceilLog256) + 4) {
            throw new IllegalArgumentException("invalid encoding");
        }
        this.perm = new int[OS2IP];
        for (int i8 = 0; i8 < OS2IP; i8++) {
            this.perm[i8] = j.OS2IP(bArr, (i8 * ceilLog256) + 4, ceilLog256);
        }
        if (!isPermutation(this.perm)) {
            throw new IllegalArgumentException("invalid encoding");
        }
    }

    public l(int[] iArr) {
        if (!isPermutation(iArr)) {
            throw new IllegalArgumentException("array is not a permutation vector");
        }
        this.perm = h.clone(iArr);
    }
}
