package com.google.zxing.common.reedsolomon;

/* loaded from: classes4.dex */
final class GenericGFPoly {
    private final int[] coefficients;
    private final GenericGF field;

    GenericGFPoly(GenericGF genericGF, int[] iArr) {
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        this.field = genericGF;
        int length = iArr.length;
        int i8 = 1;
        if (length <= 1 || iArr[0] != 0) {
            this.coefficients = iArr;
            return;
        }
        while (i8 < length && iArr[i8] == 0) {
            i8++;
        }
        if (i8 == length) {
            this.coefficients = new int[]{0};
            return;
        }
        int[] iArr2 = new int[length - i8];
        this.coefficients = iArr2;
        System.arraycopy(iArr, i8, iArr2, 0, iArr2.length);
    }

    GenericGFPoly addOrSubtract(GenericGFPoly genericGFPoly) {
        if (!this.field.equals(genericGFPoly.field)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (isZero()) {
            return genericGFPoly;
        }
        if (genericGFPoly.isZero()) {
            return this;
        }
        int[] iArr = this.coefficients;
        int[] iArr2 = genericGFPoly.coefficients;
        if (iArr.length <= iArr2.length) {
            iArr = iArr2;
            iArr2 = iArr;
        }
        int[] iArr3 = new int[iArr.length];
        int length = iArr.length - iArr2.length;
        System.arraycopy(iArr, 0, iArr3, 0, length);
        for (int i8 = length; i8 < iArr.length; i8++) {
            iArr3[i8] = GenericGF.addOrSubtract(iArr2[i8 - length], iArr[i8]);
        }
        return new GenericGFPoly(this.field, iArr3);
    }

    GenericGFPoly[] divide(GenericGFPoly genericGFPoly) {
        if (!this.field.equals(genericGFPoly.field)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (genericGFPoly.isZero()) {
            throw new IllegalArgumentException("Divide by 0");
        }
        GenericGFPoly zero = this.field.getZero();
        int inverse = this.field.inverse(genericGFPoly.getCoefficient(genericGFPoly.getDegree()));
        GenericGFPoly genericGFPoly2 = this;
        while (genericGFPoly2.getDegree() >= genericGFPoly.getDegree() && !genericGFPoly2.isZero()) {
            int degree = genericGFPoly2.getDegree() - genericGFPoly.getDegree();
            int multiply = this.field.multiply(genericGFPoly2.getCoefficient(genericGFPoly2.getDegree()), inverse);
            GenericGFPoly multiplyByMonomial = genericGFPoly.multiplyByMonomial(degree, multiply);
            zero = zero.addOrSubtract(this.field.buildMonomial(degree, multiply));
            genericGFPoly2 = genericGFPoly2.addOrSubtract(multiplyByMonomial);
        }
        return new GenericGFPoly[]{zero, genericGFPoly2};
    }

    int evaluateAt(int i8) {
        if (i8 == 0) {
            return getCoefficient(0);
        }
        if (i8 == 1) {
            int i9 = 0;
            for (int i10 : this.coefficients) {
                i9 = GenericGF.addOrSubtract(i9, i10);
            }
            return i9;
        }
        int[] iArr = this.coefficients;
        int i11 = iArr[0];
        int length = iArr.length;
        for (int i12 = 1; i12 < length; i12++) {
            i11 = GenericGF.addOrSubtract(this.field.multiply(i8, i11), this.coefficients[i12]);
        }
        return i11;
    }

    int getCoefficient(int i8) {
        return this.coefficients[(r0.length - 1) - i8];
    }

    int[] getCoefficients() {
        return this.coefficients;
    }

    int getDegree() {
        return this.coefficients.length - 1;
    }

    boolean isZero() {
        return this.coefficients[0] == 0;
    }

    GenericGFPoly multiply(GenericGFPoly genericGFPoly) {
        if (!this.field.equals(genericGFPoly.field)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (isZero() || genericGFPoly.isZero()) {
            return this.field.getZero();
        }
        int[] iArr = this.coefficients;
        int length = iArr.length;
        int[] iArr2 = genericGFPoly.coefficients;
        int length2 = iArr2.length;
        int[] iArr3 = new int[(length + length2) - 1];
        for (int i8 = 0; i8 < length; i8++) {
            int i9 = iArr[i8];
            for (int i10 = 0; i10 < length2; i10++) {
                int i11 = i8 + i10;
                iArr3[i11] = GenericGF.addOrSubtract(iArr3[i11], this.field.multiply(i9, iArr2[i10]));
            }
        }
        return new GenericGFPoly(this.field, iArr3);
    }

    GenericGFPoly multiplyByMonomial(int i8, int i9) {
        if (i8 < 0) {
            throw new IllegalArgumentException();
        }
        if (i9 == 0) {
            return this.field.getZero();
        }
        int length = this.coefficients.length;
        int[] iArr = new int[i8 + length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = this.field.multiply(this.coefficients[i10], i9);
        }
        return new GenericGFPoly(this.field, iArr);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(getDegree() * 8);
        for (int degree = getDegree(); degree >= 0; degree--) {
            int coefficient = getCoefficient(degree);
            if (coefficient != 0) {
                if (coefficient < 0) {
                    sb.append(" - ");
                    coefficient = -coefficient;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (degree == 0 || coefficient != 1) {
                    int log = this.field.log(coefficient);
                    if (log == 0) {
                        sb.append('1');
                    } else if (log == 1) {
                        sb.append('a');
                    } else {
                        sb.append("a^");
                        sb.append(log);
                    }
                }
                if (degree != 0) {
                    if (degree == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(degree);
                    }
                }
            }
        }
        return sb.toString();
    }

    GenericGFPoly multiply(int i8) {
        if (i8 == 0) {
            return this.field.getZero();
        }
        if (i8 == 1) {
            return this;
        }
        int length = this.coefficients.length;
        int[] iArr = new int[length];
        for (int i9 = 0; i9 < length; i9++) {
            iArr[i9] = this.field.multiply(this.coefficients[i9], i8);
        }
        return new GenericGFPoly(this.field, iArr);
    }
}
