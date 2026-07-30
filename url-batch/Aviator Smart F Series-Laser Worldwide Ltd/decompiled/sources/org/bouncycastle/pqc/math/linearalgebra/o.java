package org.bouncycastle.pqc.math.linearalgebra;

/* loaded from: classes5.dex */
public class o {
    private e field;

    /* renamed from: p, reason: collision with root package name */
    private m f17217p;
    protected m[] sqMatrix;
    protected m[] sqRootMatrix;

    public o(e eVar, m mVar) {
        this.field = eVar;
        this.f17217p = mVar;
        computeSquaringMatrix();
        computeSquareRootMatrix();
    }

    private void computeSquareRootMatrix() {
        int coefficient;
        int degree = this.f17217p.getDegree();
        m[] mVarArr = new m[degree];
        int i8 = degree - 1;
        for (int i9 = i8; i9 >= 0; i9--) {
            mVarArr[i9] = new m(this.sqMatrix[i9]);
        }
        this.sqRootMatrix = new m[degree];
        while (i8 >= 0) {
            this.sqRootMatrix[i8] = new m(this.field, i8);
            i8--;
        }
        for (int i10 = 0; i10 < degree; i10++) {
            if (mVarArr[i10].getCoefficient(i10) == 0) {
                int i11 = i10 + 1;
                boolean z7 = false;
                while (i11 < degree) {
                    if (mVarArr[i11].getCoefficient(i10) != 0) {
                        swapColumns(mVarArr, i10, i11);
                        swapColumns(this.sqRootMatrix, i10, i11);
                        i11 = degree;
                        z7 = true;
                    }
                    i11++;
                }
                if (!z7) {
                    throw new ArithmeticException("Squaring matrix is not invertible.");
                }
            }
            int inverse = this.field.inverse(mVarArr[i10].getCoefficient(i10));
            mVarArr[i10].multThisWithElement(inverse);
            this.sqRootMatrix[i10].multThisWithElement(inverse);
            for (int i12 = 0; i12 < degree; i12++) {
                if (i12 != i10 && (coefficient = mVarArr[i12].getCoefficient(i10)) != 0) {
                    m multWithElement = mVarArr[i10].multWithElement(coefficient);
                    m multWithElement2 = this.sqRootMatrix[i10].multWithElement(coefficient);
                    mVarArr[i12].addToThis(multWithElement);
                    this.sqRootMatrix[i12].addToThis(multWithElement2);
                }
            }
        }
    }

    private void computeSquaringMatrix() {
        int i8;
        int degree = this.f17217p.getDegree();
        this.sqMatrix = new m[degree];
        int i9 = 0;
        while (true) {
            i8 = degree >> 1;
            if (i9 >= i8) {
                break;
            }
            int i10 = i9 << 1;
            int[] iArr = new int[i10 + 1];
            iArr[i10] = 1;
            this.sqMatrix[i9] = new m(this.field, iArr);
            i9++;
        }
        while (i8 < degree) {
            int i11 = i8 << 1;
            int[] iArr2 = new int[i11 + 1];
            iArr2[i11] = 1;
            this.sqMatrix[i8] = new m(this.field, iArr2).mod(this.f17217p);
            i8++;
        }
    }

    private static void swapColumns(m[] mVarArr, int i8, int i9) {
        m mVar = mVarArr[i8];
        mVarArr[i8] = mVarArr[i9];
        mVarArr[i9] = mVar;
    }

    public m[] getSquareRootMatrix() {
        return this.sqRootMatrix;
    }

    public m[] getSquaringMatrix() {
        return this.sqMatrix;
    }
}
