package org.bouncycastle.pqc.math.linearalgebra;

/* loaded from: classes5.dex */
public class f extends q {
    private e field;
    private int[] vector;

    public f(e eVar, byte[] bArr) {
        this.field = new e(eVar);
        int i8 = 8;
        int i9 = 1;
        while (eVar.getDegree() > i8) {
            i9++;
            i8 += 8;
        }
        if (bArr.length % i9 != 0) {
            throw new IllegalArgumentException("Byte array is not an encoded vector over the given finite field.");
        }
        int length = bArr.length / i9;
        this.length = length;
        this.vector = new int[length];
        int i10 = 0;
        for (int i11 = 0; i11 < this.vector.length; i11++) {
            int i12 = 0;
            while (i12 < i8) {
                int[] iArr = this.vector;
                iArr[i11] = ((bArr[i10] & 255) << i12) | iArr[i11];
                i12 += 8;
                i10++;
            }
            if (!eVar.isElementOfThisField(this.vector[i11])) {
                throw new IllegalArgumentException("Byte array is not an encoded vector over the given finite field.");
            }
        }
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.q
    public q add(q qVar) {
        throw new RuntimeException("not implemented");
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.q
    public boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.field.equals(fVar.field)) {
            return h.equals(this.vector, fVar.vector);
        }
        return false;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.q
    public byte[] getEncoded() {
        int i8 = 8;
        int i9 = 1;
        while (this.field.getDegree() > i8) {
            i9++;
            i8 += 8;
        }
        byte[] bArr = new byte[this.vector.length * i9];
        int i10 = 0;
        for (int i11 = 0; i11 < this.vector.length; i11++) {
            int i12 = 0;
            while (i12 < i8) {
                bArr[i10] = (byte) (this.vector[i11] >>> i12);
                i12 += 8;
                i10++;
            }
        }
        return bArr;
    }

    public e getField() {
        return this.field;
    }

    public int[] getIntArrayForm() {
        return h.clone(this.vector);
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.q
    public int hashCode() {
        return (this.field.hashCode() * 31) + org.bouncycastle.util.a.hashCode(this.vector);
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.q
    public boolean isZero() {
        for (int length = this.vector.length - 1; length >= 0; length--) {
            if (this.vector[length] != 0) {
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
            throw new ArithmeticException("permutation size and vector size mismatch");
        }
        int[] iArr = new int[i8];
        for (int i9 = 0; i9 < vector.length; i9++) {
            iArr[i9] = this.vector[vector[i9]];
        }
        return new f(this.field, iArr);
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.q
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i8 = 0; i8 < this.vector.length; i8++) {
            for (int i9 = 0; i9 < this.field.getDegree(); i9++) {
                stringBuffer.append(((1 << (i9 & 31)) & this.vector[i8]) != 0 ? '1' : '0');
            }
            stringBuffer.append(' ');
        }
        return stringBuffer.toString();
    }

    public f(e eVar, int[] iArr) {
        this.field = eVar;
        this.length = iArr.length;
        for (int length = iArr.length - 1; length >= 0; length--) {
            if (!eVar.isElementOfThisField(iArr[length])) {
                throw new ArithmeticException("Element array is not specified over the given finite field.");
            }
        }
        this.vector = h.clone(iArr);
    }

    public f(f fVar) {
        this.field = new e(fVar.field);
        this.length = fVar.length;
        this.vector = h.clone(fVar.vector);
    }
}
