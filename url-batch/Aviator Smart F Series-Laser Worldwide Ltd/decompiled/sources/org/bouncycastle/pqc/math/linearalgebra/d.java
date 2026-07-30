package org.bouncycastle.pqc.math.linearalgebra;

import java.security.SecureRandom;

/* loaded from: classes5.dex */
public class d extends q {

    /* renamed from: v, reason: collision with root package name */
    private int[] f17213v;

    public d(int i8) {
        if (i8 < 0) {
            throw new ArithmeticException("Negative length.");
        }
        this.length = i8;
        this.f17213v = new int[(i8 + 31) >> 5];
    }

    public static d OS2VP(int i8, byte[] bArr) {
        if (i8 < 0) {
            throw new ArithmeticException("negative length");
        }
        if (bArr.length <= ((i8 + 7) >> 3)) {
            return new d(i8, j.toIntArray(bArr));
        }
        throw new ArithmeticException("length mismatch");
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.q
    public q add(q qVar) {
        if (!(qVar instanceof d)) {
            throw new ArithmeticException("vector is not defined over GF(2)");
        }
        d dVar = (d) qVar;
        if (this.length != dVar.length) {
            throw new ArithmeticException("length mismatch");
        }
        int[] clone = h.clone(dVar.f17213v);
        for (int length = clone.length - 1; length >= 0; length--) {
            clone[length] = clone[length] ^ this.f17213v[length];
        }
        return new d(this.length, clone);
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.q
    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.length == dVar.length && h.equals(this.f17213v, dVar.f17213v);
    }

    public d extractLeftVector(int i8) {
        int i9 = this.length;
        if (i8 > i9) {
            throw new ArithmeticException("invalid length");
        }
        if (i8 == i9) {
            return new d(this);
        }
        d dVar = new d(i8);
        int i10 = i8 >> 5;
        int i11 = i8 & 31;
        System.arraycopy(this.f17213v, 0, dVar.f17213v, 0, i10);
        if (i11 != 0) {
            dVar.f17213v[i10] = ((1 << i11) - 1) & this.f17213v[i10];
        }
        return dVar;
    }

    public d extractRightVector(int i8) {
        int i9;
        int i10 = this.length;
        if (i8 > i10) {
            throw new ArithmeticException("invalid length");
        }
        if (i8 == i10) {
            return new d(this);
        }
        d dVar = new d(i8);
        int i11 = this.length;
        int i12 = (i11 - i8) >> 5;
        int i13 = (i11 - i8) & 31;
        int i14 = (i8 + 31) >> 5;
        int i15 = 0;
        if (i13 != 0) {
            while (true) {
                i9 = i14 - 1;
                if (i15 >= i9) {
                    break;
                }
                int[] iArr = dVar.f17213v;
                int[] iArr2 = this.f17213v;
                int i16 = i12 + 1;
                iArr[i15] = (iArr2[i12] >>> i13) | (iArr2[i16] << (32 - i13));
                i15++;
                i12 = i16;
            }
            int[] iArr3 = dVar.f17213v;
            int[] iArr4 = this.f17213v;
            int i17 = i12 + 1;
            int i18 = iArr4[i12] >>> i13;
            iArr3[i9] = i18;
            if (i17 < iArr4.length) {
                iArr3[i9] = (iArr4[i17] << (32 - i13)) | i18;
            }
        } else {
            System.arraycopy(this.f17213v, i12, dVar.f17213v, 0, i14);
        }
        return dVar;
    }

    public d extractVector(int[] iArr) {
        int length = iArr.length;
        if (iArr[length - 1] > this.length) {
            throw new ArithmeticException("invalid index set");
        }
        d dVar = new d(length);
        for (int i8 = 0; i8 < length; i8++) {
            int[] iArr2 = this.f17213v;
            int i9 = iArr[i8];
            if ((iArr2[i9 >> 5] & (1 << (i9 & 31))) != 0) {
                int[] iArr3 = dVar.f17213v;
                int i10 = i8 >> 5;
                iArr3[i10] = (1 << (i8 & 31)) | iArr3[i10];
            }
        }
        return dVar;
    }

    public int getBit(int i8) {
        if (i8 >= this.length) {
            throw new IndexOutOfBoundsException();
        }
        int i9 = i8 >> 5;
        int i10 = i8 & 31;
        return (this.f17213v[i9] & (1 << i10)) >>> i10;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.q
    public byte[] getEncoded() {
        return j.toByteArray(this.f17213v, (this.length + 7) >> 3);
    }

    public int getHammingWeight() {
        int i8 = 0;
        int i9 = 0;
        while (true) {
            int[] iArr = this.f17213v;
            if (i8 >= iArr.length) {
                return i9;
            }
            int i10 = iArr[i8];
            for (int i11 = 0; i11 < 32; i11++) {
                if ((i10 & 1) != 0) {
                    i9++;
                }
                i10 >>>= 1;
            }
            i8++;
        }
    }

    public int[] getVecArray() {
        return this.f17213v;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.q
    public int hashCode() {
        return (this.length * 31) + org.bouncycastle.util.a.hashCode(this.f17213v);
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.q
    public boolean isZero() {
        for (int length = this.f17213v.length - 1; length >= 0; length--) {
            if (this.f17213v[length] != 0) {
                return false;
            }
        }
        return true;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.q
    public q multiply(l lVar) {
        int[] vector = lVar.getVector();
        int i8 = this.length;
        if (i8 != vector.length) {
            throw new ArithmeticException("length mismatch");
        }
        d dVar = new d(i8);
        for (int i9 = 0; i9 < vector.length; i9++) {
            int[] iArr = this.f17213v;
            int i10 = vector[i9];
            if ((iArr[i10 >> 5] & (1 << (i10 & 31))) != 0) {
                int[] iArr2 = dVar.f17213v;
                int i11 = i9 >> 5;
                iArr2[i11] = (1 << (i9 & 31)) | iArr2[i11];
            }
        }
        return dVar;
    }

    public void setBit(int i8) {
        if (i8 >= this.length) {
            throw new IndexOutOfBoundsException();
        }
        int[] iArr = this.f17213v;
        int i9 = i8 >> 5;
        iArr[i9] = (1 << (i8 & 31)) | iArr[i9];
    }

    public f toExtensionFieldVector(e eVar) {
        int degree = eVar.getDegree();
        int i8 = this.length;
        if (i8 % degree != 0) {
            throw new ArithmeticException("conversion is impossible");
        }
        int i9 = i8 / degree;
        int[] iArr = new int[i9];
        int i10 = 0;
        for (int i11 = i9 - 1; i11 >= 0; i11--) {
            for (int degree2 = eVar.getDegree() - 1; degree2 >= 0; degree2--) {
                if (((this.f17213v[i10 >>> 5] >>> (i10 & 31)) & 1) == 1) {
                    iArr[i11] = iArr[i11] ^ (1 << degree2);
                }
                i10++;
            }
        }
        return new f(eVar, iArr);
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.q
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i8 = 0; i8 < this.length; i8++) {
            if (i8 != 0 && (i8 & 31) == 0) {
                stringBuffer.append(' ');
            }
            stringBuffer.append((this.f17213v[i8 >> 5] & (1 << (i8 & 31))) == 0 ? '0' : '1');
        }
        return stringBuffer.toString();
    }

    public d(int i8, int i9, SecureRandom secureRandom) {
        if (i9 > i8) {
            throw new ArithmeticException("The hamming weight is greater than the length of vector.");
        }
        this.length = i8;
        this.f17213v = new int[(i8 + 31) >> 5];
        int[] iArr = new int[i8];
        for (int i10 = 0; i10 < i8; i10++) {
            iArr[i10] = i10;
        }
        for (int i11 = 0; i11 < i9; i11++) {
            int nextInt = p.nextInt(secureRandom, i8);
            setBit(iArr[nextInt]);
            i8--;
            iArr[nextInt] = iArr[i8];
        }
    }

    public d(int i8, SecureRandom secureRandom) {
        this.length = i8;
        int i9 = (i8 + 31) >> 5;
        this.f17213v = new int[i9];
        int i10 = i9 - 1;
        for (int i11 = i10; i11 >= 0; i11--) {
            this.f17213v[i11] = secureRandom.nextInt();
        }
        int i12 = i8 & 31;
        if (i12 != 0) {
            int[] iArr = this.f17213v;
            iArr[i10] = ((1 << i12) - 1) & iArr[i10];
        }
    }

    public d(int i8, int[] iArr) {
        if (i8 < 0) {
            throw new ArithmeticException("negative length");
        }
        this.length = i8;
        int i9 = (i8 + 31) >> 5;
        if (iArr.length != i9) {
            throw new ArithmeticException("length mismatch");
        }
        int[] clone = h.clone(iArr);
        this.f17213v = clone;
        int i10 = i8 & 31;
        if (i10 != 0) {
            int i11 = i9 - 1;
            clone[i11] = ((1 << i10) - 1) & clone[i11];
        }
    }

    public d(d dVar) {
        this.length = dVar.length;
        this.f17213v = h.clone(dVar.f17213v);
    }

    protected d(int[] iArr, int i8) {
        this.f17213v = iArr;
        this.length = i8;
    }
}
