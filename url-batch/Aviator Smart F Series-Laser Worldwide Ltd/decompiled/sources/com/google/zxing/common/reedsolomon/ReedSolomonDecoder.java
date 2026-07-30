package com.google.zxing.common.reedsolomon;

/* loaded from: classes4.dex */
public final class ReedSolomonDecoder {
    private final GenericGF field;

    public ReedSolomonDecoder(GenericGF genericGF) {
        this.field = genericGF;
    }

    private int[] findErrorLocations(GenericGFPoly genericGFPoly) {
        int degree = genericGFPoly.getDegree();
        if (degree == 1) {
            return new int[]{genericGFPoly.getCoefficient(1)};
        }
        int[] iArr = new int[degree];
        int i8 = 0;
        for (int i9 = 1; i9 < this.field.getSize() && i8 < degree; i9++) {
            if (genericGFPoly.evaluateAt(i9) == 0) {
                iArr[i8] = this.field.inverse(i9);
                i8++;
            }
        }
        if (i8 == degree) {
            return iArr;
        }
        throw new ReedSolomonException("Error locator degree does not match number of roots");
    }

    private int[] findErrorMagnitudes(GenericGFPoly genericGFPoly, int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i8 = 0; i8 < length; i8++) {
            int inverse = this.field.inverse(iArr[i8]);
            int i9 = 1;
            for (int i10 = 0; i10 < length; i10++) {
                if (i8 != i10) {
                    int multiply = this.field.multiply(iArr[i10], inverse);
                    i9 = this.field.multiply(i9, (multiply & 1) == 0 ? multiply | 1 : multiply & (-2));
                }
            }
            iArr2[i8] = this.field.multiply(genericGFPoly.evaluateAt(inverse), this.field.inverse(i9));
            if (this.field.getGeneratorBase() != 0) {
                iArr2[i8] = this.field.multiply(iArr2[i8], inverse);
            }
        }
        return iArr2;
    }

    private GenericGFPoly[] runEuclideanAlgorithm(GenericGFPoly genericGFPoly, GenericGFPoly genericGFPoly2, int i8) {
        if (genericGFPoly.getDegree() < genericGFPoly2.getDegree()) {
            genericGFPoly2 = genericGFPoly;
            genericGFPoly = genericGFPoly2;
        }
        GenericGFPoly zero = this.field.getZero();
        GenericGFPoly one = this.field.getOne();
        do {
            GenericGFPoly genericGFPoly3 = genericGFPoly2;
            genericGFPoly2 = genericGFPoly;
            genericGFPoly = genericGFPoly3;
            GenericGFPoly genericGFPoly4 = one;
            GenericGFPoly genericGFPoly5 = zero;
            zero = genericGFPoly4;
            if (genericGFPoly.getDegree() < i8 / 2) {
                int coefficient = zero.getCoefficient(0);
                if (coefficient == 0) {
                    throw new ReedSolomonException("sigmaTilde(0) was zero");
                }
                int inverse = this.field.inverse(coefficient);
                return new GenericGFPoly[]{zero.multiply(inverse), genericGFPoly.multiply(inverse)};
            }
            if (genericGFPoly.isZero()) {
                throw new ReedSolomonException("r_{i-1} was zero");
            }
            GenericGFPoly zero2 = this.field.getZero();
            int inverse2 = this.field.inverse(genericGFPoly.getCoefficient(genericGFPoly.getDegree()));
            while (genericGFPoly2.getDegree() >= genericGFPoly.getDegree() && !genericGFPoly2.isZero()) {
                int degree = genericGFPoly2.getDegree() - genericGFPoly.getDegree();
                int multiply = this.field.multiply(genericGFPoly2.getCoefficient(genericGFPoly2.getDegree()), inverse2);
                zero2 = zero2.addOrSubtract(this.field.buildMonomial(degree, multiply));
                genericGFPoly2 = genericGFPoly2.addOrSubtract(genericGFPoly.multiplyByMonomial(degree, multiply));
            }
            one = zero2.multiply(zero).addOrSubtract(genericGFPoly5);
        } while (genericGFPoly2.getDegree() < genericGFPoly.getDegree());
        throw new IllegalStateException("Division algorithm failed to reduce polynomial?");
    }

    public void decode(int[] iArr, int i8) {
        GenericGFPoly genericGFPoly = new GenericGFPoly(this.field, iArr);
        int[] iArr2 = new int[i8];
        boolean z7 = true;
        for (int i9 = 0; i9 < i8; i9++) {
            GenericGF genericGF = this.field;
            int evaluateAt = genericGFPoly.evaluateAt(genericGF.exp(genericGF.getGeneratorBase() + i9));
            iArr2[(i8 - 1) - i9] = evaluateAt;
            if (evaluateAt != 0) {
                z7 = false;
            }
        }
        if (z7) {
            return;
        }
        GenericGFPoly[] runEuclideanAlgorithm = runEuclideanAlgorithm(this.field.buildMonomial(i8, 1), new GenericGFPoly(this.field, iArr2), i8);
        GenericGFPoly genericGFPoly2 = runEuclideanAlgorithm[0];
        GenericGFPoly genericGFPoly3 = runEuclideanAlgorithm[1];
        int[] findErrorLocations = findErrorLocations(genericGFPoly2);
        int[] findErrorMagnitudes = findErrorMagnitudes(genericGFPoly3, findErrorLocations);
        for (int i10 = 0; i10 < findErrorLocations.length; i10++) {
            int length = (iArr.length - 1) - this.field.log(findErrorLocations[i10]);
            if (length < 0) {
                throw new ReedSolomonException("Bad error location");
            }
            iArr[length] = GenericGF.addOrSubtract(iArr[length], findErrorMagnitudes[i10]);
        }
    }
}
